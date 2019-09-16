package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请单信息_检查申请单_检查项目信息表
 */
public class RisCheckItem {
    private BigDecimal pk;

    private BigDecimal requestRisPk;

    private String orderId;

    private String checkTypeItemCode;

    private String checkItemName;

    private String checkModeCode;

    private String checkModeName;

    private String checkTypeCode;

    private String checkTypeName;

    private String checkBodyCode;

    private String checkBodyName;

    private String execTime;

    private String execDeptCode;

    private String execDeptName;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getRequestRisPk() {
        return requestRisPk;
    }

    public void setRequestRisPk(BigDecimal requestRisPk) {
        this.requestRisPk = requestRisPk == null ? null : requestRisPk;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCheckTypeItemCode() {
        return checkTypeItemCode;
    }

    public void setCheckTypeItemCode(String checkTypeItemCode) {
        this.checkTypeItemCode = checkTypeItemCode == null ? null : checkTypeItemCode.trim();
    }

    public String getCheckItemName() {
        return checkItemName;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName == null ? null : checkItemName.trim();
    }

    public String getCheckModeCode() {
        return checkModeCode;
    }

    public void setCheckModeCode(String checkModeCode) {
        this.checkModeCode = checkModeCode == null ? null : checkModeCode.trim();
    }

    public String getCheckModeName() {
        return checkModeName;
    }

    public void setCheckModeName(String checkModeName) {
        this.checkModeName = checkModeName == null ? null : checkModeName.trim();
    }

    public String getCheckTypeCode() {
        return checkTypeCode;
    }

    public void setCheckTypeCode(String checkTypeCode) {
        this.checkTypeCode = checkTypeCode == null ? null : checkTypeCode.trim();
    }

    public String getCheckTypeName() {
        return checkTypeName;
    }

    public void setCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName == null ? null : checkTypeName.trim();
    }

    public String getCheckBodyCode() {
        return checkBodyCode;
    }

    public void setCheckBodyCode(String checkBodyCode) {
        this.checkBodyCode = checkBodyCode == null ? null : checkBodyCode.trim();
    }

    public String getCheckBodyName() {
        return checkBodyName;
    }

    public void setCheckBodyName(String checkBodyName) {
        this.checkBodyName = checkBodyName == null ? null : checkBodyName.trim();
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime == null ? null : execTime.trim();
    }

    public String getExecDeptCode() {
        return execDeptCode;
    }

    public void setExecDeptCode(String execDeptCode) {
        this.execDeptCode = execDeptCode == null ? null : execDeptCode.trim();
    }

    public String getExecDeptName() {
        return execDeptName;
    }

    public void setExecDeptName(String execDeptName) {
        this.execDeptName = execDeptName == null ? null : execDeptName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}