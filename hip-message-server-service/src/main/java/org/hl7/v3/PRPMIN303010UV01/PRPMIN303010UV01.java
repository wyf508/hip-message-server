//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.18 时间 04:16:40 PM CST 
//


package org.hl7.v3.PRPMIN303010UV01;

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
import javax.xml.bind.annotation.XmlValue;

import org.hl7.v3.DocEntity;
import org.hl7.v3.PRPMIN303010UV01.Code;
import org.hl7.v3.PRPMIN303010UV01.Device;
import org.hl7.v3.PRPMIN303010UV01.Id;
import org.hl7.v3.PRPMIN303010UV01.StatusCode;


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
 *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creationTime" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="interactionId" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="processingCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="processingModeCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="acceptAckCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="receiver" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element ref="{urn:hl7-org:v3}device" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sender" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element ref="{urn:hl7-org:v3}device" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="controlActProcess" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="subject" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="registrationRequest" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="subject1" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="healthCareProvider" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="low" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="high" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="healthCarePrincipalPerson" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;simpleContent>
 *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                             &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/extension>
 *                                                                         &lt;/simpleContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="asAffiliate" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                       &lt;/sequence>
 *                                                                                       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                             &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="birthplace" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                             &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="author" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="assignedEntity" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="assignedOrganization" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ITSVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "creationTime",
    "interactionId",
    "processingCode",
    "processingModeCode",
    "acceptAckCode",
    "receiver",
    "sender",
    "controlActProcess"
})
@XmlRootElement(name = "PRPM_IN303010UV01")
public class PRPMIN303010UV01 extends DocEntity{
	protected List<Id> id;
    protected List<PRPMIN303010UV01 .CreationTime> creationTime;
    protected List<PRPMIN303010UV01 .InteractionId> interactionId;
    protected List<PRPMIN303010UV01 .ProcessingCode> processingCode;
    protected List<PRPMIN303010UV01 .ProcessingModeCode> processingModeCode;
    protected List<PRPMIN303010UV01 .AcceptAckCode> acceptAckCode;
    protected List<PRPMIN303010UV01 .Receiver> receiver;
    protected List<PRPMIN303010UV01 .Sender> sender;
    protected List<PRPMIN303010UV01 .ControlActProcess> controlActProcess;
    @XmlAttribute(name = "ITSVersion")
    protected String itsVersion;

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
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     * 
     * 
     */
    public List<Id> getId() {
        if (id == null) {
            id = new ArrayList<Id>();
        }
        return this.id;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creationTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreationTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .CreationTime }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .CreationTime> getCreationTime() {
        if (creationTime == null) {
            creationTime = new ArrayList<PRPMIN303010UV01 .CreationTime>();
        }
        return this.creationTime;
    }

    /**
     * Gets the value of the interactionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .InteractionId }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .InteractionId> getInteractionId() {
        if (interactionId == null) {
            interactionId = new ArrayList<PRPMIN303010UV01 .InteractionId>();
        }
        return this.interactionId;
    }

    /**
     * Gets the value of the processingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .ProcessingCode }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .ProcessingCode> getProcessingCode() {
        if (processingCode == null) {
            processingCode = new ArrayList<PRPMIN303010UV01 .ProcessingCode>();
        }
        return this.processingCode;
    }

    /**
     * Gets the value of the processingModeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processingModeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingModeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .ProcessingModeCode }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .ProcessingModeCode> getProcessingModeCode() {
        if (processingModeCode == null) {
            processingModeCode = new ArrayList<PRPMIN303010UV01 .ProcessingModeCode>();
        }
        return this.processingModeCode;
    }

    /**
     * Gets the value of the acceptAckCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptAckCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptAckCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .AcceptAckCode }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .AcceptAckCode> getAcceptAckCode() {
        if (acceptAckCode == null) {
            acceptAckCode = new ArrayList<PRPMIN303010UV01 .AcceptAckCode>();
        }
        return this.acceptAckCode;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .Receiver }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<PRPMIN303010UV01 .Receiver>();
        }
        return this.receiver;
    }

    /**
     * Gets the value of the sender property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sender property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSender().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .Sender }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .Sender> getSender() {
        if (sender == null) {
            sender = new ArrayList<PRPMIN303010UV01 .Sender>();
        }
        return this.sender;
    }

    /**
     * Gets the value of the controlActProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlActProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlActProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRPMIN303010UV01 .ControlActProcess }
     * 
     * 
     */
    public List<PRPMIN303010UV01 .ControlActProcess> getControlActProcess() {
        if (controlActProcess == null) {
            controlActProcess = new ArrayList<PRPMIN303010UV01 .ControlActProcess>();
        }
        return this.controlActProcess;
    }

