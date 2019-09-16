//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.18 时间 10:12:42 AM CST 
//


package org.hl7.v3.ProvideAndRegisterDocumentSetRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.v3.DocEntity;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourcePatientID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourcePatientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HealthCardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdentityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ID" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Organization" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TelephoneNumber" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EmailAddress" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="streetNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RegistryPackage" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SubmissionSet" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SubmissionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ServerOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="EpisodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="InTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="OutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AdmissionDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AdmissionDoctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="AdmissionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="DiagnosisResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Author" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AuthorInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AuthorSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="AuthorRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="targetObject" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="availabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Document" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="parentDocumentRelationship" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="parentDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sourcePatientID",
    "sourcePatientName",
    "healthCardId",
    "identityId",
    "id",
    "organization",
    "registryPackage",
    "document"
})
@XmlRootElement(name = "ProvideAndRegisterDocumentSetRequest")
public class ProvideAndRegisterDocumentSetRequest extends DocEntity{

    @XmlElement(name = "SourcePatientID")
    protected String sourcePatientID;
    @XmlElement(name = "SourcePatientName")
    protected String sourcePatientName;
    @XmlElement(name = "HealthCardId")
    protected String healthCardId;
    @XmlElement(name = "IdentityId")
    protected String identityId;
    @XmlElement(name = "ID")
    protected List<ProvideAndRegisterDocumentSetRequest.ID> id;
    @XmlElement(name = "Organization")
    protected List<ProvideAndRegisterDocumentSetRequest.Organization> organization;
    @XmlElement(name = "RegistryPackage")
    protected List<ProvideAndRegisterDocumentSetRequest.RegistryPackage> registryPackage;
    @XmlElement(name = "Document")
    protected List<ProvideAndRegisterDocumentSetRequest.Document> document;

    /**
     * 获取sourcePatientID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePatientID() {
        return sourcePatientID;
    }

    /**
     * 设置sourcePatientID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePatientID(String value) {
        this.sourcePatientID = value;
    }

    /**
     * 获取sourcePatientName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcePatientName() {
        return sourcePatientName;
    }

    /**
     * 设置sourcePatientName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcePatientName(String value) {
        this.sourcePatientName = value;
    }

    /**
     * 获取healthCardId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthCardId() {
        return healthCardId;
    }

    /**
     * 设置healthCardId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthCardId(String value) {
        this.healthCardId = value;
    }

    /**
     * 获取identityId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityId() {
        return identityId;
    }

    /**
     * 设置identityId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityId(String value) {
        this.identityId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvideAndRegisterDocumentSetRequest.ID }
     * 
     * 
     */
    public List<ProvideAndRegisterDocumentSetRequest.ID> getID() {
        if (id == null) {
            id = new ArrayList<ProvideAndRegisterDocumentSetRequest.ID>();
        }
        return this.id;
    }

    /**
     * Gets the value of the organization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvideAndRegisterDocumentSetRequest.Organization }
     * 
     * 
     */
    public List<ProvideAndRegisterDocumentSetRequest.Organization> getOrganization() {
        if (organization == null) {
            organization = new ArrayList<ProvideAndRegisterDocumentSetRequest.Organization>();
        }
        return this.organization;
    }

    /**
     * Gets the value of the registryPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registryPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistryPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvideAndRegisterDocumentSetRequest.RegistryPackage }
     * 
     * 
     */
    public List<ProvideAndRegisterDocumentSetRequest.RegistryPackage> getRegistryPackage() {
        if (registryPackage == null) {
            registryPackage = new ArrayList<ProvideAndRegisterDocumentSetRequest.RegistryPackage>();
        }
        return this.registryPackage;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvideAndRegisterDocumentSetRequest.Document }
     * 
     * 
     */
    public List<ProvideAndRegisterDocumentSetRequest.Document> getDocument() {
        if (document == null) {
            document = new ArrayList<ProvideAndRegisterDocumentSetRequest.Document>();
        }
        return this.document;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="parentDocumentRelationship" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="parentDocumentId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Document {

        @XmlElement(name = "Content")
        protected String content;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "mimeType")
        protected String mimeType;
        @XmlAttribute(name = "parentDocumentRelationship")
        protected String parentDocumentRelationship;
        @XmlAttribute(name = "parentDocumentId")
        protected String parentDocumentId;

