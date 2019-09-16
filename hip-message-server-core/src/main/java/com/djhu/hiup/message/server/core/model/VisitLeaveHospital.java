package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 就诊信息_出院信息表
 */
public class VisitLeaveHospital {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String inpatientNo;

    private String visitNumber;

    private String visitFlowNo;

    private String visitTypeCode;

    private String visitTypeDepict;

    private String leaveHospitalTime;

    private String inpatientDays;

    private String patientId;

    private String identityNo;

    private String name;

    private String authorCode;

    private String authorName;

    private String deptId;

    private String deptDepict;

    private String inpatientAreaId;

    private String inpatientAreaName;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    private List<LeaveHospitalDiagnosis> leaveHospitalDiagnosisList=new ArrayList<>();

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

    public String getLeaveHospitalTime() {
        return leaveHospitalTime;
    }

    public void setLeaveHospitalTime(String leaveHospitalTime) {
        this.leaveHospitalTime = leaveHospitalTime == null ? null : leaveHospitalTime.trim();
    }

    public String getInpatientDays() {
        return inpatientDays;
    }

    public void setInpatientDays(String inpatientDays) {
        this.inpatientDays = inpatientDays == null ? null : inpatientDays.trim();
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

    public String getAuthorCode() {
        return authorCode;
    }

    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode == null ? null : authorCode.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptDepict() {
        return deptDepict;
    }

    public void setDeptDepict(String deptDepict) {
        this.deptDepict = deptDepict == null ? null : deptDepict.trim();
    }

    public String getInpatientAreaId() {
        return inpatientAreaId;
    }

    public void setInpatientAreaId(String inpatientAreaId) {
        this.inpatientAreaId = inpatientAreaId == null ? null : inpatientAreaId.trim();
    }

    public String getInpatientAreaName() {
        return inpatientAreaName;
    }

    public void setInpatientAreaName(String inpatientAreaName) {
        this.inpatientAreaName = inpatientAreaName == null ? null : inpatientAreaName.trim();
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

    public List<LeaveHospitalDiagnosis> getLeaveHospitalDiagnosisList() {
        return leaveHospitalDiagnosisList;
    }

    public void setLeaveHospitalDiagnosisList(List<LeaveHospitalDiagnosis> leaveHospitalDiagnosisList) {
        this.leaveHospitalDiagnosisList = leaveHospitalDiagnosisList;
    }
}