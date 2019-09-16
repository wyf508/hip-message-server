package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 申请单信息_检验申请单信息表
 */
public class RequestLis extends BaseRequest{
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String requestNo;

    private String requestDepict;

    private String statusCode;

    private String requestEffectiveTimeHigh;

    private String requestEffectiveTimeLow;

    private String priorityLevelCode;

    private String priorityLevelName;

    private String specimentId;

    private String specimentTypeCode;

    private String specimentTypeName;

    private String openBillTime;

    private String founderPersonAutograph;

    private String founderPersonId;

    private String founderPersonName;

    private String openDeptId;

    private String openDeptName;

    private String auditTime;

    private String auditPersonId;

    private String auditPersonName;

    private String precautions;

    private String doorEmergencyNo;

    private String inpatientNo;

    private String visitTypeCode;

    private String visitTypeName;

    private String patientId;

    private String identityNo;

    private String medicareCardNo;

    private String name;

    private String contactPhone;

    private String genderId;

    private String genderName;

    private String dateOfBirth;

    private String age;

    private String address;

    private String hospitalBedCode;

    private String hospitalBedNo;

    private String wardCode;

    private String wardNo;

    private String deptCode;

    private String deptName;

    private String inpatientAreaCode;

    private String inpatientAreaName;

    private String diagnosticNode;

    private String diagnosticTypeCode;

    private String diagnosticTypeName;

    private String diagnosticTime;

    private String diseaseCode;

    private String diseaseName;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;
    
    private List<LisInspectionItem> lisInspectionItemList=new ArrayList<>();

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

    public String getRequestEffectiveTimeHigh() {
        return requestEffectiveTimeHigh;
    }

    public void setRequestEffectiveTimeHigh(String requestEffectiveTimeHigh) {
        this.requestEffectiveTimeHigh = requestEffectiveTimeHigh == null ? null : requestEffectiveTimeHigh.trim();
    }

    public String getRequestEffectiveTimeLow() {
        return requestEffectiveTimeLow;
    }

    public void setRequestEffectiveTimeLow(String requestEffectiveTimeLow) {
        this.requestEffectiveTimeLow = requestEffectiveTimeLow == null ? null : requestEffectiveTimeLow.trim();
    }

    public String getPriorityLevelCode() {
        return priorityLevelCode;
    }

    public void setPriorityLevelCode(String priorityLevelCode) {
        this.priorityLevelCode = priorityLevelCode == null ? null : priorityLevelCode.trim();
    }

    public String getPriorityLevelName() {
        return priorityLevelName;
    }

    public void setPriorityLevelName(String priorityLevelName) {
        this.priorityLevelName = priorityLevelName == null ? null : priorityLevelName.trim();
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

    public String getSpecimentTypeName() {
        return specimentTypeName;
    }

    public void setSpecimentTypeName(String specimentTypeName) {
        this.specimentTypeName = specimentTypeName == null ? null : specimentTypeName.trim();
    }

    public String getOpenBillTime() {
        return openBillTime;
    }

    public void setOpenBillTime(String openBillTime) {
        this.openBillTime = openBillTime == null ? null : openBillTime.trim();
    }

    public String getFounderPersonAutograph() {
        return founderPersonAutograph;
    }

    public void setFounderPersonAutograph(String founderPersonAutograph) {
        this.founderPersonAutograph = founderPersonAutograph == null ? null : founderPersonAutograph.trim();
    }

    public String getFounderPersonId() {
        return founderPersonId;
    }

    public void setFounderPersonId(String founderPersonId) {
        this.founderPersonId = founderPersonId == null ? null : founderPersonId.trim();
    }

    public String getFounderPersonName() {
        return founderPersonName;
    }

    public void setFounderPersonName(String founderPersonName) {
        this.founderPersonName = founderPersonName == null ? null : founderPersonName.trim();
    }

    public String getOpenDeptId() {
        return openDeptId;
    }

    public void setOpenDeptId(String openDeptId) {
        this.openDeptId = openDeptId == null ? null : openDeptId.trim();
    }

    public String getOpenDeptName() {
        return openDeptName;
    }

    public void setOpenDeptName(String openDeptName) {
        this.openDeptName = openDeptName == null ? null : openDeptName.trim();
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    public String getAuditPersonId() {
        return auditPersonId;
    }

    public void setAuditPersonId(String auditPersonId) {
        this.auditPersonId = auditPersonId == null ? null : auditPersonId.trim();
    }

    public String getAuditPersonName() {
        return auditPersonName;
    }

    public void setAuditPersonName(String auditPersonName) {
        this.auditPersonName = auditPersonName == null ? null : auditPersonName.trim();
    }

    public String getPrecautions() {
        return precautions;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions == null ? null : precautions.trim();
    }

    public String getDoorEmergencyNo() {
        return doorEmergencyNo;
    }

    public void setDoorEmergencyNo(String doorEmergencyNo) {
        this.doorEmergencyNo = doorEmergencyNo == null ? null : doorEmergencyNo.trim();
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo == null ? null : inpatientNo.trim();
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

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId == null ? null : genderId.trim();
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName == null ? null : genderName.trim();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth == null ? null : dateOfBirth.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHospitalBedCode() {
        return hospitalBedCode;
    }

    public void setHospitalBedCode(String hospitalBedCode) {
        this.hospitalBedCode = hospitalBedCode == null ? null : hospitalBedCode.trim();
    }

    public String getHospitalBedNo() {
        return hospitalBedNo;
    }

    public void setHospitalBedNo(String hospitalBedNo) {
        this.hospitalBedNo = hospitalBedNo == null ? null : hospitalBedNo.trim();
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode == null ? null : wardCode.trim();
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo == null ? null : wardNo.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getInpatientAreaCode() {
        return inpatientAreaCode;
    }

    public void setInpatientAreaCode(String inpatientAreaCode) {
        this.inpatientAreaCode = inpatientAreaCode == null ? null : inpatientAreaCode.trim();
    }

    public String getInpatientAreaName() {
        return inpatientAreaName;
    }

    public void setInpatientAreaName(String inpatientAreaName) {
        this.inpatientAreaName = inpatientAreaName == null ? null : inpatientAreaName.trim();
    }

    public String getDiagnosticNode() {
        return diagnosticNode;
    }

    public void setDiagnosticNode(String diagnosticNode) {
        this.diagnosticNode = diagnosticNode == null ? null : diagnosticNode.trim();
    }

    public String getDiagnosticTypeCode() {
        return diagnosticTypeCode;
    }

    public void setDiagnosticTypeCode(String diagnosticTypeCode) {
        this.diagnosticTypeCode = diagnosticTypeCode == null ? null : diagnosticTypeCode.trim();
    }

    public String getDiagnosticTypeName() {
        return diagnosticTypeName;
    }

    public void setDiagnosticTypeName(String diagnosticTypeName) {
        this.diagnosticTypeName = diagnosticTypeName == null ? null : diagnosticTypeName.trim();
    }

    public String getDiagnosticTime() {
        return diagnosticTime;
    }

    public void setDiagnosticTime(String diagnosticTime) {
        this.diagnosticTime = diagnosticTime == null ? null : diagnosticTime.trim();
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode == null ? null : diseaseCode.trim();
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
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

    public List<LisInspectionItem> getLisInspectionItemList() {
        return lisInspectionItemList;
    }

    public void setLisInspectionItemList(List<LisInspectionItem> lisInspectionItemList) {
        this.lisInspectionItemList = lisInspectionItemList;
    }
}