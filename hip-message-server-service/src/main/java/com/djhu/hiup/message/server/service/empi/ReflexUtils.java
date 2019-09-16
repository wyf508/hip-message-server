package com.djhu.hiup.message.server.service.empi;


import com.djhu.hiup.message.server.service.util.JsonUtils;
import com.djhu.hiup.message.server.service.util.NameUtils;
import com.djhu.hiup.message.server.service.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 反射工具类
 * Created by jiangmei on 2017/6/5.
 */
public class ReflexUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(ReflexUtils.class);

    /**
     * 通过匹配规则获取相关对象的属性
     * @param cls                           反射属性对应类
     * @param matchingRuleFieldConf      匹配规则属性配置
     */
    public static List<Field> getMatchingRuleFields(Class cls,String matchingRuleFieldConf){
        LOGGER.debug("通过匹配规则，获取相关对象的属性开始");
        LOGGER.debug("输入反射属性对应类：{}", JsonUtils.toJson(cls));
        LOGGER.debug("输入匹配规则属性配置：{}",JsonUtils.toJson(matchingRuleFieldConf));
        List<String> matchingFieldList= Arrays.asList(matchingRuleFieldConf.toLowerCase().split(","));
        List<String> tmplMatchingFieldList=new ArrayList<>();
        for(String matchingField:matchingFieldList){
            tmplMatchingFieldList.add(NameUtils.convertName(matchingField));
        }
        Field[] fields =cls.getDeclaredFields();
        List<Field> objectFieldList=new ArrayList<>();
        for(Field field:fields){
            field.setAccessible(true);
            if(tmplMatchingFieldList.contains(field.getName())&&!objectFieldList.contains(field)){
                objectFieldList.add(field);
            }
        }
        LOGGER.debug("通过匹配规则，获取相关对象的属性结束，返回获取的对象属性列表：{}",JsonUtils.toJson(objectFieldList));
        //LOGGER.info("通过匹配规则：{}，获取相关对象的属性，返回获取的对象属性列表：{}", JsonUtils.toJson(matchingRuleFieldConf), JsonUtils.toJson(objectFieldList));
        return objectFieldList;
    }

    /**
     * 通过反射获取对象指定属性对应的值
     * @param field     对象所对应的属性
     * @param object    对象
     * @return
     */
    public static Object getFieldObject( Field field,Object object)  {
        if(!Arrays.asList(object.getClass().getDeclaredFields()).contains(field)){
            return null;
        }
        LOGGER.debug("通过反射获取对象指定属性对应的值开始");
        LOGGER.debug("输入获取对象：{}",JsonUtils.toJson(object));
        LOGGER.debug("输入获取属性：{}",JsonUtils.toJson(field));
        Object fieldVal=null;
        try {
            fieldVal= field.get(object);
        } catch (Exception e) {
            LOGGER.warn("通过反射获取对象指定属性对应的值错误",e);
        }
        LOGGER.debug("通过反射获取对象指定属性对应的值结束，返回属性对应值：{}",fieldVal);
        //LOGGER.info("通过反射获取对象属性：{}，对应的值，返回值：{}", JsonUtils.toJson(field), fieldVal);
        return StringUtils.isEmpty(fieldVal)?"":fieldVal;
    }

    /**
     * 通过反射设置对象指定属性对应的值
     * @param field     对象所对应的属性
     * @param object    对象
     * @param value     值
     */
    public static void setFieldObject(Field field,Object object,Object value)  {
        LOGGER.debug("通过反射设置对象指定属性对应的值开始");
        LOGGER.debug("输入设置对象：{}",JsonUtils.toJson(object));
        LOGGER.debug("输入设置属性：{}",JsonUtils.toJson(field));
        LOGGER.debug("输入设置属性值：{}",value);
        try {
            if(StringUtils.isEmpty(value)||
                    (field.getType().equals(String.class))&&StringUtils.isEmpty((String)value)){
                return;
            }
            if(field.getType()== value.getClass()){
                field.set(object,value);
            }else{
                if(field.getType().equals(Double.class)){
                    if(StringUtils.isEmpty((String)value)){
                        return;
                    }
                    field.set(object,Double.valueOf((String)value));
                }
            }
        } catch (Exception e) {
            LOGGER.warn("通过反射设置对象指定属性对应的值错误",e);
        }
        LOGGER.debug("通过反射设置对象指定属性对应的值结束");
       // LOGGER.info("通过反射设置对象：{}属性，对应的值：{}", JsonUtils.toJson(field), value);
    }

    /**
     * 判断对象属性是否有赋值
     * @param object    判断对象
     * @return
     */
    public static boolean getObjectFieldsIsSetVal(Object object){
        LOGGER.debug("判断对象属性，是否有赋值开始");
        LOGGER.debug("输入判断对象：{}",JsonUtils.toJson(object));
        boolean setFieldsVal=false;
        Field[] fields =object.getClass().getDeclaredFields();
        for(Field field:fields){
            field.setAccessible(true);
            if(StringUtils.isNotEmpty(getFieldObject(field,object))){
                setFieldsVal=true;
                break;
            }
        }
        LOGGER.debug("判断对象属性，是否有赋值结束，返回赋值结果：{}",setFieldsVal);
        //LOGGER.info("判断对象：{}属性，是否有赋值结束，返回赋值结果：{}",JsonUtils.toJson(object),setFieldsVal);
        return setFieldsVal;
    }

    /**
     * 设置源对象相关属性的值到目标对象，返回属性值不一样的内容
     * @param source    源对象
     * @param target    目标对象
     * @return           对源对象哪些属性进行了哪些修改说明
     */
    public static boolean sourceToTarget(Object source, Object target)   {
        LOGGER.debug("设置源对象相关属性的值到目标对象，返回属性值不一样的内容开始");
        LOGGER.debug("输入源对象：{}",JsonUtils.toJson(source));
        LOGGER.debug("输入目标对象{}",JsonUtils.toJson(target));
        boolean sourceToTargetUpdateSucess=false;
        StringBuffer oldVisitInfo=new StringBuffer("旧"+source.getClass().getName()+"信息：");
        StringBuffer newVisitInfo=new StringBuffer("新"+target.getClass().getName()+"信息：");
        Class<?> srcClass = source.getClass();
        Field[] fields = srcClass.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            String nameKey = field.getName();
            if(Arrays.asList("person_id,patient_visit_id".split(",")).contains(nameKey)){
                continue;
            }
            // 值取得
            Object srcValue = ReflexUtils.getFieldObject(field, source);
            Object tarValue = ReflexUtils.getFieldObject(field, target);
            // 对象数据不为空，且不相等的情况
            if (StringUtils.isNotEmpty(tarValue)&&!tarValue.equals(srcValue)) {
                ReflexUtils.setFieldObject(field, source, tarValue);
                oldVisitInfo.append(nameKey+"("+srcValue+")");
                newVisitInfo.append(nameKey+"("+tarValue+")");
                sourceToTargetUpdateSucess=true;
            }
        }
        LOGGER.debug("设置源对象相关属性的值到目标对象，返回属性值不一样的内容结束");
        LOGGER.debug("返回源对象差异内容：{}",oldVisitInfo);
        LOGGER.debug("返回目标对象差异内容{}",newVisitInfo);
        //LOGGER.info("返回源对象差异内容：{}", oldVisitInfo);
        //LOGGER.info("返回目标对象差异内容{}", newVisitInfo);
        return sourceToTargetUpdateSucess;
    }


}