    /**
     * 获取itsVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getITSVersion() {
        return itsVersion;
    }

    /**
     * 设置itsVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setITSVersion(String value) {
        this.itsVersion = value;
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
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AcceptAckCode {

        @XmlAttribute(name = "code")
        protected String code;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *         &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="subject" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="registrationRequest" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="subject1" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="healthCareProvider" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="low" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="high" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="healthCarePrincipalPerson" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;simpleContent>
     *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                   &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/extension>
     *                                                               &lt;/simpleContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="asAffiliate" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                               &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                             &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="birthplace" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="author" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="assignedEntity" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="assignedPerson" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="representedOrganization" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="contactParty" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="contactPerson" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                             &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "code",
        "subject"
    })
    public static class ControlActProcess {

        protected List<Code> code;
        protected List<PRPMIN303010UV01 .ControlActProcess.Subject> subject;
        @XmlAttribute(name = "classCode")
        protected String classCode;
        @XmlAttribute(name = "moodCode")
        protected String moodCode;

        /**
         * Gets the value of the code property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the code property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Code }
         * 
         * 
         */
        public List<Code> getCode() {
            if (code == null) {
                code = new ArrayList<Code>();
            }
            return this.code;
        }

        /**
         * Gets the value of the subject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PRPMIN303010UV01 .ControlActProcess.Subject }
         * 
         * 
         */
        public List<PRPMIN303010UV01 .ControlActProcess.Subject> getSubject() {
            if (subject == null) {
                subject = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject>();
            }
            return this.subject;
        }

        /**
         * 获取classCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassCode() {
            return classCode;
        }

        /**
         * 设置classCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassCode(String value) {
            this.classCode = value;
        }

        /**
         * 获取moodCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoodCode() {
            return moodCode;
        }

        /**
         * 设置moodCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoodCode(String value) {
            this.moodCode = value;
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
         *         &lt;element name="registrationRequest" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="subject1" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="healthCareProvider" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="low" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="high" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="healthCarePrincipalPerson" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;simpleContent>
         *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                         &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/extension>
         *                                                     &lt;/simpleContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="asAffiliate" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="birthplace" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="author" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="assignedEntity" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="assignedPerson" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="representedOrganization" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="contactParty" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="contactPerson" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "registrationRequest"
        })
        public static class Subject {

            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest> registrationRequest;
            @XmlAttribute(name = "typeCode")
            protected String typeCode;

            /**
             * Gets the value of the registrationRequest property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the registrationRequest property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegistrationRequest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest }
             * 
             * 
             */
            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest> getRegistrationRequest() {
                if (registrationRequest == null) {
                    registrationRequest = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest>();
                }
                return this.registrationRequest;
            }

