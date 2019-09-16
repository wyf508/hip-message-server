package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请单信息_病理申请单-取材信息表
 */
public class PisDrawingParts {
    private BigDecimal pk;

    private BigDecimal requestPisPk;

    private String specimentId;

    private String drawingParts;

    private String drawingNumber;

    private String drawingNumberUnit;

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

    public String getSpecimentId() {
        return specimentId;
    }

    public void setSpecimentId(String specimentId) {
        this.specimentId = specimentId == null ? null : specimentId.trim();
    }

    public String getDrawingParts() {
        return drawingParts;
    }

    public void setDrawingParts(String drawingParts) {
        this.drawingParts = drawingParts == null ? null : drawingParts.trim();
    }

    public String getDrawingNumber() {
        return drawingNumber;
    }

    public void setDrawingNumber(String drawingNumber) {
        this.drawingNumber = drawingNumber == null ? null : drawingNumber.trim();
    }

    public String getDrawingNumberUnit() {
        return drawingNumberUnit;
    }

    public void setDrawingNumberUnit(String drawingNumberUnit) {
        this.drawingNumberUnit = drawingNumberUnit == null ? null : drawingNumberUnit.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}