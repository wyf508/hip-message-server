//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.18 时间 09:52:18 AM CST 
//


package org.hl7.v3.PRPAIN201311UV02;

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
 *                                                 &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
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
 *                                                                     &lt;element name="addr" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                       &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;simpleContent>
 *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/extension>
 *                                                                                   &lt;/simpleContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                             &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="maritalStatusCode" maxOccurs="unbounded" minOccurs="0">
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
 *                                                                     &lt;element name="ethnicGroupCode" maxOccurs="unbounded" minOccurs="0">
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
 *                                                                     &lt;element name="asEmployee" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                         &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
 *                                                                     &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                               &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
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
 *                                                                     &lt;element name="personalRelationship" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                               &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                       &lt;/sequence>
 *                                                                                       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="providerOrganization" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="coveredPartyOf" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="coverageRecord" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                             &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                             &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                                                           &lt;element name="assignedPerson" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                   &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
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
@XmlRootElement(name = "PRPA_IN201311UV02")
public class PRPAIN201311UV02 extends DocEntity{

    protected List<Id> id;
    protected List<PRPAIN201311UV02 .CreationTime> creationTime;
    protected List<PRPAIN201311UV02 .InteractionId> interactionId;
    protected List<PRPAIN201311UV02 .ProcessingCode> processingCode;
    protected List<PRPAIN201311UV02 .ProcessingModeCode> processingModeCode;
    protected List<PRPAIN201311UV02 .AcceptAckCode> acceptAckCode;
    protected List<PRPAIN201311UV02 .Receiver> receiver;
    protected List<PRPAIN201311UV02 .Sender> sender;
    protected List<PRPAIN201311UV02 .ControlActProcess> controlActProcess;
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
     * {@link PRPAIN201311UV02 .CreationTime }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .CreationTime> getCreationTime() {
        if (creationTime == null) {
            creationTime = new ArrayList<PRPAIN201311UV02 .CreationTime>();
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
     * {@link PRPAIN201311UV02 .InteractionId }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .InteractionId> getInteractionId() {
        if (interactionId == null) {
            interactionId = new ArrayList<PRPAIN201311UV02 .InteractionId>();
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
     * {@link PRPAIN201311UV02 .ProcessingCode }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .ProcessingCode> getProcessingCode() {
        if (processingCode == null) {
            processingCode = new ArrayList<PRPAIN201311UV02 .ProcessingCode>();
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
     * {@link PRPAIN201311UV02 .ProcessingModeCode }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .ProcessingModeCode> getProcessingModeCode() {
        if (processingModeCode == null) {
            processingModeCode = new ArrayList<PRPAIN201311UV02 .ProcessingModeCode>();
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
     * {@link PRPAIN201311UV02 .AcceptAckCode }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .AcceptAckCode> getAcceptAckCode() {
        if (acceptAckCode == null) {
            acceptAckCode = new ArrayList<PRPAIN201311UV02 .AcceptAckCode>();
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
     * {@link PRPAIN201311UV02 .Receiver }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<PRPAIN201311UV02 .Receiver>();
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
     * {@link PRPAIN201311UV02 .Sender }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .Sender> getSender() {
        if (sender == null) {
            sender = new ArrayList<PRPAIN201311UV02 .Sender>();
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
     * {@link PRPAIN201311UV02 .ControlActProcess }
     * 
     * 
     */
    public List<PRPAIN201311UV02 .ControlActProcess> getControlActProcess() {
        if (controlActProcess == null) {
            controlActProcess = new ArrayList<PRPAIN201311UV02 .ControlActProcess>();
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
     *                                       &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                                           &lt;element name="addr" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                             &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;simpleContent>
     *                                                                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                             &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/extension>
     *                                                                         &lt;/simpleContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="maritalStatusCode" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="ethnicGroupCode" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="asEmployee" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
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
     *                                                                     &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                               &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
     *                                                           &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                     &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
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
     *                                                           &lt;element name="personalRelationship" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                     &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
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
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="providerOrganization" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
     *                                                           &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="coveredPartyOf" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="coverageRecord" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                   &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                                           &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="assignedOrganization" maxOccurs="unbounded" minOccurs="0">
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
        "subject"
    })
    public static class ControlActProcess {

        protected List<PRPAIN201311UV02 .ControlActProcess.Subject> subject;
        @XmlAttribute(name = "classCode")
        protected String classCode;
        @XmlAttribute(name = "moodCode")
        protected String moodCode;

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
         * {@link PRPAIN201311UV02 .ControlActProcess.Subject }
         * 
         * 
         */
        public List<PRPAIN201311UV02 .ControlActProcess.Subject> getSubject() {
            if (subject == null) {
                subject = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject>();
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
         *                             &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                                                 &lt;element name="addr" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                   &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;simpleContent>
         *                                                                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                                                                   &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/extension>
         *                                                               &lt;/simpleContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="maritalStatusCode" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="ethnicGroupCode" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="asEmployee" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                     &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
         *                                                 &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                           &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
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
         *                                                 &lt;element name="personalRelationship" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
         *                                                           &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
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
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="providerOrganization" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
         *                                                 &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="coveredPartyOf" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="coverageRecord" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                         &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                                                 &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="assignedOrganization" maxOccurs="unbounded" minOccurs="0">
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

            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest> registrationRequest;
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
             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest }
             * 
             * 
             */
            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest> getRegistrationRequest() {
                if (registrationRequest == null) {
                    registrationRequest = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest>();
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
             *                   &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                                       &lt;element name="addr" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                         &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;simpleContent>
             *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                                                         &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/extension>
             *                                                     &lt;/simpleContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="maritalStatusCode" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="ethnicGroupCode" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="asEmployee" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                           &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
             *                                       &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                                 &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
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
             *                                       &lt;element name="personalRelationship" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
             *                                                 &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
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
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="providerOrganization" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
             *                                       &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="coveredPartyOf" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="coverageRecord" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                               &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                                       &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="assignedOrganization" maxOccurs="unbounded" minOccurs="0">
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
                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1> subject1;
                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author> author;
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
                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 }
                 * 
                 * 
                 */
                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1> getSubject1() {
                    if (subject1 == null) {
                        subject1 = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1>();
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
                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author }
                 * 
                 * 
                 */
                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author> getAuthor() {
                    if (author == null) {
                        author = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author>();
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
                 *                             &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="assignedOrganization" maxOccurs="unbounded" minOccurs="0">
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

                    protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity> assignedEntity;
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
                     * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity }
                     * 
                     * 
                     */
                    public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity> getAssignedEntity() {
                        if (assignedEntity == null) {
                            assignedEntity = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity>();
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
                     *                   &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="assignedOrganization" maxOccurs="unbounded" minOccurs="0">
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
                        "id",
                        "assignedPerson",
                        "assignedOrganization"
                    })
                    public static class AssignedEntity {

                        protected List<Id> id;
                        protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson> assignedPerson;
                        protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedOrganization> assignedOrganization;
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
                         * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson }
                         * 
                         * 
                         */
                        public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson> getAssignedPerson() {
                            if (assignedPerson == null) {
                                assignedPerson = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedPerson>();
                            }
                            return this.assignedPerson;
                        }

                        /**
                         * Gets the value of the assignedOrganization property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the assignedOrganization property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAssignedOrganization().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedOrganization }
                         * 
                         * 
                         */
                        public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedOrganization> getAssignedOrganization() {
                            if (assignedOrganization == null) {
                                assignedOrganization = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Author.AssignedEntity.AssignedOrganization>();
                            }
                            return this.assignedOrganization;
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
                        public static class AssignedOrganization {

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
                         *         &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
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

                            @XmlElement(nillable = true)
                            protected List<Name> name;
                            @XmlAttribute(name = "classCode")
                            protected String classCode;
                            @XmlAttribute(name = "determinerCode")
                            protected String determinerCode;

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
                             * {@link Name }
                             * 
                             * 
                             */
                            public List<Name> getName() {
                                if (name == null) {
                                    name = new ArrayList<Name>();
                                }
                                return this.name;
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
                 *         &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                 *                             &lt;element name="addr" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                               &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;simpleContent>
                 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *                                               &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/extension>
                 *                                           &lt;/simpleContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                     &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="maritalStatusCode" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="ethnicGroupCode" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="asEmployee" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                 &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
                 *                             &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                                       &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
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
                 *                             &lt;element name="personalRelationship" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
                 *                                       &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
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
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="providerOrganization" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                 *                             &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="coveredPartyOf" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="coverageRecord" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
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
                    "patient"
                })
                public static class Subject1 {

                    protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient> patient;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;

                    /**
                     * Gets the value of the patient property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the patient property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPatient().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient }
                     * 
                     * 
                     */
                    public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient> getPatient() {
                        if (patient == null) {
                            patient = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient>();
                        }
                        return this.patient;
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
                     *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                     *                   &lt;element name="addr" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                     &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;simpleContent>
                     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                     *                                     &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/extension>
                     *                                 &lt;/simpleContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                           &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="maritalStatusCode" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="ethnicGroupCode" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="asEmployee" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                       &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
                     *                   &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                             &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
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
                     *                   &lt;element name="personalRelationship" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
                     *                             &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
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
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="providerOrganization" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                     *                   &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="coveredPartyOf" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="coverageRecord" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
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
                        "statusCode",
                        "effectiveTime",
                        "patientPerson",
                        "providerOrganization",
                        "coveredPartyOf"
                    })
                    public static class Patient {

                        protected List<Id> id;
                        protected List<StatusCode> statusCode;
                        protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.EffectiveTime> effectiveTime;
                        protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson> patientPerson;
                        protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.ProviderOrganization> providerOrganization;
                        protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf> coveredPartyOf;
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
                         * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.EffectiveTime }
                         * 
                         * 
                         */
                        public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.EffectiveTime> getEffectiveTime() {
                            if (effectiveTime == null) {
                                effectiveTime = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.EffectiveTime>();
                            }
                            return this.effectiveTime;
                        }

                        /**
                         * Gets the value of the patientPerson property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the patientPerson property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPatientPerson().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson }
                         * 
                         * 
                         */
                        public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson> getPatientPerson() {
                            if (patientPerson == null) {
                                patientPerson = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson>();
                            }
                            return this.patientPerson;
                        }

                        /**
                         * Gets the value of the providerOrganization property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the providerOrganization property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getProviderOrganization().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.ProviderOrganization }
                         * 
                         * 
                         */
                        public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.ProviderOrganization> getProviderOrganization() {
                            if (providerOrganization == null) {
                                providerOrganization = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.ProviderOrganization>();
                            }
                            return this.providerOrganization;
                        }

                        /**
                         * Gets the value of the coveredPartyOf property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the coveredPartyOf property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getCoveredPartyOf().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf }
                         * 
                         * 
                         */
                        public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf> getCoveredPartyOf() {
                            if (coveredPartyOf == null) {
                                coveredPartyOf = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf>();
                            }
                            return this.coveredPartyOf;
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
                         *         &lt;element name="coverageRecord" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
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
                            "coverageRecord"
                        })
                        public static class CoveredPartyOf {

                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf.CoverageRecord> coverageRecord;
                            @XmlAttribute(name = "typeCode")
                            protected String typeCode;

                            /**
                             * Gets the value of the coverageRecord property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the coverageRecord property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getCoverageRecord().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf.CoverageRecord }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf.CoverageRecord> getCoverageRecord() {
                                if (coverageRecord == null) {
                                    coverageRecord = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.CoveredPartyOf.CoverageRecord>();
                                }
                                return this.coverageRecord;
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
                             *         &lt;element ref="{urn:hl7-org:v3}beneficiary" maxOccurs="unbounded" minOccurs="0"/>
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
                                "beneficiary"
                            })
                            public static class CoverageRecord {

                                protected List<Beneficiary> beneficiary;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;
                                @XmlAttribute(name = "moodCode")
                                protected String moodCode;

                                /**
                                 * Gets the value of the beneficiary property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the beneficiary property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getBeneficiary().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link Beneficiary }
                                 * 
                                 * 
                                 */
                                public List<Beneficiary> getBeneficiary() {
                                    if (beneficiary == null) {
                                        beneficiary = new ArrayList<Beneficiary>();
                                    }
                                    return this.beneficiary;
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
                        public static class EffectiveTime {

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
                         *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                         *         &lt;element name="addr" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                           &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;simpleContent>
                         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                         *                           &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/extension>
                         *                       &lt;/simpleContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="maritalStatusCode" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="ethnicGroupCode" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="asEmployee" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                             &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
                         *         &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *                   &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
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
                         *         &lt;element name="personalRelationship" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
                         *                   &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
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
                            "id",
                            "name",
                            "telecom",
                            "administrativeGenderCode",
                            "birthTime",
                            "addr",
                            "maritalStatusCode",
                            "ethnicGroupCode",
                            "asEmployee",
                            "asOtherIDs",
                            "personalRelationship"
                        })
                        public static class PatientPerson {

                            protected List<Id> id;
                            @XmlElement(nillable = true)
                            protected List<Name> name;
                            protected List<Telecom> telecom;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AdministrativeGenderCode> administrativeGenderCode;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.BirthTime> birthTime;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr> addr;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.MaritalStatusCode> maritalStatusCode;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.EthnicGroupCode> ethnicGroupCode;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee> asEmployee;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs> asOtherIDs;
                            protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship> personalRelationship;

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
                             * {@link Name }
                             * 
                             * 
                             */
                            public List<Name> getName() {
                                if (name == null) {
                                    name = new ArrayList<Name>();
                                }
                                return this.name;
                            }

                            /**
                             * Gets the value of the telecom property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the telecom property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getTelecom().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link Telecom }
                             * 
                             * 
                             */
                            public List<Telecom> getTelecom() {
                                if (telecom == null) {
                                    telecom = new ArrayList<Telecom>();
                                }
                                return this.telecom;
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
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AdministrativeGenderCode }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AdministrativeGenderCode> getAdministrativeGenderCode() {
                                if (administrativeGenderCode == null) {
                                    administrativeGenderCode = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AdministrativeGenderCode>();
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
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.BirthTime }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.BirthTime> getBirthTime() {
                                if (birthTime == null) {
                                    birthTime = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.BirthTime>();
                                }
                                return this.birthTime;
                            }

                            /**
                             * Gets the value of the addr property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the addr property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAddr().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr> getAddr() {
                                if (addr == null) {
                                    addr = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr>();
                                }
                                return this.addr;
                            }

                            /**
                             * Gets the value of the maritalStatusCode property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the maritalStatusCode property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getMaritalStatusCode().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.MaritalStatusCode }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.MaritalStatusCode> getMaritalStatusCode() {
                                if (maritalStatusCode == null) {
                                    maritalStatusCode = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.MaritalStatusCode>();
                                }
                                return this.maritalStatusCode;
                            }

                            /**
                             * Gets the value of the ethnicGroupCode property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the ethnicGroupCode property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getEthnicGroupCode().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.EthnicGroupCode }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.EthnicGroupCode> getEthnicGroupCode() {
                                if (ethnicGroupCode == null) {
                                    ethnicGroupCode = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.EthnicGroupCode>();
                                }
                                return this.ethnicGroupCode;
                            }

                            /**
                             * Gets the value of the asEmployee property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the asEmployee property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAsEmployee().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee> getAsEmployee() {
                                if (asEmployee == null) {
                                    asEmployee = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee>();
                                }
                                return this.asEmployee;
                            }

                            /**
                             * Gets the value of the asOtherIDs property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the asOtherIDs property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAsOtherIDs().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs> getAsOtherIDs() {
                                if (asOtherIDs == null) {
                                    asOtherIDs = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs>();
                                }
                                return this.asOtherIDs;
                            }

                            /**
                             * Gets the value of the personalRelationship property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the personalRelationship property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getPersonalRelationship().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship }
                             * 
                             * 
                             */
                            public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship> getPersonalRelationship() {
                                if (personalRelationship == null) {
                                    personalRelationship = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship>();
                                }
                                return this.personalRelationship;
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
                             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="streetNameBase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="houseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element name="streetAddressLine" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                 &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="state" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;simpleContent>
                             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                             *                 &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/extension>
                             *             &lt;/simpleContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "city",
                                "county",
                                "streetNameBase",
                                "streetName",
                                "houseNumber",
                                "postalCode",
                                "streetAddressLine",
                                "state"
                            })
                            public static class Addr {

                                protected String city;
                                protected String county;
                                protected String streetNameBase;
                                protected String streetName;
                                protected String houseNumber;
                                protected String postalCode;
                                @XmlElement(nillable = true)
                                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.StreetAddressLine> streetAddressLine;
                                @XmlElement(nillable = true)
                                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.State> state;
                                @XmlAttribute(name = "use")
                                protected String use;

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
                                 * 获取county属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getCounty() {
                                    return county;
                                }

                                /**
                                 * 设置county属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setCounty(String value) {
                                    this.county = value;
                                }

                                /**
                                 * 获取streetNameBase属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getStreetNameBase() {
                                    return streetNameBase;
                                }

                                /**
                                 * 设置streetNameBase属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setStreetNameBase(String value) {
                                    this.streetNameBase = value;
                                }

                                /**
                                 * 获取streetName属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getStreetName() {
                                    return streetName;
                                }

                                /**
                                 * 设置streetName属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setStreetName(String value) {
                                    this.streetName = value;
                                }

                                /**
                                 * 获取houseNumber属性的值。
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getHouseNumber() {
                                    return houseNumber;
                                }

                                /**
                                 * 设置houseNumber属性的值。
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setHouseNumber(String value) {
                                    this.houseNumber = value;
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
                                 * Gets the value of the streetAddressLine property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the streetAddressLine property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getStreetAddressLine().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.StreetAddressLine }
                                 * 
                                 * 
                                 */
                                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.StreetAddressLine> getStreetAddressLine() {
                                    if (streetAddressLine == null) {
                                        streetAddressLine = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.StreetAddressLine>();
                                    }
                                    return this.streetAddressLine;
                                }

                                /**
                                 * Gets the value of the state property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the state property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getState().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.State }
                                 * 
                                 * 
                                 */
                                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.State> getState() {
                                    if (state == null) {
                                        state = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.Addr.State>();
                                    }
                                    return this.state;
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


                                /**
                                 * <p>anonymous complex type的 Java 类。
                                 * 
                                 * <p>以下模式片段指定包含在此类中的预期内容。
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;simpleContent>
                                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                                 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                public static class State {

                                    @XmlValue
                                    protected String value;
                                    @XmlAttribute(name = "language")
                                    protected String language;

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
                                     * 获取language属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getLanguage() {
                                        return language;
                                    }

                                    /**
                                     * 设置language属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setLanguage(String value) {
                                        this.language = value;
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
                                 *       &lt;attribute name="partType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                public static class StreetAddressLine {

                                    @XmlValue
                                    protected String value;
                                    @XmlAttribute(name = "partType")
                                    protected String partType;

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
                                     * 获取partType属性的值。
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getPartType() {
                                        return partType;
                                    }

                                    /**
                                     * 设置partType属性的值。
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setPartType(String value) {
                                        this.partType = value;
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
                             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                             *         &lt;element name="occupationCode" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="employerOrganization" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                   &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
                                "occupationCode",
                                "employerOrganization"
                            })
                            public static class AsEmployee {

                                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.OccupationCode> occupationCode;
                                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.EmployerOrganization> employerOrganization;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;

                                /**
                                 * Gets the value of the occupationCode property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the occupationCode property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getOccupationCode().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.OccupationCode }
                                 * 
                                 * 
                                 */
                                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.OccupationCode> getOccupationCode() {
                                    if (occupationCode == null) {
                                        occupationCode = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.OccupationCode>();
                                    }
                                    return this.occupationCode;
                                }

                                /**
                                 * Gets the value of the employerOrganization property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the employerOrganization property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getEmployerOrganization().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.EmployerOrganization }
                                 * 
                                 * 
                                 */
                                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.EmployerOrganization> getEmployerOrganization() {
                                    if (employerOrganization == null) {
                                        employerOrganization = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsEmployee.EmployerOrganization>();
                                    }
                                    return this.employerOrganization;
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
                                 *         &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
                                    "contactParty"
                                })
                                public static class EmployerOrganization {

                                    protected String name;
                                    protected List<ContactParty> contactParty;
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
                                     * {@link ContactParty }
                                     * 
                                     * 
                                     */
                                    public List<ContactParty> getContactParty() {
                                        if (contactParty == null) {
                                            contactParty = new ArrayList<ContactParty>();
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
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "")
                                public static class OccupationCode {

                                    @XmlAttribute(name = "code")
                                    protected String code;
                                    @XmlAttribute(name = "codeSystem")
                                    protected String codeSystem;
                                    @XmlAttribute(name = "displayName")
                                    protected String displayName;

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
                             *         &lt;element name="scopingOrganization" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
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
                                "id",
                                "scopingOrganization"
                            })
                            public static class AsOtherIDs {

                                protected List<Id> id;
                                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs.ScopingOrganization> scopingOrganization;
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
                                 * Gets the value of the scopingOrganization property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the scopingOrganization property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getScopingOrganization().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs.ScopingOrganization }
                                 * 
                                 * 
                                 */
                                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs.ScopingOrganization> getScopingOrganization() {
                                    if (scopingOrganization == null) {
                                        scopingOrganization = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.AsOtherIDs.ScopingOrganization>();
                                    }
                                    return this.scopingOrganization;
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
                                    "id"
                                })
                                public static class ScopingOrganization {

                                    protected List<Id> id;
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
                             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class EthnicGroupCode {

                                @XmlAttribute(name = "code")
                                protected String code;
                                @XmlAttribute(name = "codeSystem")
                                protected String codeSystem;
                                @XmlAttribute(name = "displayName")
                                protected String displayName;

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
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "")
                            public static class MaritalStatusCode {

                                @XmlAttribute(name = "code")
                                protected String code;
                                @XmlAttribute(name = "codeSystem")
                                protected String codeSystem;
                                @XmlAttribute(name = "displayName")
                                protected String displayName;

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
                             *         &lt;element ref="{urn:hl7-org:v3}telecom" maxOccurs="unbounded" minOccurs="0"/>
                             *         &lt;element name="relationshipHolder1" maxOccurs="unbounded" minOccurs="0">
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
                                "telecom",
                                "relationshipHolder1"
                            })
                            public static class PersonalRelationship {

                                protected String code;
                                protected List<Telecom> telecom;
                                protected List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship.RelationshipHolder1> relationshipHolder1;

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
                                 * Gets the value of the telecom property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the telecom property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getTelecom().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link Telecom }
                                 * 
                                 * 
                                 */
                                public List<Telecom> getTelecom() {
                                    if (telecom == null) {
                                        telecom = new ArrayList<Telecom>();
                                    }
                                    return this.telecom;
                                }

                                /**
                                 * Gets the value of the relationshipHolder1 property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the relationshipHolder1 property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getRelationshipHolder1().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship.RelationshipHolder1 }
                                 * 
                                 * 
                                 */
                                public List<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship.RelationshipHolder1> getRelationshipHolder1() {
                                    if (relationshipHolder1 == null) {
                                        relationshipHolder1 = new ArrayList<PRPAIN201311UV02 .ControlActProcess.Subject.RegistrationRequest.Subject1 .Patient.PatientPerson.PersonalRelationship.RelationshipHolder1>();
                                    }
                                    return this.relationshipHolder1;
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
                                public static class RelationshipHolder1 {

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
                         *         &lt;element ref="{urn:hl7-org:v3}name" maxOccurs="unbounded" minOccurs="0"/>
                         *         &lt;element ref="{urn:hl7-org:v3}contactParty" maxOccurs="unbounded" minOccurs="0"/>
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
                            "contactParty"
                        })
                        public static class ProviderOrganization {

                            protected List<Id> id;
                            @XmlElement(nillable = true)
                            protected List<Name> name;
                            protected List<ContactParty> contactParty;
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
                             * {@link Name }
                             * 
                             * 
                             */
                            public List<Name> getName() {
                                if (name == null) {
                                    name = new ArrayList<Name>();
                                }
                                return this.name;
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
                             * {@link ContactParty }
                             * 
                             * 
                             */
                            public List<ContactParty> getContactParty() {
                                if (contactParty == null) {
                                    contactParty = new ArrayList<ContactParty>();
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
        "device"
    })
    public static class Receiver {

        protected List<Device> device;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

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
        "device"
    })
    public static class Sender {

        protected List<Device> device;
        @XmlAttribute(name = "typeCode")
        protected String typeCode;

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
		xml.put("patientId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).id.get(0).extension);
		xml.put("statusCode", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).statusCode.get(0).code);
		xml.put("effectiveTime", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).effectiveTime.get(0).value);
		xml.put("identityNo", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).id.get(0).extension);
		xml.put("name", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).name.get(0).value);
		xml.put("contactNumber", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).telecom.get(0).value);
		xml.put("genderId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).administrativeGenderCode.get(0).code);
		xml.put("genderDepict", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).administrativeGenderCode.get(0).displayName);
		xml.put("dateOfBirth", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).birthTime.get(0).value);
		xml.put("addr", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).streetAddressLine.get(0).value);
		xml.put("addrState", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).state.get(0).value);
		xml.put("addrCity", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).city);
		xml.put("addrCounty", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).county);
		xml.put("addrStreetNameBase", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).streetNameBase);
		xml.put("addrStreetName", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).streetName);
		xml.put("houseNumber", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).houseNumber);
		xml.put("postalCode", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).addr.get(0).postalCode);
		xml.put("maritalStatusId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).maritalStatusCode.get(0).code);
		xml.put("maritalStatusDepict", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).maritalStatusCode.get(0).displayName);
		xml.put("ethnicGroupId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).ethnicGroupCode.get(0).code);
		xml.put("ethnicGroupDescrive", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).ethnicGroupCode.get(0).displayName);
		xml.put("occupationId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asEmployee.get(0).occupationCode.get(0).code);
		xml.put("occupationDepict", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asEmployee.get(0).occupationCode.get(0).displayName);
		xml.put("company", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asEmployee.get(0).employerOrganization.get(0).name);
		xml.put("companyContactPhone", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asEmployee.get(0).employerOrganization.get(0).contactParty.get(0).telecom.get(0).value);
		xml.put("healthCardNumber", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asOtherIDs.get(0).id.get(0).extension);
		xml.put("healthCardOrganizationCode", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asOtherIDs.get(0).scopingOrganization.get(0).id.get(0).extension);
		xml.put("healthFileNumber", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asOtherIDs.get(0).id.get(0).extension);
		xml.put("archivingOrganizationCode", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).asOtherIDs.get(0).scopingOrganization.get(0).id.get(0).extension);
		xml.put("contactRelationshipCode", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).personalRelationship.get(0).code);
		xml.put("contactPhone", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).personalRelationship.get(0).telecom.get(0).value);
		xml.put("contactName", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).patientPerson.get(0).personalRelationship.get(0).relationshipHolder1.get(0).name);
		xml.put("providerOrganizationId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).providerOrganization.get(0).id.get(0).extension);
		xml.put("providerOrganizationName", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).providerOrganization.get(0).name.get(0).value);
		xml.put("medicareTypeId", this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).coveredPartyOf.get(0).coverageRecord.get(0).beneficiary.get(0).beneficiary.get(0).code.get(0).code);
		xml.put("medicareTypeDepict",this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).subject1.get(0).patient.get(0).coveredPartyOf.get(0).coverageRecord.get(0).beneficiary.get(0).beneficiary.get(0).code.get(0).displayName);
		xml.put("authorCode",this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).id.get(0).extension);
		xml.put("authorName",this.controlActProcess.get(0).subject.get(0).registrationRequest.get(0).author.get(0).assignedEntity.get(0).assignedPerson.get(0).name.get(0).value);
		return xml;
	}

}
