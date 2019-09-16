package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 就诊信息-出院就诊-诊断信息
 */
public class LeaveHospitalDiagnosis {
    private BigDecimal pk;

    private BigDecimal leaveHospitalPk;

    private String diagnosisCode;

    private String diagnosisDepict;

    private String diagnosisPersonId;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getLeaveHospitalPk() {
        return leaveHospitalPk;
    }

    public void setLeaveHospitalPk(BigDecimal leaveHospitalPk) {
        this.leaveHospitalPk = leaveHospitalPk;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    public String getDiagnosisDepict() {
        return diagnosisDepict;
    }

    public void setDiagnosisDepict(String diagnosisDepict) {
        this.diagnosisDepict = diagnosisDepict == null ? null : diagnosisDepict.trim();
    }

    public String getDiagnosisPersonId() {
        return diagnosisPersonId;
    }

    public void setDiagnosisPersonId(String diagnosisPersonId) {
        this.diagnosisPersonId = diagnosisPersonId == null ? null : diagnosisPersonId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}