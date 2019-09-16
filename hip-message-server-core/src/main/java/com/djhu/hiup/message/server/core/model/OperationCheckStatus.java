package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 状态信息-手术状态-检查状态
 */
public class OperationCheckStatus {
    private BigDecimal pk;

    private BigDecimal statusOperationPk;

    private String requestNo;

    private String operationDate;

    private String operationPersonCode;

    private String operationPersonName;

    private String execDeptCode;

    private String execDeptName;

    private String operativeStateCode;

    private String operativeStateName;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getStatusOperation() {
        return statusOperationPk;
    }

    public void setStatusOperation(BigDecimal statusOperationPk) {
        this.statusOperationPk = statusOperationPk == null ? null : statusOperationPk;
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

    public String getOperativeStateCode() {
        return operativeStateCode;
    }

    public void setOperativeStateCode(String operativeStateCode) {
        this.operativeStateCode = operativeStateCode;
    }

    public String getOperativeStateName() {
        return operativeStateName;
    }

    public void setOperativeStateName(String operativeStateName) {
        this.operativeStateName = operativeStateName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}