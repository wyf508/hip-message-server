package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 就诊信息_号源信息表
 */
public class VisitNumberSource {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String shiftWorkerId;

    private String shiftWorkerName;

    private String schedulingId;

    private String subMajorCode;

    private String subMajorDepict;

    private String resourcesSum;

    private String deptId;

    private String resourcesLeveCode;

    private String resourcesLeveDepict;

    private String medicalDoctorId;

    private String jobCategoryId;

    private String jobCategoryDepict;

    private String medicalDoctorIdentityNo;

    private String medicalDoctorName;

    private String subPeriodInfo;

    private String timedResourceTypeCode;

    private String timedResourceTypeDepict;

    private String subPeriodResourcesSum;

    private String scheduleStartTime;

    private String scheduleEndTime;

    private String residualNumber;

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

    public String getShiftWorkerId() {
        return shiftWorkerId;
    }

    public void setShiftWorkerId(String shiftWorkerId) {
        this.shiftWorkerId = shiftWorkerId == null ? null : shiftWorkerId.trim();
    }

    public String getShiftWorkerName() {
        return shiftWorkerName;
    }

    public void setShiftWorkerName(String shiftWorkerName) {
        this.shiftWorkerName = shiftWorkerName == null ? null : shiftWorkerName.trim();
    }

    public String getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(String schedulingId) {
        this.schedulingId = schedulingId == null ? null : schedulingId.trim();
    }

    public String getSubMajorCode() {
        return subMajorCode;
    }

    public void setSubMajorCode(String subMajorCode) {
        this.subMajorCode = subMajorCode == null ? null : subMajorCode.trim();
    }

    public String getSubMajorDepict() {
        return subMajorDepict;
    }

    public void setSubMajorDepict(String subMajorDepict) {
        this.subMajorDepict = subMajorDepict == null ? null : subMajorDepict.trim();
    }

    public String getResourcesSum() {
        return resourcesSum;
    }

    public void setResourcesSum(String resourcesSum) {
        this.resourcesSum = resourcesSum == null ? null : resourcesSum.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getResourcesLeveCode() {
        return resourcesLeveCode;
    }

    public void setResourcesLeveCode(String resourcesLeveCode) {
        this.resourcesLeveCode = resourcesLeveCode == null ? null : resourcesLeveCode.trim();
    }

    public String getResourcesLeveDepict() {
        return resourcesLeveDepict;
    }

    public void setResourcesLeveDepict(String resourcesLeveDepict) {
        this.resourcesLeveDepict = resourcesLeveDepict == null ? null : resourcesLeveDepict.trim();
    }

    public String getMedicalDoctorId() {
        return medicalDoctorId;
    }

    public void setMedicalDoctorId(String medicalDoctorId) {
        this.medicalDoctorId = medicalDoctorId == null ? null : medicalDoctorId.trim();
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId == null ? null : jobCategoryId.trim();
    }

    public String getJobCategoryDepict() {
        return jobCategoryDepict;
    }

    public void setJobCategoryDepict(String jobCategoryDepict) {
        this.jobCategoryDepict = jobCategoryDepict == null ? null : jobCategoryDepict.trim();
    }

    public String getMedicalDoctorIdentityNo() {
        return medicalDoctorIdentityNo;
    }

    public void setMedicalDoctorIdentityNo(String medicalDoctorIdentityNo) {
        this.medicalDoctorIdentityNo = medicalDoctorIdentityNo == null ? null : medicalDoctorIdentityNo.trim();
    }

    public String getMedicalDoctorName() {
        return medicalDoctorName;
    }

    public void setMedicalDoctorName(String medicalDoctorName) {
        this.medicalDoctorName = medicalDoctorName == null ? null : medicalDoctorName.trim();
    }

    public String getSubPeriodInfo() {
        return subPeriodInfo;
    }

    public void setSubPeriodInfo(String subPeriodInfo) {
        this.subPeriodInfo = subPeriodInfo == null ? null : subPeriodInfo.trim();
    }

    public String getTimedResourceTypeCode() {
        return timedResourceTypeCode;
    }

    public void setTimedResourceTypeCode(String timedResourceTypeCode) {
        this.timedResourceTypeCode = timedResourceTypeCode == null ? null : timedResourceTypeCode.trim();
    }

    public String getTimedResourceTypeDepict() {
        return timedResourceTypeDepict;
    }

    public void setTimedResourceTypeDepict(String timedResourceTypeDepict) {
        this.timedResourceTypeDepict = timedResourceTypeDepict == null ? null : timedResourceTypeDepict.trim();
    }

    public String getSubPeriodResourcesSum() {
        return subPeriodResourcesSum;
    }

    public void setSubPeriodResourcesSum(String subPeriodResourcesSum) {
        this.subPeriodResourcesSum = subPeriodResourcesSum == null ? null : subPeriodResourcesSum.trim();
    }

    public String getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime == null ? null : scheduleStartTime.trim();
    }

    public String getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime == null ? null : scheduleEndTime.trim();
    }

    public String getResidualNumber() {
        return residualNumber;
    }

    public void setResidualNumber(String residualNumber) {
        this.residualNumber = residualNumber == null ? null : residualNumber.trim();
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