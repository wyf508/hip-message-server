package com.djhu.hiup.message.server.service.empi;

import java.lang.reflect.Field;
import java.util.List;

/**
 * 患者匹配条件字段
 * Created by jiangmei on 2017/5/19.
 */
public class MatchingRuleField {

    /**
     * 患者信息匹配的字段
     */
    private List<Field> fieldList;

    public List<Field> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<Field> fieldList) {
        this.fieldList = fieldList;
    }

    public MatchingRuleField(List<Field> fieldList) {
        this.fieldList = fieldList;
    }
}
