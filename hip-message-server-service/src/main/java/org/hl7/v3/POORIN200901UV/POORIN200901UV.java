//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.19 时间 09:42:21 AM CST 
//


package org.hl7.v3.POORIN200901UV;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


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
 *                             &lt;element name="substanceAdministrationRequest" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="period" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
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
 *                                               &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="routeCode" maxOccurs="unbounded" minOccurs="0">
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
 *                                       &lt;element name="doseQuantity" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="doseCheckQuantity" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="numerator" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="denominator" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                                       &lt;element name="administrationUnitCode" maxOccurs="unbounded" minOccurs="0">
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
 *                                       &lt;element name="consumable2" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="medication1" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="administerableMedicine" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                     &lt;element name="asContent" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                                           &lt;element name="subjectJy" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                                               &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                               &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                               &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
 *                                                                                         &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;simpleContent>
 *                                                                                               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                                                                                 &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                               &lt;/extension>
 *                                                                                             &lt;/simpleContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                 &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                 &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                                 &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                                                                               &lt;/restriction>
 *                                                                                             &lt;/complexContent>
 *                                                                                           &lt;/complexType>
 *                                                                                         &lt;/element>
 *                                                                                         &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
 *                                                                                           &lt;complexType>
 *                                                                                             &lt;complexContent>
 *                                                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                                 &lt;sequence>
 *                                                                                                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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

    private static final Logger LOG = LoggerFactory.getLogger(POORIN200901UV.class);

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
     *                   &lt;element name="substanceAdministrationRequest" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                             &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="period" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
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
     *                                     &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="routeCode" maxOccurs="unbounded" minOccurs="0">
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
     *                             &lt;element name="doseQuantity" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="doseCheckQuantity" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="numerator" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="denominator" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                             &lt;element name="administrationUnitCode" maxOccurs="unbounded" minOccurs="0">
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
     *                             &lt;element name="consumable2" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="medication1" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="administerableMedicine" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                           &lt;element name="asContent" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                                                 &lt;element name="subjectJy" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                     &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                     &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
     *                                                                               &lt;element name="name" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;simpleContent>
     *                                                                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                                                                       &lt;attribute name="use" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                     &lt;/extension>
     *                                                                                   &lt;/simpleContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="administrativeGenderCode" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="codeSystem" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="displayName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                       &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="birthTime" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                                                                     &lt;/restriction>
     *                                                                                   &lt;/complexContent>
     *                                                                                 &lt;/complexType>
     *                                                                               &lt;/element>
     *                                                                               &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
     *                                                                                 &lt;complexType>
     *                                                                                   &lt;complexContent>
     *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                                       &lt;sequence>
     *                                                                                         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
         *         &lt;element name="substanceAdministrationRequest" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                   &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="period" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
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
         *                           &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="routeCode" maxOccurs="unbounded" minOccurs="0">
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
         *                   &lt;element name="doseQuantity" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="doseCheckQuantity" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="numerator" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="denominator" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                   &lt;element name="administrationUnitCode" maxOccurs="unbounded" minOccurs="0">
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
         *                   &lt;element name="consumable2" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="medication1" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="administerableMedicine" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                 &lt;element name="asContent" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                                                                             &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                                       &lt;element name="subjectJy" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
         *                                                           &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
         *                                                           &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
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
         *                                                                             &lt;attribute name="codeSystemName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
         *                                                                     &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
         *                                                                       &lt;complexType>
         *                                                                         &lt;complexContent>
         *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                             &lt;sequence>
         *                                                                               &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
            "substanceAdministrationRequest"
        })
        public static class Subject {

            protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest> substanceAdministrationRequest;
            @XmlAttribute(name = "typeCode")
            protected String typeCode;

            /**
             * Gets the value of the substanceAdministrationRequest property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the substanceAdministrationRequest property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSubstanceAdministrationRequest().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest }
             * 
             * 
             */
            public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest> getSubstanceAdministrationRequest() {
                if (substanceAdministrationRequest == null) {
                    substanceAdministrationRequest = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest>();
                }
                return this.substanceAdministrationRequest;
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
             *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{urn:hl7-org:v3}code" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *         &lt;element name="effectiveTime" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="period" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
             *                 &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="routeCode" maxOccurs="unbounded" minOccurs="0">
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
             *         &lt;element name="doseQuantity" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="doseCheckQuantity" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="numerator" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="denominator" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *         &lt;element name="administrationUnitCode" maxOccurs="unbounded" minOccurs="0">
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
             *         &lt;element name="consumable2" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="medication1" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="administerableMedicine" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                       &lt;element name="asContent" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                                                                   &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
             *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *                             &lt;element name="subjectJy" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
             *                                                 &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
             *                                                 &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
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
             *                                                           &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
             *                                                             &lt;complexType>
             *                                                               &lt;complexContent>
             *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                                   &lt;sequence>
             *                                                                     &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
                "text",
                "id",
                "code",
                "statusCode",
                "effectiveTime",
                "routeCode",
                "doseQuantity",
                "doseCheckQuantity",
                "administrationUnitCode",
                "consumable2",
                "author",
                "verifier",
                "subjectOf6",
                "componentOf1"
            })
            public static class SubstanceAdministrationRequest {

                protected String text;
                protected List<Id> id;
                protected List<Code> code;
                protected List<StatusCode> statusCode;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime> effectiveTime;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.RouteCode> routeCode;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseQuantity> doseQuantity;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity> doseCheckQuantity;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.AdministrationUnitCode> administrationUnitCode;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2> consumable2;
                protected List<Author> author;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Verifier> verifier;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6> subjectOf6;
                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1> componentOf1;
                @XmlAttribute(name = "classCode")
                protected String classCode;
                @XmlAttribute(name = "moodCode")
                protected String moodCode;

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
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime> getEffectiveTime() {
                    if (effectiveTime == null) {
                        effectiveTime = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime>();
                    }
                    return this.effectiveTime;
                }

                /**
                 * Gets the value of the routeCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the routeCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRouteCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.RouteCode }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.RouteCode> getRouteCode() {
                    if (routeCode == null) {
                        routeCode = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.RouteCode>();
                    }
                    return this.routeCode;
                }

                /**
                 * Gets the value of the doseQuantity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the doseQuantity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDoseQuantity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseQuantity }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseQuantity> getDoseQuantity() {
                    if (doseQuantity == null) {
                        doseQuantity = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseQuantity>();
                    }
                    return this.doseQuantity;
                }

                /**
                 * Gets the value of the doseCheckQuantity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the doseCheckQuantity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDoseCheckQuantity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity> getDoseCheckQuantity() {
                    if (doseCheckQuantity == null) {
                        doseCheckQuantity = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity>();
                    }
                    return this.doseCheckQuantity;
                }

                /**
                 * Gets the value of the administrationUnitCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the administrationUnitCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAdministrationUnitCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.AdministrationUnitCode }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.AdministrationUnitCode> getAdministrationUnitCode() {
                    if (administrationUnitCode == null) {
                        administrationUnitCode = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.AdministrationUnitCode>();
                    }
                    return this.administrationUnitCode;
                }

                /**
                 * Gets the value of the consumable2 property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the consumable2 property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getConsumable2().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2> getConsumable2() {
                    if (consumable2 == null) {
                        consumable2 = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2>();
                    }
                    return this.consumable2;
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
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Verifier }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Verifier> getVerifier() {
                    if (verifier == null) {
                        verifier = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Verifier>();
                    }
                    return this.verifier;
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
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6> getSubjectOf6() {
                    if (subjectOf6 == null) {
                        subjectOf6 = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6>();
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
                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 }
                 * 
                 * 
                 */
                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1> getComponentOf1() {
                    if (componentOf1 == null) {
                        componentOf1 = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1>();
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
                public static class AdministrationUnitCode {

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
                 *         &lt;element name="encounter" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                 *                   &lt;element name="subjectJy" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                 *                                       &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                 *                                       &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
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
                 *                                                 &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;sequence>
                 *                                                           &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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

                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter> encounter;
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
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter> getEncounter() {
                        if (encounter == null) {
                            encounter = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter>();
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
                     *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                     *         &lt;element name="subjectJy" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                     *                             &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                     *                             &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
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
                     *                                       &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;sequence>
                     *                                                 &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
                        protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy> subject;
                       
						public void setSubject(
								List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1.Encounter.SubjectJy> subject) {
							this.subject = subject;
						}


						protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location> location;
                        @XmlAttribute(name = "classCode")
                        protected String classCode;
                        @XmlAttribute(name = "moodCode")
                        protected String moodCode;

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
                         * Gets the value of the subjectJy property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the subjectJy property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSubjectJy().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy }
                         * 
                         * 
                         */
                        public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy> getSubject() {
                            if (subject == null) {
                                subject = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy>();
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
                         * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location }
                         * 
                         * 
                         */
                        public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location> getLocation() {
                            if (location == null) {
                                location = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location>();
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
                            protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation> serviceDeliveryLocation;
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
                             * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation }
                             * 
                             * 
                             */
                            public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation> getServiceDeliveryLocation() {
                                if (serviceDeliveryLocation == null) {
                                    serviceDeliveryLocation = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation>();
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

                                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc> location;
                                public void setLocation(
										List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1.Encounter.Location.ServiceDeliveryLocation.Locationbc> location) {
									this.location = location;
								}

								public void setServiceProviderOrganization(
										List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1.Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization> serviceProviderOrganization) {
									this.serviceProviderOrganization = serviceProviderOrganization;
								}


								protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization> serviceProviderOrganization;
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
                                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc }
                                 * 
                                 * 
                                 */
                                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc> getLocation() {
                                    if (location == null) {
                                        location = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc>();
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
                                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization }
                                 * 
                                 * 
                                 */
                                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization> getServiceProviderOrganization() {
                                    if (serviceProviderOrganization == null) {
                                        serviceProviderOrganization = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization>();
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
                                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf> asLocatedEntityPartOf;
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
                                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf> getAsLocatedEntityPartOf() {
                                        if (asLocatedEntityPartOf == null) {
                                            asLocatedEntityPartOf = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf>();
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

                                        protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf> location;
                                        public void setLocation(
												List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1.Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf> location) {
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
                                         * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf }
                                         * 
                                         * 
                                         */
                                        public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf> getLocation() {
                                            if (location == null) {
                                                location = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.Locationbc.AsLocatedEntityPartOf.Locationbf>();
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
                                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf> asOrganizationPartOf;
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
                                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf> getAsOrganizationPartOf() {
                                        if (asOrganizationPartOf == null) {
                                            asOrganizationPartOf = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf>();
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

                                        protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization> wholeOrganization;
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
                                         * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization }
                                         * 
                                         * 
                                         */
                                        public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization> getWholeOrganization() {
                                            if (wholeOrganization == null) {
                                                wholeOrganization = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.Location.ServiceDeliveryLocation.ServiceProviderOrganization.AsOrganizationPartOf.WholeOrganization>();
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
                         *         &lt;element name="patient" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                         *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                         *                   &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                         *                   &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
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
                         *                             &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;sequence>
                         *                                       &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
                            "patient"
                        })
                        @XmlRootElement(name = "subject")
                        public static class SubjectJy {

                            protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient> patient;
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
                             * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient }
                             * 
                             * 
                             */
                            public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient> getPatient() {
                                if (patient == null) {
                                    patient = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient>();
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
                             *         &lt;element name="telecom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                             *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
                             *         &lt;element ref="{urn:hl7-org:v3}statusCode" maxOccurs="unbounded" minOccurs="0"/>
                             *         &lt;element name="patientPerson" maxOccurs="unbounded" minOccurs="0">
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
                             *                   &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;sequence>
                             *                             &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
                                "telecom",
                                "id",
                                "statusCode",
                                "patientPerson"
                            })
                            public static class Patient {

                                protected String telecom;
                                protected List<Id> id;
                                protected List<StatusCode> statusCode;
                                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson> patientPerson;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;

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
                                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson }
                                 * 
                                 * 
                                 */
                                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson> getPatientPerson() {
                                    if (patientPerson == null) {
                                        patientPerson = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson>();
                                    }
                                    return this.patientPerson;
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
                                 *         &lt;element name="asOtherIDs" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;sequence>
                                 *                   &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
                                    "asOtherIDs"
                                })
                                public static class PatientPerson {

                                    protected List<Id> id;
                                    @XmlElement(nillable = true)
                                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.Name> name;
                                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AdministrativeGenderCode> administrativeGenderCode;
                                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.BirthTime> birthTime;
                                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AsOtherIDs> asOtherIDs;
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
                                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.Name }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.Name> getName() {
                                        if (name == null) {
                                            name = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.Name>();
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
                                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AdministrativeGenderCode }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AdministrativeGenderCode> getAdministrativeGenderCode() {
                                        if (administrativeGenderCode == null) {
                                            administrativeGenderCode = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AdministrativeGenderCode>();
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
                                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.BirthTime }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.BirthTime> getBirthTime() {
                                        if (birthTime == null) {
                                            birthTime = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.BirthTime>();
                                        }
                                        return this.birthTime;
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
                                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AsOtherIDs }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AsOtherIDs> getAsOtherIDs() {
                                        if (asOtherIDs == null) {
                                            asOtherIDs = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter.SubjectJy.Patient.PatientPerson.AsOtherIDs>();
                                        }
                                        return this.asOtherIDs;
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
                                     *         &lt;element ref="{urn:hl7-org:v3}id" maxOccurs="unbounded" minOccurs="0"/>
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
                                        "id"
                                    })
                                    public static class AsOtherIDs {

                                        protected List<Id> id;
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
                 *         &lt;element name="medication1" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="administerableMedicine" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                             &lt;element name="asContent" maxOccurs="unbounded" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
                 *                                                   &lt;complexType>
                 *                                                     &lt;complexContent>
                 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                                         &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                                                         &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "medication1"
                })
                public static class Consumable2 {

                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1> medication1;
                    @XmlAttribute(name = "typeCode")
                    protected String typeCode;
                    @XmlAttribute(name = "contextControlCode")
                    protected String contextControlCode;

                    /**
                     * Gets the value of the medication1 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the medication1 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMedication1().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1> getMedication1() {
                        if (medication1 == null) {
                            medication1 = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1>();
                        }
                        return this.medication1;
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
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="administerableMedicine" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *                   &lt;element name="asContent" maxOccurs="unbounded" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
                     *                                         &lt;complexType>
                     *                                           &lt;complexContent>
                     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                               &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                        "administerableMedicine"
                    })
                    public static class Medication1 {

                        protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine> administerableMedicine;
                        @XmlAttribute(name = "classCode")
                        protected String classCode;

                        /**
                         * Gets the value of the administerableMedicine property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the administerableMedicine property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getAdministerableMedicine().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine }
                         * 
                         * 
                         */
                        public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine> getAdministerableMedicine() {
                            if (administerableMedicine == null) {
                                administerableMedicine = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine>();
                            }
                            return this.administerableMedicine;
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
                         *         &lt;element name="asContent" maxOccurs="unbounded" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
                         *                               &lt;complexType>
                         *                                 &lt;complexContent>
                         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                                     &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                         *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                            "asContent"
                        })
                        public static class AdministerableMedicine {

                            protected String name;
                            protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent> asContent;
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
                             * Gets the value of the asContent property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the asContent property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getAsContent().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent }
                             * 
                             * 
                             */
                            public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent> getAsContent() {
                                if (asContent == null) {
                                    asContent = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent>();
                                }
                                return this.asContent;
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
                             *         &lt;element name="containerPackagedMedicine" maxOccurs="unbounded" minOccurs="0">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
                             *                     &lt;complexType>
                             *                       &lt;complexContent>
                             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                             *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                "containerPackagedMedicine"
                            })
                            public static class AsContent {

                                protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine> containerPackagedMedicine;
                                @XmlAttribute(name = "classCode")
                                protected String classCode;

                                /**
                                 * Gets the value of the containerPackagedMedicine property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the containerPackagedMedicine property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getContainerPackagedMedicine().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine }
                                 * 
                                 * 
                                 */
                                public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine> getContainerPackagedMedicine() {
                                    if (containerPackagedMedicine == null) {
                                        containerPackagedMedicine = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine>();
                                    }
                                    return this.containerPackagedMedicine;
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
                                 *         &lt;element name="capacityQuantity" maxOccurs="unbounded" minOccurs="0">
                                 *           &lt;complexType>
                                 *             &lt;complexContent>
                                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                                 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                    "capacityQuantity"
                                })
                                public static class ContainerPackagedMedicine {

                                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine.CapacityQuantity> capacityQuantity;
                                    @XmlAttribute(name = "classCode")
                                    protected String classCode;
                                    @XmlAttribute(name = "determinerCode")
                                    protected String determinerCode;

                                    /**
                                     * Gets the value of the capacityQuantity property.
                                     * 
                                     * <p>
                                     * This accessor method returns a reference to the live list,
                                     * not a snapshot. Therefore any modification you make to the
                                     * returned list will be present inside the JAXB object.
                                     * This is why there is not a <CODE>set</CODE> method for the capacityQuantity property.
                                     * 
                                     * <p>
                                     * For example, to add a new item, do as follows:
                                     * <pre>
                                     *    getCapacityQuantity().add(newItem);
                                     * </pre>
                                     * 
                                     * 
                                     * <p>
                                     * Objects of the following type(s) are allowed in the list
                                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine.CapacityQuantity }
                                     * 
                                     * 
                                     */
                                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine.CapacityQuantity> getCapacityQuantity() {
                                        if (capacityQuantity == null) {
                                            capacityQuantity = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.Consumable2 .Medication1 .AdministerableMedicine.AsContent.ContainerPackagedMedicine.CapacityQuantity>();
                                        }
                                        return this.capacityQuantity;
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
                                     *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                                    public static class CapacityQuantity {

                                        @XmlAttribute(name = "unit")
                                        protected String unit;
                                        @XmlAttribute(name = "value")
                                        protected String value;

                                        /**
                                         * 获取unit属性的值。
                                         * 
                                         * @return
                                         *     possible object is
                                         *     {@link String }
                                         *     
                                         */
                                        public String getUnit() {
                                            return unit;
                                        }

                                        /**
                                         * 设置unit属性的值。
                                         * 
                                         * @param value
                                         *     allowed object is
                                         *     {@link String }
                                         *     
                                         */
                                        public void setUnit(String value) {
                                            this.unit = value;
                                        }

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
                 *         &lt;element name="numerator" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="denominator" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    "numerator",
                    "denominator"
                })
                public static class DoseCheckQuantity {

                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Numerator> numerator;
                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Denominator> denominator;

                    /**
                     * Gets the value of the numerator property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the numerator property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getNumerator().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Numerator }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Numerator> getNumerator() {
                        if (numerator == null) {
                            numerator = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Numerator>();
                        }
                        return this.numerator;
                    }

                    /**
                     * Gets the value of the denominator property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the denominator property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDenominator().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Denominator }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Denominator> getDenominator() {
                        if (denominator == null) {
                            denominator = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.DoseCheckQuantity.Denominator>();
                        }
                        return this.denominator;
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
                     *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    public static class Denominator {

                        @XmlAttribute(name = "unit")
                        protected String unit;
                        @XmlAttribute(name = "value")
                        protected String value;

                        /**
                         * 获取unit属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnit() {
                            return unit;
                        }

                        /**
                         * 设置unit属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnit(String value) {
                            this.unit = value;
                        }

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
                     *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                    public static class Numerator {

                        @XmlAttribute(name = "unit")
                        protected String unit;
                        @XmlAttribute(name = "value")
                        protected String value;

                        /**
                         * 获取unit属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnit() {
                            return unit;
                        }

                        /**
                         * 设置unit属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnit(String value) {
                            this.unit = value;
                        }

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
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class DoseQuantity {

                    @XmlAttribute(name = "value")
                    protected String value;
                    @XmlAttribute(name = "unit")
                    protected String unit;

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
                     * 获取unit属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUnit() {
                        return unit;
                    }

                    /**
                     * 设置unit属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUnit(String value) {
                        this.unit = value;
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
                 *         &lt;element name="period" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
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
                 *       &lt;attribute name="operator" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "period",
                    "low",
                    "high"
                })
                public static class EffectiveTime {

                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Period> period;
                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Low> low;
                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.High> high;
                    @XmlAttribute(name = "operator")
                    protected String operator;
                    
                    @XmlAttribute(name = "xsi:type")
                    protected String type;
                    public String getType() {
						return type;
					}

					public void setType(String type) {
						this.type = type;
					}

					/**
                     * Gets the value of the period property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the period property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPeriod().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Period }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Period> getPeriod() {
                        if (period == null) {
                            period = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Period>();
                        }
                        return this.period;
                    }

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
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Low }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Low> getLow() {
                        if (low == null) {
                            low = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.Low>();
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
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.High }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.High> getHigh() {
                        if (high == null) {
                            high = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime.High>();
                        }
                        return this.high;
                    }

                    /**
                     * 获取operator属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOperator() {
                        return operator;
                    }

                    /**
                     * 设置operator属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOperator(String value) {
                        this.operator = value;
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
                     *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Period {

                        @XmlAttribute(name = "value")
                        protected String value;
                        @XmlAttribute(name = "unit")
                        protected String unit;

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
                         * 获取unit属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnit() {
                            return unit;
                        }

                        /**
                         * 设置unit属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnit(String value) {
                            this.unit = value;
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
                public static class RouteCode {

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

                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .SeperatableInd> seperatableInd;
                    protected List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .Annotation> annotation;
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
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .SeperatableInd }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .SeperatableInd> getSeperatableInd() {
                        if (seperatableInd == null) {
                            seperatableInd = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .SeperatableInd>();
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
                     * {@link POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .Annotation }
                     * 
                     * 
                     */
                    public List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .Annotation> getAnnotation() {
                        if (annotation == null) {
                            annotation = new ArrayList<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.SubjectOf6 .Annotation>();
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
		
		xml.put("orderOpenTime", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).author.get(0).time.get(0).value);
		xml.put("orderOpenPersonAutograph", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).author.get(0).signatureText);
		xml.put("orderOpenPersonId", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).author.get(0).assignedEntity.get(0).id.get(0).extension);
		xml.put("orderOpenPersonName", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).author.get(0).assignedEntity.get(0).assignedPerson.get(0).name);
		xml.put("orderOpenDeptId", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.get(0).id.get(0).extension);
		xml.put("orderOpenDeptName", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).author.get(0).assignedEntity.get(0).representedOrganization.get(0).name);
		xml.put("orderAuditorTime", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).verifier.get(0).time.get(0).value);
		xml.put("orderAuditorPersonAutograph", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).verifier.get(0).signatureText);
		xml.put("orderAuditorPersonId", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).verifier.get(0).assignedEntity.get(0).id.get(0).extension);
		xml.put("orderAuditorPersonName", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).verifier.get(0).assignedEntity.get(0).assignedPerson.get(0).name);
//		xml.put("orderSequence", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).);
		xml.put("orderId", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).id.get(0).extension);
		xml.put("orderItemTypeCode", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).code.get(0).code);
		xml.put("checkTypeName", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).code.get(0).displayName);
		xml.put("orderItemContent", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).text);
		xml.put("statusCode", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).statusCode.get(0).code);

        xml.put("orderStartTime", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).effectiveTime.get(0).low.get(0).value);
        LOG.info("orderStartTime= {}", xml.get("orderStartTime"));
        xml.put("orderEndTime", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).effectiveTime.get(0).high.get(0).value);
        LOG.info("orderEndTime= {}", xml.get("orderEndTime") );
        xml.put("orderExecRateCode", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).effectiveTime.get(1).period.get(0).value);
        LOG.info("orderExecRateCode= {}", xml.get("orderExecRateCode") );
        xml.put("orderExecRateName", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).effectiveTime.get(1).period.get(0).unit);
        LOG.info("orderExecRateName= {}", xml.get("orderExecRateName") );