            /**
             * 获取typeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTypeCode() {
                return typeCode;
            }

            /**
             * 设置typeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTypeCode(String value) {
                this.typeCode = value;
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
             *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="subject1" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="healthCareProvider" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="low" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="high" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="healthCarePrincipalPerson" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;simpleContent>
             *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                               &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/extension>
             *                                           &lt;/simpleContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="asAffiliate" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="birthplace" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="author" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="assignedEntity" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="assignedPerson" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="representedOrganization" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="contactParty" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="contactPerson" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "statusCode",
                "subject1",
                "author"
            })
            public static class RegistrationRequest {

                protected List<StatusCode> statusCode;
                protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1> subject1;
                protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author> author;
                @XmlAttribute(name = "classCode")
                protected String classCode;
                @XmlAttribute(name = "moodCode")
                protected String moodCode;

                /**
                 * Gets the value of the statusCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the statusCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStatusCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StatusCode }
                 * 
                 * 
                 */
                public List<StatusCode> getStatusCode() {
                    if (statusCode == null) {
                        statusCode = new ArrayList<StatusCode>();
                    }
                    return this.statusCode;
                }

                /**
                 * Gets the value of the subject1 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the subject1 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSubject1().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 }
                 * 
                 * 
                 */
                public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1> getSubject1() {
                    if (subject1 == null) {
                        subject1 = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1>();
                    }
                    return this.subject1;
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
                 * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author }
                 * 
                 * 
                 */
                public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author> getAuthor() {
                    if (author == null) {
                        author = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author>();
                    }
                    return this.author;
                }

                /**
                 * 获取classCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getClassCode() {
                    return classCode;
                }

                /**
                 * 设置classCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setClassCode(String value) {
                    this.classCode = value;
                }

                /**
                 * 获取moodCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMoodCode() {
                    return moodCode;
                }

                /**
                 * 设置moodCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMoodCode(String value) {
                    this.moodCode = value;
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
                 *         &lt;element name="assignedEntity" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="assignedPerson" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="representedOrganization" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="contactParty" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="contactPerson" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "assignedEntity"
                })
                public static class Author {

                    protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity> assignedEntity;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;

                    /**
                     * Gets the value of the assignedEntity property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the assignedEntity property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAssignedEntity().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity }
                     * 
                     * 
                     */
                    public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity> getAssignedEntity() {
                        if (assignedEntity == null) {
                            assignedEntity = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity>();
                        }
                        return this.assignedEntity;
                    }

                    /**
                     * 获取typeCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTypeCode() {
                        return typeCode;
                    }

                    /**
                     * 设置typeCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTypeCode(String value) {
                        this.typeCode = value;
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
                     *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="assignedPerson" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="representedOrganization" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="contactParty" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="contactPerson" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                     &lt;/sequence>
                     *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "id",
                        "assignedPerson",
                        "representedOrganization"
                    })
                    public static class AssignedEntity {

                        protected List<Id> id;
                        protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson> assignedPerson;
                        protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization> representedOrganization;
                        @XmlAttribute(name = "classCode")
                        protected String classCode;

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
                         *    getId().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Id }
                         * 
                         * 
                         */
                        public List<Id> getId() {
                            if (id == null) {
                                id = new ArrayList<Id>();
                            }
                            return this.id;
                        }

                        /**
                         * Gets the value of the assignedPerson property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the assignedPerson property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAssignedPerson().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson }
                         * 
                         * 
                         */
                        public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson> getAssignedPerson() {
                            if (assignedPerson == null) {
                                assignedPerson = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson>();
                            }
                            return this.assignedPerson;
                        }

                        /**
                         * Gets the value of the representedOrganization property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the representedOrganization property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRepresentedOrganization().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization }
                         * 
                         * 
                         */
                        public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization> getRepresentedOrganization() {
                            if (representedOrganization == null) {
                                representedOrganization = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization>();
                            }
                            return this.representedOrganization;
                        }

