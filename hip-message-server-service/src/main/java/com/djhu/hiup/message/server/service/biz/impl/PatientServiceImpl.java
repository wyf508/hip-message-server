package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IPatientDao;
import com.djhu.hiup.message.server.core.model.Patient;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;
import com.djhu.hiup.message.server.service.common.HIPMessageServerServiceCode;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.empi.*;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import com.djhu.hiup.message.server.service.exception.DataTooManyException;
import com.djhu.hiup.message.server.service.future.FutureJob;
import com.djhu.hiup.message.server.service.util.StringUtils;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 患者
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.PATIENT)
public class PatientServiceImpl implements IHIPMessageServerService {

    private static final Logger LOG = LoggerFactory.getLogger(PatientServiceImpl.class);
    @Resource
    private IPatientDao patientDao;
    @Resource
    protected MatchingRuleHandle matchingRuleHandle;
    @Resource
    private EmpiServiceImpl empiService;


    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
        long st = System.currentTimeMillis();

        int count = patientDao.selectCountBySelective(keyAndXmlValMap);
        LOG.info("thread {} - 查询患者信息耗时：{}毫秒", Thread.currentThread().getName(), System.currentTimeMillis() - st);
        if (count > 0) {
            throw new DataExistedException();
        }

        final Patient patient = (Patient) BeanUtils.mapToObject(keyAndXmlValMap, Patient.class);
        String globalId = matchingRuleHandle.groupingAndMeatchingPatient(patient);
//      String globalId = UUID.randomUUID().toString();
        patient.setEmpi(globalId);
        patientDao.insertSelective(patient);
        LOG.info("thread {} - insertSelective ：{}毫秒",
                Thread.currentThread().getName(), System.currentTimeMillis() - st);

        FutureJob.involke(() -> {
            try {
                long empiTime = System.currentTimeMillis();
                empiService.saveOrUpdateEmpi(patient);
                LOG.info("thread {} - empiTime saveOrUpdateEmpi：{}毫秒",
                        Thread.currentThread().getName(), System.currentTimeMillis() - empiTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        LOG.info("thread {} - 保存患者信息耗时：{}毫秒", Thread.currentThread().getName(), System.currentTimeMillis() - st);
        return count;
    }


    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
        String action = (String) keyAndXmlValMap.get(HIPMessageKeyConstant.ACTION);
        int count = 0;
        List<Patient> patientList;
        long updateStart1 = System.currentTimeMillis();
        if (HIPMessageServerServiceCode.S0003.equals(action)) {
            //合并
            count = patientDao.selectCountBySelectiveMerge(keyAndXmlValMap);
            patientList = patientDao.selectBySelectiveForMerge(keyAndXmlValMap);

        } else {
            //更新
            count = patientDao.selectCountBySelective(keyAndXmlValMap);
            patientList = patientDao.selectBySelectiveForUpdate(keyAndXmlValMap);

        }
        LOG.info("patientDao.selectBySelective 耗时：{} ms", System.currentTimeMillis() - updateStart1);

        if (CollectionUtils.isEmpty(patientList)) {
            throw new DataNotExistException();
        }

        Patient patientMsg = (Patient) BeanUtils.mapToObject(keyAndXmlValMap, Patient.class);
        Patient patientDb = patientList.get(0);

        if (HIPMessageServerServiceCode.S0003.equals(action)) {
            //合并患者信息逻辑(强制合并，先这样写)
            //先查询被合并患者信息，获取EMPI，进行废弃
            //更新要合并的患者EMPI=上面获取的EMPI
            List<Patient> beMergedPatientList = patientDao.selectBeMergedPatientByPatientId(keyAndXmlValMap);
            //被合并患者信息不存在
            if (CollectionUtils.isEmpty(beMergedPatientList)) {
                throw new DataNotExistException("被合并患者信息不存在！！");
            }
            Patient tmplBeMergedPatient = beMergedPatientList.get(0);
            //被合并患者信息，进行废弃
            Patient beMergedPatient = new Patient();
            beMergedPatient.setPk(tmplBeMergedPatient.getPk());
            beMergedPatient.setStatusCode((String) keyAndXmlValMap.get("beMergedStatusCode"));
            patientDao.discardPatientByPk(beMergedPatient);
            if (beMergedPatientList.size() == 1) {
                empiService.discardEmpiByEmpiPk(tmplBeMergedPatient.getEmpi());
            }
            //更新要合并的患者EMPI=上面获取的EMPI
            Patient toMergedPatient = new Patient();
            toMergedPatient.setEmpi(tmplBeMergedPatient.getEmpi());
            toMergedPatient.setAuthorCode(patientMsg.getAuthorCode());
            toMergedPatient.setAuthorName(patientMsg.getAuthorName());
            toMergedPatient.setPk(patientDb.getPk());
            patientDao.updateEmpiByPk(toMergedPatient);

        } else {
            long updateStart3 = System.currentTimeMillis();

            //更新患者信息逻辑
            boolean updateMatchingRuleField = getUpdateMatchingRuleField(patientMsg, patientDb);
            //患者源对象相关属性值，设置成目标对象相关属性值，变更列表进行日志记录
            boolean updatePatient = ReflexUtils.sourceToTarget(patientDb, patientMsg);
            patientMsg.setEmpi(patientDb.getEmpi());
            //更新匹配字段，需要重新计算关联关系
            if (updateMatchingRuleField) {
                //对更新前，原来EMPI关联数据进行匹配分组
                // 可能有些患者信息，是由于该条需要更新的患者信息才关联到一个EMPI上的
                // 需要排除自己，对原来关联在一个EMPI上的患者列表进行重新分组匹配
                matchingRuleHandle.groupingAndMeatchingOldPatient(patientDb);
                //6）：对更新后的患者信息进展匹配分组
                String newEmpi = matchingRuleHandle.groupingAndMeatchingPatient(patientDb);
                patientDb.setEmpi(newEmpi);
            }
            if (updatePatient) {
                count = patientDao.updateBySelective(patientMsg);
                FutureJob.involke(() -> {
                    try {
                        empiService.saveOrUpdateEmpi(patientMsg);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
            }
            LOG.info("do update 耗时：{} ms", System.currentTimeMillis() - updateStart3);

        }
        return count;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
        return patientDao.selectBySelective(keyAndXmlValMap);
    }


    /**
     * 判断是否对匹配字段进行更新
     *
     * @param patientMsg 接收到的患者信息
     * @param patientDb  数据库查询到的患者信息
     * @return 是否对匹配字段进行更新
     */
    private boolean getUpdateMatchingRuleField(Patient patientMsg, Patient patientDb) {
        boolean updateMatchingRuleField = false;
        List<MatchingRuleField> patientMatchingRuleFields = MatchingRuleReader.getPatientMatchingRuleFields();
        Object patientMsgFieldVal;
        Object patientDbFieldVal;
        for (MatchingRuleField patientMatchingRuleField : patientMatchingRuleFields) {
            for (Field patientField : patientMatchingRuleField.getFieldList()) {
                patientMsgFieldVal = ReflexUtils.getFieldObject(patientField, patientMsg);
                patientDbFieldVal = ReflexUtils.getFieldObject(patientField, patientDb);
                if (StringUtils.isNotEmpty(patientMsgFieldVal) && !patientMsgFieldVal.equals(patientDbFieldVal)) {
                    updateMatchingRuleField = true;
                    break;
                }
            }
            if (updateMatchingRuleField) {
                break;
            }
        }
        return updateMatchingRuleField;
    }
}
