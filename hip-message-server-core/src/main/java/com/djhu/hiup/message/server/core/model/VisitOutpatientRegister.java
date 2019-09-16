package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 就诊信息_门诊挂号信息表
 */
public class VisitOutpatientRegister {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String doorEmergencyNo;

    private String visitNumber;

    private String visitFlowNo;

    private String visitTypeCode;

    private String visitTypeDepict;

    private String visitTime;

    private String visitCauseDepict;

    private String medicareTypeId;

    private String medicareTypeDepict;

    private String patientId;

    private String identityNo;

    private String name;

    private String responsiblePhysicianId;

    private String responsiblePhysicianName;

    private String deptId;

    private String deptName;

    private String serviceInstitutionsId;

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

    public String getDoorEmergencyNo() {
        return doorEmergencyNo;
    }

    public void setDoorEmergencyNo(String doorEmergencyNo) {
        this.doorEmergencyNo = doorEmergencyNo == null ? null : doorEmergencyNo.trim();
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

    public String getVisitTypeCode() {
        return visitTypeCode;
    }

    public void setVisitTypeCode(String visitTypeCode) {
        this.visitTypeCode = visitTypeCode == null ? null : visitTypeCode.trim();
    }

    public String getVisitTypeDepict() {
        return visitTypeDepict;
    }

    public void setVisitTypeDepict(String visitTypeDepict) {
        this.visitTypeDepict = visitTypeDepict == null ? null : visitTypeDepict.trim();
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    public String getVisitCauseDepict() {
        return visitCauseDepict;
    }

    public void setVisitCauseDepict(String visitCauseDepict) {
        this.visitCauseDepict = visitCauseDepict == null ? null : visitCauseDepict.trim();
    }

    public String getMedicareTypeId() {
        return medicareTypeId;
    }

    public void setMedicareTypeId(String medicareTypeId) {
        this.medicareTypeId = medicareTypeId == null ? null : medicareTypeId.trim();
    }

    public String getMedicareTypeDepict() {
        return medicareTypeDepict;
    }

    public void setMedicareTypeDepict(String medicareTypeDepict) {
        this.medicareTypeDepict = medicareTypeDepict == null ? null : medicareTypeDepict.trim();
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

    public String getResponsiblePhysicianId() {
        return responsiblePhysicianId;
    }

    public void setResponsiblePhysicianId(String responsiblePhysicianId) {
        this.responsiblePhysicianId = responsiblePhysicianId == null ? null : responsiblePhysicianId.trim();
    }

    public String getResponsiblePhysicianName() {
        return responsiblePhysicianName;
    }

    public void setResponsiblePhysicianName(String responsiblePhysicianName) {
        this.responsiblePhysicianName = responsiblePhysicianName == null ? null : responsiblePhysicianName.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getServiceInstitutionsId() {
        return serviceInstitutionsId;
    }

    public void setServiceInstitutionsId(String serviceInstitutionsId) {
        this.serviceInstitutionsId = serviceInstitutionsId == null ? null : serviceInstitutionsId.trim();
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