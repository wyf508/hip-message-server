//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.19 时间 11:31:55 AM CST 
//


package org.hl7.v3.POOR_IN200901UV;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *                             &lt;element name="observationRequest" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element ref="{urn:hl7-org:v3}effectiveTime" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="priorityCode" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{urn:hl7-org:v3}specimen" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="recordTarget" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="verifier" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="signatureText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element ref="{urn:hl7-org:v3}time" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element ref="{urn:hl7-org:v3}signatureCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                                 &lt;element ref="{urn:hl7-org:v3}assignedEntity" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="goal" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="observationEventCriterion" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                         &lt;/sequence>
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
 *                                       &lt;element name="reason" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="observation" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="subjectOf6" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="seperatableInd" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="annotation" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="componentOf1" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="encounter" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="subjectSj" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                         &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;complexContent>
 *                                                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                           &lt;sequence>
 *                                                                                                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                                           &lt;/sequence>
 *                                                                                                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                         &lt;/restriction>
 *                                                                                                       &lt;/complexContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                 &lt;/sequence>
 *                                                                                                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                       &lt;/sequence>
 *                                                                                       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                       &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                         &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
 *                                                                                                     &lt;complexType>
 *                                                                                                       &lt;complexContent>
 *                                                                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                           &lt;sequence>
 *                                                                                                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                                                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                                           &lt;/sequence>
 *                                                                                                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                         &lt;/restriction>
 *                                                                                                       &lt;/complexContent>
 *                                                                                                     &lt;/complexType>
 *                                                                                                   &lt;/element>
 *                                                                                                 &lt;/sequence>
 *                                                                                                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
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
 *                                                                   &lt;/sequence>
 *                                                                   &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlRootElement(name = "POOR_IN200901UV")
public class POORIN200901UV extends DocEntity{

