package com.djhu.hiup.message.server.service.biz.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.djhu.hiup.message.server.service.util.DataUtils;
import com.djhulog.api.HiupLogService;
import com.djhulog.entity.*;
import com.djhulog.util.JSONUtil;
import com.hiup.base.MonitorService;
import com.hiup.commons.Column;
import com.hiup.commons.GridParam;
import com.hiup.commons.PageNum;
import com.hiup.commons.SelectorParam;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author dihua.wu
 * @date 2018/11/16
 */

@Service
public class MonitorServiceImpl implements MonitorService {

    private static final Logger logger = LoggerFactory.getLogger(MonitorServiceImpl.class);
    private static final DateFormat SDF = new SimpleDateFormat("yyyyMMdd");

    //业务编号
    private static final String APP_CODE = "hip-message-server";

    @Autowired
    private HiupLogService hiupLogService;

    private static List<Column> Columns;

    private Map<String, Object> getCommonGridParam(GridParam gridParam) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("command", gridParam.getCommand());
        resultMap.put("version", gridParam.getVersion());
        resultMap.put("businessCode", gridParam.getBusinessCode());
        return resultMap;
    }

    @Override
    public Map<String, Object> getList(GridParam gridParam) {
        logger.info("平台详情数据表格分页查询请求getList,输入参数是gridParam={}", gridParam.toString());
        Map<String, Object> result = getCommonGridParam(gridParam);

        String searchParam = null;
        String startDate = null;
        String endDate = null;
        String status = null;
        Map<String, String> otherParams = null;
        //当前页
        int pageNo = gridParam.getPage() != null && gridParam.getPage().getPageNo() != null ? gridParam.getPage().getPageNo() : 1;
        //每页条数
        int pageSize = gridParam.getPage() != null && gridParam.getPage().getPageSize() != null ? gridParam.getPage().getPageSize() : 1;

        if (gridParam != null && gridParam.getParam() != null) {
            searchParam = gridParam.getParam().getSearchNo();
            startDate = gridParam.getParam().getStartDate();
            endDate = gridParam.getParam().getEndDate();
            status = gridParam.getParam().getStatus();
            otherParams = gridParam.getParam().getOtherSearch();
        }
        try {
            PageSearch pageSearch = new PageSearch(pageNo, pageSize);
            LogEntitySearch logEntitySearch = null;
            if(otherParams!=null) {
                logEntitySearch = LogEntitySearch.formLogEntitySearch(otherParams);
            }else {
                logEntitySearch = new LogEntitySearch();
            }
            if (StringUtils.isNotEmpty(gridParam.getBusinessCode())) {
                logEntitySearch.setBusinessCode(gridParam.getBusinessCode());
            }
            if (StringUtils.isNotEmpty(searchParam)) {
                logEntitySearch.setMsgId(searchParam);
            }
            if (StringUtils.isNotEmpty(endDate)) {
                logEntitySearch.setRequestTimeEnd(DataUtils.parseDate(endDate.concat("235959"),"yyyyMMddHHmmss"));
            }
            if (StringUtils.isNotEmpty(startDate)) {
                logEntitySearch.setRequestTimeStart(SDF.parse(startDate));
            }
            if (StringUtils.isNotEmpty(status)) {
                if (Integer.valueOf(status) == 1) {
                    logEntitySearch.setErrCode(0);
                } else if (Integer.valueOf(status) == 0) {
                    logEntitySearch.setErrCode(1);
                } else {
                    logEntitySearch.setErrCode(2);
                }
            }
            if(gridParam.getAppCode()!=null) {
                logEntitySearch.setAppCode(gridParam.getAppCode());
            }
            pageSearch.setLogEntitySearch(logEntitySearch);
//			pageSearch.setMainT("true");
            PageResult<LogEntity> pr = hiupLogService.pageList(pageSearch);
            PageNum page = new PageNum(pageNo, pageSize, pr.getTotal().intValue());
            result.put("page", page);
            if (pr.getTotal() > 0) {
                if (gridParam.getParam() != null && gridParam.getParam().getColumns() != null
                        && gridParam.getParam().getColumns().length > 0) {
                    List<LogEntity> list = pr.getResult();
                    List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
                    JSONArray ars = JSONUtil.Object2Array(list);
                    for (int i = 0; i < ars.size(); i++) {
                        JSONObject o = ars.getJSONObject(i);
                        Map<String, Object> itm = new HashMap<String, Object>();
                        for (String cls : gridParam.getParam().getColumns()) {
                            if (o.containsKey(cls)) {
                                itm.put(cls, o.get(cls));
                                if ("requestTime".equals(cls) || "responseTime".equals(cls)) {
                                    Date date = (Date)o.get(cls);
                                    String dateString = DataUtils.formatDate(date, "yyyy-MM-dd HH:mm:ss");
                                    itm.put(cls, dateString);
                                }
                                if ("status".equals(cls)) {
                                    if ("成功".equals(o.get(cls))) {
                                        itm.put(cls, "成功");
                                    } else {
                                        itm.put(cls, "失败");
                                    }
                                }
                            }
                        }
                        itm.put("uniqueId", o.getString("msgId"));
                        maps.add(itm);
                    }
                    result.put("resultList", maps);
                    result.put("size", maps.size());
                } else {
                    result.put("resultList", (pr.getResult()));
                    result.put("size", pr.getResult().size());
                }
            }
            result.put("result", "true");
        } catch (Exception e) {
            result.put("result", "false");
            result.put("size", 0);
            result.put("resultList", new ArrayList<Map<String, Object>>(0));
            result.put("errorMsg", "分页查询失败");
            logger.error("平台详情数据表格分页查询请求getList失败", e.getMessage(), e);
        }
        logger.info("平台详情数据表格分页查询请求getList,输出参数是：");
        outPrint(result);
        return result;
    }

    @Override
    public Map<String, Object> getDetailFlow(GridParam gridParam) {
        logger.info("平台详情数据流程图数据查询请求getDetailFlow,输入参数是gridParam={}", gridParam.toString());
        Map<String, Object> result = getCommonGridParam(gridParam);

        String msgId = null;
        if (gridParam != null) {
            msgId = gridParam.getParam() != null && gridParam.getParam().getUniqueId() != null ? gridParam.getParam().getUniqueId()
                    : null;
        }
        if (StringUtils.isEmpty(msgId)) {
            result.put("result", "false");
            result.put("size", 0);
            result.put("resultList", new ArrayList<Map<String, Object>>(0));
            result.put("errorMsg", "查询条件不能为空");
            logger.error("平台详情数据流程图数据查询请求getDetailFlow失败,uniqueId不能为空");
        } else {
            try {
                List<MsgDetails> list = queryRequestToMsg(msgId, gridParam.getAppCode());
                result.put("resultList", list);
                result.put("size", list.size());
                result.put("result", "true");
            } catch (Exception e) {
                result.put("result", "false");
                result.put("size", 0);
                result.put("resultList", new ArrayList<Map<String, Object>>(0));
                result.put("errorMsg", "查询流程图失败"+e.getMessage());
                logger.error("平台详情数据流程图数据查询请求getDetailFlow失败", e.getMessage(), e);
            }
        }
        logger.info("平台详情数据流程图数据查询请求getDetailFlow,输出参数是：");
        outPrint(result);
        return result;
    }

    private List<MsgDetails> queryRequestToMsg(String msgId, String appcode) {
        List<MsgDetails> msgDetailList = new ArrayList<MsgDetails>();
        Map<String, Object> param = new HashMap<String, Object>();
        try {
            param.put("msgId", msgId);
            param.put("appCode", appcode);
//			param.put("isSender", 0);
            msgDetailList = hiupLogService.queryToMsg(param);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return msgDetailList;
    }


    @Override
    public Map<String, Object> getColumns() {
        if (Columns == null) {
            init();
        }
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("command", "getColumns");
        result.put("version", "1.0.0");
        result.put("businessCode", "");
        result.put("resultList", Columns);
        result.put("size", Columns.size());
        result.put("result", "true");
        return result;
    }

    @Override
    public Map<String, Object> retryDealData(GridParam json) {
        return null;
    }

    @Override
    public Map<String, Object> getStatisticsData(GridParam gridParam) {
        logger.info("统计数据查询getStatisticsData,输入参数是gridParam={}", gridParam.toString());
        Map<String, Object> result = getCommonGridParam(gridParam);

        String startDate = null;
        String endDate = null;
        if (gridParam != null && gridParam.getParam() != null) {
            startDate = gridParam.getParam().getStartDate();
            endDate = gridParam.getParam().getEndDate();
        }
        try {
            Map<String, Object> params = new HashMap<String, Object>();
            if (StringUtils.isNotEmpty(startDate)) {
                startDate = startDate.concat("000000");
            }
            if (StringUtils.isNotEmpty(endDate)) {
                endDate = endDate.concat("235959");
            }
            params.put("startDate", startDate);
            params.put("endDate", endDate);
            params.put("appCode", APP_CODE);
            List<Map<String, Object>> list = hiupLogService.getStatisticsData(params);
            result.put("resultList", list);
            result.put("size", list.size());
            result.put("result", "true");
        } catch (Exception e) {
            result.put("result", "false");
            result.put("size", 0);
            result.put("resultList", new ArrayList<Map<String, Object>>(0));
            result.put("errorMsg", "统计数据查询getStatisticsData失败:" + e.getMessage());
            logger.error("统计数据查询getStatisticsData失败:", e.getMessage(), e);
        }
        logger.info("统计数据查询getStatisticsData,输出参数是：");
        outPrint(result);
        return result;
    }

    @Override
    public Map<String, Object> getSearchCondition(GridParam gridParam) {
        logger.info("条件查询 getSearchCondition,输入参数是gridParam={}", gridParam.toString());
        Map<String, Object> result = getCommonGridParam(gridParam);

        if (Columns == null) {
            init();
        }
        try {
            List<SelectorParam> list = new ArrayList<SelectorParam>();
            for (Column cl : Columns) {
                SelectorParam eventAddrList = new SelectorParam();
                eventAddrList.setSearchColumn(cl.getColumnName());
                eventAddrList.setSearchDesc(cl.getColumnDesc());
                eventAddrList.setSearchType(SelectorParam.TEXT);
                list.add(eventAddrList);
            }
            result.put("result", "true");
            result.put("resultList", list);

        } catch (Exception e) {
            result.put("result", "false");
            result.put("size", 0);
            result.put("resultList", new ArrayList<Map<String, Object>>(0));
            result.put("errorMsg", "平台数据查询条件查询getSearchCondition失败" + e.getMessage());
            logger.error("平台数据查询条件查询 getSearchCondition 失败", e.getMessage(), e);
        }
        logger.info("条件查询getStatisticsData,输出参数是：");
        outPrint(result);
        return result;
    }

    @Override
    public Map<String, Object> getColumns(String s) {
        return getColumns();
    }

    @Override
    public Map<String, Object> getDetail(GridParam gridParam) {
        return null;
    }

    @Override
    public Map<String, Object> findone(GridParam gridParam) {
        return null;
    }

    @Override
    public Map<String, Object> reportCount(GridParam gridParam) {
        return null;
    }

    @Override
    public Map<String, Object> reportLines(GridParam gridParam) {
        return null;
    }

    private static void init() {
        Columns = new ArrayList<Column>();
        Column c = new Column();
        c.setColumnName("msgId");
        c.setColumnDesc("消息ID");
        Columns.add(c);

        Column c8 = new Column();
        c8.setColumnName("receiver");
        c8.setColumnDesc("接收方");
        Columns.add(c8);

        Column c5 = new Column();
        c5.setColumnName("status");
        c5.setColumnDesc("状态");
        Columns.add(c5);

        Column c1 = new Column();
        c1.setColumnName("errMsg");
        c1.setColumnDesc("错误信息");
        Columns.add(c1);

        Column c2 = new Column();
        c2.setColumnName("sender");
        c2.setColumnDesc("发送方");
        Columns.add(c2);

        Column c3 = new Column();
        c3.setColumnName("responseTime");
        c3.setColumnDesc("处理时间");
        Columns.add(c3);

        Column c4 = new Column();
        c4.setColumnName("requestTime");
        c4.setColumnDesc("请求时间");
        Columns.add(c4);

        Column c6 = new Column();
        c6.setColumnName("interfaceDesc");
        c6.setColumnDesc("荷载类型");
        Columns.add(c6);

        Column c9 = new Column();
        c9.setColumnName("sheetId");
        c9.setColumnDesc("申请单编号");
        Columns.add(c9);

        Column c10 = new Column();
        c10.setColumnName("outhospitalId");
        c10.setColumnDesc("门诊流水号");
        Columns.add(c10);

        Column c11 = new Column();
        c11.setColumnName("inhospitalId");
        c11.setColumnDesc("住院流水号");
        Columns.add(c11);

        Column c12 = new Column();
        c12.setColumnName("patientname");
        c12.setColumnDesc("患者名字");
        Columns.add(c12);

        Column c13 = new Column();
        c13.setColumnName("doctor");
        c13.setColumnDesc("主治医生名字");
        Columns.add(c13);

        Column c14 = new Column();
        c14.setColumnName("department");
        c14.setColumnDesc("所在科室");
        Columns.add(c14);

        Column c15 = new Column();
        c15.setColumnName("cardNo");
        c15.setColumnDesc("门诊编号");
        Columns.add(c15);

        Column c16 = new Column();
        c16.setColumnName("businessCode");
        c16.setColumnDesc("业务编码");
        Columns.add(c16);
    }

    /**
     * 接口输出参数日志
     * @param returnMap
     */
    private void outPrint(Map<String, Object> returnMap) {
        for (Map.Entry<String, Object> map : returnMap.entrySet()) {
            logger.info("{}:{}", map.getKey(), map.getValue());
        }
    }

}
