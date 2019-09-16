package com.djhu.hiup.message.server.service.empi;

import com.djhu.hiup.message.server.core.dao.IEmpiDao;
import com.djhu.hiup.message.server.core.dao.IPatientDao;
import com.djhu.hiup.message.server.core.model.Patient;
import com.djhu.hiup.message.server.service.config.AppConfig;
import com.djhu.hiup.message.server.service.util.JsonUtils;
import com.djhu.hiup.message.server.service.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.*;

/**
 * 匹配规则处理器
 * 按匹配规则对患者信息信息进行分组
 * 1）：加载配置获取规则
 * 2）：有匹配规则情况下
 * 3）：通过匹配规则，获取对应收到的患者信息中，匹配字段中的值,封装成查询条件，查询匹配的患者列表
 * 4）：收到患者消息，数据库不存在或者存在数据情况，添加患者消息到患者列表中，进行匹配
 * 5）：匹配：姓名、身份证分组，默认匹配规则：HIS ID、HIS流水ID、病案号进行匹配
 * 6）：大于一组：从第二组起，对于每一组，产生一个新的EMPI，并Set patient的 empi值
 * 7）：判断接收到的患者信息分到哪一组中，返回对应的EMPI，便于后面保存患者信息使用
 */
@Component("matchingRuleHandle")
public class MatchingRuleHandle {

    private static final Logger LOGGER = LoggerFactory.getLogger(MatchingRuleHandle.class);

    @Resource
    private AppConfig appConfig;
    @Resource
    private GroupingRuleHandle groupingRuleHandle;
    @Resource
    private IPatientDao patientDao;
    @Resource
    private IEmpiDao empiDao;

    /**
     * 1）：按匹配规则对患者信息信息进行分组
     * 处理逻辑：
     * 1）：加载配置获取规则
     * 2）：有匹配规则情况下
     * 3）：通过匹配规则，获取对应收到的患者信息中，匹配字段中的值,封装成查询条件，查询匹配的患者列表
     * 4）：收到患者消息，数据库不存在或者存在数据情况，添加患者消息到患者列表中，进行匹配
     * 5）：匹配：姓名、身份证分组，默认匹配规则：HIS ID、HIS流水ID、病案号进行匹配
     * 6）：大于一组：从第二组起，对于每一组，产生一个新的EMPI，并Set patient的 empi值
     * 7）：判断接收到的患者信息分到哪一组中，返回对应的EMPI，便于后面保存患者信息使用
     *
     * @param patientMsg 接收到的患者信息
     * @return 接收到的患者信息分组后对应的EMPI
     *
     */
    public String groupingAndMeatchingPatient(Patient patientMsg) {
        //通过匹配规则+接收消息的patient,作为关联条件，查找可以关联到的患者信息
        List<Patient> linkPatientList = getPatientsByPatientMsg(patientMsg);
        //没有关联的患者信息
        if (StringUtils.isEmpty(linkPatientList)) {
            //如果是更新患者的话，并且只有一个患者，直接返回该患者的EMPI，不用重新生成新的EMPI
            if (StringUtils.isNotEmpty(patientMsg) && StringUtils.isNotEmpty(patientMsg.getEmpi())) {
                return patientMsg.getEmpi();
            }
            //新增患者，肯定是生成一个新的EMPI
            return generateGlobalId();
        }
        //更新患者的话，匹配分组，去除数据库中的自己
        String patientMsgPatientId = patientMsg.getPatientId();
        if (StringUtils.isNotEmpty(patientMsgPatientId)) {
            List<Patient> removePatientList = new ArrayList<>();
            for (Patient patient : linkPatientList) {
                if (patientMsgPatientId.equals(patient.getPatientId())) {
                    removePatientList.add(patient);
                }
            }
            linkPatientList.removeAll(removePatientList);
        }
        //添加患者信息到集合中，进行匹配
        linkPatientList.add(patientMsg);
        return groupingAndMeatchingPatient(patientMsgPatientId, linkPatientList);
    }

    /**
     * 2）：根据患者主索引唯一标识,获取关联的患者交叉索引信息列表，剔除自己(自己要更新掉了)，进行匹配分组
     *
     * @param patientMsg 接收到的患者信息
     * @
     */
    public void groupingAndMeatchingOldPatient(Patient patientMsg) {
        LOGGER.debug("据患者主索引唯一标识,获取关联的患者交叉索引信息列表，剔除自己(自己要更新掉了)，进行匹配分组开始");
        LOGGER.debug("输入患者交叉索引信息：{}", JsonUtils.toJson(patientMsg));
        List<String> listEmpi = new ArrayList<String>();
        listEmpi.add(patientMsg.getEmpi());
        List<Patient> oldLinks = patientDao.selectPatientByEmpi(listEmpi);
        List<Patient> removePatientList = new ArrayList<>();
        String patientMsgPatientId = patientMsg.getPatientId();
        for (Patient patient : oldLinks) {
            if (patient.getPatientId().equals(patientMsgPatientId)) {
                removePatientList.add(patient);
            }
        }
        oldLinks.removeAll(removePatientList);
        if (oldLinks.size() > 0) {
            groupingAndMeatchingPatient(patientMsgPatientId, oldLinks);
        }
    }

