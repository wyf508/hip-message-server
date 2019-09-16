package com.djhu.hiup.message.server.service.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

/**
 * 字符串工具类
 */
public class StringUtils {

    private static final Logger LOGGER= LoggerFactory.getLogger(StringUtils.class);

    /**
     * 判断字符串是否为空
     * @param string
     * @return
     */
     public static boolean isEmpty(String string){
         //LOGGER.debug("判断字符串是否为空开始",string);
         //LOGGER.debug("输入字符串：{}",string);
         boolean isEmpty=string==null||"null".equalsIgnoreCase(string.trim())||"".equals(string.trim());
         //LOGGER.debug("判断字符串是否为空结束，返回字符串为空：{}",isEmpty);
         //LOGGER.info("判断字符串：{}，是否为空，返回字符串为空：{}", string, isEmpty);
        return isEmpty;
    }

    /**
     * 判断String对象列表是否为空
     * @param strings
     * @return
     */
    public static boolean isEmptyOr(String... strings){
        //LOGGER.debug("判断String字符串列表,是否为空开始");
        //LOGGER.debug("输入String字符串列表：{}", JsonUtils.toJson(strings));
        boolean empty=false;
        for(String string:strings){
            if(string==null|| "".equals(string.trim())){
                return true;
            }
        }
        //LOGGER.debug("判断String字符串列表,是否为空结束，返回String对象为空：{}",empty);
        //LOGGER.info("判断String字符串列表：{}，是否为空，返回String对象为空：{}", JsonUtils.toJson(strings),empty);
        return empty;
    }

    /**
     * 判断Object对象是否为空
     * @param object
     * @return
     */
     public static boolean isEmpty(Object object){
         if(object instanceof String){
             return isEmpty((String)object);
         }
         //LOGGER.debug("判断Object对象，是否为空开始");
         //LOGGER.debug("输入Object对象：{}", JsonUtils.toJson(object));
         boolean isEmpty=object==null;
         //LOGGER.debug("判断Object对象，是否为空结束，返回Object对象为空：{}",isEmpty);
         //LOGGER.info("判断Object对象：{}，是否为空，返回Object对象为空：{}", JsonUtils.toJson(object), isEmpty);
        return isEmpty;
    }

    /**
     * 判断Object对象列表是否为空
     * @param objects
     * @return
     */
    public static boolean isEmptyOr(Object... objects){
        //LOGGER.debug("判断Object对象列表，是否为空开始");
        //LOGGER.debug("输入Object对象列表：{}", JsonUtils.toJson(objects));
        boolean empty=false;
        for(Object object:objects){
           if(object==null){
               return true;
           }
        }
        //LOGGER.debug("判断Object对象列表，是否为空结束，返回Object对象列表为空：{}",empty);
        //LOGGER.debug("判断Object对象列表：{}，是否为空，返回Object对象列表为空：{}",JsonUtils.toJson(objects),empty);
        return empty;
    }

    /**
     * 判断集合是否为空
     * @param list
     * @return
     */
     public static boolean isEmpty(List list){
         //LOGGER.debug("判断集合，是否为空开始");
         //LOGGER.debug("输入集合：{}", JsonUtils.toJson(list));
         boolean isEmpty=list==null||list.size()==0;
         //LOGGER.debug("判断集合，是否为空结束，返回集合为空：{}",isEmpty);
         //LOGGER.info("判断集合：{}，是否为空，返回集合为空：{}", JsonUtils.toJson(list), isEmpty);
         return isEmpty;
    }

    /**
     * 判断字符串是否不为空
     * @param string
     * @return
     */
     public static boolean isNotEmpty(String string){
         //LOGGER.debug("判断字符串，是否不为空开始");
         //LOGGER.debug("输入字符串：{}",string);
         boolean isNotEmpty=!isEmpty(string);
         //LOGGER.debug("判断字符串，是否不为空结束，返回字符串不为空：{}",isNotEmpty);
         //LOGGER.info("判断字符串：{}，是否不为空，返回字符串不为空：{}", string, isNotEmpty);
         return isNotEmpty;
    }


    /**
     * 判断Object对象是否不为空
     * @param object
     * @return
     */
     public static boolean isNotEmpty(Object object){
         //LOGGER.debug("判断Object对象，是否不为空开始");
         //LOGGER.debug("输入Object对象：{}", JsonUtils.toJson(object));
         boolean isNotEmpty=!isEmpty(object);
         //LOGGER.debug("判断Object对象，是否不为空结束，返回Object对象不为空：{}",isNotEmpty);
         //LOGGER.info("判断Object对象：{}，是否不为空，返回Object对象不为空：{}", JsonUtils.toJson(object), isNotEmpty);
         return isNotEmpty;
    }

    /**
     * 判断集合是否不为空
     * @param list
     * @return
     */
     public static boolean isNotEmpty(List list){
         //LOGGER.debug("判断集合，是否不为空开始");
         //LOGGER.debug("输入集合：{}", JsonUtils.toJson(list));
         boolean isNotEmpty=!isEmpty(list);
         //LOGGER.debug("判断集合，是否不为空结束，返回字符串为空：{}",isNotEmpty);
         //LOGGER.info("判断集合：{}，是否不为空，返回字符串为空：{}", JsonUtils.toJson(list), isNotEmpty);
         return isNotEmpty;
    }

    /**
     * 截取指定标识之前的字符串
     *
     * @param str
     * @param strFlg
     * @return
     */
    public static String subStringBefore(String str, String strFlg) {
        //LOGGER.debug("截取指定标识之前的字符串开始");
        //LOGGER.debug("输入字符串：{}",str);
        //LOGGER.debug("输入截取标识：{}",strFlg);
        String beforeStr=str;
        if (str.indexOf(strFlg) != -1) {
            beforeStr= str.substring(0, str.indexOf(strFlg));
        }
        //LOGGER.debug("截取指定标识之前的字符串结束，返回截取后的字符串：{}",beforeStr);
        //LOGGER.info("截取字符串：{}，指定标识之前的字符串，返回截取后的字符串：{}",str, beforeStr);
        return beforeStr;
    }

    /**
     * 截取指定标识之后的字符串
     *
     * @param str
     * @param strFlg
     * @return
     */
    public static String subStringAfter(String str, String strFlg) {
        //LOGGER.debug("截取指定标识之后的字符串开始");
        //LOGGER.debug("输入字符串：{}",str);
        //LOGGER.debug("输入截取标识：{}",strFlg);
        String afterStr="";
        if (str.indexOf(strFlg) != -1) {
            afterStr= str.substring(str.indexOf(strFlg) + 1);
        }
        //LOGGER.debug("截取指定标识之后的字符串结束，返回截取后的字符串：{}",afterStr);
        //LOGGER.info("截取字符串：{}，截取指定标识之后的字符串结束，返回截取后的字符串：{}",str,afterStr);
        return afterStr;
    }
}
