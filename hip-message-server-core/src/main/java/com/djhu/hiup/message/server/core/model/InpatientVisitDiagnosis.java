package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 就诊信息-住院就诊-诊断信息
 */
public class InpatientVisitDiagnosis {
    private BigDecimal pk;

    private BigDecimal inpatientVisitPk;

    private String diagnosisCode;

    private String diagnosisName;

    private String diagnosisPersonCode;

    private Date createTime;

    public BigDecimal getPk() {
        return pk;
    }

    public void setPk(BigDecimal pk) {
        this.pk = pk;
    }

    public BigDecimal getInpatientVisitPk() {
        return inpatientVisitPk;
    }

    public void setInpatientVisitPk(BigDecimal inpatientVisitPk) {
        this.inpatientVisitPk = inpatientVisitPk;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode == null ? null : diagnosisCode.trim();
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName == null ? null : diagnosisName.trim();
    }

    public String getDiagnosisPersonCode() {
        return diagnosisPersonCode;
    }

    public void setDiagnosisPersonCode(String diagnosisPersonCode) {
        this.diagnosisPersonCode = diagnosisPersonCode == null ? null : diagnosisPersonCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}