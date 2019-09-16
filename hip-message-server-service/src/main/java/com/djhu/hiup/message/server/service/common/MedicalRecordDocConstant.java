package com.djhu.hiup.message.server.service.common;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author YFC
 * @create 2018-12-01 上午 2:01
 */
public class MedicalRecordDocConstant {
    private static Map<String, LogDocPathBean> interNumber = new HashMap<>();

    static {
        interNumber.put("S0001", new LogDocPathBean("HZZCJK", ServiceName.PATIENT, "01"));
        interNumber.put("S0002", new LogDocPathBean("HZGXJK", ServiceName.PATIENT, "02"));
        interNumber.put("S0003", new LogDocPathBean("HZHBJK", ServiceName.PATIENT, "03"));
        interNumber.put("S0004", new LogDocPathBean("HZCYJK", ServiceName.PATIENT, "04"));
        interNumber.put("S0008", new LogDocPathBean("YHRYZCJK", ServiceName.PERSONNEL, "05"));
        interNumber.put("S0009", new LogDocPathBean("YHRYGXJK", ServiceName.PERSONNEL, "06"));
        interNumber.put("S0010", new LogDocPathBean("YHRYCYJK", ServiceName.PERSONNEL, "07"));
        interNumber.put("S0005", new LogDocPathBean("KSXXZCJK", ServiceName.DEPT, "08"));
        interNumber.put("S0006", new LogDocPathBean("KSXXGXJK", ServiceName.DEPT, "09"));
        interNumber.put("S0007", new LogDocPathBean("KSXXCYJK", ServiceName.DEPT, "10"));
        interNumber.put("S0035", new LogDocPathBean("YZXXJSJK", ServiceName.ORDERS, "14"));
        interNumber.put("S0037", new LogDocPathBean("YZXXCYJK", ServiceName.ORDERS, "15"));
        interNumber.put("S0014", new LogDocPathBean("BLWDZCFWJK", ServiceName.DOC, "11"));
        interNumber.put("S0016", new LogDocPathBean("BLWDJSFWJK", ServiceName.DOC, "13"));
        interNumber.put("S0015", new LogDocPathBean("BLWDDYFWJK", ServiceName.DOC, "12"));
        interNumber.put("S0041", new LogDocPathBean("SQDXZFWJK", ServiceName.REQUEST_RIS, "16"));
        interNumber.put("S0043", new LogDocPathBean("SQDCYFWJK", ServiceName.REQUEST_RIS, "17"));
        interNumber.put("S0082", new LogDocPathBean("MZJZDJJK", ServiceName.VISIT_OUTPATIENT_VISIT, "27"));
        interNumber.put("S0084", new LogDocPathBean("MZJZCYJK", ServiceName.VISIT_OUTPATIENT_VISIT, "28"));
        interNumber.put("S0026", new LogDocPathBean("ZYJZDJJK", ServiceName.VISIT_INPATIENT_VISIT, "29"));
        interNumber.put("S0028", new LogDocPathBean("ZYJZCYJK", ServiceName.VISIT_INPATIENT_VISIT, "30"));
        interNumber.put("S0032", new LogDocPathBean("CYDJJK", ServiceName.VISIT_LEAVE_HOSPITAL, "31"));
        interNumber.put("S0034", new LogDocPathBean("CYDJCYJK", ServiceName.VISIT_LEAVE_HOSPITAL, "32"));
    }

    public static Map<String, LogDocPathBean> getMap() {
        return interNumber;
    }

    private static boolean containsKey(String key) {
        return interNumber.containsKey(key);
    }

    public static LogDocPathBean get(String key) {
        if (containsKey(key)) {
            return interNumber.get(key);
        }
        return new LogDocPathBean();
    }

    public static String getDocNumber(String key) {
        return get(key).getDocNumber();
    }

    public static String getBusinessCode(String key) {
        return get(key).getBusinessCode();
    }

    public static String getInterNumber(String key) {
        return get(key).getInterNumber();
    }

}
