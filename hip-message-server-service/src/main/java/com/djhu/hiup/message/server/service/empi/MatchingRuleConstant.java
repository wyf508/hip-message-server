package com.djhu.hiup.message.server.service.empi;

/**
 * 匹配规则常量
 * 1）：通过非必须匹配规则获取关联的患者交叉索引信息
 * 2）：必须匹配规则为空情况下、使用非必须匹配规则进行分组
 * Created by jiangmei on 2018/1/24.
 */
public class MatchingRuleConstant {
    /**
     *匹配规则文件名称
     */
    public static final String CONF_FILE="rule.properties";

    /**
     *患者匹配规则前缀
     */
    public static final String PATIENT_PREFIX="patient.matching.rule";

    /**
     * 空字符串，患者分组使用
     */
    public static final String EMPTY= "empty";

    /**
     *必须规则前缀
     */
    public static final String MUST_PREFIX="must.matching.rule";

    /**
     * ROW_END
     */
    public static final String ROW_END = "\r\n";
}