//        List<POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime> effectiveTimes =
//                this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).getEffectiveTime();
//
//		for (POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.EffectiveTime effectiveTime : effectiveTimes) {
//            LOG.info("effectiveTime.type= {}", effectiveTime.type );
//		    if("IVL_TS".equals(effectiveTime.type)) {
//			    LOG.info("医嘱接收：orderStartTime={},orderEndTime={}",
//                        effectiveTime.low.get(0).value, effectiveTime.high.get(0).value);
//				xml.put("orderStartTime", effectiveTime.low.get(0).value);
//				xml.put("orderEndTime", effectiveTime.high.get(0).value);
//			}else if("PIVL_TS".equals(effectiveTime.type)) {
//                LOG.info("医嘱接收：orderExecRateCode={},orderExecRateName={}",
//                        effectiveTime.period.get(0).value, effectiveTime.period.get(0).unit);
//				xml.put("orderExecRateCode", effectiveTime.period.get(0).value);
//				xml.put("orderExecRateName", effectiveTime.period.get(0).unit);
//			}
//		}
		
		xml.put("drugChannel", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).routeCode.get(0).code);
		xml.put("drugChannelDepict", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).routeCode.get(0).displayName);
		xml.put("drugOneDose", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).doseQuantity.get(0).value);
		xml.put("drugOneDoseUnit", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).doseQuantity.get(0).unit);
		xml.put("drugTotalDose", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).doseCheckQuantity.get(0).numerator.get(0).value);
		xml.put("drugTotalDoseUnit", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).doseCheckQuantity.get(0).numerator.get(0).unit);
		xml.put("drugTotalDoseDays", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).doseCheckQuantity.get(0).denominator.get(0).value);
		xml.put("drugDosageForm", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).administrationUnitCode.get(0).code);
		xml.put("drugDosageFormDepict", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).administrationUnitCode.get(0).displayName);
