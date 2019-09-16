package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 病人信息
 */
public class Patient {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String patientId;

    private String statusCode;

    private String effectiveTime;

    private String identityNo;

    private String certificatesTypeId;

    private String certificatesTypeDepict;

    private String name;

    private String contactNumber;

    private String genderId;

    private String genderDepict;

    private String dateOfBirth;

    private String addr;

    private String addrState;

    private String addrCity;

    private String addrCounty;

    private String addrStreetNameBase;

    private String addrStreetName;

    private String houseNumber;

    private String postalCode;

    private String maritalStatusId;

    private String maritalStatusDepict;

    private String ethnicGroupId;

    private String ethnicGroupDescrive;

    private String occupationId;

    private String occupationDepict;

    private String company;

    private String companyContactPhone;

    private String healthCardNumber;

    private String healthCardOrganizationCode;

    private String healthFileNumber;

    private String archivingOrganizationCode;

    private String contactRelationshipCode;

    private String contactPhone;

    private String contactName;

    private String providerOrganizationId;

    private String providerOrganizationName;

    private String medicareTypeId;

    private String medicareTypeDepict;

    private String authorCode;

    private String authorName;

    private Date createTime;

    private Date updateTime;

    private String hiupStatus;

    private String hiupInfo;

    private String empi;

    //private String patientflag;

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

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode == null ? null : statusCode.trim();
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime == null ? null : effectiveTime.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getCertificatesTypeId() {
        return certificatesTypeId;
    }

    public void setCertificatesTypeId(String certificatesTypeId) {
        this.certificatesTypeId = certificatesTypeId == null ? null : certificatesTypeId.trim();
    }

    public String getCertificatesTypeDepict() {
        return certificatesTypeDepict;
    }

    public void setCertificatesTypeDepict(String certificatesTypeDepict) {
        this.certificatesTypeDepict = certificatesTypeDepict == null ? null : certificatesTypeDepict.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId == null ? null : genderId.trim();
    }

    public String getGenderDepict() {
        return genderDepict;
    }

    public void setGenderDepict(String genderDepict) {
        this.genderDepict = genderDepict == null ? null : genderDepict.trim();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth == null ? null : dateOfBirth.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getAddrState() {
        return addrState;
    }

    public void setAddrState(String addrState) {
        this.addrState = addrState == null ? null : addrState.trim();
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity == null ? null : addrCity.trim();
    }

    public String getAddrCounty() {
        return addrCounty;
    }

    public void setAddrCounty(String addrCounty) {
        this.addrCounty = addrCounty == null ? null : addrCounty.trim();
    }

    public String getAddrStreetNameBase() {
        return addrStreetNameBase;
    }

    public void setAddrStreetNameBase(String addrStreetNameBase) {
        this.addrStreetNameBase = addrStreetNameBase == null ? null : addrStreetNameBase.trim();
    }

    public String getAddrStreetName() {
        return addrStreetName;
    }

    public void setAddrStreetName(String addrStreetName) {
        this.addrStreetName = addrStreetName == null ? null : addrStreetName.trim();
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber == null ? null : houseNumber.trim();
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode == null ? null : postalCode.trim();
    }

    public String getMaritalStatusId() {
        return maritalStatusId;
    }

    public void setMaritalStatusId(String maritalStatusId) {
        this.maritalStatusId = maritalStatusId == null ? null : maritalStatusId.trim();
    }

    public String getMaritalStatusDepict() {
        return maritalStatusDepict;
    }

    public void setMaritalStatusDepict(String maritalStatusDepict) {
        this.maritalStatusDepict = maritalStatusDepict == null ? null : maritalStatusDepict.trim();
    }

    public String getEthnicGroupId() {
        return ethnicGroupId;
    }

    public void setEthnicGroupId(String ethnicGroupId) {
        this.ethnicGroupId = ethnicGroupId == null ? null : ethnicGroupId.trim();
    }

    public String getEthnicGroupDescrive() {
        return ethnicGroupDescrive;
    }

    public void setEthnicGroupDescrive(String ethnicGroupDescrive) {
        this.ethnicGroupDescrive = ethnicGroupDescrive == null ? null : ethnicGroupDescrive.trim();
    }

    public String getOccupationId() {
        return occupationId;
    }

    public void setOccupationId(String occupationId) {
        this.occupationId = occupationId == null ? null : occupationId.trim();
    }

    public String getOccupationDepict() {
        return occupationDepict;
    }

    public void setOccupationDepict(String occupationDepict) {
        this.occupationDepict = occupationDepict == null ? null : occupationDepict.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCompanyContactPhone() {
        return companyContactPhone;
    }

    public void setCompanyContactPhone(String companyContactPhone) {
        this.companyContactPhone = companyContactPhone == null ? null : companyContactPhone.trim();
    }

    public String getHealthCardNumber() {
        return healthCardNumber;
    }

    public void setHealthCardNumber(String healthCardNumber) {
        this.healthCardNumber = healthCardNumber == null ? null : healthCardNumber.trim();
    }

    public String getHealthCardOrganizationCode() {
        return healthCardOrganizationCode;
    }

    public void setHealthCardOrganizationCode(String healthCardOrganizationCode) {
        this.healthCardOrganizationCode = healthCardOrganizationCode == null ? null : healthCardOrganizationCode.trim();
    }

    public String getHealthFileNumber() {
        return healthFileNumber;
    }

    public void setHealthFileNumber(String healthFileNumber) {
        this.healthFileNumber = healthFileNumber == null ? null : healthFileNumber.trim();
    }

    public String getArchivingOrganizationCode() {
        return archivingOrganizationCode;
    }

    public void setArchivingOrganizationCode(String archivingOrganizationCode) {
        this.archivingOrganizationCode = archivingOrganizationCode == null ? null : archivingOrganizationCode.trim();
    }

    public String getContactRelationshipCode() {
        return contactRelationshipCode;
    }

    public void setContactRelationshipCode(String contactRelationshipCode) {
        this.contactRelationshipCode = contactRelationshipCode == null ? null : contactRelationshipCode.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getProviderOrganizationId() {
        return providerOrganizationId;
    }

    public void setProviderOrganizationId(String providerOrganizationId) {
        this.providerOrganizationId = providerOrganizationId == null ? null : providerOrganizationId.trim();
    }

    public String getProviderOrganizationName() {
        return providerOrganizationName;
    }

    public void setProviderOrganizationName(String providerOrganizationName) {
        this.providerOrganizationName = providerOrganizationName == null ? null : providerOrganizationName.trim();
    }

    public String getMedicareTypeId() {
        return medicareTypeId;
    }

    public void setMedicareTypeId(String medicareTypeId) {
        this.medicareTypeId = medicareTypeId == null ? null : medicareTypeId.trim();
    }

    public String getMedicareTypeDepict() {
        return medicareTypeDepict;
    }

    public void setMedicareTypeDepict(String medicareTypeDepict) {
        this.medicareTypeDepict = medicareTypeDepict == null ? null : medicareTypeDepict.trim();
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

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi == null ? null : empi.trim();
    }

    /*public String getPatientflag() {
        return patientflag;
    }

    public void setPatientflag(String patientflag) {
        this.patientflag = patientflag;
    }*/
}