        /**
         * 获取content属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContent() {
            return content;
        }

        /**
         * 设置content属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContent(String value) {
            this.content = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * 获取mimeType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMimeType() {
            return mimeType;
        }

        /**
         * 设置mimeType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMimeType(String value) {
            this.mimeType = value;
        }

        /**
         * 获取parentDocumentRelationship属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentDocumentRelationship() {
            return parentDocumentRelationship;
        }

        /**
         * 设置parentDocumentRelationship属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentDocumentRelationship(String value) {
            this.parentDocumentRelationship = value;
        }

        /**
         * 获取parentDocumentId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentDocumentId() {
            return parentDocumentId;
        }

        /**
         * 设置parentDocumentId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentDocumentId(String value) {
            this.parentDocumentId = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ID {

        @XmlAttribute(name = "root")
        protected String root;
        @XmlAttribute(name = "extension")
        protected String extension;

        /**
         * 获取root属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoot() {
            return root;
        }

        /**
         * 设置root属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoot(String value) {
            this.root = value;
        }

        /**
         * 获取extension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * 设置extension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TelephoneNumber" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EmailAddress" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="streetNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "telephoneNumber",
        "emailAddress",
        "address"
    })
    public static class Organization {

        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "TelephoneNumber")
        protected List<ProvideAndRegisterDocumentSetRequest.Organization.TelephoneNumber> telephoneNumber;
        @XmlElement(name = "EmailAddress")
        protected List<ProvideAndRegisterDocumentSetRequest.Organization.EmailAddress> emailAddress;
        @XmlElement(name = "Address")
        protected List<ProvideAndRegisterDocumentSetRequest.Organization.Address> address;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the telephoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the telephoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTelephoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProvideAndRegisterDocumentSetRequest.Organization.TelephoneNumber }
         * 
         * 
         */
        public List<ProvideAndRegisterDocumentSetRequest.Organization.TelephoneNumber> getTelephoneNumber() {
            if (telephoneNumber == null) {
                telephoneNumber = new ArrayList<ProvideAndRegisterDocumentSetRequest.Organization.TelephoneNumber>();
            }
            return this.telephoneNumber;
        }

