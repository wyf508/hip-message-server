package com.djhu.hiup.message.server.service.util;

import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;

import java.util.List;
import java.util.Map;

/**
 * 部分服务请求参数，存在循环，默认配置文件对应key=list 1****
 * Created by jiangmei on 2018/6/22.
 */
public class HIPMessageMapUtils {

    public static List<Map<String,Object>> getSonMap1(Map<String,Object> keyAndXmlValMap){
        return (List<Map<String,Object>>) keyAndXmlValMap.get(HIPMessageKeyConstant.SON_KEY_1);
    }

    public static List<Map<String,Object>> getSonMap2(Map<String,Object> keyAndXmlValMap){
        return (List<Map<String,Object>>) keyAndXmlValMap.get(HIPMessageKeyConstant.SON_KEY_2);
    }

    public static List<Map<String,Object>> getSonMap3(Map<String,Object> keyAndXmlValMap){
        return (List<Map<String,Object>>) keyAndXmlValMap.get(HIPMessageKeyConstant.SON_KEY_3);
    }

}
