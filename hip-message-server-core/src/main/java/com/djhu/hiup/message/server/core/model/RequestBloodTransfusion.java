package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请单信息_输血申请单信息表
 */
public class RequestBloodTransfusion extends BaseRequest{
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String requestNo;

    private String requestContent;

    private String requestTime;

    private String priorityLevelCode;

    private String priorityLevelDepict;

    private String patientId;

    private String identityNo;

    private String name;

    private String openBillTime;

    private String openBillDoctorCode;

    private String openBillDoctorName;

    private String openDeptId;

    private String openDeptName;

    private String auditTime;

    private String auditPersonId;

    private String auditPersonName;

    private String deptCode;

    private String deptDepict;

    private String inpatientAreaCode;

    private String inpatientAreaName;

    private String wardCode;

    private String wardName;

    private String hospitalBedCode;

    private String hospitalBedName;

    private String diagnosisInfo;

    private String diagnosisCode;

    private String diagnosisDepict;

    private String inpatientNo;

    private String outpatientNo;

    private String visitTypeCode;

    private String visitTypeDepict;

    private String admissionTime;

    private String medicareTypeId;

    private String medicareTypeDepict;

    private String inpatientFrequency;

    private String aboBloodTypeCode;

    private String aboBloodTypeDepict;

    private String rhBloodTypeCode;

    private String rhBloodTypeDepict;

    private String height;

    private String weight;

    private String systolicPressure;

    private String diastolicPressure;

    private String temperature;

    private String pulse;

    private String requestAboBloodTypeCode;

    private String requestAboBloodTypeDepict;

    private String requestRhBloodTypeCode;

    private String requestRhBloodTypeDepict;

    private String bloodSampling;

    private String placeBloodAddress;

    private String bloodTransfusionPusrposes;

    private String bloodTransfusionNature;

    private String bloodTransfusionEmergency;

    private String medicalHistoryInformation;

    private String bloodTransfusionHistory;

    private String bloodReactionHistory;

    private String drugAllergyHistory;

    private String pregnancy;

    private String secondaryProduction;

    private String otherMedicalHistory;

    private String remarks;

    private String bloodUnit;