        /**
         * Gets the value of the emailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProvideAndRegisterDocumentSetRequest.Organization.EmailAddress }
         * 
         * 
         */
        public List<ProvideAndRegisterDocumentSetRequest.Organization.EmailAddress> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<ProvideAndRegisterDocumentSetRequest.Organization.EmailAddress>();
            }
            return this.emailAddress;
        }

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProvideAndRegisterDocumentSetRequest.Organization.Address }
         * 
         * 
         */
        public List<ProvideAndRegisterDocumentSetRequest.Organization.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<ProvideAndRegisterDocumentSetRequest.Organization.Address>();
            }
            return this.address;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="stateOrProvince" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="streetNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Address {

            @XmlAttribute(name = "city")
            protected String city;
            @XmlAttribute(name = "country")
            protected String country;
            @XmlAttribute(name = "postalCode")
            protected String postalCode;
            @XmlAttribute(name = "stateOrProvince")
            protected String stateOrProvince;
            @XmlAttribute(name = "street")
            protected String street;
            @XmlAttribute(name = "streetNumber")
            protected String streetNumber;

            /**
             * 获取city属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * 设置city属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * 获取country属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountry() {
                return country;
            }

            /**
             * 设置country属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountry(String value) {
                this.country = value;
            }

            /**
             * 获取postalCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * 设置postalCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * 获取stateOrProvince属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateOrProvince() {
                return stateOrProvince;
            }

            /**
             * 设置stateOrProvince属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateOrProvince(String value) {
                this.stateOrProvince = value;
            }

            /**
             * 获取street属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreet() {
                return street;
            }

            /**
             * 设置street属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreet(String value) {
                this.street = value;
            }

            /**
             * 获取streetNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStreetNumber() {
                return streetNumber;
            }

            /**
             * 设置streetNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStreetNumber(String value) {
                this.streetNumber = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EmailAddress {

            @XmlAttribute(name = "address")
            protected String address;

            /**
             * 获取address属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddress() {
                return address;
            }

            /**
             * 设置address属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddress(String value) {
                this.address = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="areaCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="number" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TelephoneNumber {

            @XmlAttribute(name = "areaCode")
            protected String areaCode;
            @XmlAttribute(name = "number")
            protected String number;

            /**
             * 获取areaCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaCode() {
                return areaCode;
            }

            /**
             * 设置areaCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaCode(String value) {
                this.areaCode = value;
            }

            /**
             * 获取number属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * 设置number属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SubmissionSet" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SubmissionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ServerOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="EpisodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="InTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="OutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AdmissionDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AdmissionDoctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="AdmissionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="DiagnosisResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Author" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AuthorInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AuthorSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="AuthorRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="targetObject" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="availabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "submissionSet"
    })
    public static class RegistryPackage {

        @XmlElement(name = "SubmissionSet")
        protected List<ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet> submissionSet;

        /**
         * Gets the value of the submissionSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submissionSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubmissionSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet }
         * 
         * 
         */
        public List<ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet> getSubmissionSet() {
            if (submissionSet == null) {
                submissionSet = new ArrayList<ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet>();
            }
            return this.submissionSet;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SubmissionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="UniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="SourceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="CreateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ServerOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="EpisodeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="InTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="OutTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AdmissionDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AdmissionDoctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="AdmissionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="DiagnosisResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Author" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AuthorInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AuthorSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="AuthorRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="targetObject" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="availabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "submissionTime",
            "uniqueId",
            "sourceId",
            "comments",
            "title",
            "createTime",
            "serverOrganization",
            "episodeID",
            "inTime",
            "outTime",
            "admissionDepart",
            "admissionDoctor",
            "admissionType",
            "diagnosisResult",
            "author"
        })
        public static class SubmissionSet {

            @XmlElement(name = "SubmissionTime")
            protected String submissionTime;
            @XmlElement(name = "UniqueId")
            protected String uniqueId;
            @XmlElement(name = "SourceId")
            protected String sourceId;
            @XmlElement(name = "Comments")
            protected String comments;
            @XmlElement(name = "Title")
            protected String title;
            @XmlElement(name = "CreateTime")
            protected String createTime;
            @XmlElement(name = "ServerOrganization")
            protected String serverOrganization;
            @XmlElement(name = "EpisodeID")
            protected String episodeID;
            @XmlElement(name = "InTime")
            protected String inTime;
            @XmlElement(name = "OutTime")
            protected String outTime;
            @XmlElement(name = "AdmissionDepart")
            protected String admissionDepart;
            @XmlElement(name = "AdmissionDoctor")
            protected String admissionDoctor;
            @XmlElement(name = "AdmissionType")
            protected String admissionType;
            @XmlElement(name = "DiagnosisResult")
            protected String diagnosisResult;
            @XmlElement(name = "Author")
            protected List<ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet.Author> author;
            @XmlAttribute(name = "targetObject")
            protected String targetObject;
            @XmlAttribute(name = "availabilityStatus")
            protected String availabilityStatus;

            /**
             * 获取submissionTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubmissionTime() {
                return submissionTime;
            }

            /**
             * 设置submissionTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubmissionTime(String value) {
                this.submissionTime = value;
            }

            /**
             * 获取uniqueId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueId() {
                return uniqueId;
            }

            /**
             * 设置uniqueId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueId(String value) {
                this.uniqueId = value;
            }

            /**
             * 获取sourceId属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSourceId() {
                return sourceId;
            }

            /**
             * 设置sourceId属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSourceId(String value) {
                this.sourceId = value;
            }

            /**
             * 获取comments属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComments() {
                return comments;
            }

            /**
             * 设置comments属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComments(String value) {
                this.comments = value;
            }

            /**
             * 获取title属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * 设置title属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * 获取createTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreateTime() {
                return createTime;
            }

            /**
             * 设置createTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreateTime(String value) {
                this.createTime = value;
            }

            /**
             * 获取serverOrganization属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServerOrganization() {
                return serverOrganization;
            }

            /**
             * 设置serverOrganization属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServerOrganization(String value) {
                this.serverOrganization = value;
            }

            /**
             * 获取episodeID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEpisodeID() {
                return episodeID;
            }

            /**
             * 设置episodeID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEpisodeID(String value) {
                this.episodeID = value;
            }

            /**
             * 获取inTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInTime() {
                return inTime;
            }

            /**
             * 设置inTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInTime(String value) {
                this.inTime = value;
            }

            /**
             * 获取outTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOutTime() {
                return outTime;
            }

            /**
             * 设置outTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOutTime(String value) {
                this.outTime = value;
            }

            /**
             * 获取admissionDepart属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdmissionDepart() {
                return admissionDepart;
            }

            /**
             * 设置admissionDepart属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdmissionDepart(String value) {
                this.admissionDepart = value;
            }

            /**
             * 获取admissionDoctor属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdmissionDoctor() {
                return admissionDoctor;
            }

            /**
             * 设置admissionDoctor属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdmissionDoctor(String value) {
                this.admissionDoctor = value;
            }

            /**
             * 获取admissionType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdmissionType() {
                return admissionType;
            }

            /**
             * 设置admissionType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdmissionType(String value) {
                this.admissionType = value;
            }

            /**
             * 获取diagnosisResult属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDiagnosisResult() {
                return diagnosisResult;
            }

            /**
             * 设置diagnosisResult属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDiagnosisResult(String value) {
                this.diagnosisResult = value;
            }

            /**
             * Gets the value of the author property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the author property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAuthor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet.Author }
             * 
             * 
             */
            public List<ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet.Author> getAuthor() {
                if (author == null) {
                    author = new ArrayList<ProvideAndRegisterDocumentSetRequest.RegistryPackage.SubmissionSet.Author>();
                }
                return this.author;
            }

            /**
             * 获取targetObject属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTargetObject() {
                return targetObject;
            }

            /**
             * 设置targetObject属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTargetObject(String value) {
                this.targetObject = value;
            }

            /**
             * 获取availabilityStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAvailabilityStatus() {
                return availabilityStatus;
            }

            /**
             * 设置availabilityStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAvailabilityStatus(String value) {
                this.availabilityStatus = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="AuthorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AuthorInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AuthorSpecialty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="AuthorRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "authorName",
                "authorInstitution",
                "authorSpecialty",
                "authorRole"
            })
            public static class Author {

                @XmlElement(name = "AuthorName")
                protected String authorName;
                @XmlElement(name = "AuthorInstitution")
                protected String authorInstitution;
                @XmlElement(name = "AuthorSpecialty")
                protected String authorSpecialty;
                @XmlElement(name = "AuthorRole")
                protected String authorRole;

                /**
                 * 获取authorName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorName() {
                    return authorName;
                }

                /**
                 * 设置authorName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorName(String value) {
                    this.authorName = value;
                }

                /**
                 * 获取authorInstitution属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorInstitution() {
                    return authorInstitution;
                }

                /**
                 * 设置authorInstitution属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorInstitution(String value) {
                    this.authorInstitution = value;
                }

                /**
                 * 获取authorSpecialty属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorSpecialty() {
                    return authorSpecialty;
                }

                /**
                 * 设置authorSpecialty属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorSpecialty(String value) {
                    this.authorSpecialty = value;
                }

                /**
                 * 获取authorRole属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorRole() {
                    return authorRole;
                }

                /**
                 * 设置authorRole属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorRole(String value) {
                    this.authorRole = value;
                }

            }

        }

    }


	@Override
	public Map<String, Object> toMap() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("msgId", this.id.get(0).getExtension());
		map.put("docFlowNo", this.registryPackage.get(0).getSubmissionSet().get(0).uniqueId);
		map.put("docTypeId", this.registryPackage.get(0).getSubmissionSet().get(0).sourceId);
		map.put("docTypeDepict", this.registryPackage.get(0).getSubmissionSet().get(0).title);
		map.put("docCreationTime", this.registryPackage.get(0).getSubmissionSet().get(0).createTime);
		map.put("base64DocContent", this.document.get(0).content);
		//map.put("patientId", this.sourcePatientID);
        map.put("patientId", this.registryPackage.get(0).submissionSet.get(0).episodeID);
		map.put("identityNo", this.identityId);
		map.put("name", this.sourcePatientName);
		map.put("authorName", this.registryPackage.get(0).submissionSet.get(0).author.get(0).authorName);
		map.put("healthCardId", this.healthCardId);
		map.put("serverOrganization", this.registryPackage.get(0).submissionSet.get(0).serverOrganization);
		//map.put("episodeId", this.registryPackage.get(0).submissionSet.get(0).episodeID);
        map.put("episodeId", this.sourcePatientID);
		map.put("inTime", this.registryPackage.get(0).submissionSet.get(0).inTime);
		map.put("outTime", this.registryPackage.get(0).submissionSet.get(0).outTime);
		map.put("admissionDepart", this.registryPackage.get(0).submissionSet.get(0).admissionDepart);
		//门诊/住院
		map.put("admissionType", this.registryPackage.get(0).submissionSet.get(0).admissionType);
		map.put("admissionDoctor", this.registryPackage.get(0).submissionSet.get(0).admissionDoctor);
		map.put("diagnosisResult", this.registryPackage.get(0).submissionSet.get(0).diagnosisResult);
		map.put("docType", this.registryPackage.get(0).submissionSet.get(0).targetObject);
		map.put("documentId", this.document.get(0).id);
		map.put("hospitalCode", this.organization.get(0).id);
		map.put("hospitalName", this.organization.get(0).name);
		return map;
	}

}
