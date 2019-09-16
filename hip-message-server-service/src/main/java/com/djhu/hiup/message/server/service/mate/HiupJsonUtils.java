package com.djhu.hiup.message.server.service.mate;

import com.djhu.hiup.message.server.service.common.ForwardConstant;
import com.djhu.hiup.message.server.service.common.HIPMessageMessageConstant;
import com.djhu.hiup.message.server.service.common.HIPMessageServerServiceCode;
import com.djhu.hiup.message.server.service.util.JsonUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jiangmei on 2018/5/25.
 */
public class HiupJsonUtils {

    public static Map<String, String> initHiupJsonMap(String action,String message,Map<String,String> keyAndXmlValMap) {


        Map<String,String> jsonKeyAndXmlValMap=new HashMap<String,String>();

        //设置requestHeader，生成json，规则引擎推送数据使用
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_HADER_MSG_ID,keyAndXmlValMap.get(HIPMessageMessageConstant.MSG_ID));
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_HADER_MSG_PRIORITY,HIPMessageMessageConstant.MSG_PRIORITY);
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_HADER_MSG_VERSION,HIPMessageMessageConstant.MSG_VERSION);
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_HADER_RECEIVER,keyAndXmlValMap.get(HIPMessageMessageConstant.RECEIVE_ID));
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_HADER_REQUEST_TIME, keyAndXmlValMap.get(HIPMessageMessageConstant.MSG_CREATION_TIME));
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_HADER_SENDER,keyAndXmlValMap.get(HIPMessageMessageConstant.SEND_ID));
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_HADER_MSG_TYPE,action);
        String tmplRequestBody= JsonUtils.toJson("<![CDATA[" + message + "]]>");
        tmplRequestBody=tmplRequestBody.substring(1,tmplRequestBody.length()-1);
        jsonKeyAndXmlValMap.put(ForwardConstant.REQUEST_BODY,tmplRequestBody);

        //设置routerData，生成json，规则引擎推送数据使用
        jsonKeyAndXmlValMap.put(ForwardConstant.ROUTER_DATA_TYPE,action);
        jsonKeyAndXmlValMap.put(ForwardConstant.ROUTER_DATA_VERSION, ForwardConstant.ROUTER_DATA_VERSION_VAL);
        jsonKeyAndXmlValMap.put(ForwardConstant.ROUTER_DATA_SOURCE,keyAndXmlValMap.get(HIPMessageMessageConstant.SEND_ID));
        jsonKeyAndXmlValMap.put(ForwardConstant.ROUTER_DATA_DOMAIN_ID,keyAndXmlValMap.get(HIPMessageMessageConstant.SEND_ID));

        //设置msgHeader，生成json，主数据存储到ES使用
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_CLASSNAME, ForwardConstant.MSG_HEADER_CLASSNAME_VAL);
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_CLASSTYPE, ForwardConstant.MSG_HEADER_CLASSTYPE_VAL);
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_VERSION, ForwardConstant.MSG_HEADER_VERSION_VAL);
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_DOMAINID,action);
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_ID,"1");
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_INDEX,action);
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_TYPE,action);
        jsonKeyAndXmlValMap.put(ForwardConstant.MSG_HEADER_SYSNOTENAME, HIPMessageServerServiceCode.getCodeAndServiceMap().get(action).getComment());
        return jsonKeyAndXmlValMap;
    }
}
