package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 状态信息_检验状态信息表
 */
public class StatusLis {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String requestNo;

    private String requestDepict;

    private String statusCode;

    private String specimentId;

    private String specimentTypeCode;

    private String specimentTypeDepict;

    private String operationTime;

    private String operationCode;

    private String operationName;

    private String operationDepict;

    private String operationPersonCode;

    private String operationPersonName;

    private String operationDeptCode;

    private String operationDeptName;

    private String patientId;

    private String identityNo;

    private String medicareCardNo;

    private String name;

    private String genderId;

    private String genderDepict;

    private String dateOfBirth;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    private RequestLis requestLis;

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

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getRequestDepict() {
        return requestDepict;
    }

    public void setRequestDepict(String requestDepict) {
        this.requestDepict = requestDepict == null ? null : requestDepict.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getSpecimentId() {
        return specimentId;
    }

    public void setSpecimentId(String specimentId) {
        this.specimentId = specimentId == null ? null : specimentId.trim();
    }

    public String getSpecimentTypeCode() {
        return specimentTypeCode;
    }

    public void setSpecimentTypeCode(String specimentTypeCode) {
        this.specimentTypeCode = specimentTypeCode == null ? null : specimentTypeCode.trim();
    }

    public String getSpecimentTypeDepict() {
        return specimentTypeDepict;
    }

    public void setSpecimentTypeDepict(String specimentTypeDepict) {
        this.specimentTypeDepict = specimentTypeDepict == null ? null : specimentTypeDepict.trim();
    }

    public String getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(String operationTime) {
        this.operationTime = operationTime == null ? null : operationTime.trim();
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

    public String getOperationDepict() {
        return operationDepict;
    }

    public void setOperationDepict(String operationDepict) {
        this.operationDepict = operationDepict == null ? null : operationDepict.trim();
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

    public String getOperationDeptCode() {
        return operationDeptCode;
    }

    public void setOperationDeptCode(String operationDeptCode) {
        this.operationDeptCode = operationDeptCode == null ? null : operationDeptCode.trim();
    }

    public String getOperationDeptName() {
        return operationDeptName;
    }

    public void setOperationDeptName(String operationDeptName) {
        this.operationDeptName = operationDeptName == null ? null : operationDeptName.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getMedicareCardNo() {
        return medicareCardNo;
    }

    public void setMedicareCardNo(String medicareCardNo) {
        this.medicareCardNo = medicareCardNo == null ? null : medicareCardNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId == null ? null : genderId.trim();
    }

    public String getGenderDepict() {
        return genderDepict;
    }

    public void setGenderDepict(String genderDepict) {
        this.genderDepict = genderDepict == null ? null : genderDepict.trim();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth == null ? null : dateOfBirth.trim();
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

    public RequestLis getRequestLis() {
        return requestLis;
    }

    public void setRequestLis(RequestLis requestLis) {
        this.requestLis = requestLis;
    }
}