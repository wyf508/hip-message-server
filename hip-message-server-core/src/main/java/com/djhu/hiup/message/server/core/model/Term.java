package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 术语信息表
 */
public class Term {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String valueSetId;

    private String valueSetDepict;

    private String statusCode;

    private String valueSetVersionCode;

    private String valueSetVersionDepict;

    private String valueProjectCode;

    private String valueProjectDepict;

    private String valueProjectStatusCode;

    private String authorCode;

    private String authorName;

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

    public String getValueSetId() {
        return valueSetId;
    }

    public void setValueSetId(String valueSetId) {
        this.valueSetId = valueSetId == null ? null : valueSetId.trim();
    }

    public String getValueSetDepict() {
        return valueSetDepict;
    }

    public void setValueSetDepict(String valueSetDepict) {
        this.valueSetDepict = valueSetDepict == null ? null : valueSetDepict.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getValueSetVersionCode() {
        return valueSetVersionCode;
    }

    public void setValueSetVersionCode(String valueSetVersionCode) {
        this.valueSetVersionCode = valueSetVersionCode == null ? null : valueSetVersionCode.trim();
    }

    public String getValueSetVersionDepict() {
        return valueSetVersionDepict;
    }

    public void setValueSetVersionDepict(String valueSetVersionDepict) {
        this.valueSetVersionDepict = valueSetVersionDepict == null ? null : valueSetVersionDepict.trim();
    }

    public String getValueProjectCode() {
        return valueProjectCode;
    }

    public void setValueProjectCode(String valueProjectCode) {
        this.valueProjectCode = valueProjectCode == null ? null : valueProjectCode.trim();
    }

    public String getValueProjectDepict() {
        return valueProjectDepict;
    }

    public void setValueProjectDepict(String valueProjectDepict) {
        this.valueProjectDepict = valueProjectDepict == null ? null : valueProjectDepict.trim();
    }

    public String getValueProjectStatusCode() {
        return valueProjectStatusCode;
    }

    public void setValueProjectStatusCode(String valueProjectStatusCode) {
        this.valueProjectStatusCode = valueProjectStatusCode == null ? null : valueProjectStatusCode.trim();
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