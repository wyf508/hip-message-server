package com.djhu.hiup.message.server.service.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 交互服务代码
 * Created by jiangmei on 2018/5/24.
 */
public class HIPMessageServerServiceCode {

    //1 个人信息注册、查询服务
    public static String S0001 = "S0001";      //个人信息注册服务
    public static String S0002 = "S0002";      //个人信息更新服务
    public static String S0003 = "S0003";      //个人信息合并服务
    public static String S0004 = "S0004";      //个人信息查询服务

    //2 医疗卫生机构注册、查询服务
    public static String S0005 = "S0005";      //医疗卫生机构（科室）信息注册服务
    public static String S0006 = "S0006";      //医疗卫生机构（科室）信息更新服务
    public static String S0007 = "S0007";      //医疗卫生机构（科室）信息查询服务

    //3 医疗卫生人员注册、查询服务
    public static String S0008 = "S0008";      //医疗卫生人员信息注册服务
    public static String S0009 = "S0009";      //医疗卫生人员信息更新服务
    public static String S0010 = "S0010";      //医疗卫生人员信息查询服务

    //4 术语注册、查询服务
    public static String S0011 = "S0011";      //术语注册服务
    public static String S0012 = "S0012";      //术语更新服务
    public static String S0013 = "S0013";      //术语查询服务

    //5 文档注册、查询服务
    public static String S0014 = "S0014";      //电子病历文档注册服务
    public static String S0015 = "S0015";      //电子病历文档调阅服务
    public static String S0016 = "S0016";      //电子病历文档检索服务

    //6 就诊信息交互服务
    public static String S0017 = "S0017";      //就诊卡信息新增服务
    public static String S0018 = "S0018";      //就诊卡信息更新服务
    public static String S0019 = "S0019";      //就诊卡信息查询服务
    public static String S0020 = "S0020";      //号源排班信息新增服务
    public static String S0021 = "S0021";      //号源排班信息更新服务
    public static String S0022 = "S0022";      //号源排班信息查询服务
    public static String S0023 = "S0023";      //门诊挂号信息新增服务
    public static String S0024 = "S0024";      //门诊挂号信息更新服务
    public static String S0025 = "S0025";      //门诊挂号信息查询服务
    public static String S0026 = "S0026";      //住院就诊信息登记服务
    public static String S0027 = "S0027";      //住院就诊信息更新服务
    public static String S0028 = "S0028";      //住院就诊信息查询服务
    public static String S0029 = "S0029";      //住院转科信息新增服务
    public static String S0030 = "S0030";      //住院转科信息更新服务
    public static String S0031 = "S0031";      //住院转科信息查询服务
    public static String S0032 = "S0032";      //出院登记信息新增服务
    public static String S0033 = "S0033";      //出院登记信息更新服务
    public static String S0034 = "S0034";      //出院登记信息查询服务

    //7 医嘱信息交互服务
    public static String S0035 = "S0035";      //医嘱信息新增服务
    public static String S0036 = "S0036";      //医嘱信息更新服务
    public static String S0037 = "S0037";      //医嘱信息查询服务

    //8 申请单信息交互服务
    public static String S0038 = "S0038";      //检验申请信息新增服务
    public static String S0039 = "S0039";      //检验申请信息更新服务
    public static String S0040 = "S0040";      //检验申请信息查询服务
    public static String S0041 = "S0041";      //检查申请信息新增服务
    public static String S0042 = "S0042";      //检查申请信息更新服务
    public static String S0043 = "S0043";      //检查申请信息查询服务
    public static String S0044 = "S0044";      //病理申请信息新增服务
    public static String S0045 = "S0045";      //病理申请信息更新服务
    public static String S0046 = "S0046";      //病理申请信息查询服务
    public static String S0047 = "S0047";      //输血申请信息新增服务
    public static String S0048 = "S0048";      //输血申请信息更新服务
    public static String S0049 = "S0049";      //输血申请信息查询服务
    public static String S0050 = "S0050";      //手术申请信息新增服务
    public static String S0051 = "S0051";      //手术申请信息更新服务
    public static String S0052 = "S0052";      //手术申请信息查询服务