                        /**
                         * 获取classCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getClassCode() {
                            return classCode;
                        }

                        /**
                         * 设置classCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setClassCode(String value) {
                            this.classCode = value;
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
                         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *       &lt;/sequence>
                         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "name"
                        })
                        public static class AssignedPerson {

                            protected String name;
                            @XmlAttribute(name = "classCode")
                            protected String classCode;
                            @XmlAttribute(name = "determinerCode")
                            protected String determinerCode;

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
                             * 获取classCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getClassCode() {
                                return classCode;
                            }

                            /**
                             * 设置classCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setClassCode(String value) {
                                this.classCode = value;
                            }

                            /**
                             * 获取determinerCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDeterminerCode() {
                                return determinerCode;
                            }

                            /**
                             * 设置determinerCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDeterminerCode(String value) {
                                this.determinerCode = value;
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
                         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="contactParty" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="contactPerson" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                           &lt;/sequence>
                         *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "id",
                            "contactParty"
                        })
                        public static class RepresentedOrganization {

                            protected String name;
                            protected List<Id> id;
                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty> contactParty;
                            @XmlAttribute(name = "classCode")
                            protected String classCode;
                            @XmlAttribute(name = "determinerCode")
                            protected String determinerCode;

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
                             *    getId().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Id }
                             * 
                             * 
                             */
                            public List<Id> getId() {
                                if (id == null) {
                                    id = new ArrayList<Id>();
                                }
                                return this.id;
                            }

                            /**
                             * Gets the value of the contactParty property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the contactParty property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getContactParty().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty> getContactParty() {
                                if (contactParty == null) {
                                    contactParty = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty>();
                                }
                                return this.contactParty;
                            }

                            /**
                             * 获取classCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getClassCode() {
                                return classCode;
                            }

                            /**
                             * 设置classCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setClassCode(String value) {
                                this.classCode = value;
                            }

                            /**
                             * 获取determinerCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDeterminerCode() {
                                return determinerCode;
                            }

                            /**
                             * 设置determinerCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDeterminerCode(String value) {
                                this.determinerCode = value;
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
                             *         &lt;element name="contactPerson" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                 &lt;/sequence>
                             *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "contactPerson"
                            })
                            public static class ContactParty {

                                protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty.ContactPerson> contactPerson;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;

                                /**
                                 * Gets the value of the contactPerson property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getContactPerson().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty.ContactPerson }
                                 * 
                                 * 
                                 */
                                public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty.ContactPerson> getContactPerson() {
                                    if (contactPerson == null) {
                                        contactPerson = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.RepresentedOrganization.ContactParty.ContactPerson>();
                                    }
                                    return this.contactPerson;
                                }

                                /**
                                 * 获取classCode属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getClassCode() {
                                    return classCode;
                                }

                                /**
                                 * 设置classCode属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setClassCode(String value) {
                                    this.classCode = value;
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
                                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *       &lt;/sequence>
                                 *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "name"
                                })
                                public static class ContactPerson {

                                    protected String name;
                                    @XmlAttribute(name = "classCode")
                                    protected String classCode;
                                    @XmlAttribute(name = "determinerCode")
                                    protected String determinerCode;

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
                                     * 获取classCode属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getClassCode() {
                                        return classCode;
                                    }

                                    /**
                                     * 设置classCode属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setClassCode(String value) {
                                        this.classCode = value;
                                    }

                                    /**
                                     * 获取determinerCode属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getDeterminerCode() {
                                        return determinerCode;
                                    }

                                    /**
                                     * 设置determinerCode属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setDeterminerCode(String value) {
                                        this.determinerCode = value;
                                    }

                                }

                            }

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
                 *         &lt;element name="healthCareProvider" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="low" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="high" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="healthCarePrincipalPerson" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;simpleContent>
                 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/extension>
                 *                                 &lt;/simpleContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="asAffiliate" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="birthplace" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "healthCareProvider"
                })
                public static class Subject1 {

                    protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider> healthCareProvider;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;

                    /**
                     * Gets the value of the healthCareProvider property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the healthCareProvider property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getHealthCareProvider().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider }
                     * 
                     * 
                     */
                    public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider> getHealthCareProvider() {
                        if (healthCareProvider == null) {
                            healthCareProvider = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider>();
                        }
                        return this.healthCareProvider;
                    }