    protected List<Id> id;
    protected List<POORIN200901UV.CreationTime> creationTime;
    protected List<POORIN200901UV.InteractionId> interactionId;
    protected List<POORIN200901UV.ProcessingCode> processingCode;
    protected List<POORIN200901UV.ProcessingModeCode> processingModeCode;
    protected List<POORIN200901UV.AcceptAckCode> acceptAckCode;
    protected List<POORIN200901UV.Receiver> receiver;
    protected List<POORIN200901UV.Sender> sender;
    protected List<POORIN200901UV.ControlActProcess> controlActProcess;
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
     * {@link POORIN200901UV.CreationTime }
     * 
     * 
     */
    public List<POORIN200901UV.CreationTime> getCreationTime() {
        if (creationTime == null) {
            creationTime = new ArrayList<POORIN200901UV.CreationTime>();
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
     * {@link POORIN200901UV.InteractionId }
     * 
     * 
     */
    public List<POORIN200901UV.InteractionId> getInteractionId() {
        if (interactionId == null) {
            interactionId = new ArrayList<POORIN200901UV.InteractionId>();
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
     * {@link POORIN200901UV.ProcessingCode }
     * 
     * 
     */
    public List<POORIN200901UV.ProcessingCode> getProcessingCode() {
        if (processingCode == null) {
            processingCode = new ArrayList<POORIN200901UV.ProcessingCode>();
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
     * {@link POORIN200901UV.ProcessingModeCode }
     * 
     * 
     */
    public List<POORIN200901UV.ProcessingModeCode> getProcessingModeCode() {
        if (processingModeCode == null) {
            processingModeCode = new ArrayList<POORIN200901UV.ProcessingModeCode>();
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
     * {@link POORIN200901UV.AcceptAckCode }
     * 
     * 
     */
    public List<POORIN200901UV.AcceptAckCode> getAcceptAckCode() {
        if (acceptAckCode == null) {
            acceptAckCode = new ArrayList<POORIN200901UV.AcceptAckCode>();
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
     * {@link POORIN200901UV.Receiver }
     * 
     * 
     */
    public List<POORIN200901UV.Receiver> getReceiver() {
        if (receiver == null) {
            receiver = new ArrayList<POORIN200901UV.Receiver>();
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
     * {@link POORIN200901UV.Sender }
     * 
     * 
     */
    public List<POORIN200901UV.Sender> getSender() {
        if (sender == null) {
            sender = new ArrayList<POORIN200901UV.Sender>();
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
     * {@link POORIN200901UV.ControlActProcess }
     * 
     * 
     */
    public List<POORIN200901UV.ControlActProcess> getControlActProcess() {
        if (controlActProcess == null) {
            controlActProcess = new ArrayList<POORIN200901UV.ControlActProcess>();
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
     *                   &lt;element name="observationRequest" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{urn:hl7-org:v3}effectiveTime" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="priorityCode" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{urn:hl7-org:v3}specimen" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="recordTarget" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="verifier" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="signatureText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element ref="{urn:hl7-org:v3}time" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element ref="{urn:hl7-org:v3}signatureCode" maxOccurs="unbounded" minOccurs="0"/>
     *                                       &lt;element ref="{urn:hl7-org:v3}assignedEntity" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="goal" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="observationEventCriterion" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                               &lt;/sequence>
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
     *                             &lt;element name="reason" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="observation" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="subjectOf6" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="seperatableInd" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="annotation" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="componentOf1" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="encounter" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="subjectSj" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                         &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                               &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                               &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                                                 &lt;/sequence>
     *                                                                                                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                             &lt;/sequence>
     *                                                                             &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                             &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                               &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                               &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
     *                                                                                           &lt;complexType>
     *                                                                                             &lt;complexContent>
     *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                                 &lt;sequence>
     *                                                                                                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                                                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                                                 &lt;/sequence>
     *                                                                                                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                               &lt;/restriction>
     *                                                                                             &lt;/complexContent>
     *                                                                                           &lt;/complexType>
     *                                                                                         &lt;/element>
     *                                                                                       &lt;/sequence>
     *                                                                                       &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
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
     *                                                         &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        protected List<POORIN200901UV.ControlActProcess.Subject> subject;
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
         * {@link POORIN200901UV.ControlActProcess.Subject }
         * 
         * 
         */
        public List<POORIN200901UV.ControlActProcess.Subject> getSubject() {
            if (subject == null) {
                subject = new ArrayList<POORIN200901UV.ControlActProcess.Subject>();
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
         *         &lt;element name="observationRequest" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{urn:hl7-org:v3}effectiveTime" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="priorityCode" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{urn:hl7-org:v3}specimen" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="recordTarget" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="verifier" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="signatureText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element ref="{urn:hl7-org:v3}time" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element ref="{urn:hl7-org:v3}signatureCode" maxOccurs="unbounded" minOccurs="0"/>
         *                             &lt;element ref="{urn:hl7-org:v3}assignedEntity" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="goal" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="observationEventCriterion" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                     &lt;/sequence>
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
         *                   &lt;element name="reason" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="observation" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="subjectOf6" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="seperatableInd" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="annotation" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="componentOf1" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="encounter" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="subjectSj" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                               &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                                     &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
         *                                                                   &lt;/sequence>
         *                                                                   &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                   &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                                     &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
         *                           &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "observationRequest"
        })
        public static class Subject {

            protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest> observationRequest;
            @XmlAttribute(name = "typeCode")
            protected String typeCode;

            /**
             * Gets the value of the observationRequest property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the observationRequest property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObservationRequest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest }
             * 
             * 
             */
            public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest> getObservationRequest() {
                if (observationRequest == null) {
                    observationRequest = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest>();
                }
                return this.observationRequest;
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
             *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{urn:hl7-org:v3}effectiveTime" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="priorityCode" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{urn:hl7-org:v3}specimen" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="recordTarget" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="verifier" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="signatureText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element ref="{urn:hl7-org:v3}time" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element ref="{urn:hl7-org:v3}signatureCode" maxOccurs="unbounded" minOccurs="0"/>
             *                   &lt;element ref="{urn:hl7-org:v3}assignedEntity" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="goal" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="observationEventCriterion" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                           &lt;/sequence>
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
             *         &lt;element name="reason" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="observation" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="subjectOf6" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="seperatableInd" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="annotation" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="componentOf1" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="encounter" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="subjectSj" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                     &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                                           &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
             *                                                         &lt;/sequence>
             *                                                         &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                         &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                                           &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
             *                 &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                "text",
                "id",
                "statusCode",
                "effectiveTime",
                "priorityCode",
                "specimen",
                "recordTarget",
                "author",
                "verifier",
                "goal",
                "reason",
                "subjectOf6",
                "componentOf1"
            })
            public static class ObservationRequest {

                protected String code;
                protected String text;
                protected List<Id> id;
                protected List<StatusCode> statusCode;
                protected List<EffectiveTime> effectiveTime;
                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.PriorityCode> priorityCode;
                protected List<Specimen> specimen;
                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.RecordTarget> recordTarget;
                protected List<Author> author;
                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Verifier> verifier;
                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal> goal;
                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason> reason;
                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6> subjectOf6;
                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1> componentOf1;
                @XmlAttribute(name = "classCode")
                protected String classCode;
                @XmlAttribute(name = "moodCode")
                protected String moodCode;

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
                 * 获取text属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getText() {
                    return text;
                }

                /**
                 * 设置text属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setText(String value) {
                    this.text = value;
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
                 * {@link EffectiveTime }
                 * 
                 * 
                 */
                public List<EffectiveTime> getEffectiveTime() {
                    if (effectiveTime == null) {
                        effectiveTime = new ArrayList<EffectiveTime>();
                    }
                    return this.effectiveTime;
                }

                /**
                 * Gets the value of the priorityCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the priorityCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPriorityCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.PriorityCode }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.PriorityCode> getPriorityCode() {
                    if (priorityCode == null) {
                        priorityCode = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.PriorityCode>();
                    }
                    return this.priorityCode;
                }

                /**
                 * Gets the value of the specimen property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the specimen property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSpecimen().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Specimen }
                 * 
                 * 
                 */
                public List<Specimen> getSpecimen() {
                    if (specimen == null) {
                        specimen = new ArrayList<Specimen>();
                    }
                    return this.specimen;
                }

                /**
                 * Gets the value of the recordTarget property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the recordTarget property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRecordTarget().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.RecordTarget }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.RecordTarget> getRecordTarget() {
                    if (recordTarget == null) {
                        recordTarget = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.RecordTarget>();
                    }
                    return this.recordTarget;
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
                 * {@link Author }
                 * 
                 * 
                 */
                public List<Author> getAuthor() {
                    if (author == null) {
                        author = new ArrayList<Author>();
                    }
                    return this.author;
                }

                /**
                 * Gets the value of the verifier property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the verifier property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getVerifier().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Verifier }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Verifier> getVerifier() {
                    if (verifier == null) {
                        verifier = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Verifier>();
                    }
                    return this.verifier;
                }

                /**
                 * Gets the value of the goal property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the goal property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGoal().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal> getGoal() {
                    if (goal == null) {
                        goal = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal>();
                    }
                    return this.goal;
                }

                /**
                 * Gets the value of the reason property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the reason property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getReason().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason> getReason() {
                    if (reason == null) {
                        reason = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason>();
                    }
                    return this.reason;
                }

                /**
                 * Gets the value of the subjectOf6 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the subjectOf6 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSubjectOf6().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6> getSubjectOf6() {
                    if (subjectOf6 == null) {
                        subjectOf6 = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6>();
                    }
                    return this.subjectOf6;
                }

                /**
                 * Gets the value of the componentOf1 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the componentOf1 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getComponentOf1().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1> getComponentOf1() {
                    if (componentOf1 == null) {
                        componentOf1 = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1>();
                    }
                    return this.componentOf1;
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
                 *         &lt;element name="encounter" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="subjectSj" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                           &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                                                 &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
                 *                                               &lt;/sequence>
                 *                                               &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                               &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                                                 &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
                 *       &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "encounter"
                })
                public static class ComponentOf1 {

                    protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter> encounter;
                    @XmlAttribute(name = "contextConductionInd")
                    protected String contextConductionInd;

                    /**
                     * Gets the value of the encounter property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the encounter property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getEncounter().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter> getEncounter() {
                        if (encounter == null) {
                            encounter = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter>();
                        }
                        return this.encounter;
                    }

                    /**
                     * 获取contextConductionInd属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContextConductionInd() {
                        return contextConductionInd;
                    }

                    /**
                     * 设置contextConductionInd属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContextConductionInd(String value) {
                        this.contextConductionInd = value;
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
                     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="subjectSj" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *                 &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                                       &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
                     *                                     &lt;/sequence>
                     *                                     &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                     &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                                       &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
                        "id",
                        "statusCode",
                        "subject",
                        "location"
                    })
                    public static class Encounter {

                        protected List<Id> id;
                        protected List<StatusCode> statusCode;
                        protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.SubjectSj> subject;
                        public void setStatusCode(List<StatusCode> statusCode) {
							this.statusCode = statusCode;
						}

						public void setSubject(
								List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1.Encounter.SubjectSj> subject) {
							this.subject = subject;
						}


						protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location> location;
                        public void setLocation(
								List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1.Encounter.Location> location) {
							this.location = location;
						}


						@XmlAttribute(name = "classCode")
                        protected String classCode;
                        @XmlAttribute(name = "moodCode")
                        protected String moodCode;

                        /**
                         * 获取id属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public List<Id> getId() {
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
                        public void setId(List<Id> value) {
                            this.id = value;
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
                         * Gets the value of the subjectSj property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the subjectSj property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSubjectSj().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.SubjectSj }
                         * 
                         * 
                         */
                        public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.SubjectSj> getSubject() {
                            if (subject == null) {
                            	subject = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.SubjectSj>();
                            }
                            return this.subject;
                        }

                        /**
                         * Gets the value of the location property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the location property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getLocation().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location }
                         * 
                         * 
                         */
                        public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location> getLocation() {
                            if (location == null) {
                                location = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location>();
                            }
                            return this.location;
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
                         *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *         &lt;element name="serviceDeliveryLocation" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *                             &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
                         *                           &lt;/sequence>
                         *                           &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                           &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *                             &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
                            "time",
                            "serviceDeliveryLocation"
                        })
                        public static class Location {

                            protected String time;
                            protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation> serviceDeliveryLocation;
                            @XmlAttribute(name = "typeCode")
                            protected String typeCode;

                            /**
                             * 获取time属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTime() {
                                return time;
                            }

                            /**
                             * 设置time属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTime(String value) {
                                this.time = value;
                            }

                            /**
                             * Gets the value of the serviceDeliveryLocation property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the serviceDeliveryLocation property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getServiceDeliveryLocation().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation }
                             * 
                             * 
                             */
                            public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation> getServiceDeliveryLocation() {
                                if (serviceDeliveryLocation == null) {
                                    serviceDeliveryLocation = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation>();
                                }
                                return this.serviceDeliveryLocation;
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
                             *         &lt;element name="locationbc" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                             *                   &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
                             *                 &lt;/sequence>
                             *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                 &lt;attribute name="determinerCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="serviceProviderOrganization" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                             *                   &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
                                "location",
                                "serviceProviderOrganization"
                            })
                            public static class ServiceDeliveryLocation {

                                protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc> location;

								public void setLocation(
										List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1.Encounter.Location.ServiceDeliveryLocation.Locationbc> location) {
									this.location = location;
								}


								protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization> serviceProviderOrganization;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;

                                /**
                                 * Gets the value of the locationbc property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the locationbc property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getLocationbc().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc }
                                 * 
                                 * 
                                 */
                                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc> getLocation() {
                                    if (location == null) {
                                    	location = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc>();
                                    }
                                    return this.location;
                                }

                                /**
                                 * Gets the value of the serviceProviderOrganization property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the serviceProviderOrganization property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getServiceProviderOrganization().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization }
                                 * 
                                 * 
                                 */
                                public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization> getServiceProviderOrganization() {
                                    if (serviceProviderOrganization == null) {
                                        serviceProviderOrganization = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization>();
                                    }
                                    return this.serviceProviderOrganization;
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
                                 *         &lt;element name="asLocatedEntityPartOf" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
                                    "asLocatedEntityPartOf"
                                })
                                @XmlRootElement(name = "location")
                                public static class Locationbc {

                                    protected String name;
                                    protected List<Id> id;
                                    protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf> asLocatedEntityPartOf;
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
                                     * Gets the value of the asLocatedEntityPartOf property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the asLocatedEntityPartOf property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getAsLocatedEntityPartOf().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf> getAsLocatedEntityPartOf() {
                                        if (asLocatedEntityPartOf == null) {
                                            asLocatedEntityPartOf = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf>();
                                        }
                                        return this.asLocatedEntityPartOf;
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
                                     *         &lt;element name="locationbf" maxOccurs="unbounded" minOccurs="0">
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
                                        "location"
                                    })
                                    public static class AsLocatedEntityPartOf {

                                        protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf> location;
                                        public void setLocation(
												List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1.Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf> location) {
											this.location = location;
										}


										@XmlAttribute(name = "classCode")
                                        protected String classCode;

                                        /**
                                         * Gets the value of the locationbf property.
                                         * 
                                         * <p>
                                         * This accessor method returns a reference to the live list,
                                         * not a snapshot. Therefore any modification you make to the
                                         * returned list will be present inside the JAXB object.
                                         * This is why there is not a <CODE>set</CODE> method for the locationbf property.
                                         * 
                                         * <p>
                                         * For example, to add a new item, do as follows:
                                         * <pre>
                                         *    getLocationbf().add(newItem);
                                         * </pre>
                                         * 
                                         * 
                                         * <p>
                                         * Objects of the following type(s) are allowed in the list
                                         * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf }
                                         * 
                                         * 
                                         */
                                        public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf> getLocation() {
                                            if (location == null) {
                                            	location = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf>();
                                            }
                                            return this.location;
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
                                        @XmlRootElement(name = "location")
                                        public static class Locationbf {

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
                                 *         &lt;element name="asOrganizationPartOf" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
                                    "asOrganizationPartOf"
                                })
                                public static class ServiceProviderOrganization {

                                    protected String name;
                                    protected List<Id> id;
                                    protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf> asOrganizationPartOf;
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
                                     * Gets the value of the asOrganizationPartOf property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the asOrganizationPartOf property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getAsOrganizationPartOf().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf> getAsOrganizationPartOf() {
                                        if (asOrganizationPartOf == null) {
                                            asOrganizationPartOf = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf>();
                                        }
                                        return this.asOrganizationPartOf;
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
                                     *         &lt;element name="wholeOrganization" maxOccurs="unbounded" minOccurs="0">
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
                                        "wholeOrganization"
                                    })
                                    public static class AsOrganizationPartOf {

                                        protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization> wholeOrganization;
                                        @XmlAttribute(name = "classCode")
                                        protected String classCode;

                                        /**
                                         * Gets the value of the wholeOrganization property.
                                         * 
                                         * <p>
                                         * This accessor method returns a reference to the live list,
                                         * not a snapshot. Therefore any modification you make to the
                                         * returned list will be present inside the JAXB object.
                                         * This is why there is not a <CODE>set</CODE> method for the wholeOrganization property.
                                         * 
                                         * <p>
                                         * For example, to add a new item, do as follows:
                                         * <pre>
                                         *    getWholeOrganization().add(newItem);
                                         * </pre>
                                         * 
                                         * 
                                         * <p>
                                         * Objects of the following type(s) are allowed in the list
                                         * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization }
                                         * 
                                         * 
                                         */
                                        public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization> getWholeOrganization() {
                                            if (wholeOrganization == null) {
                                                wholeOrganization = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization>();
                                            }
                                            return this.wholeOrganization;
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
                                        public static class WholeOrganization {

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
                         *         &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
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
                        @XmlRootElement(name = "subject")
                        public static class SubjectSj {

                            protected List<Patient> patient;
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
                             * {@link Patient }
                             * 
                             * 
                             */
                            public List<Patient> getPatient() {
                                if (patient == null) {
                                    patient = new ArrayList<Patient>();
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
                 *         &lt;element name="observationEventCriterion" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                 &lt;/sequence>
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
                    "observationEventCriterion"
                })
                public static class Goal {

                    protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal.ObservationEventCriterion> observationEventCriterion;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;

                    /**
                     * Gets the value of the observationEventCriterion property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the observationEventCriterion property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getObservationEventCriterion().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal.ObservationEventCriterion }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal.ObservationEventCriterion> getObservationEventCriterion() {
                        if (observationEventCriterion == null) {
                            observationEventCriterion = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Goal.ObservationEventCriterion>();
                        }
                        return this.observationEventCriterion;
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
                     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                        "text"
                    })
                    public static class ObservationEventCriterion {

                        protected String text;

                        /**
                         * 获取text属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getText() {
                            return text;
                        }

                        /**
                         * 设置text属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setText(String value) {
                            this.text = value;
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
                 *       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class PriorityCode {

                    @XmlAttribute(name = "code")
                    protected String code;
                    @XmlAttribute(name = "displayName")
                    protected String displayName;
                    @XmlAttribute(name = "codeSystem")
                    protected String codeSystem;
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
                 *         &lt;element name="observation" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="classCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="moodCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "observation"
                })
                public static class Reason {

                    protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason.Observation> observation;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;
                    @XmlAttribute(name = "contextControlCode")
                    protected String contextControlCode;
                    @XmlAttribute(name = "contextConductionInd")
                    protected String contextConductionInd;

                    /**
                     * Gets the value of the observation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the observation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getObservation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason.Observation }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason.Observation> getObservation() {
                        if (observation == null) {
                            observation = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason.Observation>();
                        }
                        return this.observation;
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
                     * 获取contextControlCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContextControlCode() {
                        return contextControlCode;
                    }

                    /**
                     * 设置contextControlCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContextControlCode(String value) {
                        this.contextControlCode = value;
                    }

                    /**
                     * 获取contextConductionInd属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContextConductionInd() {
                        return contextConductionInd;
                    }

                    /**
                     * 设置contextConductionInd属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContextConductionInd(String value) {
                        this.contextConductionInd = value;
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
                     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
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
                        "value",
                        "code"
                    })
                    public static class Observation {

                        protected String value;
                        protected List<Code> code;
                        @XmlAttribute(name = "classCode")
                        protected String classCode;
                        @XmlAttribute(name = "moodCode")
                        protected String moodCode;

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
                 *       &lt;sequence>
                 *         &lt;element ref="{urn:hl7-org:v3}patient" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class RecordTarget {

                    protected List<Patient> patient;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;
                    @XmlAttribute(name = "contextControlCode")
                    protected String contextControlCode;

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
                     * {@link Patient }
                     * 
                     * 
                     */
                    public List<Patient> getPatient() {
                        if (patient == null) {
                            patient = new ArrayList<Patient>();
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
                     * 获取contextControlCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContextControlCode() {
                        return contextControlCode;
                    }

                    /**
                     * 设置contextControlCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContextControlCode(String value) {
                        this.contextControlCode = value;
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
                 *         &lt;element name="seperatableInd" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="annotation" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="contextConductionInd" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "seperatableInd",
                    "annotation"
                })
                public static class SubjectOf6 {

                    protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .SeperatableInd> seperatableInd;
                    protected List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .Annotation> annotation;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;
                    @XmlAttribute(name = "contextConductionInd")
                    protected String contextConductionInd;

                    /**
                     * Gets the value of the seperatableInd property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the seperatableInd property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSeperatableInd().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .SeperatableInd }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .SeperatableInd> getSeperatableInd() {
                        if (seperatableInd == null) {
                            seperatableInd = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .SeperatableInd>();
                        }
                        return this.seperatableInd;
                    }

                    /**
                     * Gets the value of the annotation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the annotation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getAnnotation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .Annotation }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .Annotation> getAnnotation() {
                        if (annotation == null) {
                            annotation = new ArrayList<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.SubjectOf6 .Annotation>();
                        }
                        return this.annotation;
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
                     * 获取contextConductionInd属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContextConductionInd() {
                        return contextConductionInd;
                    }

                    /**
                     * 设置contextConductionInd属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContextConductionInd(String value) {
                        this.contextConductionInd = value;
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
                     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}author" maxOccurs="unbounded" minOccurs="0"/>
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
                        "text",
                        "statusCode",
                        "author"
                    })
                    public static class Annotation {

                        protected String text;
                        protected List<StatusCode> statusCode;
                        protected List<Author> author;

                        /**
                         * 获取text属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getText() {
                            return text;
                        }

                        /**
                         * 设置text属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setText(String value) {
                            this.text = value;
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
                         * {@link Author }
                         * 
                         * 
                         */
                        public List<Author> getAuthor() {
                            if (author == null) {
                                author = new ArrayList<Author>();
                            }
                            return this.author;
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
                    public static class SeperatableInd {

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
                 *         &lt;element name="signatureText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element ref="{urn:hl7-org:v3}time" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element ref="{urn:hl7-org:v3}signatureCode" maxOccurs="unbounded" minOccurs="0"/>
                 *         &lt;element ref="{urn:hl7-org:v3}assignedEntity" maxOccurs="unbounded" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attribute name="typeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="contextControlCode" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "signatureText",
                    "time",
                    "signatureCode",
                    "assignedEntity"
                })
                public static class Verifier {

                    protected String signatureText;
                    protected List<Time> time;
                    protected List<SignatureCode> signatureCode;
                    protected List<AssignedEntity> assignedEntity;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;
                    @XmlAttribute(name = "contextControlCode")
                    protected String contextControlCode;

                    /**
                     * 获取signatureText属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSignatureText() {
                        return signatureText;
                    }

                    /**
                     * 设置signatureText属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSignatureText(String value) {
                        this.signatureText = value;
                    }

                    /**
                     * Gets the value of the time property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the time property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTime().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Time }
                     * 
                     * 
                     */
                    public List<Time> getTime() {
                        if (time == null) {
                            time = new ArrayList<Time>();
                        }
                        return this.time;
                    }

                    /**
                     * Gets the value of the signatureCode property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the signatureCode property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSignatureCode().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link SignatureCode }
                     * 
                     * 
                     */
                    public List<SignatureCode> getSignatureCode() {
                        if (signatureCode == null) {
                            signatureCode = new ArrayList<SignatureCode>();
                        }
                        return this.signatureCode;
                    }

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
                     * {@link AssignedEntity }
                     * 
                     * 
                     */
                    public List<AssignedEntity> getAssignedEntity() {
                        if (assignedEntity == null) {
                            assignedEntity = new ArrayList<AssignedEntity>();
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
                     * 获取contextControlCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getContextControlCode() {
                        return contextControlCode;
                    }

                    /**
                     * 设置contextControlCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setContextControlCode(String value) {
                        this.contextControlCode = value;
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
		
		POORIN200901UV.ControlActProcess.Subject.ObservationRequest observationRequest = this.controlActProcess.get(0).subject.get(0).observationRequest.get(0);
		xml.put("requestNo", observationRequest.id.get(0).extension);
		xml.put("requestEffectiveTimeHigh", observationRequest.effectiveTime.get(0).high.get(0).value);
		xml.put("requestEffectiveTimeLow", observationRequest.effectiveTime.get(0).low.get(0).value);
		xml.put("priorityLevelCode", observationRequest.priorityCode.get(0).code);
		xml.put("priorityLevelName", observationRequest.priorityCode.get(0).displayName);
		xml.put("openBillTime", observationRequest.author.get(0).time.get(0).value);
		xml.put("founderPersonId", observationRequest.author.get(0).assignedEntity.get(0).id.get(0).extension);
		xml.put("founderPersonName", observationRequest.author.get(0).assignedEntity.get(0).assignedPerson.get(0).name);
		xml.put("openDeptId", observationRequest.author.get(0).assignedEntity.get(0).representedOrganization.get(0).id.get(0).extension);
		xml.put("openDeptName", observationRequest.author.get(0).assignedEntity.get(0).representedOrganization.get(0).name);
		xml.put("auditTime", observationRequest.verifier.get(0).time.get(0).value);
		xml.put("auditPersonId", observationRequest.verifier.get(0).assignedEntity.get(0).id.get(0).extension);
		xml.put("auditPersonName", observationRequest.verifier.get(0).assignedEntity.get(0).assignedPerson.get(0).name);
		List<Map<String, Object>> list1s = new ArrayList<Map<String, Object>>();
//		component2 = observationRequest.componentOf1
		xml.put("list1", list1s);
		
		xml.put("precautions", observationRequest.subjectOf6.get(0).annotation.get(0).text);

        POORIN200901UV.ControlActProcess.Subject.ObservationRequest.RecordTarget recordTarget =
                observationRequest.recordTarget.get(0);
        if (recordTarget.patient.get(0).id!= null && !recordTarget.patient.get(0).id.isEmpty()) {
            for (Id id : recordTarget.patient.get(0).id) {
                if("2.16.156.10011.1.10".equals(id.root)) {
                    xml.put("outpatientNo", id.extension);
                }else if("2.16.156.10011.1.12".equals(id.root)) {
                    xml.put("inpatientNo", id.extension);
                }
            }
        } else {
            xml.put("outpatientNo", "outpatientNo");
            xml.put("inpatientNo", "inpatientNo");
        }

		POORIN200901UV.ControlActProcess.Subject.ObservationRequest.ComponentOf1.Encounter encounter =
                observationRequest.componentOf1.get(0).encounter.get(0);
//		if(encounter.id!=null && !encounter.id.isEmpty()) {
//			for (Id id : encounter.id) {
//				if("2.16.156.10011.1.10".equals(id.root)) {
//					xml.put("outpatientNo", id.extension);
//				}else if("2.16.156.10011.1.12".equals(id.root)) {
//                    xml.put("inpatientNo", id.extension);
//				}
//			}
//		}
		
//		xml.put("visitTypeCode", encounter.);
//		xml.put("visitTypeName", observationRequest);
		xml.put("patientId", encounter.subject.get(0).patient.get(0).id.get(0).extension);
		Patient.PatientPerson patientPerson = encounter.subject.get(0).patient.get(0).patientPerson.get(0);
		if(patientPerson.id!=null && !patientPerson.id.isEmpty()) {
			for (Id id : patientPerson.id) {
				if("2.16.156.10011.1.3".equals(id.root)) {
					xml.put("identityNo", id.extension);
				}else if("2.16.156.10011.1.15".equals(id.root)) {
					xml.put("medicareCardNo", id.extension);
				}
			}
		}
		xml.put("name", patientPerson.name.get(0).value);
		xml.put("contactPhone",  encounter.subject.get(0).patient.get(0).telecom);
		xml.put("genderId", patientPerson.administrativeGenderCode.get(0).code);
		xml.put("genderDepict", patientPerson.administrativeGenderCode.get(0).displayName);
		xml.put("dateOfBirth", patientPerson.birthTime.get(0).value);
//		xml.put("age", patientPerson.birthTime.get(0).);
//		xml.put("address", patientPerson.);
		xml.put("hospitalBedCode", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).id.get(0).extension);
		xml.put("hospitalBedNo", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).name);
		xml.put("wardCode", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).asLocatedEntityPartOf.get(0).location.get(0).id.get(0).extension);
		xml.put("wardNo", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).asLocatedEntityPartOf.get(0).location.get(0).name);
		xml.put("deptCode", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).id.get(0).extension);
		xml.put("deptName", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).name);
		xml.put("inpatientAreaCode", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).asOrganizationPartOf.get(0).wholeOrganization.get(0).id.get(0).extension);
		xml.put("inpatientAreaName", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).asOrganizationPartOf.get(0).wholeOrganization.get(0).name);
//		xml.put("diagnosticTypeCode", encounter.p);
//		xml.put("diagnosticTypeName", observationRequest);
//		xml.put("diseaseCode", observationRequest);
//		xml.put("diseaseName", observationRequest);
		
		List<POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason> reasons = observationRequest.reason;
		List<Map<String, Object>> list2s = new ArrayList<Map<String, Object>>();
		
		if(reasons != null && !reasons.isEmpty()) {
			for (POORIN200901UV.ControlActProcess.Subject.ObservationRequest.Reason reason : reasons) {
				Map<String, Object> rs = new HashMap<String, Object>();
				rs.put("code", reason.observation.get(0).code.get(0).code);
				rs.put("value", reason.observation.get(0).value);
				list2s.add(rs);
			}
		}
		xml.put("list2", list2s);
		
		List<Specimen>  specimens = observationRequest.specimen;
		if(specimens!=null && !specimens.isEmpty()) {
			xml.put("specimenCode", specimens.get(0).specimen.get(0).specimenNatural.get(0).code.get(0).value);
			xml.put("specimenDesc", specimens.get(0).specimen.get(0).specimenNatural.get(0).desc);
			xml.put("additive", specimens.get(0).specimen.get(0).specimenNatural.get(0).additive.get(0).additive3.get(0).desc);
			xml.put("specimenTime", specimens.get(0).specimen.get(0).productOf.get(0).time.get(0).value);
			xml.put("specimenEffectivetime", specimens.get(0).specimen.get(0).productOf.get(0).specimenProcessStep.get(0).effectiveTime.get(0).value);
		}
		Patient.PatientPerson.AsOtherIDs asOtherIDs = patientPerson.asOtherIDs.get(0);
		if(asOtherIDs.id!=null && !asOtherIDs.id.isEmpty()) {
			for(Id id : asOtherIDs.id) {
				if("2.16.156.10011.1.19".equals(id.root)) {
					xml.put("healthCard", id.extension);
				}else if("2.16.156.10011.1.2".equals(id.root)) {
					xml.put("healthSeq", id.extension);
				}
			}
		}
		xml.put("observationEventcriterion", observationRequest.goal.get(0).observationEventCriterion.get(0).text);
		return xml;
	}

}