    /**
     * 1.1）：根据输入参数+配置的匹配规则查询对应的患者记录
     *
     * @param patientMsg
     * @return
     * @
     */
    private List<Patient> getPatientsByPatientMsg(Patient patientMsg) {
        //LOGGER.info("根据输入参数+配置的匹配规则查询对应的患者记录方法开始");
        //根据匹配规则，判断患者信息输入哪些可以作为查询患者信息的条件
        List<Object> patientParamList = getMatchFindPatientParamList(patientMsg);
        List<Patient> allPatientList = new ArrayList<>();
        List<Patient> tmplPatientList = null;
        //查询对应的患者信息
        for (Object objectParam : patientParamList) {
            if (objectParam instanceof Patient) {
                tmplPatientList = patientDao.selectBySelective((Map<String, Object>) BeanUtils.objectToMap(objectParam));
                allPatientList.addAll(tmplPatientList);
            }
        }
        if (allPatientList.size() > 0) {
            Set<String> empiSet = new HashSet<>();
            for (Patient patient : allPatientList) {
                //LOGGER.info("empi值:{}", patient.getEmpi());
                empiSet.add(patient.getEmpi());
            }
            List<String> uniqueEmpiList = new ArrayList<>();
            uniqueEmpiList.addAll(empiSet);
            allPatientList = patientDao.selectPatientByEmpi(uniqueEmpiList);
            //LOGGER.info("根据empi查询患者所有基本信息件数{}", allPatientList.size());
        }
        //通过主键进行去重复
        Set<String> patientIdSet = new HashSet<>();
        tmplPatientList = new ArrayList<>();
        for (Patient patient : allPatientList) {
            //更新患者信息，原来还没有进行更新的那条患者信息，进行剔除（后面需要更新）
            //新增患者信息，数据库中还没有数据，没有关系，不用特殊处理
            if (!patientIdSet.contains(patient.getPatientId()) && !patient.getPatientId().equals(patientMsg.getPatientId())) {
                tmplPatientList.add(patient);
                patientIdSet.add(patient.getPatientId());
                LOGGER.info("进行去重复后的患者基本信息Patient_id:{}", patient.getPatientId());
            }
        }
        allPatientList.clear();
        //LOGGER.info("根据输入参数+配置的匹配规则查询对应的患者记录方法结束");
        return tmplPatientList;
    }