                    /**
                     * 获取typeCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTypeCode() {
                        return typeCode;
                    }

                    /**
                     * 设置typeCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTypeCode(String value) {
                        this.typeCode = value;
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
                     *         &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="low" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="high" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="healthCarePrincipalPerson" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;simpleContent>
                     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/extension>
                     *                       &lt;/simpleContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="asAffiliate" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                                     &lt;/sequence>
                     *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="birthplace" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "addr",
                        "telecom",
                        "id",
                        "code",
                        "statusCode",
                        "effectiveTime",
                        "healthCarePrincipalPerson"
                    })
                    public static class HealthCareProvider {

                        protected String addr;
                        protected String telecom;
                        protected List<Id> id;
                        protected List<Code> code;
                        protected List<StatusCode> statusCode;
                        protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime> effectiveTime;
                        protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson> healthCarePrincipalPerson;
                        @XmlAttribute(name = "classCode")
                        protected String classCode;

                        /**
                         * 获取addr属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAddr() {
                            return addr;
                        }

                        /**
                         * 设置addr属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAddr(String value) {
                            this.addr = value;
                        }

                        /**
                         * 获取telecom属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTelecom() {
                            return telecom;
                        }

                        /**
                         * 设置telecom属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTelecom(String value) {
                            this.telecom = value;
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
                         *    getId().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Id }
                         * 
                         * 
                         */
                        public List<Id> getId() {
                            if (id == null) {
                                id = new ArrayList<Id>();
                            }
                            return this.id;
                        }

                        /**
                         * Gets the value of the code property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the code property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCode().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link Code }
                         * 
                         * 
                         */
                        public List<Code> getCode() {
                            if (code == null) {
                                code = new ArrayList<Code>();
                            }
                            return this.code;
                        }

                        /**
                         * Gets the value of the statusCode property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the statusCode property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getStatusCode().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link StatusCode }
                         * 
                         * 
                         */
                        public List<StatusCode> getStatusCode() {
                            if (statusCode == null) {
                                statusCode = new ArrayList<StatusCode>();
                            }
                            return this.statusCode;
                        }

                        /**
                         * Gets the value of the effectiveTime property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the effectiveTime property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getEffectiveTime().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime }
                         * 
                         * 
                         */
                        public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime> getEffectiveTime() {
                            if (effectiveTime == null) {
                                effectiveTime = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime>();
                            }
                            return this.effectiveTime;
                        }

                        /**
                         * Gets the value of the healthCarePrincipalPerson property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the healthCarePrincipalPerson property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getHealthCarePrincipalPerson().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson }
                         * 
                         * 
                         */
                        public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson> getHealthCarePrincipalPerson() {
                            if (healthCarePrincipalPerson == null) {
                                healthCarePrincipalPerson = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson>();
                            }
                            return this.healthCarePrincipalPerson;
                        }

                        /**
                         * 获取classCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getClassCode() {
                            return classCode;
                        }

                        /**
                         * 设置classCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setClassCode(String value) {
                            this.classCode = value;
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
                         *         &lt;element name="low" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="high" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "low",
                            "high"
                        })
                        public static class EffectiveTime {

                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.Low> low;
                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.High> high;

                            /**
                             * Gets the value of the low property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the low property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getLow().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.Low }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.Low> getLow() {
                                if (low == null) {
                                    low = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.Low>();
                                }
                                return this.low;
                            }

                            /**
                             * Gets the value of the high property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the high property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getHigh().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.High }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.High> getHigh() {
                                if (high == null) {
                                    high = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.EffectiveTime.High>();
                                }
                                return this.high;
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
                             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class High {

                                @XmlAttribute(name = "value")
                                protected String value;

                                /**
                                 * 获取value属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * 设置value属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
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
                             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class Low {

                                @XmlAttribute(name = "value")
                                protected String value;

                                /**
                                 * 获取value属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * 设置value属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
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
                         *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;simpleContent>
                         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/extension>
                         *             &lt;/simpleContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="asAffiliate" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *                           &lt;/sequence>
                         *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="birthplace" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "id",
                            "name",
                            "administrativeGenderCode",
                            "birthTime",
                            "asAffiliate",
                            "birthplace"
                        })
                        public static class HealthCarePrincipalPerson {

                            protected List<Id> id;
                            @XmlElement(nillable = true)
                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Name> name;
                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AdministrativeGenderCode> administrativeGenderCode;
                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.BirthTime> birthTime;
                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate> asAffiliate;
                            protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Birthplace> birthplace;
                            @XmlAttribute(name = "classCode")
                            protected String classCode;
                            @XmlAttribute(name = "determinerCode")
                            protected String determinerCode;

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
                             *    getId().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Id }
                             * 
                             * 
                             */
                            public List<Id> getId() {
                                if (id == null) {
                                    id = new ArrayList<Id>();
                                }
                                return this.id;
                            }

