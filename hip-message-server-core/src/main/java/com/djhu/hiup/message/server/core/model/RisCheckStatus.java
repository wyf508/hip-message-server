package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 状态信息_检查状态_检查状态信息表
 */
public class RisCheckStatus {
    private BigDecimal pk;

    private BigDecimal statusRisPk;

    private String requestNo;

    private String operationDate;

    private String operationPersonCode;

    private String operationPersonName;

    private String execDeptCode;

    private String execDeptName;

    private String checkStatusCode;

    private String checkStatusName;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getStatusRisPk() {
        return statusRisPk;
    }

    public void setStatusRisPk(BigDecimal statusRisPk) {
        this.statusRisPk = statusRisPk == null ? null : statusRisPk;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate == null ? null : operationDate.trim();
    }

    public String getOperationPersonCode() {
        return operationPersonCode;
    }

    public void setOperationPersonCode(String operationPersonCode) {
        this.operationPersonCode = operationPersonCode == null ? null : operationPersonCode.trim();
    }

    public String getOperationPersonName() {
        return operationPersonName;
    }

    public void setOperationPersonName(String operationPersonName) {
        this.operationPersonName = operationPersonName == null ? null : operationPersonName.trim();
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

    public String getCheckStatusCode() {
        return checkStatusCode;
    }

    public void setCheckStatusCode(String checkStatusCode) {
        this.checkStatusCode = checkStatusCode == null ? null : checkStatusCode.trim();
    }

    public String getCheckStatusName() {
        return checkStatusName;
    }

    public void setCheckStatusName(String checkStatusName) {
        this.checkStatusName = checkStatusName == null ? null : checkStatusName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}