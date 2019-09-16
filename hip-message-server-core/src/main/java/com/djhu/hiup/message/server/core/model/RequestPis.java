package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 申请单信息_病理申请单信息表
 */
public class RequestPis extends BaseRequest{
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String requestNo;

    private String requestDetailedContent;

    private String checkRequestDate;

    private String checkTypeCode;

    private String checkTypeName;

    private String inspectionTissue;

    private String inspectionTissueNumber;

    private String inspectionTissueNumberUnit;

    private String specimentId;

    private String fixedLiquid;

    private String collectionDate;

    private String inspectionDoctorId;

    private String inspectionDoctorName;

    private String openBillTime;

    private String openBillDoctorCode;

    private String openBillDoctorName;

    private String openDeptId;

    private String openDeptName;

    private String confirmationTime;

    private String confirmationPersonCode;

    private String confirmationPersonName;

    private String medicalRecordsAndSee;

    private String precautions;

    private String visitNumber;

    private String visitFlowNo;

    private String visitTypeCode;

    private String visitTypeName;

    private String domainId;

    private String patientId;

    private String outpatientNo;

    private String inpatientNo;

    private String identityNo;

    private String medicareCardNo;

    private String name;

    private String contactPhone;

    private String genderId;

    private String dateOfBirth;

    private String age;

    private String address;

    private String nationalityCode;

    private String nationalityName;

    private String hospitalBedCode;

    private String hospitalBedNo;

    private String wardCode;

    private String wardNo;

    private String deptCode;

    private String deptName;

    private String inpatientAreaCode;

    private String inpatientAreaName;

    private String diagnosticTypeCode;

    private String diagnosticTypeName;

    private String diseaseDate;

    private String diseaseCode;

    private String diseaseName;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    private Patient patient;
    private List<PisCheckItem> pisCheckItemList=new ArrayList<>();
    private List<PisDrawingParts> pisDrawingPartsList=new ArrayList<>();
    private List<PisContactPerson> pisContactPersonList=new ArrayList<>();

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

    public String getRequestDetailedContent() {
        return requestDetailedContent;
    }

    public void setRequestDetailedContent(String requestDetailedContent) {
        this.requestDetailedContent = requestDetailedContent == null ? null : requestDetailedContent.trim();
    }

    public String getCheckRequestDate() {
        return checkRequestDate;
    }

    public void setCheckRequestDate(String checkRequestDate) {
        this.checkRequestDate = checkRequestDate == null ? null : checkRequestDate.trim();
    }

    public String getCheckTypeCode() {
        return checkTypeCode;
    }

    public void setCheckTypeCode(String checkTypeCode) {
        this.checkTypeCode = checkTypeCode == null ? null : checkTypeCode.trim();
    }

    public String getCheckTypeName() {
        return checkTypeName;
    }

