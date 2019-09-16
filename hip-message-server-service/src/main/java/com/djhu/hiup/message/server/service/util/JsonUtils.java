package com.djhu.hiup.message.server.service.util;

import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * json处理工具，便于日志输出，不用重写pojo的toString方法
 * fastjson是效率最高的
 * Created by jiangmei on 2018/1/4.
 */
public class JsonUtils {

    /**
     * 获取Gson实例，由于Gson是线程安全的，这里共同使用同一个Gson实例
     */
    public static String toJson(Object object){
        return JSON.toJSONString(object);
    }

    /**
     * Json转换成对应的java对象，定义成泛型（实现灵活的返回值类型）
     * @param json  json字符串
     * @param cls   转换后的对象类型.class
     * @param <T>   转换后的对象类型
     * @return      转换后的对象类型
     */
    public static <T> T  parseObject(String json,Class<T> cls){
        return JSON.parseObject(json, cls);
    }

    /**
     * Json转换成对应的java对象
     * @param json          json字符串
     * @param clazz
     * @param <T>            转换后的对象类型
     * @return                转换后的对象类型
     */
    public static <T> List<T> parseArray(String json, Class<T> clazz){
        return JSON.parseArray(json, clazz);
    }

    /**
     * 判断json字符串格式是否正确
     * @param jsonString
     * @return
     */
    public static boolean isJson(String jsonString){
        try{
            net.sf.json.JSONObject jsonObject = net.sf.json.JSONObject.fromObject(jsonString);
            jsonObject=null;
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
