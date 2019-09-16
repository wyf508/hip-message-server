package com.djhu.hiup.message.server.service.common;

/**
 *
 * 互联互通查询返回状态
 * Created by jiangmei on 2018/6/15.
 */
public class QueryResponseCode {

    public static final String QUERY_RESPONSE_CODE_KEY="queryResponseCode";

    //系统错误
    public static final String ERROR="AE";

    //未找到数据
    public static final String NOT_FIND="NF";

    //找到数据
    public static final String OK="OK";

    //查询参数错误
    public static final String QUERY_PARAM_ERROR="AE";

}
