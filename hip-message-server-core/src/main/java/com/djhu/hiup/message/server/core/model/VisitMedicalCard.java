package com.djhu.hiup.message.server.core.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 就诊信息_就诊卡信息表
 */
public class VisitMedicalCard {
    private BigDecimal pk;

    private String msgId;

    private String msgCreationTime;

    private String receiveId;

    private String sendId;

    private String medicalCardNo;

    private String medicalCardStatus;

    private String createCardTime;

    private String identityNo;

    private String name;

    private String contactPhone;

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

    private String contactRelationshipCode;

    private String contactRelationshipDepict;

    private String contactPersonPhone;

    private String contactPersonName;

    private String organizationCode;

    private String organizationName;

    private String medicareTypeId;

    private String medicareTypeDepict;

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

    public String getMedicalCardNo() {
        return medicalCardNo;
    }

    public void setMedicalCardNo(String medicalCardNo) {
        this.medicalCardNo = medicalCardNo == null ? null : medicalCardNo.trim();
    }

    public String getMedicalCardStatus() {
        return medicalCardStatus;
    }

    public void setMedicalCardStatus(String medicalCardStatus) {
        this.medicalCardStatus = medicalCardStatus == null ? null : medicalCardStatus.trim();
    }

    public String getCreateCardTime() {
        return createCardTime;
    }

    public void setCreateCardTime(String createCardTime) {
        this.createCardTime = createCardTime == null ? null : createCardTime.trim();
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

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
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

    public String getContactRelationshipCode() {
        return contactRelationshipCode;
    }

    public void setContactRelationshipCode(String contactRelationshipCode) {
        this.contactRelationshipCode = contactRelationshipCode == null ? null : contactRelationshipCode.trim();
    }

    public String getContactRelationshipDepict() {
        return contactRelationshipDepict;
    }

    public void setContactRelationshipDepict(String contactRelationshipDepict) {
        this.contactRelationshipDepict = contactRelationshipDepict == null ? null : contactRelationshipDepict.trim();
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

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName == null ? null : organizationName.trim();
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
}