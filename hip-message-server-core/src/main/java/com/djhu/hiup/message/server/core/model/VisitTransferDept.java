package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 就诊信息_转科信息表
 */
public class VisitTransferDept {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String inpatientNo;

    private String visitNumber;

    private String visitFlowNo;

    private String patientId;

    private String turnInTime;

    private String turnInDeptId;

    private String turnInDeptName;

    private String turnInInpatientAreaId;

    private String turnInInpatientAreaDepict;

    private String turnInWardId;

    private String turnInWardDepict;

    private String turnInHositalBedId;

    private String turnInHositalBedDepict;

    private String turnOutTime;

    private String turnOutDeptId;

    private String turnOutDeptName;

    private String turnOutInpatientAreaId;

    private String turnOutInpatientAreaDepict;

    private String turnOutWardId;

    private String turnOutWardDepict;

    private String turnOutHositalBedId;

    private String turnOutHositalBedDepict;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    private VisitInpatientVisit visitInpatientVisit;

    public VisitInpatientVisit getVisitInpatientVisit() {
        return visitInpatientVisit;
    }

    public void setVisitInpatientVisit(VisitInpatientVisit visitInpatientVisit) {
        this.visitInpatientVisit = visitInpatientVisit;
    }

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

    public String getVisitFlowNo() {
        return visitFlowNo;
    }

    public void setVisitFlowNo(String visitFlowNo) {
        this.visitFlowNo = visitFlowNo == null ? null : visitFlowNo.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getTurnInTime() {
        return turnInTime;
    }

    public void setTurnInTime(String turnInTime) {
        this.turnInTime = turnInTime == null ? null : turnInTime.trim();
    }

    public String getTurnInDeptId() {
        return turnInDeptId;
    }

    public void setTurnInDeptId(String turnInDeptId) {
        this.turnInDeptId = turnInDeptId == null ? null : turnInDeptId.trim();
    }

    public String getTurnInDeptName() {
        return turnInDeptName;
    }

    public void setTurnInDeptName(String turnInDeptName) {
        this.turnInDeptName = turnInDeptName == null ? null : turnInDeptName.trim();
    }

    public String getTurnInInpatientAreaId() {
        return turnInInpatientAreaId;
    }

    public void setTurnInInpatientAreaId(String turnInInpatientAreaId) {
        this.turnInInpatientAreaId = turnInInpatientAreaId == null ? null : turnInInpatientAreaId.trim();
    }

    public String getTurnInInpatientAreaDepict() {
        return turnInInpatientAreaDepict;
    }

    public void setTurnInInpatientAreaDepict(String turnInInpatientAreaDepict) {
        this.turnInInpatientAreaDepict = turnInInpatientAreaDepict == null ? null : turnInInpatientAreaDepict.trim();
    }

    public String getTurnInWardId() {
        return turnInWardId;
    }

    public void setTurnInWardId(String turnInWardId) {
        this.turnInWardId = turnInWardId == null ? null : turnInWardId.trim();
    }

    public String getTurnInWardDepict() {
        return turnInWardDepict;
    }

    public void setTurnInWardDepict(String turnInWardDepict) {
        this.turnInWardDepict = turnInWardDepict == null ? null : turnInWardDepict.trim();
    }

    public String getTurnInHositalBedId() {
        return turnInHositalBedId;
    }

    public void setTurnInHositalBedId(String turnInHositalBedId) {
        this.turnInHositalBedId = turnInHositalBedId == null ? null : turnInHositalBedId.trim();
    }

    public String getTurnInHositalBedDepict() {
        return turnInHositalBedDepict;
    }

    public void setTurnInHositalBedDepict(String turnInHositalBedDepict) {
        this.turnInHositalBedDepict = turnInHositalBedDepict == null ? null : turnInHositalBedDepict.trim();
    }

    public String getTurnOutTime() {
        return turnOutTime;
    }

    public void setTurnOutTime(String turnOutTime) {
        this.turnOutTime = turnOutTime == null ? null : turnOutTime.trim();
    }

    public String getTurnOutDeptId() {
        return turnOutDeptId;
    }

    public void setTurnOutDeptId(String turnOutDeptId) {
        this.turnOutDeptId = turnOutDeptId == null ? null : turnOutDeptId.trim();
    }

    public String getTurnOutDeptName() {
        return turnOutDeptName;
    }

    public void setTurnOutDeptName(String turnOutDeptName) {
        this.turnOutDeptName = turnOutDeptName == null ? null : turnOutDeptName.trim();
    }

    public String getTurnOutInpatientAreaId() {
        return turnOutInpatientAreaId;
    }

    public void setTurnOutInpatientAreaId(String turnOutInpatientAreaId) {
        this.turnOutInpatientAreaId = turnOutInpatientAreaId == null ? null : turnOutInpatientAreaId.trim();
    }

    public String getTurnOutInpatientAreaDepict() {
        return turnOutInpatientAreaDepict;
    }

    public void setTurnOutInpatientAreaDepict(String turnOutInpatientAreaDepict) {
        this.turnOutInpatientAreaDepict = turnOutInpatientAreaDepict == null ? null : turnOutInpatientAreaDepict.trim();
    }

    public String getTurnOutWardId() {
        return turnOutWardId;
    }

    public void setTurnOutWardId(String turnOutWardId) {
        this.turnOutWardId = turnOutWardId == null ? null : turnOutWardId.trim();
    }

    public String getTurnOutWardDepict() {
        return turnOutWardDepict;
    }

    public void setTurnOutWardDepict(String turnOutWardDepict) {
        this.turnOutWardDepict = turnOutWardDepict == null ? null : turnOutWardDepict.trim();
    }

    public String getTurnOutHositalBedId() {
        return turnOutHositalBedId;
    }

    public void setTurnOutHositalBedId(String turnOutHositalBedId) {
        this.turnOutHositalBedId = turnOutHositalBedId == null ? null : turnOutHositalBedId.trim();
    }

    public String getTurnOutHositalBedDepict() {
        return turnOutHositalBedDepict;
    }

    public void setTurnOutHositalBedDepict(String turnOutHositalBedDepict) {
        this.turnOutHositalBedDepict = turnOutHositalBedDepict == null ? null : turnOutHositalBedDepict.trim();
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