                            /**
                             * Gets the value of the name property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the name property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getName().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Name }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Name> getName() {
                                if (name == null) {
                                    name = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Name>();
                                }
                                return this.name;
                            }

                            /**
                             * Gets the value of the administrativeGenderCode property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the administrativeGenderCode property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAdministrativeGenderCode().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AdministrativeGenderCode }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AdministrativeGenderCode> getAdministrativeGenderCode() {
                                if (administrativeGenderCode == null) {
                                    administrativeGenderCode = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AdministrativeGenderCode>();
                                }
                                return this.administrativeGenderCode;
                            }

                            /**
                             * Gets the value of the birthTime property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the birthTime property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getBirthTime().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.BirthTime }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.BirthTime> getBirthTime() {
                                if (birthTime == null) {
                                    birthTime = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.BirthTime>();
                                }
                                return this.birthTime;
                            }

                            /**
                             * Gets the value of the asAffiliate property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the asAffiliate property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAsAffiliate().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate> getAsAffiliate() {
                                if (asAffiliate == null) {
                                    asAffiliate = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate>();
                                }
                                return this.asAffiliate;
                            }

                            /**
                             * Gets the value of the birthplace property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the birthplace property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getBirthplace().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Birthplace }
                             * 
                             * 
                             */
                            public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Birthplace> getBirthplace() {
                                if (birthplace == null) {
                                    birthplace = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.Birthplace>();
                                }
                                return this.birthplace;
                            }

                            /**
                             * 获取classCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getClassCode() {
                                return classCode;
                            }

                            /**
                             * 设置classCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setClassCode(String value) {
                                this.classCode = value;
                            }

                            /**
                             * 获取determinerCode属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDeterminerCode() {
                                return determinerCode;
                            }

                            /**
                             * 设置determinerCode属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDeterminerCode(String value) {
                                this.determinerCode = value;
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
                             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class AdministrativeGenderCode {

                                @XmlAttribute(name = "code")
                                protected String code;
                                @XmlAttribute(name = "codeSystem")
                                protected String codeSystem;
                                @XmlAttribute(name = "displayName")
                                protected String displayName;
                                @XmlAttribute(name = "codeSystemName")
                                protected String codeSystemName;

                                /**
                                 * 获取code属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCode() {
                                    return code;
                                }

                                /**
                                 * 设置code属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCode(String value) {
                                    this.code = value;
                                }

                                /**
                                 * 获取codeSystem属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodeSystem() {
                                    return codeSystem;
                                }

                                /**
                                 * 设置codeSystem属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodeSystem(String value) {
                                    this.codeSystem = value;
                                }

                                /**
                                 * 获取displayName属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getDisplayName() {
                                    return displayName;
                                }

                                /**
                                 * 设置displayName属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setDisplayName(String value) {
                                    this.displayName = value;
                                }

                                /**
                                 * 获取codeSystemName属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCodeSystemName() {
                                    return codeSystemName;
                                }

                                /**
                                 * 设置codeSystemName属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCodeSystemName(String value) {
                                    this.codeSystemName = value;
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
                             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="effectiveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="affiliatedPrincipalOrganization" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                             *                 &lt;/sequence>
                             *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "code",
                                "effectiveTime",
                                "affiliatedPrincipalOrganization"
                            })
                            public static class AsAffiliate {

                                protected String code;
                                protected String effectiveTime;
                                protected List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate.AffiliatedPrincipalOrganization> affiliatedPrincipalOrganization;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;

                                /**
                                 * 获取code属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCode() {
                                    return code;
                                }

                                /**
                                 * 设置code属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCode(String value) {
                                    this.code = value;
                                }

                                /**
                                 * 获取effectiveTime属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getEffectiveTime() {
                                    return effectiveTime;
                                }

                                /**
                                 * 设置effectiveTime属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setEffectiveTime(String value) {
                                    this.effectiveTime = value;
                                }

                                /**
                                 * Gets the value of the affiliatedPrincipalOrganization property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the affiliatedPrincipalOrganization property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getAffiliatedPrincipalOrganization().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate.AffiliatedPrincipalOrganization }
                                 * 
                                 * 
                                 */
                                public List<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate.AffiliatedPrincipalOrganization> getAffiliatedPrincipalOrganization() {
                                    if (affiliatedPrincipalOrganization == null) {
                                        affiliatedPrincipalOrganization = new ArrayList<PRPMIN303010UV01 .ControlActProcess.Subject.RegistrationRequest.Subject1 .HealthCareProvider.HealthCarePrincipalPerson.AsAffiliate.AffiliatedPrincipalOrganization>();
                                    }
                                    return this.affiliatedPrincipalOrganization;
                                }

