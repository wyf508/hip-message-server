package com.djhu.hiup.message.server.service.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YFC
 * @create 2018-12-06 上午 2:52
 */
public class SharedDocConstant {
    private static Map<String, LogDocPathBean> sharedDodMap = new HashMap();

    static {
        sharedDodMap.put("病历概要", new LogDocPathBean("01"));
        sharedDodMap.put("门（急）诊病历", new LogDocPathBean("02"));
        sharedDodMap.put("急诊留观病历", new LogDocPathBean("03"));
        sharedDodMap.put("西药处方", new LogDocPathBean("04"));
        sharedDodMap.put("中药处方", new LogDocPathBean("05"));
        sharedDodMap.put("检查报告", new LogDocPathBean("06"));
        sharedDodMap.put("检验报告", new LogDocPathBean("07"));

        sharedDodMap.put("检验记录", new LogDocPathBean("07"));

        sharedDodMap.put("治疗记录", new LogDocPathBean("08"));
        sharedDodMap.put("一般手术记录", new LogDocPathBean("09"));
        sharedDodMap.put("麻醉术前访视记录", new LogDocPathBean("10"));

        sharedDodMap.put("麻醉记录", new LogDocPathBean("11"));
        sharedDodMap.put("麻醉术后访视记录", new LogDocPathBean("12"));
        sharedDodMap.put("输血记录", new LogDocPathBean("13"));
        sharedDodMap.put("待产记录", new LogDocPathBean("14"));
        sharedDodMap.put("阴道分娩记录", new LogDocPathBean("15"));
        sharedDodMap.put("剖宫产记录", new LogDocPathBean("16"));
        sharedDodMap.put("一般护理记录", new LogDocPathBean("17"));
        sharedDodMap.put("病重（病危）护理记录", new LogDocPathBean("18"));
        sharedDodMap.put("手术护理记录", new LogDocPathBean("19"));
        sharedDodMap.put("生命体征测量记录", new LogDocPathBean("20"));

        sharedDodMap.put("出入量记录", new LogDocPathBean("21"));
        sharedDodMap.put("高值耗材使用记录", new LogDocPathBean("22"));
        sharedDodMap.put("入院评估", new LogDocPathBean("23"));
        sharedDodMap.put("护理计划", new LogDocPathBean("24"));
        sharedDodMap.put("出院评估与指导", new LogDocPathBean("25"));

        sharedDodMap.put("手术知情告知书", new LogDocPathBean("26"));

        sharedDodMap.put("手术知情同意书", new LogDocPathBean("26"));
        sharedDodMap.put("麻醉知情同意书", new LogDocPathBean("27"));
        sharedDodMap.put("输血治疗同意书", new LogDocPathBean("28"));
        sharedDodMap.put("特殊检查及特殊治疗同意书", new LogDocPathBean("29"));
        sharedDodMap.put("病危(重)同意书", new LogDocPathBean("30"));
        sharedDodMap.put("其他知情告知同意书", new LogDocPathBean("31"));

        sharedDodMap.put("其他知情同意书", new LogDocPathBean("31"));

        sharedDodMap.put("住院病案首页", new LogDocPathBean("32"));
        sharedDodMap.put("中医住院病案首页", new LogDocPathBean("33"));
        sharedDodMap.put("入院记录", new LogDocPathBean("34"));
        sharedDodMap.put("24小时内入出院记录", new LogDocPathBean("35"));

        sharedDodMap.put("24h内入出院记录", new LogDocPathBean("35"));

        sharedDodMap.put("24h内入院死亡记录", new LogDocPathBean("36"));
        sharedDodMap.put("首次病程记录", new LogDocPathBean("37"));
        sharedDodMap.put("日常病程记录", new LogDocPathBean("38"));
        sharedDodMap.put("上级医师查房记录", new LogDocPathBean("39"));
        sharedDodMap.put("疑难病例讨论记录", new LogDocPathBean("40"));

        sharedDodMap.put("交接班记录", new LogDocPathBean("41"));
        sharedDodMap.put("转科记录", new LogDocPathBean("42"));
        sharedDodMap.put("阶段小结", new LogDocPathBean("43"));
        sharedDodMap.put("抢救记录", new LogDocPathBean("44"));
        sharedDodMap.put("会诊记录", new LogDocPathBean("45"));
        sharedDodMap.put("术前小结", new LogDocPathBean("46"));
        sharedDodMap.put("术前讨论", new LogDocPathBean("47"));
        sharedDodMap.put("术后首次病程记录", new LogDocPathBean("48"));
        sharedDodMap.put("出院记录", new LogDocPathBean("49"));
        sharedDodMap.put("死亡记录", new LogDocPathBean("50"));
        sharedDodMap.put("死亡病例讨论记录", new LogDocPathBean("51"));
        sharedDodMap.put("住院医嘱", new LogDocPathBean("52"));
        sharedDodMap.put("出院小结", new LogDocPathBean("53"));
    }


    public static void main(String[] args) {

    }

    public static Map<String, LogDocPathBean> getMap() {
        return sharedDodMap;
    }

    private static boolean containsKey(String key) {
        return sharedDodMap.containsKey(key);
    }

    public static LogDocPathBean get(String key) {
        if (containsKey(key)) {
            return sharedDodMap.get(key);
        }
        return new LogDocPathBean();
    }

    public static String getNumber(String key) {
        return get(key).getDocNumber();
    }


}