    public void setCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName == null ? null : checkTypeName.trim();
    }

    public String getInspectionTissue() {
        return inspectionTissue;
    }

    public void setInspectionTissue(String inspectionTissue) {
        this.inspectionTissue = inspectionTissue == null ? null : inspectionTissue.trim();
    }

    public String getInspectionTissueNumber() {
        return inspectionTissueNumber;
    }

    public void setInspectionTissueNumber(String inspectionTissueNumber) {
        this.inspectionTissueNumber = inspectionTissueNumber == null ? null : inspectionTissueNumber.trim();
    }

    public String getInspectionTissueNumberUnit() {
        return inspectionTissueNumberUnit;
    }

    public void setInspectionTissueNumberUnit(String inspectionTissueNumberUnit) {
        this.inspectionTissueNumberUnit = inspectionTissueNumberUnit == null ? null : inspectionTissueNumberUnit.trim();
    }

    public String getSpecimentId() {
        return specimentId;
    }

    public void setSpecimentId(String specimentId) {
        this.specimentId = specimentId == null ? null : specimentId.trim();
    }

    public String getFixedLiquid() {
        return fixedLiquid;
    }

    public void setFixedLiquid(String fixedLiquid) {
        this.fixedLiquid = fixedLiquid == null ? null : fixedLiquid.trim();
    }

    public String getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(String collectionDate) {
        this.collectionDate = collectionDate == null ? null : collectionDate.trim();
    }

    public String getInspectionDoctorId() {
        return inspectionDoctorId;
    }

    public void setInspectionDoctorId(String inspectionDoctorId) {
        this.inspectionDoctorId = inspectionDoctorId == null ? null : inspectionDoctorId.trim();
    }

    public String getInspectionDoctorName() {
        return inspectionDoctorName;
    }

    public void setInspectionDoctorName(String inspectionDoctorName) {
        this.inspectionDoctorName = inspectionDoctorName == null ? null : inspectionDoctorName.trim();
    }

    public String getOpenBillTime() {
        return openBillTime;
    }

    public void setOpenBillTime(String openBillTime) {
        this.openBillTime = openBillTime == null ? null : openBillTime.trim();
    }

    public String getOpenBillDoctorCode() {
        return openBillDoctorCode;
    }

    public void setOpenBillDoctorCode(String openBillDoctorCode) {
        this.openBillDoctorCode = openBillDoctorCode == null ? null : openBillDoctorCode.trim();
    }

    public String getOpenBillDoctorName() {
        return openBillDoctorName;
    }

    public void setOpenBillDoctorName(String openBillDoctorName) {
        this.openBillDoctorName = openBillDoctorName == null ? null : openBillDoctorName.trim();
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

    public String getConfirmationTime() {
        return confirmationTime;
    }

    public void setConfirmationTime(String confirmationTime) {
        this.confirmationTime = confirmationTime == null ? null : confirmationTime.trim();
    }

    public String getConfirmationPersonCode() {
        return confirmationPersonCode;
    }

    public void setConfirmationPersonCode(String confirmationPersonCode) {
        this.confirmationPersonCode = confirmationPersonCode == null ? null : confirmationPersonCode.trim();
    }

    public String getConfirmationPersonName() {
        return confirmationPersonName;
    }

    public void setConfirmationPersonName(String confirmationPersonName) {
        this.confirmationPersonName = confirmationPersonName == null ? null : confirmationPersonName.trim();
    }

    public String getMedicalRecordsAndSee() {
        return medicalRecordsAndSee;
    }

    public void setMedicalRecordsAndSee(String medicalRecordsAndSee) {
        this.medicalRecordsAndSee = medicalRecordsAndSee == null ? null : medicalRecordsAndSee.trim();
    }

    public String getPrecautions() {
        return precautions;
    }

    public void setPrecautions(String precautions) {
        this.precautions = precautions == null ? null : precautions.trim();
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

    public String getVisitTypeName() {
        return visitTypeName;
    }

    public void setVisitTypeName(String visitTypeName) {
        this.visitTypeName = visitTypeName == null ? null : visitTypeName.trim();
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

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode == null ? null : nationalityCode.trim();
    }

    public String getNationalityName() {
        return nationalityName;
    }

    public void setNationalityName(String nationalityName) {
        this.nationalityName = nationalityName == null ? null : nationalityName.trim();
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

    public String getDiseaseDate() {
        return diseaseDate;
    }

    public void setDiseaseDate(String diseaseDate) {
        this.diseaseDate = diseaseDate == null ? null : diseaseDate.trim();
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

    public List<PisCheckItem> getPisCheckItemList() {
        return pisCheckItemList;
    }

    public void setPisCheckItemList(List<PisCheckItem> pisCheckItemList) {
        this.pisCheckItemList = pisCheckItemList;
    }

    public List<PisDrawingParts> getPisDrawingPartsList() {
        return pisDrawingPartsList;
    }

    public void setPisDrawingPartsList(List<PisDrawingParts> pisDrawingPartsList) {
        this.pisDrawingPartsList = pisDrawingPartsList;
    }

    public List<PisContactPerson> getPisContactPersonList() {
        return pisContactPersonList;
    }

    public void setPisContactPersonList(List<PisContactPerson> pisContactPersonList) {
        this.pisContactPersonList = pisContactPersonList;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}