                                /**
                                 * 获取classCode属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getClassCode() {
                                    return classCode;
                                }

                                /**
                                 * 设置classCode属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setClassCode(String value) {
                                    this.classCode = value;
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
                                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                                 *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                                 *       &lt;/sequence>
                                 *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                    "id"
                                })
                                public static class AffiliatedPrincipalOrganization {

                                    protected String name;
                                    protected List<Id> id;
                                    @XmlAttribute(name = "classCode")
                                    protected String classCode;
                                    @XmlAttribute(name = "determinerCode")
                                    protected String determinerCode;

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
                                     *    getId().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link Id }
                                     * 
                                     * 
                                     */
                                    public List<Id> getId() {
                                        if (id == null) {
                                            id = new ArrayList<Id>();
                                        }
                                        return this.id;
                                    }

                                    /**
                                     * 获取classCode属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getClassCode() {
                                        return classCode;
                                    }

                                    /**
                                     * 设置classCode属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setClassCode(String value) {
                                        this.classCode = value;
                                    }

                                    /**
                                     * 获取determinerCode属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getDeterminerCode() {
                                        return determinerCode;
                                    }

                                    /**
                                     * 设置determinerCode属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setDeterminerCode(String value) {
                                        this.determinerCode = value;
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
                             *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class BirthTime {

                                @XmlAttribute(name = "value")
                                protected String value;

                                /**
                                 * 获取value属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * 设置value属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
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
                             *         &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *       &lt;/sequence>
                             *       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "addr"
                            })
                            public static class Birthplace {

                                protected String addr;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;

                                /**
                                 * 获取addr属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getAddr() {
                                    return addr;
                                }

                                /**
                                 * 设置addr属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setAddr(String value) {
                                    this.addr = value;
                                }

                                /**
                                 * 获取classCode属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getClassCode() {
                                    return classCode;
                                }

                                /**
                                 * 设置classCode属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setClassCode(String value) {
                                    this.classCode = value;
                                }

                            }


                            /**
                             * <p>anonymous complex type的 Java 类。
                             * 
                             * <p>以下模式片段指定包含在此类中的预期内容。
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;simpleContent>
                             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/extension>
                             *   &lt;/simpleContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "value"
                            })
                            public static class Name {

                                @XmlValue
                                protected String value;
                                @XmlAttribute(name = "use")
                                protected String use;

                                /**
                                 * 获取value属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * 设置value属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
                                }

                                /**
                                 * 获取use属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getUse() {
                                    return use;
                                }

                                /**
                                 * 设置use属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setUse(String value) {
                                    this.use = value;
                                }

                            }

                        }

                    }

                }

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
     *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CreationTime {

        @XmlAttribute(name = "value")
        protected String value;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
    public static class InteractionId {

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
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProcessingCode {

        @XmlAttribute(name = "code")
        protected String code;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProcessingModeCode {

        @XmlAttribute(name = "code")
        protected String code;

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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
     *         &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{urn:hl7-org:v3}device" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "telecom",
        "device"
    })
    public static class Receiver {

        protected String telecom;
        protected List<Device> device;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

        /**
         * 获取telecom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelecom() {
            return telecom;
        }

        /**
         * 设置telecom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelecom(String value) {
            this.telecom = value;
        }

        /**
         * Gets the value of the device property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the device property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Device }
         * 
         * 
         */
        public List<Device> getDevice() {
            if (device == null) {
                device = new ArrayList<Device>();
            }
            return this.device;
        }

