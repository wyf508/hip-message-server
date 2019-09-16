package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 申请单信息_病理申请单_检查项目信息表
 */
public class PisCheckItem {
    private BigDecimal pk;

    private BigDecimal requestPisPk;

    private String checkItemCode;

    private String checkItemName;

    private String checkMethodCode;

    private String checkMethodName;

    private String checkBodyCode;

    private String checkBodyName;

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

    public BigDecimal getRequestPisPk() {
        return requestPisPk;
    }

    public void setRequestPisPk(BigDecimal requestPisPk) {
        this.requestPisPk = requestPisPk;
    }

    public String getCheckItemCode() {
        return checkItemCode;
    }

    public void setCheckItemCode(String checkItemCode) {
        this.checkItemCode = checkItemCode == null ? null : checkItemCode.trim();
    }

    public String getCheckItemName() {
        return checkItemName;
    }

    public void setCheckItemName(String checkItemName) {
        this.checkItemName = checkItemName == null ? null : checkItemName.trim();
    }

    public String getCheckMethodCode() {
        return checkMethodCode;
    }

    public void setCheckMethodCode(String checkMethodCode) {
        this.checkMethodCode = checkMethodCode == null ? null : checkMethodCode.trim();
    }

    public String getCheckMethodName() {
        return checkMethodName;
    }

    public void setCheckMethodName(String checkMethodName) {
        this.checkMethodName = checkMethodName == null ? null : checkMethodName.trim();
    }

    public String getCheckBodyCode() {
        return checkBodyCode;
    }

    public void setCheckBodyCode(String checkBodyCode) {
        this.checkBodyCode = checkBodyCode == null ? null : checkBodyCode.trim();
    }

    public String getCheckBodyName() {
        return checkBodyName;
    }

    public void setCheckBodyName(String checkBodyName) {
        this.checkBodyName = checkBodyName == null ? null : checkBodyName.trim();
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