package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 预约信息_门诊预约信息表
 */
public class ReserveOutpatient {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String reserveId;

    private String reserveTime;

    private String patientId;

    private String identityNo;

    private String name;

    private String systemReserveTime;

    private String systemId;

    private String reserveStatusCode;

    private String reserveStatusDepict;

    private String medicalStaffReserveTime;

    private String reserveMedicalStaffCode;

    private String resourceId;

    private String resourceStartTime;

    private String resourceEndTime;

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

    public String getReserveId() {
        return reserveId;
    }

    public void setReserveId(String reserveId) {
        this.reserveId = reserveId == null ? null : reserveId.trim();
    }

    public String getReserveTime() {
        return reserveTime;
    }

    public void setReserveTime(String reserveTime) {
        this.reserveTime = reserveTime == null ? null : reserveTime.trim();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSystemReserveTime() {
        return systemReserveTime;
    }

    public void setSystemReserveTime(String systemReserveTime) {
        this.systemReserveTime = systemReserveTime == null ? null : systemReserveTime.trim();
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }

    public String getReserveStatusCode() {
        return reserveStatusCode;
    }

    public void setReserveStatusCode(String reserveStatusCode) {
        this.reserveStatusCode = reserveStatusCode == null ? null : reserveStatusCode.trim();
    }

    public String getReserveStatusDepict() {
        return reserveStatusDepict;
    }

    public void setReserveStatusDepict(String reserveStatusDepict) {
        this.reserveStatusDepict = reserveStatusDepict == null ? null : reserveStatusDepict.trim();
    }

    public String getMedicalStaffReserveTime() {
        return medicalStaffReserveTime;
    }

    public void setMedicalStaffReserveTime(String medicalStaffReserveTime) {
        this.medicalStaffReserveTime = medicalStaffReserveTime == null ? null : medicalStaffReserveTime.trim();
    }

    public String getReserveMedicalStaffCode() {
        return reserveMedicalStaffCode;
    }

    public void setReserveMedicalStaffCode(String reserveMedicalStaffCode) {
        this.reserveMedicalStaffCode = reserveMedicalStaffCode == null ? null : reserveMedicalStaffCode.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public String getResourceStartTime() {
        return resourceStartTime;
    }

    public void setResourceStartTime(String resourceStartTime) {
        this.resourceStartTime = resourceStartTime == null ? null : resourceStartTime.trim();
    }

    public String getResourceEndTime() {
        return resourceEndTime;
    }

    public void setResourceEndTime(String resourceEndTime) {
        this.resourceEndTime = resourceEndTime == null ? null : resourceEndTime.trim();
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