package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 状态信息_手术排班信息表
 */
public class StatusOperationScheduling {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String operationClassNo;

    private String reservesOperationTime;

    private String expectedDuration;

    private String expectedDurationUnit;

    private String outpatientNo;

    private String inpatientNo;

    private String patientId;

    private String visitNumber;

    private String name;

    private String reservesDeviceCode;

    private String reserveDeviceName;

    private String mainKnifeDoctorCode;

    private String mainKnifeDoctorName;

    private String assistantInfo;

    private String operativeAssistantCode;

    private String operativeAssistantName;

    private String execDeptCode;

    private String execDeptName;

    private String operativeRoom;

    private String operativeRequestNo;

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

    public String getOperationClassNo() {
        return operationClassNo;
    }

    public void setOperationClassNo(String operationClassNo) {
        this.operationClassNo = operationClassNo == null ? null : operationClassNo.trim();
    }

    public String getReservesOperationTime() {
        return reservesOperationTime;
    }

    public void setReservesOperationTime(String reservesOperationTime) {
        this.reservesOperationTime = reservesOperationTime == null ? null : reservesOperationTime.trim();
    }

    public String getExpectedDuration() {
        return expectedDuration;
    }

    public void setExpectedDuration(String expectedDuration) {
        this.expectedDuration = expectedDuration == null ? null : expectedDuration.trim();
    }

    public String getExpectedDurationUnit() {
        return expectedDurationUnit;
    }

    public void setExpectedDurationUnit(String expectedDurationUnit) {
        this.expectedDurationUnit = expectedDurationUnit == null ? null : expectedDurationUnit.trim();
    }

    public String getOutpatientNo() {
        return outpatientNo;
    }

    public void setOutpatientNo(String outpatientNo) {
        this.outpatientNo = outpatientNo == null ? null : outpatientNo.trim();
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo == null ? null : inpatientNo.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber == null ? null : visitNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getReservesDeviceCode() {
        return reservesDeviceCode;
    }

    public void setReservesDeviceCode(String reservesDeviceCode) {
        this.reservesDeviceCode = reservesDeviceCode == null ? null : reservesDeviceCode.trim();
    }

    public String getReserveDeviceName() {
        return reserveDeviceName;
    }

    public void setReserveDeviceName(String reserveDeviceName) {
        this.reserveDeviceName = reserveDeviceName == null ? null : reserveDeviceName.trim();
    }

    public String getMainKnifeDoctorCode() {
        return mainKnifeDoctorCode;
    }

    public void setMainKnifeDoctorCode(String mainKnifeDoctorCode) {
        this.mainKnifeDoctorCode = mainKnifeDoctorCode == null ? null : mainKnifeDoctorCode.trim();
    }

    public String getMainKnifeDoctorName() {
        return mainKnifeDoctorName;
    }

    public void setMainKnifeDoctorName(String mainKnifeDoctorName) {
        this.mainKnifeDoctorName = mainKnifeDoctorName == null ? null : mainKnifeDoctorName.trim();
    }

    public String getAssistantInfo() {
        return assistantInfo;
    }

    public void setAssistantInfo(String assistantInfo) {
        this.assistantInfo = assistantInfo == null ? null : assistantInfo.trim();
    }

    public String getOperativeAssistantCode() {
        return operativeAssistantCode;
    }

    public void setOperativeAssistantCode(String operativeAssistantCode) {
        this.operativeAssistantCode = operativeAssistantCode == null ? null : operativeAssistantCode.trim();
    }

    public String getOperativeAssistantName() {
        return operativeAssistantName;
    }

    public void setOperativeAssistantName(String operativeAssistantName) {
        this.operativeAssistantName = operativeAssistantName == null ? null : operativeAssistantName.trim();
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

    public String getOperativeRoom() {
        return operativeRoom;
    }

    public void setOperativeRoom(String operativeRoom) {
        this.operativeRoom = operativeRoom == null ? null : operativeRoom.trim();
    }

    public String getOperativeRequestNo() {
        return operativeRequestNo;
    }

    public void setOperativeRequestNo(String operativeRequestNo) {
        this.operativeRequestNo = operativeRequestNo == null ? null : operativeRequestNo.trim();
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