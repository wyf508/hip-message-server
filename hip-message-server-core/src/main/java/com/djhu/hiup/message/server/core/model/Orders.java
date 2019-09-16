package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 医嘱
 */
public class Orders {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String orderOpenTime;

    private String orderOpenPersonAutograph;

    private String orderOpenPersonId;

    private String orderOpenPersonName;

    private String orderOpenDeptId;

    private String orderOpenDeptName;

    private String orderAuditorTime;

    private String orderAuditorPersonAutograph;

    private String orderAuditorPersonId;

    private String orderAuditorPersonName;

    private String orderInfoRoot;

    private String orderSequence;

    private String orderId;

    private String orderItemTypeCode;

    private String checkTypeName;

    private String orderItemContent;

    private String statusCode;

    private String orderStartTime;

    private String orderEndTime;

    private String orderExecRateCode;

    private String orderExecRateName;

    private String drugChannel;

    private String drugChannelDepict;

    private String drugOneDose;

    private String drugOneDoseUnit;

    private String drugTotalDose;

    private String drugTotalDoseUnit;

    private String drugTotalDoseDays;

    private String drugDosageForm;

    private String drugDosageFormDepict;

    private String drugCode;

    private String drugName;

    private String drugSpec;

    private String drugSpecUnit;

    private String drugMedicalTypeCode;

    private String drugMedicalTypeName;

    private String execDeptCode;

    private String execDeptName;

    private String parentOrderNo;

    private String orderTimeTypeCode;

    private String orderTimeTypeName;

    private String collarDrugAmount;

    private String collarDrugAmountUnit;

    private String orderRemarksInfo;

    private String orderRemarksInfoStatus;

    private String visitNumber;

    private String visitFlowNo;

    private String visitTypeCode;

    private String visitTypeName;

    private String visitId;

    private String inpatientNo;

    private String patientId;

    private String contactPhone;

    private String identityNo;

    private String name;

    private String genderId;

    private String genderDepict;

    private String dateOfBirth;

    private String healthFileNumber;

    private String healthCardNumber;

    private String hositalBedNo;

    private String hositalBedName;

    private String wardNo;

    private String wardName;

    private String deptCode;

    private String deptName;

    private String inpatientArea;

    private String inpatientAreaName;

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

    public String getOrderOpenTime() {
        return orderOpenTime;
    }

    public void setOrderOpenTime(String orderOpenTime) {
        this.orderOpenTime = orderOpenTime == null ? null : orderOpenTime.trim();
    }

    public String getOrderOpenPersonAutograph() {
        return orderOpenPersonAutograph;
    }

    public void setOrderOpenPersonAutograph(String orderOpenPersonAutograph) {
        this.orderOpenPersonAutograph = orderOpenPersonAutograph == null ? null : orderOpenPersonAutograph.trim();
    }

    public String getOrderOpenPersonId() {
        return orderOpenPersonId;
    }

    public void setOrderOpenPersonId(String orderOpenPersonId) {
        this.orderOpenPersonId = orderOpenPersonId == null ? null : orderOpenPersonId.trim();
    }

    public String getOrderOpenPersonName() {
        return orderOpenPersonName;
    }

    public void setOrderOpenPersonName(String orderOpenPersonName) {
        this.orderOpenPersonName = orderOpenPersonName == null ? null : orderOpenPersonName.trim();
    }

    public String getOrderOpenDeptId() {
        return orderOpenDeptId;
    }

    public void setOrderOpenDeptId(String orderOpenDeptId) {
        this.orderOpenDeptId = orderOpenDeptId == null ? null : orderOpenDeptId.trim();
    }

    public String getOrderOpenDeptName() {
        return orderOpenDeptName;
    }

    public void setOrderOpenDeptName(String orderOpenDeptName) {
        this.orderOpenDeptName = orderOpenDeptName == null ? null : orderOpenDeptName.trim();
    }

    public String getOrderAuditorTime() {
        return orderAuditorTime;
    }

    public void setOrderAuditorTime(String orderAuditorTime) {
        this.orderAuditorTime = orderAuditorTime == null ? null : orderAuditorTime.trim();
    }

    public String getOrderAuditorPersonAutograph() {
        return orderAuditorPersonAutograph;
    }

    public void setOrderAuditorPersonAutograph(String orderAuditorPersonAutograph) {
        this.orderAuditorPersonAutograph = orderAuditorPersonAutograph == null ? null : orderAuditorPersonAutograph.trim();
    }

    public String getOrderAuditorPersonId() {
        return orderAuditorPersonId;
    }

