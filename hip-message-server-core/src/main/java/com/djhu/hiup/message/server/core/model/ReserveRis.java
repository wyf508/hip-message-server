package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 预约信息_检查预约信息表
 */
public class ReserveRis {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String reservesFlowNo;

    private String visitTypeCode;

    private String visitTypeName;

    private String reservesCheckTime;

    private String domainId;

    private String patientId;

    private String outpatientNo;

    private String inpatientNo;

    private String visitNumber;

    private String reservesOrderNo;

    private String name;

    private String patientDeptId;

    private String patientDeptName;

    private String reserveDeviceId;

    private String reserveDeviceName;

    private String reserveClerkId;

    private String reserveClerkName;

    private String execDeptCode;

    private String execDeptName;

    private String checkRequestNo;

    private String orderNo;

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

    public String getReservesFlowNo() {
        return reservesFlowNo;
    }

    public void setReservesFlowNo(String reservesFlowNo) {
        this.reservesFlowNo = reservesFlowNo == null ? null : reservesFlowNo.trim();
    }

    public String getVisitTypeCode() {
        return visitTypeCode;
    }

    public void setVisitTypeCode(String visitTypeCode) {
        this.visitTypeCode = visitTypeCode == null ? null : visitTypeCode.trim();
    }

    public String getVisitTypeName() {
        return visitTypeName;
    }

    public void setVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName == null ? null : visitTypeName.trim();
    }

    public String getReservesCheckTime() {
        return reservesCheckTime;
    }

    public void setReservesCheckTime(String reservesCheckTime) {
        this.reservesCheckTime = reservesCheckTime == null ? null : reservesCheckTime.trim();
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

    public String getVisitNumber() {
        return visitNumber;
    }

    public void setVisitNumber(String visitNumber) {
        this.visitNumber = visitNumber == null ? null : visitNumber.trim();
    }

    public String getReservesOrderNo() {
        return reservesOrderNo;
    }

    public void setReservesOrderNo(String reservesOrderNo) {
        this.reservesOrderNo = reservesOrderNo == null ? null : reservesOrderNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPatientDeptId() {
        return patientDeptId;
    }

    public void setPatientDeptId(String patientDeptId) {
        this.patientDeptId = patientDeptId == null ? null : patientDeptId.trim();
    }

    public String getPatientDeptName() {
        return patientDeptName;
    }

    public void setPatientDeptName(String patientDeptName) {
        this.patientDeptName = patientDeptName == null ? null : patientDeptName.trim();
    }

    public String getReserveDeviceId() {
        return reserveDeviceId;
    }

    public void setReserveDeviceId(String reserveDeviceId) {
        this.reserveDeviceId = reserveDeviceId == null ? null : reserveDeviceId.trim();
    }

    public String getReserveDeviceName() {
        return reserveDeviceName;
    }

    public void setReserveDeviceName(String reserveDeviceName) {
        this.reserveDeviceName = reserveDeviceName == null ? null : reserveDeviceName.trim();
    }

    public String getReserveClerkId() {
        return reserveClerkId;
    }

    public void setReserveClerkId(String reserveClerkId) {
        this.reserveClerkId = reserveClerkId == null ? null : reserveClerkId.trim();
    }

    public String getReserveClerkName() {
        return reserveClerkName;
    }

    public void setReserveClerkName(String reserveClerkName) {
        this.reserveClerkName = reserveClerkName == null ? null : reserveClerkName.trim();
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

    public String getCheckRequestNo() {
        return checkRequestNo;
    }

    public void setCheckRequestNo(String checkRequestNo) {
        this.checkRequestNo = checkRequestNo == null ? null : checkRequestNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
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