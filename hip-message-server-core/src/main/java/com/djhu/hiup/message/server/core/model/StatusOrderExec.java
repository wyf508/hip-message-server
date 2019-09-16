package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 状态信息_医嘱执行状态信息表
 */
public class StatusOrderExec {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String effectiveTime;

    private String domainId;

    private String patientId;

    private String operationDate;

    private String operationPersonCode;

    private String operationPersonName;

    private String execDeptCode;

    private String execDeptName;

    private String orderNo;

    private String requestNo;

    private String orderItemOrderType;

    private String orderItemOrderTypeName;

    private String specimentId;

    private String sampleCollectionDate;

    private String sampleCollectionId;

    private String sampleCollectionName;

    private String orderCauseRevocationCode;

    private String orderCauseRevocationDepict;

    private String orderExecStatusCode;

    private String orderExecStatusDepict;

    private String inpatientFrequency;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId == null ? null : msgId.trim();
    }

    public String getMsgCreationTime() {
        return msgCreationTime;
    }

    public void setMsgCreationTime(String msgCreationTime) {
        this.msgCreationTime = msgCreationTime == null ? null : msgCreationTime.trim();
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId == null ? null : sendId.trim();
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime == null ? null : effectiveTime.trim();
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId == null ? null : domainId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
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

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getOrderItemOrderType() {
        return orderItemOrderType;
    }

    public void setOrderItemOrderType(String orderItemOrderType) {
        this.orderItemOrderType = orderItemOrderType == null ? null : orderItemOrderType.trim();
    }

    public String getOrderItemOrderTypeName() {
        return orderItemOrderTypeName;
    }

    public void setOrderItemOrderTypeName(String orderItemOrderTypeName) {
        this.orderItemOrderTypeName = orderItemOrderTypeName == null ? null : orderItemOrderTypeName.trim();
    }

    public String getSpecimentId() {
        return specimentId;
    }

    public void setSpecimentId(String specimentId) {
        this.specimentId = specimentId == null ? null : specimentId.trim();
    }

    public String getSampleCollectionDate() {
        return sampleCollectionDate;
    }

    public void setSampleCollectionDate(String sampleCollectionDate) {
        this.sampleCollectionDate = sampleCollectionDate == null ? null : sampleCollectionDate.trim();
    }

    public String getSampleCollectionId() {
        return sampleCollectionId;
    }

    public void setSampleCollectionId(String sampleCollectionId) {
        this.sampleCollectionId = sampleCollectionId == null ? null : sampleCollectionId.trim();
    }

    public String getSampleCollectionName() {
        return sampleCollectionName;
    }

    public void setSampleCollectionName(String sampleCollectionName) {
        this.sampleCollectionName = sampleCollectionName == null ? null : sampleCollectionName.trim();
    }

    public String getOrderCauseRevocationCode() {
        return orderCauseRevocationCode;
    }

    public void setOrderCauseRevocationCode(String orderCauseRevocationCode) {
        this.orderCauseRevocationCode = orderCauseRevocationCode == null ? null : orderCauseRevocationCode.trim();
    }

    public String getOrderCauseRevocationDepict() {
        return orderCauseRevocationDepict;
    }

    public void setOrderCauseRevocationDepict(String orderCauseRevocationDepict) {
        this.orderCauseRevocationDepict = orderCauseRevocationDepict == null ? null : orderCauseRevocationDepict.trim();
    }

    public String getOrderExecStatusCode() {
        return orderExecStatusCode;
    }

    public void setOrderExecStatusCode(String orderExecStatusCode) {
        this.orderExecStatusCode = orderExecStatusCode == null ? null : orderExecStatusCode.trim();
    }

    public String getOrderExecStatusDepict() {
        return orderExecStatusDepict;
    }

    public void setOrderExecStatusDepict(String orderExecStatusDepict) {
        this.orderExecStatusDepict = orderExecStatusDepict == null ? null : orderExecStatusDepict.trim();
    }

    public String getInpatientFrequency() {
        return inpatientFrequency;
    }

    public void setInpatientFrequency(String inpatientFrequency) {
        this.inpatientFrequency = inpatientFrequency == null ? null : inpatientFrequency.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getHiupStatus() {
        return hiupStatus;
    }

    public void setHiupStatus(String hiupStatus) {
        this.hiupStatus = hiupStatus == null ? null : hiupStatus.trim();
    }

    public String getHiupInfo() {
        return hiupInfo;
    }

    public void setHiupInfo(String hiupInfo) {
        this.hiupInfo = hiupInfo == null ? null : hiupInfo.trim();
    }
}