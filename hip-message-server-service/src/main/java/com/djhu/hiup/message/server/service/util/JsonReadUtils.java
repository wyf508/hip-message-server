package com.djhu.hiup.message.server.service.util;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.PathNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by jiangmei on 2017/10/20.
 */
public class JsonReadUtils {

    private static Logger logger= LoggerFactory.getLogger(JsonReadUtils.class);
    private static DateFormat dateFormat=new SimpleDateFormat("yyyyMMdd");
    private static DateFormat enUsFormat=DateFormat.getDateTimeInstance(2, 2, Locale.US);


    /**
     * 通过JsonPath从Json中获取内容
     * @param json
     * @param jsonPath
     * @return
     */
    public static String read(String json, String jsonPath) {
        try{
            if(StringUtils.isNotEmpty(jsonPath)){
                Object jsonPathVal=JsonPath.read(json, jsonPath);
                if(!(jsonPathVal instanceof net.minidev.json.JSONObject)){
                    if(StringUtils.isNotEmpty(jsonPathVal)){
                        return jsonPathVal+"";
                    }
                }

            }
            return "";
        }catch (PathNotFoundException e){
            return "";
        }catch (Exception e){
			logger.warn(e.getMessage(),e);
            return "";
        }
    }
}