    private String blood;

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

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo == null ? null : requestNo.trim();
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent == null ? null : requestContent.trim();
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime == null ? null : requestTime.trim();
    }

    public String getPriorityLevelCode() {
        return priorityLevelCode;
    }

    public void setPriorityLevelCode(String priorityLevelCode) {
        this.priorityLevelCode = priorityLevelCode == null ? null : priorityLevelCode.trim();
    }

    public String getPriorityLevelDepict() {
        return priorityLevelDepict;
    }

    public void setPriorityLevelDepict(String priorityLevelDepict) {
        this.priorityLevelDepict = priorityLevelDepict == null ? null : priorityLevelDepict.trim();
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

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptDepict() {
        return deptDepict;
    }

    public void setDeptDepict(String deptDepict) {
        this.deptDepict = deptDepict == null ? null : deptDepict.trim();
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

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode == null ? null : wardCode.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    public String getHospitalBedCode() {
        return hospitalBedCode;
    }

    public void setHospitalBedCode(String hospitalBedCode) {
        this.hospitalBedCode = hospitalBedCode == null ? null : hospitalBedCode.trim();
    }

    public String getHospitalBedName() {
        return hospitalBedName;
    }

    public void setHospitalBedName(String hospitalBedName) {
        this.hospitalBedName = hospitalBedName == null ? null : hospitalBedName.trim();
    }

    public String getDiagnosisInfo() {
        return diagnosisInfo;
    }

    public void setDiagnosisInfo(String diagnosisInfo) {
        this.diagnosisInfo = diagnosisInfo == null ? null : diagnosisInfo.trim();
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    public String getDiagnosisDepict() {
        return diagnosisDepict;
    }

    public void setDiagnosisDepict(String diagnosisDepict) {
        this.diagnosisDepict = diagnosisDepict == null ? null : diagnosisDepict.trim();
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo == null ? null : inpatientNo.trim();
    }

    public String getOutpatientNo() {
        return outpatientNo;
    }

    public void setOutpatientNo(String outpatientNo) {
        this.outpatientNo = outpatientNo == null ? null : outpatientNo.trim();
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

    public String getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(String admissionTime) {
        this.admissionTime = admissionTime == null ? null : admissionTime.trim();
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

    public String getAboBloodTypeCode() {
        return aboBloodTypeCode;
    }

    public void setAboBloodTypeCode(String aboBloodTypeCode) {
        this.aboBloodTypeCode = aboBloodTypeCode == null ? null : aboBloodTypeCode.trim();
    }

    public String getAboBloodTypeDepict() {
        return aboBloodTypeDepict;
    }

    public void setAboBloodTypeDepict(String aboBloodTypeDepict) {
        this.aboBloodTypeDepict = aboBloodTypeDepict == null ? null : aboBloodTypeDepict.trim();
    }

    public String getRhBloodTypeCode() {
        return rhBloodTypeCode;
    }

    public void setRhBloodTypeCode(String rhBloodTypeCode) {
        this.rhBloodTypeCode = rhBloodTypeCode == null ? null : rhBloodTypeCode.trim();
    }

    public String getRhBloodTypeDepict() {
        return rhBloodTypeDepict;
    }

    public void setRhBloodTypeDepict(String rhBloodTypeDepict) {
        this.rhBloodTypeDepict = rhBloodTypeDepict == null ? null : rhBloodTypeDepict.trim();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(String systolicPressure) {
        this.systolicPressure = systolicPressure == null ? null : systolicPressure.trim();
    }

    public String getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(String diastolicPressure) {
        this.diastolicPressure = diastolicPressure == null ? null : diastolicPressure.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse == null ? null : pulse.trim();
    }

    public String getRequestAboBloodTypeCode() {
        return requestAboBloodTypeCode;
    }

    public void setRequestAboBloodTypeCode(String requestAboBloodTypeCode) {
        this.requestAboBloodTypeCode = requestAboBloodTypeCode == null ? null : requestAboBloodTypeCode.trim();
    }

    public String getRequestAboBloodTypeDepict() {
        return requestAboBloodTypeDepict;
    }

    public void setRequestAboBloodTypeDepict(String requestAboBloodTypeDepict) {
        this.requestAboBloodTypeDepict = requestAboBloodTypeDepict == null ? null : requestAboBloodTypeDepict.trim();
    }

    public String getRequestRhBloodTypeCode() {
        return requestRhBloodTypeCode;
    }

    public void setRequestRhBloodTypeCode(String requestRhBloodTypeCode) {
        this.requestRhBloodTypeCode = requestRhBloodTypeCode == null ? null : requestRhBloodTypeCode.trim();
    }

    public String getRequestRhBloodTypeDepict() {
        return requestRhBloodTypeDepict;
    }

    public void setRequestRhBloodTypeDepict(String requestRhBloodTypeDepict) {
        this.requestRhBloodTypeDepict = requestRhBloodTypeDepict == null ? null : requestRhBloodTypeDepict.trim();
    }

    public String getBloodSampling() {
        return bloodSampling;
    }

    public void setBloodSampling(String bloodSampling) {
        this.bloodSampling = bloodSampling == null ? null : bloodSampling.trim();
    }

    public String getPlaceBloodAddress() {
        return placeBloodAddress;
    }

    public void setPlaceBloodAddress(String placeBloodAddress) {
        this.placeBloodAddress = placeBloodAddress == null ? null : placeBloodAddress.trim();
    }

    public String getBloodTransfusionPusrposes() {
        return bloodTransfusionPusrposes;
    }

    public void setBloodTransfusionPusrposes(String bloodTransfusionPusrposes) {
        this.bloodTransfusionPusrposes = bloodTransfusionPusrposes == null ? null : bloodTransfusionPusrposes.trim();
    }

    public String getBloodTransfusionNature() {
        return bloodTransfusionNature;
    }

    public void setBloodTransfusionNature(String bloodTransfusionNature) {
        this.bloodTransfusionNature = bloodTransfusionNature == null ? null : bloodTransfusionNature.trim();
    }

    public String getBloodTransfusionEmergency() {
        return bloodTransfusionEmergency;
    }

    public void setBloodTransfusionEmergency(String bloodTransfusionEmergency) {
        this.bloodTransfusionEmergency = bloodTransfusionEmergency == null ? null : bloodTransfusionEmergency.trim();
    }

    public String getMedicalHistoryInformation() {
        return medicalHistoryInformation;
    }

    public void setMedicalHistoryInformation(String medicalHistoryInformation) {
        this.medicalHistoryInformation = medicalHistoryInformation == null ? null : medicalHistoryInformation.trim();
    }

    public String getBloodTransfusionHistory() {
        return bloodTransfusionHistory;
    }

    public void setBloodTransfusionHistory(String bloodTransfusionHistory) {
        this.bloodTransfusionHistory = bloodTransfusionHistory == null ? null : bloodTransfusionHistory.trim();
    }

    public String getBloodReactionHistory() {
        return bloodReactionHistory;
    }

    public void setBloodReactionHistory(String bloodReactionHistory) {
        this.bloodReactionHistory = bloodReactionHistory == null ? null : bloodReactionHistory.trim();
    }

    public String getDrugAllergyHistory() {
        return drugAllergyHistory;
    }

    public void setDrugAllergyHistory(String drugAllergyHistory) {
        this.drugAllergyHistory = drugAllergyHistory == null ? null : drugAllergyHistory.trim();
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(String pregnancy) {
        this.pregnancy = pregnancy == null ? null : pregnancy.trim();
    }

    public String getSecondaryProduction() {
        return secondaryProduction;
    }

    public void setSecondaryProduction(String secondaryProduction) {
        this.secondaryProduction = secondaryProduction == null ? null : secondaryProduction.trim();
    }

    public String getOtherMedicalHistory() {
        return otherMedicalHistory;
    }

    public void setOtherMedicalHistory(String otherMedicalHistory) {
        this.otherMedicalHistory = otherMedicalHistory == null ? null : otherMedicalHistory.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getBloodUnit() {
        return bloodUnit;
    }

    public void setBloodUnit(String bloodUnit) {
        this.bloodUnit = bloodUnit == null ? null : bloodUnit.trim();
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood == null ? null : blood.trim();
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