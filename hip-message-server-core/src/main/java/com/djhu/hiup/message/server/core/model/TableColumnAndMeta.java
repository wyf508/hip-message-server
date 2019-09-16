package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;

/**
 * 交互服务表中列和数据元标识对应关系信息表
 */
public class TableColumnAndMeta {
    private BigDecimal pk;

    private String columnName;

    private String metaId;

    private String createDate;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName == null ? null : columnName.trim();
    }

    public String getMetaId() {
        return metaId;
    }

    public void setMetaId(String metaId) {
        this.metaId = metaId == null ? null : metaId.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }
}