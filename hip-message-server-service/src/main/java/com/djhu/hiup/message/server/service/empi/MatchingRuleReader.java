package com.djhu.hiup.message.server.service.empi;


import com.djhu.hiup.message.server.core.model.Patient;
import com.djhu.hiup.message.server.service.util.PropertiesReaderUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 读取匹配规则
 * Created by jiangmei on 2017/5/19.
 */
public class MatchingRuleReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(MatchingRuleReader.class);

    /**
     * 获取查询患者关联数据匹配规则
     * @return
     */
    public static List<MatchingRuleField> getPatientMatchingRuleFields(){
        return getMatchingRuleFields(Patient.class,MatchingRuleConstant.PATIENT_PREFIX);
    }

    /**
     * 获取特定属性分组，该特定属性为空值，匹配规则
     * @return
     */
    public static List<Field> getMustMatchingRuleFields(){
        return getGroupingRuleFields(MatchingRuleConstant.MUST_PREFIX);
    }

    /**
     * 通过分组规则名称前缀，获取分组规则属性集合
     * @param groupingRulePrefix    分组规则名称前缀
     * @return                        分组规则属性集合
     */
    private static List<Field> getGroupingRuleFields(String groupingRulePrefix) {
        LOGGER.debug("通过分组规则名称前缀，获取分组规则属性集合开始");
        LOGGER.debug("输入分组规则名称前缀：{}", groupingRulePrefix);
        Map<String,String> map=loadMatchingConfMap();
        List<Field> allPatientGroupingRuleFields=new ArrayList<>();
        for(String key:map.keySet()){
            //获取分组规则
            if(key.indexOf(groupingRulePrefix) != -1) {
                allPatientGroupingRuleFields.addAll(ReflexUtils.getMatchingRuleFields(Patient.class, map.get(key)));
            }
        }
        LOGGER.debug("通过分组规则名称前缀，获取分组规则属性集合结束，返回分组规则属性集合：{}",allPatientGroupingRuleFields);
        //LOGGER.info("通过分组规则名称前缀：{}，获取分组规则属性集合，返回分组规则属性集合：{}",allPatientGroupingRuleFields);
        return allPatientGroupingRuleFields;
    }

    /**
     * 通过匹配规则名称前缀，获取匹配规则属性集合
     * @param matchingRulePrefix    匹配规则名称前缀
     * @return  患者匹配规则属性集合
     */
    private static List<MatchingRuleField> getMatchingRuleFields(Class fieldClass,String matchingRulePrefix){
        LOGGER.debug("通过匹配规则名称前缀，获取匹配规则属性集合开始");
        LOGGER.debug("输入匹配规则名称前缀：{}",matchingRulePrefix);
        LOGGER.debug("输入匹配规则反射类型：{}",fieldClass);
        List<MatchingRuleField> matchingRuleFields =new ArrayList<>();
        Map<String,String> map=loadMatchingConfMap();
        List<Field> personFieldList=null;
        for(String key:map.keySet()){
            //获取匹配规则
            if(key.indexOf(matchingRulePrefix) != -1) {
                personFieldList=ReflexUtils.getMatchingRuleFields(fieldClass, map.get(key));
                matchingRuleFields.add(new MatchingRuleField(personFieldList));
            }
        }
        LOGGER.debug("通过匹配规则名称前缀，获取匹配规则属性集合结束，返回匹配规则属性集合：{}",matchingRuleFields);
        //LOGGER.info("通过匹配规则名称前缀：{}，获取匹配规则属性集合，返回匹配规则属性集合：{}", matchingRulePrefix, matchingRuleFields);
        return matchingRuleFields;
    }

    /**
     * 获取规则配置键值对
     * @return
     */
    private static Map<String,String> loadMatchingConfMap(){
        String fileName= "/config/" +MatchingRuleConstant.CONF_FILE;
        return PropertiesReaderUtils.loadProperties(fileName);
    }


}