//		xml.put("drugCode",  this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).consumable2.get(0).medication1.get(0));
		xml.put("drugName", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).consumable2.get(0).medication1.get(0).administerableMedicine.get(0).name);
		xml.put("drugSpec", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).consumable2.get(0).medication1.get(0).administerableMedicine.get(0).asContent.get(0).containerPackagedMedicine.get(0).capacityQuantity.get(0).value);
		xml.put("drugSpecUnit", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).consumable2.get(0).medication1.get(0).administerableMedicine.get(0).asContent.get(0).containerPackagedMedicine.get(0).capacityQuantity.get(0).unit);
//		xml.put("drugMedicalTypeCode", this.sender.get(0).device.get(0).id.get(0).extension);
//		xml.put("drugMedicalTypeName", this.sender.get(0).device.get(0).id.get(0).extension);
		xml.put("execDeptCode", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).componentOf1.get(0).encounter.get(0).location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).id.get(0).extension);
		xml.put("execDeptName", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).componentOf1.get(0).encounter.get(0).location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).name);
		
		xml.put("orderRemarksInfo", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).subjectOf6.get(0).annotation.get(0).text);
		xml.put("orderRemarksInfoStatus", this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).subjectOf6.get(0).annotation.get(0).statusCode.get(0).code);
		POORIN200901UV.ControlActProcess.Subject.SubstanceAdministrationRequest.ComponentOf1 .Encounter encounter =
                this.controlActProcess.get(0).subject.get(0).substanceAdministrationRequest.get(0).componentOf1.get(0).encounter.get(0);
		for (Id id : encounter.id) {
			if("2.16.156.10011.2.5.1.8".equals(id.root)) {
				xml.put("visitNumber", id.extension);
			}else if("2.16.156.10011.2.5.1.9".equals(id.root)) {
				xml.put("visitFlowNo", id.extension);
			}
		}
