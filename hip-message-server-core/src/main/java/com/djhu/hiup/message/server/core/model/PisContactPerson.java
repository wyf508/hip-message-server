package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请单信息_病理申请单-联系人信息表
 */
public class PisContactPerson {
    private BigDecimal pk;

    private BigDecimal requestPisPk;

    private String contactPersonPhone;

    private String contactPersonName;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getRequestPisPk() {
        return requestPisPk;
    }

    public void setRequestPisPk(BigDecimal requestPisPk) {
        this.requestPisPk = requestPisPk;
    }

    public String getContactPersonPhone() {
        return contactPersonPhone;
    }

    public void setContactPersonPhone(String contactPersonPhone) {
        this.contactPersonPhone = contactPersonPhone == null ? null : contactPersonPhone.trim();
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName == null ? null : contactPersonName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}