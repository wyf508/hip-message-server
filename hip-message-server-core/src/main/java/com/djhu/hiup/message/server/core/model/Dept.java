package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 科室
 */
public class Dept {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String statusCode;

    private String deptId;

    private String deptTypeId;

    private String deptTypeName;

    private String roleName;

    private String companyAddr;

    private String companyContactPhone;

    private String roleEffectiveTimeLow;

    private String roleEffectiveTimeHigh;

    private String deptEntityName;

    private String deptEntityId;

    private String parentDeptName;

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

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getDeptTypeId() {
        return deptTypeId;
    }

    public void setDeptTypeId(String deptTypeId) {
        this.deptTypeId = deptTypeId == null ? null : deptTypeId.trim();
    }

    public String getDeptTypeName() {
        return deptTypeName;
    }

    public void setDeptTypeName(String deptTypeName) {
        this.deptTypeName = deptTypeName == null ? null : deptTypeName.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getCompanyAddr() {
        return companyAddr;
    }

    public void setCompanyAddr(String companyAddr) {
        this.companyAddr = companyAddr == null ? null : companyAddr.trim();
    }

    public String getCompanyContactPhone() {
        return companyContactPhone;
    }

    public void setCompanyContactPhone(String companyContactPhone) {
        this.companyContactPhone = companyContactPhone == null ? null : companyContactPhone.trim();
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

    public String getDeptEntityName() {
        return deptEntityName;
    }

    public void setDeptEntityName(String deptEntityName) {
        this.deptEntityName = deptEntityName == null ? null : deptEntityName.trim();
    }

    public String getDeptEntityId() {
        return deptEntityId;
    }

    public void setDeptEntityId(String deptEntityId) {
        this.deptEntityId = deptEntityId == null ? null : deptEntityId.trim();
    }

    public String getParentDeptName() {
        return parentDeptName;
    }

    public void setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName == null ? null : parentDeptName.trim();
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