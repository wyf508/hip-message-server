package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 人员信息
 */
public class Personnel {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String healthCareProviderId;

    private String jobCategoryId;

    private String jobCategoryName;

    private String roleEffectiveTimeLow;

    private String roleEffectiveTimeHigh;

    private String identityNo;

    private String certificatesTypeId;

    private String certificatesTypeDepict;

    private String name;

    private String genderId;

    private String genderDepict;

    private String dateOfBirth;

    private String deptId;

    private String deptName;

    private String birthplace;

    private String authorCode;

    private String authorName;

    private String authorDeptId;

    private String authorDeptName;

    private String authorDeptContactPerson;

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

    public String getHealthCareProviderId() {
        return healthCareProviderId;
    }

    public void setHealthCareProviderId(String healthCareProviderId) {
        this.healthCareProviderId = healthCareProviderId == null ? null : healthCareProviderId.trim();
    }

    public String getJobCategoryId() {
        return jobCategoryId;
    }

    public void setJobCategoryId(String jobCategoryId) {
        this.jobCategoryId = jobCategoryId == null ? null : jobCategoryId.trim();
    }

    public String getJobCategoryName() {
        return jobCategoryName;
    }

    public void setJobCategoryName(String jobCategoryName) {
        this.jobCategoryName = jobCategoryName == null ? null : jobCategoryName.trim();
    }

    public String getRoleEffectiveTimeLow() {
        return roleEffectiveTimeLow;
    }

    public void setRoleEffectiveTimeLow(String roleEffectiveTimeLow) {
        this.roleEffectiveTimeLow = roleEffectiveTimeLow == null ? null : roleEffectiveTimeLow.trim();
    }

    public String getRoleEffectiveTimeHigh() {
        return roleEffectiveTimeHigh;
    }

    public void setRoleEffectiveTimeHigh(String roleEffectiveTimeHigh) {
        this.roleEffectiveTimeHigh = roleEffectiveTimeHigh == null ? null : roleEffectiveTimeHigh.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getCertificatesTypeId() {
        return certificatesTypeId;
    }

    public void setCertificatesTypeId(String certificatesTypeId) {
        this.certificatesTypeId = certificatesTypeId == null ? null : certificatesTypeId.trim();
    }

    public String getCertificatesTypeDepict() {
        return certificatesTypeDepict;
    }

    public void setCertificatesTypeDepict(String certificatesTypeDepict) {
        this.certificatesTypeDepict = certificatesTypeDepict == null ? null : certificatesTypeDepict.trim();
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

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace == null ? null : birthplace.trim();
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

    public String getAuthorDeptId() {
        return authorDeptId;
    }

    public void setAuthorDeptId(String authorDeptId) {
        this.authorDeptId = authorDeptId == null ? null : authorDeptId.trim();
    }

    public String getAuthorDeptName() {
        return authorDeptName;
    }

    public void setAuthorDeptName(String authorDeptName) {
        this.authorDeptName = authorDeptName == null ? null : authorDeptName.trim();
    }

    public String getAuthorDeptContactPerson() {
        return authorDeptContactPerson;
    }

    public void setAuthorDeptContactPerson(String authorDeptContactPerson) {
        this.authorDeptContactPerson = authorDeptContactPerson == null ? null : authorDeptContactPerson.trim();
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