package com.djhu.hiup.message.server.service.common;

/**
 * 转发常量
 * Created by jiangmei on 2018/4/27.
 */
public class ForwardConstant {
    
     /*==============================转发规则队列key常量=============================*/

    /** 数据类型*/
    public static final String ROUTER_DATA_TYPE = "routerinfo.data_type";

    /** 数据来源*/
    public static final String ROUTER_DATA_SOURCE = "routerinfo.data_source";

    /** 数据域ID */
    public static final String ROUTER_DATA_DOMAIN_ID= "routerinfo.data_domain_id";

    /** 版本信息 */
    public static final String ROUTER_DATA_VERSION = "routerinfo.data_version";


    /*==============================转发规则队列value常量=============================*/
    public static final String ROUTER_DATA_VERSION_VAL = "1.0.0.0";


    /*==============================WebService请求参数队列key常量=============================*/
    public static final String REQUEST_HADER_MSG_ID = "requestHeader.msgId";

    public static final String REQUEST_HADER_MSG_PRIORITY = "requestHeader.msgPriority";

    public static final String REQUEST_HADER_MSG_VERSION= "requestHeader.msgVersion";

    public static final String REQUEST_HADER_RECEIVER = "requestHeader.receiver";

    public static final String REQUEST_HADER_REQUEST_TIME= "requestHeader.requestTime";

    public static final String REQUEST_HADER_SENDER = "requestHeader.sender";

    public static final String REQUEST_HADER_MSG_TYPE= "requestHeader.msgType";

    public static final String REQUEST_BODY = "requestBody";


    /*==============================主数据msgHeader队列key常量=============================*/

    public static final String MSG_HEADER_CLASSNAME = "storeMsgs[0].msgHeader.classname";
    public static final String MSG_HEADER_CLASSTYPE = "storeMsgs[0].msgHeader.classtype";
    public static final String MSG_HEADER_VERSION = "storeMsgs[0].msgHeader.version";

    public static final String MSG_HEADER_DOMAINID = "storeMsgs[0].msgHeader.domain_id";
    public static final String MSG_HEADER_ID = "storeMsgs[0].msgHeader.id";
    public static final String MSG_HEADER_INDEX = "storeMsgs[0].msgHeader.index";
    public static final String MSG_HEADER_TYPE = "storeMsgs[0].msgHeader.type";
    public static final String MSG_HEADER_SYSNOTENAME= "storeMsgs[0].msgHeader.sysnoteName";
    public static final String MSG_HEADER_FILEID = "storeMsgs[0].msgHeader.fileId";


    /*==============================主数据msgHeader队列value常量=============================*/
    public static final String MSG_HEADER_CLASSNAME_VAL = "importCompare";
    public static final String MSG_HEADER_CLASSTYPE_VAL = "byname";
    public static final String MSG_HEADER_VERSION_VAL = ROUTER_DATA_VERSION_VAL;

}