    public void setOrderAuditorPersonId(String orderAuditorPersonId) {
        this.orderAuditorPersonId = orderAuditorPersonId == null ? null : orderAuditorPersonId.trim();
    }

    public String getOrderAuditorPersonName() {
        return orderAuditorPersonName;
    }

    public void setOrderAuditorPersonName(String orderAuditorPersonName) {
        this.orderAuditorPersonName = orderAuditorPersonName == null ? null : orderAuditorPersonName.trim();
    }

    public String getOrderInfoRoot() {
        return orderInfoRoot;
    }

    public void setOrderInfoRoot(String orderInfoRoot) {
        this.orderInfoRoot = orderInfoRoot == null ? null : orderInfoRoot.trim();
    }

    public String getOrderSequence() {
        return orderSequence;
    }

    public void setOrderSequence(String orderSequence) {
        this.orderSequence = orderSequence == null ? null : orderSequence.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderItemTypeCode() {
        return orderItemTypeCode;
    }

    public void setOrderItemTypeCode(String orderItemTypeCode) {
        this.orderItemTypeCode = orderItemTypeCode == null ? null : orderItemTypeCode.trim();
    }

    public String getCheckTypeName() {
        return checkTypeName;
    }

    public void setCheckTypeName(String checkTypeName) {
        this.checkTypeName = checkTypeName == null ? null : checkTypeName.trim();
    }

    public String getOrderItemContent() {
        return orderItemContent;
    }

    public void setOrderItemContent(String orderItemContent) {
        this.orderItemContent = orderItemContent == null ? null : orderItemContent.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(String orderStartTime) {
        this.orderStartTime = orderStartTime == null ? null : orderStartTime.trim();
    }

    public String getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(String orderEndTime) {
        this.orderEndTime = orderEndTime == null ? null : orderEndTime.trim();
    }

    public String getOrderExecRateCode() {
        return orderExecRateCode;
    }

    public void setOrderExecRateCode(String orderExecRateCode) {
        this.orderExecRateCode = orderExecRateCode == null ? null : orderExecRateCode.trim();
    }

    public String getOrderExecRateName() {
        return orderExecRateName;
    }

    public void setOrderExecRateName(String orderExecRateName) {
        this.orderExecRateName = orderExecRateName == null ? null : orderExecRateName.trim();
    }

    public String getDrugChannel() {
        return drugChannel;
    }

    public void setDrugChannel(String drugChannel) {
        this.drugChannel = drugChannel == null ? null : drugChannel.trim();
    }

    public String getDrugChannelDepict() {
        return drugChannelDepict;
    }

    public void setDrugChannelDepict(String drugChannelDepict) {
        this.drugChannelDepict = drugChannelDepict == null ? null : drugChannelDepict.trim();
    }

    public String getDrugOneDose() {
        return drugOneDose;
    }

    public void setDrugOneDose(String drugOneDose) {
        this.drugOneDose = drugOneDose == null ? null : drugOneDose.trim();
    }

    public String getDrugOneDoseUnit() {
        return drugOneDoseUnit;
    }

    public void setDrugOneDoseUnit(String drugOneDoseUnit) {
        this.drugOneDoseUnit = drugOneDoseUnit == null ? null : drugOneDoseUnit.trim();
    }

    public String getDrugTotalDose() {
        return drugTotalDose;
    }

    public void setDrugTotalDose(String drugTotalDose) {
        this.drugTotalDose = drugTotalDose == null ? null : drugTotalDose.trim();
    }

    public String getDrugTotalDoseUnit() {
        return drugTotalDoseUnit;
    }

    public void setDrugTotalDoseUnit(String drugTotalDoseUnit) {
        this.drugTotalDoseUnit = drugTotalDoseUnit == null ? null : drugTotalDoseUnit.trim();
    }

    public String getDrugTotalDoseDays() {
        return drugTotalDoseDays;
    }

    public void setDrugTotalDoseDays(String drugTotalDoseDays) {
        this.drugTotalDoseDays = drugTotalDoseDays == null ? null : drugTotalDoseDays.trim();
    }

    public String getDrugDosageForm() {
        return drugDosageForm;
    }

    public void setDrugDosageForm(String drugDosageForm) {
        this.drugDosageForm = drugDosageForm == null ? null : drugDosageForm.trim();
    }

    public String getDrugDosageFormDepict() {
        return drugDosageFormDepict;
    }

    public void setDrugDosageFormDepict(String drugDosageFormDepict) {
        this.drugDosageFormDepict = drugDosageFormDepict == null ? null : drugDosageFormDepict.trim();
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec == null ? null : drugSpec.trim();
    }

    public String getDrugSpecUnit() {
        return drugSpecUnit;
    }

    public void setDrugSpecUnit(String drugSpecUnit) {
        this.drugSpecUnit = drugSpecUnit == null ? null : drugSpecUnit.trim();
    }

    public String getDrugMedicalTypeCode() {
        return drugMedicalTypeCode;
    }

    public void setDrugMedicalTypeCode(String drugMedicalTypeCode) {
        this.drugMedicalTypeCode = drugMedicalTypeCode == null ? null : drugMedicalTypeCode.trim();
    }

    public String getDrugMedicalTypeName() {
        return drugMedicalTypeName;
    }

    public void setDrugMedicalTypeName(String drugMedicalTypeName) {
        this.drugMedicalTypeName = drugMedicalTypeName == null ? null : drugMedicalTypeName.trim();
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

    public String getParentOrderNo() {
        return parentOrderNo;
    }

    public void setParentOrderNo(String parentOrderNo) {
        this.parentOrderNo = parentOrderNo == null ? null : parentOrderNo.trim();
    }

    public String getOrderTimeTypeCode() {
        return orderTimeTypeCode;
    }

    public void setOrderTimeTypeCode(String orderTimeTypeCode) {
        this.orderTimeTypeCode = orderTimeTypeCode == null ? null : orderTimeTypeCode.trim();
    }

    public String getOrderTimeTypeName() {
        return orderTimeTypeName;
    }

    public void setOrderTimeTypeName(String orderTimeTypeName) {
        this.orderTimeTypeName = orderTimeTypeName == null ? null : orderTimeTypeName.trim();
    }

    public String getCollarDrugAmount() {
        return collarDrugAmount;
    }

    public void setCollarDrugAmount(String collarDrugAmount) {
        this.collarDrugAmount = collarDrugAmount == null ? null : collarDrugAmount.trim();
    }

    public String getCollarDrugAmountUnit() {
        return collarDrugAmountUnit;
    }

    public void setCollarDrugAmountUnit(String collarDrugAmountUnit) {
        this.collarDrugAmountUnit = collarDrugAmountUnit == null ? null : collarDrugAmountUnit.trim();
    }

    public String getOrderRemarksInfo() {
        return orderRemarksInfo;
    }

    public void setOrderRemarksInfo(String orderRemarksInfo) {
        this.orderRemarksInfo = orderRemarksInfo == null ? null : orderRemarksInfo.trim();
    }

    public String getOrderRemarksInfoStatus() {
        return orderRemarksInfoStatus;
    }

    public void setOrderRemarksInfoStatus(String orderRemarksInfoStatus) {
        this.orderRemarksInfoStatus = orderRemarksInfoStatus == null ? null : orderRemarksInfoStatus.trim();
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

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId == null ? null : visitId.trim();
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

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
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

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId == null ? null : genderId.trim();
    }

    public String getGenderDepict() {
        return genderDepict;
    }

    public void setGenderDepict(String genderDepict) {
        this.genderDepict = genderDepict == null ? null : genderDepict.trim();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth == null ? null : dateOfBirth.trim();
    }

    public String getHealthFileNumber() {
        return healthFileNumber;
    }

    public void setHealthFileNumber(String healthFileNumber) {
        this.healthFileNumber = healthFileNumber == null ? null : healthFileNumber.trim();
    }

    public String getHealthCardNumber() {
        return healthCardNumber;
    }

    public void setHealthCardNumber(String healthCardNumber) {
        this.healthCardNumber = healthCardNumber == null ? null : healthCardNumber.trim();
    }

    public String getHositalBedNo() {
        return hositalBedNo;
    }

    public void setHositalBedNo(String hositalBedNo) {
        this.hositalBedNo = hositalBedNo == null ? null : hositalBedNo.trim();
    }

    public String getHositalBedName() {
        return hositalBedName;
    }

    public void setHositalBedName(String hositalBedName) {
        this.hositalBedName = hositalBedName == null ? null : hositalBedName.trim();
    }

    public String getWardNo() {
        return wardNo;
    }

    public void setWardNo(String wardNo) {
        this.wardNo = wardNo == null ? null : wardNo.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
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

    public String getInpatientArea() {
        return inpatientArea;
    }

    public void setInpatientArea(String inpatientArea) {
        this.inpatientArea = inpatientArea == null ? null : inpatientArea.trim();
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
}