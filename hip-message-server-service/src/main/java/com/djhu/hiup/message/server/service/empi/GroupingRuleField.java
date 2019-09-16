package com.djhu.hiup.message.server.service.empi;

import java.lang.reflect.Field;

/**
 * 分组嵌套属性，便于递归调用
 * Created by jiangmei on 2017/6/9.
 */
public class GroupingRuleField {

    /**
     * 分组属性
     */
    private Field field;

    /**
     * 分组属性子集
     */
    private GroupingRuleField sonGroupingRuleField;

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public GroupingRuleField getSonGroupingRuleField() {
        return sonGroupingRuleField;
    }

    public void setSonGroupingRuleField(GroupingRuleField sonGroupingRuleField) {
        this.sonGroupingRuleField = sonGroupingRuleField;
    }

    public GroupingRuleField() {
    }
}
