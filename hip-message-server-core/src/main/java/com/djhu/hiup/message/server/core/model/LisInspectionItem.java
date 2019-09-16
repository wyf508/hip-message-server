package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请单信息_检验申请单_检验项目信息表
 */
public class LisInspectionItem {
    private BigDecimal pk;

    private BigDecimal requestLisPk;

    private String inspectionItemNode;

    private String orderId;

    private String inspectionItemNo;

    private String inspectionItemName;

    private String inspectionMethodCode;

    private String inspectionMethodName;

    private String execTime;

    private String execDeptCode;

    private String execDeptName;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getRequestLisPk() {
        return requestLisPk;
    }

    public void setRequestLisPk(BigDecimal requestLisPk) {
        this.requestLisPk = requestLisPk;
    }

    public String getInspectionItemNode() {
        return inspectionItemNode;
    }

    public void setInspectionItemNode(String inspectionItemNode) {
        this.inspectionItemNode = inspectionItemNode == null ? null : inspectionItemNode.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getInspectionItemNo() {
        return inspectionItemNo;
    }

    public void setInspectionItemNo(String inspectionItemNo) {
        this.inspectionItemNo = inspectionItemNo == null ? null : inspectionItemNo.trim();
    }

    public String getInspectionItemName() {
        return inspectionItemName;
    }

    public void setInspectionItemName(String inspectionItemName) {
        this.inspectionItemName = inspectionItemName == null ? null : inspectionItemName.trim();
    }

    public String getInspectionMethodCode() {
        return inspectionMethodCode;
    }

    public void setInspectionMethodCode(String inspectionMethodCode) {
        this.inspectionMethodCode = inspectionMethodCode == null ? null : inspectionMethodCode.trim();
    }

    public String getInspectionMethodName() {
        return inspectionMethodName;
    }

    public void setInspectionMethodName(String inspectionMethodName) {
        this.inspectionMethodName = inspectionMethodName == null ? null : inspectionMethodName.trim();
    }

    public String getExecTime() {
        return execTime;
    }

    public void setExecTime(String execTime) {
        this.execTime = execTime == null ? null : execTime.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}