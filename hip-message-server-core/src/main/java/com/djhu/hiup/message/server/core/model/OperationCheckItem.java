package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请单信息-手术申请单-检查项目
 */
public class OperationCheckItem {
    private BigDecimal pk;

    private BigDecimal requestOperationPk;

    private String operationCode;

    private String operationName;

    private String operationGradeCode;

    private String operationGradeName;

    private String scheduledOperationTime;

    private String operationPhsicianCode;

    private String operationPhsicianName;

    private String execDeptCode;

    private String execDeptName;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getRequestOperationPk() {
        return requestOperationPk;
    }

    public void setRequestOperationPk(BigDecimal requestOperationPk) {
        this.requestOperationPk = requestOperationPk;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode == null ? null : operationCode.trim();
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName == null ? null : operationName.trim();
    }

    public String getOperationGradeCode() {
        return operationGradeCode;
    }

    public void setOperationGradeCode(String operationGradeCode) {
        this.operationGradeCode = operationGradeCode == null ? null : operationGradeCode.trim();
    }

    public String getOperationGradeName() {
        return operationGradeName;
    }

    public void setOperationGradeName(String operationGradeName) {
        this.operationGradeName = operationGradeName == null ? null : operationGradeName.trim();
    }

    public String getScheduledOperationTime() {
        return scheduledOperationTime;
    }

    public void setScheduledOperationTime(String scheduledOperationTime) {
        this.scheduledOperationTime = scheduledOperationTime == null ? null : scheduledOperationTime.trim();
    }

    public String getOperationPhsicianCode() {
        return operationPhsicianCode;
    }

    public void setOperationPhsicianCode(String operationPhsicianCode) {
        this.operationPhsicianCode = operationPhsicianCode == null ? null : operationPhsicianCode.trim();
    }

    public String getOperationPhsicianName() {
        return operationPhsicianName;
    }

    public void setOperationPhsicianName(String operationPhsicianName) {
        this.operationPhsicianName = operationPhsicianName == null ? null : operationPhsicianName.trim();
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