//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.19 时间 09:24:55 AM CST 
//


package org.hl7.v3.GetDocumentStroedInfoRequest;

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

import org.apache.commons.lang.StringUtils;
import org.hl7.v3.DocEntity;
import org.hl7.v3.RetrieveDocumentSetRequest.RetrieveDocumentSetRequest;


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
 *         &lt;element name="IdentityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    "identityId",
    "documentTitle",
    "id",
    "healthCardId",
    "patientId"
})
@XmlRootElement(name = "GetDocumentStroedInfoRequest")
public class GetDocumentStroedInfoRequest extends DocEntity{

    @XmlElement(name = "IdentityId")
    protected String identityId;
    @XmlElement(name = "DocumentTitle")
    protected String documentTitle;
    @XmlElement(name = "Id")
    protected List<GetDocumentStroedInfoRequest.Id> id;
    
    @XmlElement(name = "HealthCardId")
    protected String healthCardId;

    @XmlElement(name = "PatientId")
    protected String patientId;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getHealthCardId() {
		return healthCardId;
	}

	public void setHealthCardId(String healthCardId) {
		this.healthCardId = healthCardId;
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
     * 获取documentTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTitle() {
        return documentTitle;
    }

    /**
     * 设置documentTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTitle(String value) {
        this.documentTitle = value;
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
     * {@link GetDocumentStroedInfoRequest.Id }
     * 
     * 
     */
    public List<GetDocumentStroedInfoRequest.Id> getId() {
        if (id == null) {
            id = new ArrayList<GetDocumentStroedInfoRequest.Id>();
        }
        return this.id;
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
    public static class Id {

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


	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> xml = new HashMap<String, Object>();
		xml.put("msgId", this.id.get(0).extension);
		xml.put("healthCardId", this.healthCardId);
		xml.put("identityNo", this.identityId);
		xml.put("docTypeDepict", this.documentTitle);
        //xml.put("patientId", this.patientId);

		return xml;
	}

}