    /**
     * 1.1.1）：通过查询关联数据匹配规则,获取收到患者信息对应的内容,获取查询关联患者信息的查询条件
     *
     * @param objectInMsg 收到患者/就诊信息
     * @return 查询关联患者信息的查询条件
     */
    private List<Object> getMatchFindPatientParamList(Object objectInMsg) {
        //LOGGER.info("根据对象类型，获取匹配开始");
        List<MatchingRuleField> patientMatchingRuleFields = MatchingRuleReader.getPatientMatchingRuleFields();
        //LOGGER.info("根据对象类型，获取匹配结束");
        //没有匹配规则
        if (StringUtils.isEmpty(patientMatchingRuleFields)) {
            throw new RuntimeException("没有匹配规则！");
        }
        //匹配规则中有空值，直接该组跳过
        List<MatchingRuleField> tmplMatchingRuleFieldList = new ArrayList<>();
        for (MatchingRuleField matchingRuleField : patientMatchingRuleFields) {
            for (Field patientField : matchingRuleField.getFieldList()) {
                if (StringUtils.isEmpty(ReflexUtils.getFieldObject(patientField, objectInMsg))) {
                    LOGGER.info(patientField.getName() + "的值为空");
                    tmplMatchingRuleFieldList.add(matchingRuleField);
                }
            }
        }
        patientMatchingRuleFields.removeAll(tmplMatchingRuleFieldList);
        Object objectInMatching = null;
        //对匹配规则进行循环
        //获取收到消息对应匹配字段的值，并设置到新的患者对象相关属性中（作为查询条件需要使用）
        List<Object> paramList = new ArrayList<>();
        //LOGGER.info("获取收到消息对应匹配字段的值，并设置到新的患者对象相关属性中（作为查询条件需要使用）开始");
        for (MatchingRuleField patientMatchingRuleField : patientMatchingRuleFields) {
            try {
                objectInMatching = objectInMsg.getClass().newInstance();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            for (Field patientField : patientMatchingRuleField.getFieldList()) {
                ReflexUtils.setFieldObject(patientField, objectInMatching, ReflexUtils.getFieldObject(patientField, objectInMsg));
            }

            //LOGGER.info("设定的对象{}",JsonUtils.toJson(objectInMatching));
            paramList.add(objectInMatching);
        }
        //LOGGER.info("获取收到消息对应匹配字段的值，并设置到新的患者对象相关属性中（作为查询条件需要使用）结束");
        return paramList;
    }

    /**
     * 1.2）：生成新的globalId，并检查是否存在
     *
     * @return 新生成的globalId
     */
    private String generateGlobalId() {
        String newEmpi = UUID.randomUUID().toString();
        int count = empiDao.getEmpiCount(newEmpi);
        if (count > 0) {
            throw new RuntimeException("生成的EMPI已经存在！");
        }
        return newEmpi;
    }

    /**
     * 1.3）：通过匹配规则对关联患者信息进行分组匹配
     *
     * @param patientMsgId
     * @param linkPatientList
     * @return
     */
    private String groupingAndMeatchingPatient(String patientMsgId, List<Patient> linkPatientList) {
        //通过匹配规则对关联患者信息进行分组匹配
        List<List<Patient>> splitedPatient = groupingRuleHandle.groupPatientListByGroupingRuleAndMatchingRule(linkPatientList);
        int splitedPatientSize = splitedPatient.size();
        //除新数据外，只有一组，直接从里面取一个EMPI
        if (splitedPatientSize == 1 && getOneGroupEmpi(splitedPatient.get(0))) {
            return getPatientsEmpi(splitedPatient.get(0));
        }
        List<Patient> patientList = new ArrayList<>();
        Set<String> noProcGlobalIdSet = new HashSet<>();
        String groupingGloaldId = null;
        //LOGGER.info("通过匹配规则对关联患者信息进行分组匹配,分成{}组", splitedPatientSize);
        //废弃历史empi步骤1：废弃原来EMPI，存在拆分情况，不能按empi进行废弃，分组后的patientList数量和数据库patient表数量一致情况下，才进行废弃EMPI操作
        Map<String, Integer> discardEmpiMap = new HashMap<>();
        Map<String, Integer> discardEmpiDbPatientMap = new HashMap<>();
        int dbPatientEmpiCount = 0;
        for (int i = 0; i < splitedPatientSize; i++) {
            patientList = splitedPatient.get(i);
            //从列表中获取一个EMPI，新数据此时没有EMPI
            groupingGloaldId = getPatientsEmpi(patientList);
            //第一组并且EMPI都一样，不做任何处理,或者，没有处理过并且EMPI都一样，也不做任何处理
            if ((i == 0 && getOneGroupEmpi(patientList)) ||
                    (getOneGroupEmpi(patientList) && !noProcGlobalIdSet.contains(groupingGloaldId))) {
                noProcGlobalIdSet.add(groupingGloaldId);
                continue;
            }

            //废弃历史empi步骤2：对重新分组的历史数据进行处理，先对分组后的patientList，按empi分组进行统计数量
            String tmplEmpi = null;
            for (Patient patient : patientList) {
                //收到的消息数据不处理（接收到的消息empi为空）
                if (StringUtils.isNotEmpty(patient.getPatientId())) {
                    tmplEmpi = patient.getEmpi();
                    if (discardEmpiMap.keySet().contains(tmplEmpi)) {
                        //已经添加过，empi一样进行计数
                        discardEmpiMap.put(tmplEmpi, discardEmpiMap.get(tmplEmpi) + 1);
                    } else {
                        //第一次进行添加，并且数量是1
                        discardEmpiMap.put(tmplEmpi, 1);
                    }
                    if (!discardEmpiDbPatientMap.keySet().contains(tmplEmpi)) {
                        dbPatientEmpiCount = patientDao.selectPatientCountByEmpi(tmplEmpi);
                        discardEmpiDbPatientMap.put(tmplEmpi, dbPatientEmpiCount);
                    }
                }
            }
            //产生一个新的EMPI，并Set patient的 empi值，保存新EMPI数据
            generateGlobalIdAndSendEmpi(patientList);
        }
        // 作废旧的EMPI
        //满足该患者同一个EMPI号，所有分组的patient表的数量和数据库empi所对应patient数量一致情况下，才需要废弃该EMPI，否则可能是拆分，需要保留
        for (String discardEmpi : discardEmpiMap.keySet()) {
            if (discardEmpiMap.get(discardEmpi).equals(discardEmpiDbPatientMap.get(discardEmpi))) {
                empiDao.discardEmpiByEmpiPk(discardEmpi);
            }
        }
        //接收患者信息分组后对应的EMPI获取
        return getGlobalIdBySplitedPatient(patientMsgId, splitedPatient);
    }

    /**
     * 1.3.1）：对患者信息列表进行empi分组，判断只有一个empi，直接返回，多个创建新的empi
     *
     * @param patientList 患者信息列表
     * @return
     */
    private boolean getOneGroupEmpi(List<Patient> patientList) {
        Set<String> linkPatientEmpiSet = new HashSet<>();
        for (Patient patient : patientList) {
            if (StringUtils.isNotEmpty(patient.getPatientId())) {
                linkPatientEmpiSet.add(patient.getEmpi());
            }
        }
        if (StringUtils.isNotEmpty(linkPatientEmpiSet) && linkPatientEmpiSet.size() == 1) {
            return true;
        }
        return false;
    }

    /**
     * 1.3.2）：从患者列表中取一个EMPI
     *
     * @param patientList
     * @return
     */
    private String getPatientsEmpi(List<Patient> patientList) {
        for (Patient patient : patientList) {
            if (StringUtils.isNotEmpty(patient.getPatientId())) {
                return patient.getEmpi();
            }
        }
        //就一组，并且没有历史数据，创建一个新的，说明是新数据
        return generateGlobalId();
    }

    /**
     * 1.3.3）：生成新的EMPI（保存或更新），更新所有患者信息所对应的EMPI
     *
     * @param patientList
     */
    private void generateGlobalIdAndSendEmpi(List<Patient> patientList) {
        if (StringUtils.isEmpty(patientList)) {
            return;
        }
        //新数据单独分成一组，这里不用生成新的EMPI，getGlobalIdBySplitedPatient会生成，并且保存Patient后会处理EMPI表，否则会多一条EMPI数据
        if (patientList.size() == 1 && StringUtils.isEmpty(patientList.get(0).getPatientId())) {
            return;
        }
        //2）：对这一组生成一个新的EMPI
        Patient mainPatient = getMainPatient(patientList);
        mainPatient.setEmpi(generateGlobalId());
        //LOGGER.info("开始sendSaveOrUpdateEmpiToMQ：{}",mainPatient.getEmpi());
        empiDao.insertSelective(mainPatient);
        //3）：对这一组的EMPI进行更新
        Patient tmplUpdatePatient = null;
        for (Patient patient : patientList) {
            //收到的消息数据不处理
            if (StringUtils.isNotEmpty(patient.getPatientId())) {
                //LOGGER.info("开始更新患者EMPI：patientId：{},oldEmpi：{},newEmpi：{}",patient.getPatientId(),patient.getEmpi(),mainPatient.getEmpi());
                //对集合中的EMPI进行重新赋值（getPatientsEmpi中用到）
                tmplUpdatePatient = new Patient();
                tmplUpdatePatient.setPk(patient.getPk());
                tmplUpdatePatient.setEmpi(mainPatient.getEmpi());
                patientDao.updateEmpiByPk(tmplUpdatePatient);
            }
        }
    }

    /**
     * 1.3.4）：接收患者信息分组后对应的EMPI获取（分到哪一组了，对应的EMPI是多少）
     *
     * @param patientId      患者主键
     * @param splitedPatient 分组后的患者列表
     * @return
     */
    private String getGlobalIdBySplitedPatient(String patientId, List<List<Patient>> splitedPatient) {
        LOGGER.debug("接收患者信息分组后对应的EMPI获取开始");
        LOGGER.debug("输入患者交叉索引自增主键：{}", patientId);
        LOGGER.debug("输入分组后的患者交叉索引列表：{}", JsonUtils.toJson(splitedPatient));
        String globalId = null;
        for (List<Patient> patients : splitedPatient) {
            for (Patient patient : patients) {
                if (StringUtils.isEmpty(patient.getPatientId()) ||
                        patient.getPatientId().equals(patientId)) {
                    globalId = getPatientsEmpi(patients);
                    break;
                }
            }
            if (StringUtils.isNotEmpty(globalId)) {
                break;
            }
        }
        LOGGER.debug("接收患者信息分组后对应的EMPI获取结束，返回患者主索引唯一标识：{}", globalId);
        //LOGGER.info("接收患者信息分组后对应的EMPI获取，返回患者主索引唯一标识：{}",globalId);
        return globalId;
    }

    /**
     * 1.3.3.1）：通过域判断获取主要患者交叉索引信息
     *
     * @param patientList
     * @return
     */
    private Patient getMainPatient(List<Patient> patientList) {
        if (StringUtils.isEmpty(patientList)) {
            return null;
        }
        //获取HIS或EMR域对应的患者信息
        String hisDomain = appConfig.getHisDomain();
        String emrDomain = appConfig.getEmrDomain();
        if (StringUtils.isEmptyOr(hisDomain, emrDomain)) {
            return patientList.get(0);
        }
        for (Patient patient : patientList) {
            if (hisDomain.equals(patient.getSendId()) ||
                    emrDomain.equals(patient.getSendId())) {
                return patient;
            }
        }
        return patientList.get(0);
    }
}