        /**
         * 获取typeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeCode() {
            return typeCode;
        }

        /**
         * 设置typeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeCode(String value) {
            this.typeCode = value;
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
     *         &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element ref="{urn:hl7-org:v3}device" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "telecom",
        "device"
    })
    public static class Sender {

        protected String telecom;
        protected List<Device> device;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

        /**
         * 获取telecom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelecom() {
            return telecom;
        }

        /**
         * 设置telecom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelecom(String value) {
            this.telecom = value;
        }

        /**
         * Gets the value of the device property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the device property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDevice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Device }
         * 
         * 
         */
        public List<Device> getDevice() {
            if (device == null) {
                device = new ArrayList<Device>();
            }
            return this.device;
        }

        /**
         * 获取typeCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeCode() {
            return typeCode;
        }

        /**
         * 设置typeCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeCode(String value) {
            this.typeCode = value;
        }

    }


	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> xml = new HashMap<String, Object>();
		xml.put("msgId", this.id.get(0).extension);
		xml.put("msgCreationTime", this.creationTime.get(0).value);
		xml.put("receiveId", this.receiver.get(0).device.get(0).id.get(0).extension);
		xml.put("sendId", this.sender.get(0).device.get(0).id.get(0).extension);
		
		xml.put("healthCareProviderId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).id.get(0).extension);
		xml.put("jobCategoryId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).code.get(0).code);
		xml.put("jobCategoryName", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).code.get(0).displayName);
		xml.put("roleEffectiveTimeLow", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).effectiveTime.get(0).low.get(0).value);
		xml.put("roleEffectiveTimeHigh", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).effectiveTime.get(0).high.get(0).value);
		xml.put("identityNo", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).id.get(0).extension);
		xml.put("name", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).name.get(0).value);
		xml.put("genderId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).administrativeGenderCode.get(0).code);
		xml.put("genderDepict", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).administrativeGenderCode.get(0).displayName);
		xml.put("dateOfBirth", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).birthTime.get(0).value);
		xml.put("deptId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).asAffiliate.get(0).affiliatedPrincipalOrganization.get(0).id.get(0).extension);
		xml.put("deptName", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).asAffiliate.get(0).affiliatedPrincipalOrganization.get(0).name);
		xml.put("birthplace", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).healthCareProvider.get(0).healthCarePrincipalPerson.get(0).birthplace.get(0).addr);
		xml.put("authorCode", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).id.get(0).extension);
		if(this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).assignedPerson!=null && !this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).assignedPerson.isEmpty()) {
			xml.put("authorName", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).assignedPerson.get(0).name);
		}
		if(this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization!=null && !this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.isEmpty()) {
			xml.put("authorDeptId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.get(0).id.get(0).extension);
			xml.put("authorDeptName", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.get(0).name);
			if(this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.get(0).contactParty!=null && !this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.get(0).contactParty.isEmpty()) {
				xml.put("authorDeptContactPerson", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.get(0).contactParty.get(0).contactPerson.get(0).name);
			}
		}
		return xml;
	}
}
