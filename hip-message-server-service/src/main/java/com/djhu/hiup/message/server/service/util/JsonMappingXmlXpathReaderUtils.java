package com.djhu.hiup.message.server.service.util;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangmei on 2017/8/10.
 */
public class JsonMappingXmlXpathReaderUtils {

    /*
        消息类型：消息类型对应的配置文件内容（key=val）
        JSON节点=Xpath，Xpath获取到的内容赋值到JSON节点中
    */
    private static Map<String,Map<String, String>> XML_TO_JOSN_CONF_MAP=new HashMap<>();


    /**
     * 根据对应的消息类型，获取对应的XmlToJson配置文件
     * @param msgType 消息类型
     * @return
     */
    public static Map getXmlToJsonConfPropertiesMap(String msgType){
        if(StringUtils.isEmpty(XML_TO_JOSN_CONF_MAP.get(msgType))){
            String fileName= "/config/xml2json/" +msgType+".properties";
            XML_TO_JOSN_CONF_MAP.put(msgType, PropertiesReaderUtils.loadProperties(fileName));
        }
        return XML_TO_JOSN_CONF_MAP.get(msgType);
    }

    
    static{
    	System.out.println("初始化XmlToJson配置文件");
    	String type = "S00";
    	for (int i = 1; i < 85; i++) {
    		String msgType = type;
			if(i<10) {
				msgType+="0";
			}
			getXmlToJsonConfPropertiesMap(msgType);
		}
    	System.out.println("初始化XmlToJson配置文件结束");
    }

}