    //9 预约信息交互服务
    public static String S0053 = "S0053";      //门诊预约状态信息新增服务
    public static String S0054 = "S0054";      //门诊预约状态信息更新服务
    public static String S0055 = "S0055";      //门诊预约状态信息查询服务
    public static String S0056 = "S0056";      //检查预约状态信息新增服务
    public static String S0057 = "S0057";      //检查预约状态信息更新服务
    public static String S0058 = "S0058";      //检查预约状态信息查询服务

    //10 结果、状态信息交互服务
    public static String S0059 = "S0059";      //医嘱执行状态信息更新服务
    public static String S0060 = "S0060";      //医嘱执行状态信息查询服务
    public static String S0061 = "S0061";      //检查状态信息更新服务
    public static String S0062 = "S0062";      //检查状态信息查询服务
    public static String S0063 = "S0063";      //检验状态信息更新服务
    public static String S0064 = "S0064";      //检验状态信息查询服务
    public static String S0065 = "S0065";      //普通检验结果信息新增服务
    public static String S0066 = "S0066";      //普通检验结果信息更新服务
    public static String S0067 = "S0067";      //普通检验结果信息查询服务
    public static String S0068 = "S0068";      //药敏检验结果信息新增服务
    public static String S0069 = "S0069";      //药敏检验结果信息更新服务
    public static String S0070 = "S0070";      //药敏检验结果信息查询服务
    public static String S0071 = "S0071";      //检查结果信息新增服务
    public static String S0072 = "S0072";      //检查结果信息更新服务
    public static String S0073 = "S0073";      //检查结果信息查询服务
    public static String S0074 = "S0074";      //病理结果信息新增服务
    public static String S0075 = "S0075";      //病理结果信息更新服务
    public static String S0076 = "S0076";      //病理结果信息查询服务
    public static String S0077 = "S0077";      //手术排班信息新增服务
    public static String S0078 = "S0078";      //手术排班信息更新服务
    public static String S0079 = "S0079";      //手术排班信息查询服务
    public static String S0080 = "S0080";      //手术状态信息更新服务
    public static String S0081 = "S0081";      //手术状态信息查询服务
    public static String S0082 = "S0082";      //门诊就诊登记服务
    public static String S0083 = "S0083";      //门诊就诊登记更新服务
    public static String S0084 = "S0084";      //门诊就诊查询服务

    //服务代码及对应实现类信息关系（实现类名称、说明、方法）
    private static Map<String, ServiceImplVo> codeAndServiceMap = new HashMap<>();

    //转换用
    private static Map<String, String> map = new TreeMap<String, String>();

    private static final String PatientRegistryReviseRequest = "PatientRegistryReviseRequest";

    public static boolean codeMapContains(String key) {
        return map.containsKey(key);
    }

    public static String getCodeMapValue(String key) {
        return map.get(key);
    }

    //报告查询服务代码
    private static Set<String> docSelectServiceCodeSet = new HashSet<>();

