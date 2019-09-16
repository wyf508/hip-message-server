package com.djhu.hiup.message.server.core.model;

import java.io.Serializable;

public class VisitOutpatientVisit implements Serializable {
    private Long pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String outpatientNo;

    private String visitTypeCode;

    private String visitTypeDepict;

    private String statusCode;

    private String visitTime;

    private String visitCauseDepict;

    private String patientId;

    private String name;

    private String visitPhysicianId;

    private String visitPhysicianName;

    private String deptId;

    private String deptName;

    private String hospitalId;

    private static final long serialVersionUID = 1L;

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
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

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime == null ? null : visitTime.trim();
    }

    public String getVisitCauseDepict() {
        return visitCauseDepict;
    }

    public void setVisitCauseDepict(String visitCauseDepict) {
        this.visitCauseDepict = visitCauseDepict == null ? null : visitCauseDepict.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVisitPhysicianId() {
        return visitPhysicianId;
    }

    public void setVisitPhysicianId(String visitPhysicianId) {
        this.visitPhysicianId = visitPhysicianId == null ? null : visitPhysicianId.trim();
    }

    public String getVisitPhysicianName() {
        return visitPhysicianName;
    }

    public void setVisitPhysicianName(String visitPhysicianName) {
        this.visitPhysicianName = visitPhysicianName == null ? null : visitPhysicianName.trim();
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

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }
}