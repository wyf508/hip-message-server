package com.djhu.hiup.message.server.service.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.*;

/**
 * Created by jiangmei on 2017/6/8.
 */
public class PropertiesReaderUtils {

    private static Logger logger = LoggerFactory.getLogger(PropertiesReaderUtils.class);

    /**
     * 加载配置文件，返回键值对
     * @param fileName
     * @return
     */
    public static Map<String, String> loadProperties(String fileName){
        Map<String, String> map=new HashMap<String, String>();
        InputStream is = null;
        try{
            // 获取当前程序所在目录
            String strPath = System.getProperty("user.dir");
            Properties properties = new Properties();
            //加载属性文件
            properties.load(new FileInputStream(strPath+fileName));
            Iterator itr = properties.entrySet().iterator();
            Object entryKey=null;
            String entryKeyStr=null;

            Object entryVal=null;
            String entryValStr=null;
            while (itr.hasNext()) {
                Map.Entry entry = (Map.Entry) itr.next();
                entryKey=entry.getKey();
                entryVal=entry.getValue();
                if(StringUtils.isNotEmpty(entry)&&
                        StringUtils.isNotEmpty(entryKey)&&
                        StringUtils.isNotEmpty(entryVal)&&
                        StringUtils.isNotEmpty(entryVal.toString())){
                    entryKeyStr=String.valueOf(entryKey).trim();
                    entryValStr=String.valueOf(entryVal).trim();
                    map.put(entryKeyStr,entryValStr);
                }
            }
            properties.clear();
        }catch (Exception e){
            logger.error("加载配置文件错误"+fileName+"，"+e.getMessage(),e);
        }finally{
            if(null != is){
                try{
                    is.close();
                }catch (Exception e){
                    logger.error(e.getMessage(),e);
                }
            }
        }
        return map;
    }

}