    static {
        map.put(PatientRegistryReviseRequest, S0001);

        //个人信息注册服务
        codeAndServiceMap.put(S0001, new ServiceImplVo(ServiceName.PATIENT, "新增个人注册服务", ServiceMethodType.ADD));
        //个人信息更新服务
        codeAndServiceMap.put(S0002, new ServiceImplVo(ServiceName.PATIENT, "个人信息更新服务", ServiceMethodType.UPDATE));
        //个人信息合并服务
        codeAndServiceMap.put(S0003, new ServiceImplVo(ServiceName.PATIENT, "个人身份合并服务", ServiceMethodType.UPDATE));
        //个人信息查询服务
        codeAndServiceMap.put(S0004, new ServiceImplVo(ServiceName.PATIENT, "个人基本信息查询服务", ServiceMethodType.SELECT));
        //医疗卫生机构（科室）信息注册服务
        codeAndServiceMap.put(S0005, new ServiceImplVo(ServiceName.DEPT, "新增医疗卫生机构（科室）注册服务", ServiceMethodType.ADD));
        //医疗卫生机构（科室）信息更新服务
        codeAndServiceMap.put(S0006, new ServiceImplVo(ServiceName.DEPT, "医疗卫生机构（科室）信息更新服务", ServiceMethodType.UPDATE));
        //医疗卫生机构（科室）信息查询服务
        codeAndServiceMap.put(S0007, new ServiceImplVo(ServiceName.DEPT, "医疗卫生机构（科室）信息查询服务", ServiceMethodType.SELECT));
        //医疗卫生人员信息注册服务
        codeAndServiceMap.put(S0008, new ServiceImplVo(ServiceName.PERSONNEL, "新增医护人员注册服务", ServiceMethodType.ADD));
        //医疗卫生人员信息更新服务
        codeAndServiceMap.put(S0009, new ServiceImplVo(ServiceName.PERSONNEL, "医护人员信息更新服务", ServiceMethodType.UPDATE));
        //医疗卫生人员信息查询服务
        codeAndServiceMap.put(S0010, new ServiceImplVo(ServiceName.PERSONNEL, "医护人员信息查询服务", ServiceMethodType.SELECT));

        codeAndServiceMap.put(S0011, new ServiceImplVo(ServiceName.TERM, "术语注册服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0012, new ServiceImplVo(ServiceName.TERM, "术语更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0013, new ServiceImplVo(ServiceName.TERM, "术语查询服务", ServiceMethodType.SELECT));

        //电子病历文档注册服务
        codeAndServiceMap.put(S0014, new ServiceImplVo(ServiceName.DOC, "电子病历文档注册服务", ServiceMethodType.ADD));
        //电子病历文档调阅服务
        codeAndServiceMap.put(S0015, new ServiceImplVo(ServiceName.DOC, "电子病历文档调阅服务", ServiceMethodType.SELECT));
        //电子病历文档检索服务
        codeAndServiceMap.put(S0016, new ServiceImplVo(ServiceName.DOC, "电子病历文档检索服务", ServiceMethodType.SELECT));

        codeAndServiceMap.put(S0017, new ServiceImplVo(ServiceName.VISIT_MEDICAL_CARD, "就诊卡信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0018, new ServiceImplVo(ServiceName.VISIT_MEDICAL_CARD, "就诊卡信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0019, new ServiceImplVo(ServiceName.VISIT_MEDICAL_CARD, "就诊卡信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0020, new ServiceImplVo(ServiceName.VISIT_NUMBER_SOURCE, "号源排班信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0021, new ServiceImplVo(ServiceName.VISIT_NUMBER_SOURCE, "号源排班信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0022, new ServiceImplVo(ServiceName.VISIT_NUMBER_SOURCE, "号源排班信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0023, new ServiceImplVo(ServiceName.VISIT_OUTPATIENT_REGISTER, "门诊挂号信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0024, new ServiceImplVo(ServiceName.VISIT_OUTPATIENT_REGISTER, "门诊挂号信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0025, new ServiceImplVo(ServiceName.VISIT_OUTPATIENT_REGISTER, "门诊挂号信息查询服务", ServiceMethodType.SELECT));

        //住院就诊信息登记服务
        codeAndServiceMap.put(S0026, new ServiceImplVo(ServiceName.VISIT_INPATIENT_VISIT, "住院就诊登记服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0027, new ServiceImplVo(ServiceName.VISIT_INPATIENT_VISIT, "住院就诊信息更新服务", ServiceMethodType.UPDATE));
        //住院就诊信息查询服务
        codeAndServiceMap.put(S0028, new ServiceImplVo(ServiceName.VISIT_INPATIENT_VISIT, "住院就诊查询服务", ServiceMethodType.SELECT));


        codeAndServiceMap.put(S0029, new ServiceImplVo(ServiceName.VISIT_TRANSFER_DEPT, "住院转科信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0030, new ServiceImplVo(ServiceName.VISIT_TRANSFER_DEPT, "住院转科信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0031, new ServiceImplVo(ServiceName.VISIT_TRANSFER_DEPT, "住院转科信息查询服务", ServiceMethodType.SELECT));

        //出院登记信息新增服务
        codeAndServiceMap.put(S0032, new ServiceImplVo(ServiceName.VISIT_LEAVE_HOSPITAL, "出院登记服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0033, new ServiceImplVo(ServiceName.VISIT_LEAVE_HOSPITAL, "出院登记信息更新服务", ServiceMethodType.UPDATE));
        //出院登记信息查询服务
        codeAndServiceMap.put(S0034, new ServiceImplVo(ServiceName.VISIT_LEAVE_HOSPITAL, "出院信息服务", ServiceMethodType.SELECT));
        //医嘱信息新增服务
        codeAndServiceMap.put(S0035, new ServiceImplVo(ServiceName.ORDERS, "医嘱接收服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0036, new ServiceImplVo(ServiceName.ORDERS, "医嘱信息更新服务", ServiceMethodType.UPDATE));
        //医嘱信息查询服务
        codeAndServiceMap.put(S0037, new ServiceImplVo(ServiceName.ORDERS, "医嘱查询服务", ServiceMethodType.SELECT));

        codeAndServiceMap.put(S0038, new ServiceImplVo(ServiceName.REQUEST_LIS, "检验申请信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0039, new ServiceImplVo(ServiceName.REQUEST_LIS, "检验申请信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0040, new ServiceImplVo(ServiceName.REQUEST_LIS, "检验申请信息查询服务", ServiceMethodType.SELECT));

        //检查申请信息新增服务
        codeAndServiceMap.put(S0041, new ServiceImplVo(ServiceName.REQUEST_RIS, "申请单接收服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0042, new ServiceImplVo(ServiceName.REQUEST_RIS, "检查申请信息更新服务", ServiceMethodType.UPDATE));
        //检查申请信息查询服务
        codeAndServiceMap.put(S0043, new ServiceImplVo(ServiceName.REQUEST_RIS, "申请单查询服务", ServiceMethodType.SELECT));


        codeAndServiceMap.put(S0044, new ServiceImplVo(ServiceName.REQUEST_PIS, "病理申请信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0045, new ServiceImplVo(ServiceName.REQUEST_PIS, "病理申请信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0046, new ServiceImplVo(ServiceName.REQUEST_PIS, "病理申请信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0047, new ServiceImplVo(ServiceName.REQUEST_BLOOD_TRANSFUSION, "输血申请信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0048, new ServiceImplVo(ServiceName.REQUEST_BLOOD_TRANSFUSION, "输血申请信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0049, new ServiceImplVo(ServiceName.REQUEST_BLOOD_TRANSFUSION, "输血申请信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0050, new ServiceImplVo(ServiceName.REQUEST_OPERATION, "手术申请信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0051, new ServiceImplVo(ServiceName.REQUEST_OPERATION, "手术申请信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0052, new ServiceImplVo(ServiceName.REQUEST_OPERATION, "手术申请信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0053, new ServiceImplVo(ServiceName.RESERVE_OUTPATIENT, "门诊预约状态信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0054, new ServiceImplVo(ServiceName.RESERVE_OUTPATIENT, "门诊预约状态信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0055, new ServiceImplVo(ServiceName.RESERVE_OUTPATIENT, "门诊预约状态信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0056, new ServiceImplVo(ServiceName.RESERVE_RIS, "检查预约状态信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0057, new ServiceImplVo(ServiceName.RESERVE_RIS, "检查预约状态信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0058, new ServiceImplVo(ServiceName.RESERVE_RIS, "检查预约状态信息查询服务", ServiceMethodType.SELECT));

        codeAndServiceMap.put(S0059, new ServiceImplVo(ServiceName.STATUS_ORDER_EXEC, "医嘱执行状态信息更新服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0060, new ServiceImplVo(ServiceName.STATUS_ORDER_EXEC, "医嘱执行状态信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0061, new ServiceImplVo(ServiceName.STATUS_RIS, "检查状态信息更新服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0062, new ServiceImplVo(ServiceName.STATUS_RIS, "检查状态信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0063, new ServiceImplVo(ServiceName.STATUS_LIS, "检验状态信息更新服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0064, new ServiceImplVo(ServiceName.STATUS_LIS, "检验状态信息查询服务", ServiceMethodType.SELECT));

        codeAndServiceMap.put(S0065, new ServiceImplVo(ServiceName.DOC, "普通检验结果信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0066, new ServiceImplVo(ServiceName.DOC, "普通检验结果信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0067, new ServiceImplVo(ServiceName.DOC, "普通检验结果信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0068, new ServiceImplVo(ServiceName.DOC, "药敏检验结果信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0069, new ServiceImplVo(ServiceName.DOC, "药敏检验结果信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0070, new ServiceImplVo(ServiceName.DOC, "药敏检验结果信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0071, new ServiceImplVo(ServiceName.DOC, "检查结果信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0072, new ServiceImplVo(ServiceName.DOC, "检查结果信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0073, new ServiceImplVo(ServiceName.DOC, "检查结果信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0074, new ServiceImplVo(ServiceName.DOC, "病理结果信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0075, new ServiceImplVo(ServiceName.DOC, "病理结果信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0076, new ServiceImplVo(ServiceName.DOC, "病理结果信息查询服务", ServiceMethodType.SELECT));

        codeAndServiceMap.put(S0077, new ServiceImplVo(ServiceName.STATUS_OPERATION_SCHEDULING, "手术排班信息新增服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0078, new ServiceImplVo(ServiceName.STATUS_OPERATION_SCHEDULING, "手术排班信息更新服务", ServiceMethodType.UPDATE));
        codeAndServiceMap.put(S0079, new ServiceImplVo(ServiceName.STATUS_OPERATION_SCHEDULING, "手术排班信息查询服务", ServiceMethodType.SELECT));
        codeAndServiceMap.put(S0080, new ServiceImplVo(ServiceName.STATUS_OPERATION, "手术状态信息更新服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0081, new ServiceImplVo(ServiceName.STATUS_OPERATION, "手术状态信息查询服务", ServiceMethodType.SELECT));

        //门诊就诊登记服务
        codeAndServiceMap.put(S0082, new ServiceImplVo(ServiceName.VISIT_OUTPATIENT_VISIT, "门诊就诊登记服务", ServiceMethodType.ADD));
        codeAndServiceMap.put(S0083, new ServiceImplVo(ServiceName.VISIT_OUTPATIENT_VISIT, "门诊就诊登记更新服务", ServiceMethodType.UPDATE));
        //门诊就诊查询服务
        codeAndServiceMap.put(S0084, new ServiceImplVo(ServiceName.VISIT_OUTPATIENT_VISIT, "门诊就诊查询服务", ServiceMethodType.SELECT));


        docSelectServiceCodeSet.add(S0015);
        docSelectServiceCodeSet.add(S0016);
        docSelectServiceCodeSet.add(S0067);
        docSelectServiceCodeSet.add(S0070);
        docSelectServiceCodeSet.add(S0073);
        docSelectServiceCodeSet.add(S0076);
    }

    /**
     * 获取服务代码集合
     *
     * @return
     */
    public static Set<String> getCodeSet() {
        return codeAndServiceMap.keySet();
    }

    /**
     * 获取服务代码集合
     *
     * @return
     */
    public static Map<String, ServiceImplVo> getCodeAndServiceMap() {
        return codeAndServiceMap;
    }

    public static Set<String> getDocSelectServiceCodeSet() {
        return docSelectServiceCodeSet;
    }

}
