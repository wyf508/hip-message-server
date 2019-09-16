package com.djhu.hiup.message.server.service.empi;



import com.djhu.hiup.message.server.core.model.Patient;
import com.djhu.hiup.message.server.service.util.JsonUtils;
import com.djhu.hiup.message.server.service.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by jiangmei on 2017/6/9.
 */
@Component("groupingRuleHandle")
public class GroupingRuleHandle {


    private static final Logger LOGGER= LoggerFactory.getLogger(GroupingRuleHandle.class);

    /**
     * 1）：通过分组属性+匹配规则，对患者关联信息进行分组（先分组，后匹配）
     * @param linkPatientList
     * @return
     */
    public List<List<Patient>> groupPatientListByGroupingRuleAndMatchingRule(List<Patient> linkPatientList) {
        List<Field> personGroupingRuleFields=MatchingRuleReader.getMustMatchingRuleFields();
        GroupingRuleField groupingRuleField=getGroupingRuleField(personGroupingRuleFields);
        return groupPatientListByField(linkPatientList, groupingRuleField);
    }

    /**
     * 1.1）：把一个平级的分组属性集合，转换成多层嵌套的分组属性对象（便于后面动态递归分组）
     * @param personGroupingRuleFields
     */
    private GroupingRuleField getGroupingRuleField(List<Field> personGroupingRuleFields) {
        LOGGER.debug("把一个平级的分组属性集合，转换成多层嵌套的分组属性对象开始");
        LOGGER.debug("输入分组属性集合：{}", JsonUtils.toJson(personGroupingRuleFields));
        Set<Field> tmplFieldSet=new HashSet<>();
        for(Field field:personGroupingRuleFields){
            tmplFieldSet.add(field);
        }
        LOGGER.debug("去重复后的分组属性集合：{}", JsonUtils.toJson(tmplFieldSet));
        personGroupingRuleFields=new ArrayList<>();
        personGroupingRuleFields.addAll(tmplFieldSet);
        GroupingRuleField groupingRuleField=new GroupingRuleField();
        Field field=null;
        for(int i=0;i<personGroupingRuleFields.size();i++){
            field=personGroupingRuleFields.get(i);
            if(i==0){
                //第一个直接赋值
                groupingRuleField.setField(field);
            }else{
                //其他递归调用
                groupingRuleField=getGroupingRuleField(groupingRuleField, field);
            }
        }
        LOGGER.debug("把一个平级的分组属性集合，转换成多层嵌套的分组属性对象结束，返回转换后的多层嵌套分组属性对象：{}",JsonUtils.toJson(groupingRuleField));
        //LOGGER.info("把一个平级的分组属性集合：{}，转换成多层嵌套的分组属性对象结束，返回转换后的多层嵌套分组属性对象：{}", JsonUtils.toJson(personGroupingRuleFields), JsonUtils.toJson(groupingRuleField));
        return groupingRuleField;
    }

    /**
     * 1.1.1）： 多层嵌套的分组属性对象进行赋值
     * @param groupingRuleField     多层嵌套的分组属性对象
     * @param field                   分组属性
     * @return
     */
    private GroupingRuleField getGroupingRuleField(GroupingRuleField groupingRuleField,Field field) {
        LOGGER.debug("多层嵌套的分组属性对象进行赋值开始");
        GroupingRuleField sonGroupingRuleField=new GroupingRuleField();
        //子为空,添加子集
        if(StringUtils.isEmpty(groupingRuleField.getSonGroupingRuleField())){
            LOGGER.debug("子为空，添加子集");
            sonGroupingRuleField.setField(field);
            groupingRuleField.setSonGroupingRuleField(sonGroupingRuleField);
        }else{
            //子不为空，递归,直到获取为空的进行赋值（最里面一层）
            LOGGER.debug("子不为空，递归，直到获取为空的进行赋值（最里面一层）");
            sonGroupingRuleField=getGroupingRuleField(groupingRuleField.getSonGroupingRuleField(), field);
            groupingRuleField.setSonGroupingRuleField(sonGroupingRuleField);
        }
        LOGGER.debug("多层嵌套的分组属性对象进行赋值结束，返回赋值后的多层嵌套的分组属性对象：{}",JsonUtils.toJson(groupingRuleField));
        return groupingRuleField;
    }

