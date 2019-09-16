package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 文档
 */
public class Doc {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String docFlowNo;

    private String docTypeId;

    private String docTypeDepict;

    private String docCreationTime;

    private String docSecrecyLevelId;

    private String docSecrecyLevelDepict;

    private String docVersionNo;

    private BigDecimal systemDirPk;

    private String docPath;

    private String patientId;

    private String inpatientNo;

    private String outpatientNo;

    private String patientVisitTime;

    private String identityNo;

    private String name;

    private String hospitalCode;

    private String hospitalName;

    private String deptCode;

    private String authorCode;

    private String authorName;

    private String docStorageUnitCode;

    private String docStorageUnitName;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    private String docBase64Content;
    
    private String healthCardId;

    private String serverOrganization;

    private String episodeId;

    private String inTime;

    private String outTime;

    private String admissionDepart;

    private String admissionType;
    
    private String admissionDoctor;

    private String diagnosisResult;

    private String repositoryUniqueId;
    
    private String docUrl;

    //2018-11-23

    private String docType;

    private String documentId;
    
    public String getHealthCardId() {
		return healthCardId;
	}

	public void setHealthCardId(String healthCardId) {
		this.healthCardId = healthCardId;
	}

	public String getServerOrganization() {
		return serverOrganization;
	}

	public void setServerOrganization(String serverOrganization) {
		this.serverOrganization = serverOrganization;
	}

	public String getEpisodeId() {
		return episodeId;
	}

	public void setEpisodeId(String episodeId) {
		this.episodeId = episodeId;
	}

	public String getInTime() {
		return inTime;
	}

	public void setInTime(String inTime) {
		this.inTime = inTime;
	}

	public String getOutTime() {
		return outTime;
	}

	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}

	public String getAdmissionDepart() {
		return admissionDepart;
	}

	public void setAdmissionDepart(String admissionDepart) {
		this.admissionDepart = admissionDepart;
	}

	public String getAdmissionType() {
		return admissionType;
	}

	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}

	public String getDiagnosisResult() {
		return diagnosisResult;
	}

	public void setDiagnosisResult(String diagnosisResult) {
		this.diagnosisResult = diagnosisResult;
	}

	public String getRepositoryUniqueId() {
		return repositoryUniqueId;
	}

	public void setRepositoryUniqueId(String repositoryUniqueId) {
		this.repositoryUniqueId = repositoryUniqueId;
	}

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

    public String getDocFlowNo() {
        return docFlowNo;
    }

    public void setDocFlowNo(String docFlowNo) {
        this.docFlowNo = docFlowNo == null ? null : docFlowNo.trim();
    }

    public String getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(String docTypeId) {
        this.docTypeId = docTypeId == null ? null : docTypeId.trim();
    }

    public String getDocTypeDepict() {
        return docTypeDepict;
    }

    public void setDocTypeDepict(String docTypeDepict) {
        this.docTypeDepict = docTypeDepict == null ? null : docTypeDepict.trim();
    }

    public String getDocCreationTime() {
        return docCreationTime;
    }

    public void setDocCreationTime(String docCreationTime) {
        this.docCreationTime = docCreationTime == null ? null : docCreationTime.trim();
    }

    public String getDocSecrecyLevelId() {
        return docSecrecyLevelId;
    }

    public void setDocSecrecyLevelId(String docSecrecyLevelId) {
        this.docSecrecyLevelId = docSecrecyLevelId == null ? null : docSecrecyLevelId.trim();
    }

    public String getDocSecrecyLevelDepict() {
        return docSecrecyLevelDepict;
    }

    public void setDocSecrecyLevelDepict(String docSecrecyLevelDepict) {
        this.docSecrecyLevelDepict = docSecrecyLevelDepict == null ? null : docSecrecyLevelDepict.trim();
    }

    public String getDocVersionNo() {
        return docVersionNo;
    }

    public void setDocVersionNo(String docVersionNo) {
        this.docVersionNo = docVersionNo == null ? null : docVersionNo.trim();
    }

    public BigDecimal getSystemDirPk() {
        return systemDirPk;
    }

    public void setSystemDirPk(BigDecimal systemDirPk) {
        this.systemDirPk = systemDirPk;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath == null ? null : docPath.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getInpatientNo() {
        return inpatientNo;
    }

    public void setInpatientNo(String inpatientNo) {
        this.inpatientNo = inpatientNo == null ? null : inpatientNo.trim();
    }

    public String getOutpatientNo() {
        return outpatientNo;
    }

    public void setOutpatientNo(String outpatientNo) {
        this.outpatientNo = outpatientNo == null ? null : outpatientNo.trim();
    }

    public String getPatientVisitTime() {
        return patientVisitTime;
    }

    public void setPatientVisitTime(String patientVisitTime) {
        this.patientVisitTime = patientVisitTime == null ? null : patientVisitTime.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
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

    public String getDocStorageUnitCode() {
        return docStorageUnitCode;
    }

    public void setDocStorageUnitCode(String docStorageUnitCode) {
        this.docStorageUnitCode = docStorageUnitCode == null ? null : docStorageUnitCode.trim();
    }

    public String getDocStorageUnitName() {
        return docStorageUnitName;
    }

    public void setDocStorageUnitName(String docStorageUnitName) {
        this.docStorageUnitName = docStorageUnitName == null ? null : docStorageUnitName.trim();
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

    public String getDocBase64Content() {
        return docBase64Content;
    }

    public void setDocBase64Content(String docBase64Content) {
        this.docBase64Content = docBase64Content;
    }

	public String getDocUrl() {
		return docUrl;
	}

	public void setDocUrl(String docUrl) {
		this.docUrl = docUrl;
	}

	public String getAdmissionDoctor() {
		return admissionDoctor;
	}

	public void setAdmissionDoctor(String admissionDoctor) {
		this.admissionDoctor = admissionDoctor;
	}

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}