//		xml.put("visitTypeCode", encounter.code);
//		xml.put("visitTypeName", id.extension);
		for (Id id : encounter.subject.get(0).patient.get(0).id) {
			if("2.16.156.10011.1.10".equals(id.root)) {
				xml.put("visitId", id.extension);
			}
			if("2.16.156.10011.1.12".equals(id.root)) {
				xml.put("inpatientNo", id.extension);
			}
			if("2.16.156.10011.2.5.1.4".equals(id.root)) {
				xml.put("patientId", id.extension);
			}
		}
		xml.put("contactPhone", encounter.subject.get(0).patient.get(0).telecom);
		xml.put("identityNo", encounter.subject.get(0).patient.get(0).patientPerson.get(0).id.get(0).extension);
		xml.put("name", encounter.subject.get(0).patient.get(0).patientPerson.get(0).name.get(0).value);
		xml.put("genderId",  encounter.subject.get(0).patient.get(0).patientPerson.get(0).administrativeGenderCode.get(0).code);
		xml.put("genderDepict", encounter.subject.get(0).patient.get(0).patientPerson.get(0).administrativeGenderCode.get(0).displayName);
		xml.put("dateOfBirth", encounter.subject.get(0).patient.get(0).patientPerson.get(0).birthTime.get(0).value);
		for (Id id : encounter.subject.get(0).patient.get(0).patientPerson.get(0).asOtherIDs.get(0).id) {
			if("2.16.156.10011.1.2".equals(id.root)) {
				xml.put("healthFileNumber", id.extension);
			}else if("2.16.156.10011.1.19".equals(id.root)) {
				xml.put("healthCardNumber", id.extension);
			}
		}
		xml.put("hositalBedNo", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).id.get(0).extension);
		xml.put("hositalBedName", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).name);
		xml.put("wardNo", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).asLocatedEntityPartOf.get(0).location.get(0).id.get(0).extension);
		xml.put("wardName", encounter.location.get(0).serviceDeliveryLocation.get(0).location.get(0).asLocatedEntityPartOf.get(0).location.get(0).name);
		xml.put("deptCode", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).id.get(0).extension);
		xml.put("deptName", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).name);
		xml.put("inpatientArea", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).asOrganizationPartOf.get(0).wholeOrganization.get(0).id.get(0).extension);
		xml.put("inpatientAreaName", encounter.location.get(0).serviceDeliveryLocation.get(0).serviceProviderOrganization.get(0).asOrganizationPartOf.get(0).wholeOrganization.get(0).name);
		return xml;
	}

}