    /**
     * 2）：通过多层嵌套的分组属性对象，对患者关联信息进行递归分组
     * @param linkPatientList
     * @param groupingRuleField
     * @return
     */
    private List<List<Patient>> groupPatientListByField(List<Patient> linkPatientList,GroupingRuleField groupingRuleField) {
        LOGGER.debug("通过多层嵌套的分组属性对象，对患者关联信息进行递归分组开始");
        LOGGER.debug("输入患者交叉索引列表：{}",JsonUtils.toJson(linkPatientList));
        LOGGER.debug("输入多层嵌套的分组属性对象：{}",JsonUtils.toJson(groupingRuleField));
        //按患者信息属性进行分组
        Map<String, List<Patient>> personMap = new HashMap<>();
        List<Patient> tmplPatientList = null;
        Object personFieldValue=null;
        for (Patient person : linkPatientList) {
            personFieldValue= ReflexUtils.getFieldObject(groupingRuleField.getField(), person);
            personFieldValue=StringUtils.isEmpty(personFieldValue)||StringUtils.isEmpty(String.valueOf(personFieldValue))? MatchingRuleConstant.EMPTY:personFieldValue;
            if (personMap.keySet().contains(personFieldValue)) {
                personMap.get(personFieldValue).add(person);
            } else {
                tmplPatientList = new ArrayList<Patient>();
                tmplPatientList.add(person);
                personMap.put(String.valueOf(personFieldValue), tmplPatientList);
            }
        }
        LOGGER.debug("通过属性：{}，分组后的患者交叉索引Map：{}",JsonUtils.toJson(groupingRuleField.getField()),JsonUtils.toJson(personMap));
        LOGGER.info("通过属性：{}，分组后的患者交叉索引Map：{}", JsonUtils.toJson(groupingRuleField.getField()), JsonUtils.toJson(personMap));
        //归并属性为空的数据
        addNoLinkPatientToList(personMap);
        //对每一组，继续处理
        List<List<Patient>> splitedListList = new ArrayList<>();
        if(StringUtils.isNotEmpty(groupingRuleField.getSonGroupingRuleField())){
            //非最后一组
            for (String personProperty : personMap.keySet()) {
                splitedListList.addAll(groupPatientListByField(personMap.get(personProperty), groupingRuleField.getSonGroupingRuleField()));
            }
        }else{
            //最后一组
            //personMap.keySet().size()决定有几组，没有匹配上就不管了
            for (String personProperty: personMap.keySet()) {
                splitedListList.add(personMap.get(personProperty));
            }
        }
        return splitedListList;
    }

    /**
     * 2.1）：对强制匹配规则为空的，通过普通匹配规则进行匹配
     *
     * @param personsMap
     */
    private void addNoLinkPatientToList(Map<String, List<Patient>> personsMap) {
        LOGGER.debug("对强制匹配规则为空的，通过普通匹配规则进行匹配开始");
        if(StringUtils.isEmptyOr(personsMap.get(MatchingRuleConstant.EMPTY))){
            return;
        }
        //加载配置，获取匹配规则
        List<MatchingRuleField> personMatchingRuleFields= MatchingRuleReader.getPatientMatchingRuleFields();
        boolean link = false;
        List<Patient> tmplPatientList=new ArrayList<>();
        for (Patient noLinkPatient : personsMap.get(MatchingRuleConstant.EMPTY)) {
            for (String key : personsMap.keySet()) {
                if (key.equals(MatchingRuleConstant.EMPTY)) {
                    continue;
                }
                for (Patient p : personsMap.get(key)) {
                    link= matchTwoPatient(noLinkPatient, p, personMatchingRuleFields);
                    if(link){
                        break;
                    }
                }
                //匹配则加入到这一组,并且进行移除
                if (link) {
                    personsMap.get(key).add(noLinkPatient);
                    tmplPatientList.add(noLinkPatient);
                    break;
                }
            }
        }
        personsMap.get(MatchingRuleConstant.EMPTY).removeAll(tmplPatientList);
        if(StringUtils.isEmpty(personsMap.get(MatchingRuleConstant.EMPTY))){
            personsMap.remove(MatchingRuleConstant.EMPTY);
        }
    }


    /**
     *  2.1.1）：匹配规则匹配两个患者信息是否相匹配
     * @param aPatient                   患者A
     * @param bPatient                   患者B
     * @param personMatchingRuleFields    患者匹配规则
     * @return
     */
    private boolean matchTwoPatient(Patient aPatient, Patient bPatient, List<MatchingRuleField> personMatchingRuleFields) {
        boolean matched = false;
        LOGGER.debug("匹配规则匹配两个患者信息是否相匹配开始");
        LOGGER.debug("输入患者A:{}",JsonUtils.toJson(aPatient));
        LOGGER.debug("输入患者B:{}",JsonUtils.toJson(bPatient));
        LOGGER.debug("输入患者交叉索引信息匹配规则:{}",JsonUtils.toJson(personMatchingRuleFields));
        //对匹配规则进行循环
        List<Field> personFieldList=null;
        for(MatchingRuleField personMatchingRuleField : personMatchingRuleFields){
            personFieldList=personMatchingRuleField.getFieldList();
            if(StringUtils.isNotEmpty(personFieldList)){
                matched = true;
            }
            //判断患者信息的匹配规则
            //对于任一匹配规则中，有字段为空，或者某一字段不匹配，则匹配不成立；
            //患者主要信息，匹配字段进行比较
            for(Field personField: personFieldList){
                Object aPatientFieldVal= ReflexUtils.getFieldObject(personField, aPatient);
                Object bPatientFieldVal= ReflexUtils.getFieldObject(personField, bPatient);
                if (StringUtils.isEmptyOr(aPatientFieldVal, bPatientFieldVal)||
                        StringUtils.isEmptyOr(String.valueOf(aPatientFieldVal),String.valueOf(bPatientFieldVal))||
                        !aPatientFieldVal.equals(bPatientFieldVal)) {
                    matched = false;
                    break;
                }
            }
            //任何一轮匹配成功，则两个Patient匹配成功；
            if (matched) {
                break;
            }
        }
        return matched;
    }
}
