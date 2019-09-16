package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 就诊信息_住院就诊信息表
 */
public class VisitInpatientVisit {
	
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

    private String admissionDate;

    private String visitCauseDepict;

    private String medicareTypeId;

    private String medicareTypeDepict;

    private String inpatientFrequency;

    private String patientId;

    private String identityNo;

    private String name;

    private String doctorId;

    private String doctorName;

    private String deptId;

    private String deptName;

    private String inpatientAreaId;

    private String inpatientAreaName;

    private String wardId;

    private String wardName;

    private String hospitalBedId;

    private String hospitalBedName;

    private String serviceOrganizationCode;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    private List<InpatientVisitDiagnosis> inpatientVisitDiagnosisList=new ArrayList<>();

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

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
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

    public String getInpatientFrequency() {
        return inpatientFrequency;
    }

    public void setInpatientFrequency(String inpatientFrequency) {
        this.inpatientFrequency = inpatientFrequency == null ? null : inpatientFrequency.trim();
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

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId == null ? null : doctorId.trim();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
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

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId == null ? null : wardId.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    public String getHospitalBedId() {
        return hospitalBedId;
    }

    public void setHospitalBedId(String hospitalBedId) {
        this.hospitalBedId = hospitalBedId == null ? null : hospitalBedId.trim();
    }

    public String getHospitalBedName() {
        return hospitalBedName;
    }

    public void setHospitalBedName(String hospitalBedName) {
        this.hospitalBedName = hospitalBedName == null ? null : hospitalBedName.trim();
    }

    public String getServiceOrganizationCode() {
        return serviceOrganizationCode;
    }

    public void setServiceOrganizationCode(String serviceOrganizationCode) {
        this.serviceOrganizationCode = serviceOrganizationCode == null ? null : serviceOrganizationCode.trim();
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

    public List<InpatientVisitDiagnosis> getInpatientVisitDiagnosisList() {
        return inpatientVisitDiagnosisList;
    }

    public void setInpatientVisitDiagnosisList(List<InpatientVisitDiagnosis> inpatientVisitDiagnosisList) {
        this.inpatientVisitDiagnosisList = inpatientVisitDiagnosisList;
    }
}