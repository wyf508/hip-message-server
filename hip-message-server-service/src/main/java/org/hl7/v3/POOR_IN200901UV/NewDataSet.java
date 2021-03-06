//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.19 时间 11:31:55 AM CST 
//


package org.hl7.v3.POOR_IN200901UV;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:hl7-org:v3}id"/>
 *         &lt;element ref="{urn:hl7-org:v3}device"/>
 *         &lt;element ref="{urn:hl7-org:v3}code"/>
 *         &lt;element ref="{urn:hl7-org:v3}statusCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}effectiveTime"/>
 *         &lt;element ref="{urn:hl7-org:v3}specimen"/>
 *         &lt;element ref="{urn:hl7-org:v3}time"/>
 *         &lt;element ref="{urn:hl7-org:v3}patient"/>
 *         &lt;element ref="{urn:hl7-org:v3}author"/>
 *         &lt;element ref="{urn:hl7-org:v3}signatureCode"/>
 *         &lt;element ref="{urn:hl7-org:v3}assignedEntity"/>
 *         &lt;element ref="{urn:hl7-org:v3}POOR_IN200901UV"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idOrDeviceOrCode"
})
@XmlRootElement(name = "NewDataSet")
public class NewDataSet {

    @XmlElements({
        @XmlElement(name = "id", type = Id.class),
        @XmlElement(name = "device", type = Device.class),
        @XmlElement(name = "code", type = Code.class),
        @XmlElement(name = "statusCode", type = StatusCode.class),
        @XmlElement(name = "effectiveTime", type = EffectiveTime.class),
        @XmlElement(name = "specimen", type = Specimen.class),
        @XmlElement(name = "time", type = Time.class),
        @XmlElement(name = "patient", type = Patient.class),
        @XmlElement(name = "author", type = Author.class),
        @XmlElement(name = "signatureCode", type = SignatureCode.class),
        @XmlElement(name = "assignedEntity", type = AssignedEntity.class),
        @XmlElement(name = "POOR_IN200901UV", type = POORIN200901UV.class)
    })
    protected List<Object> idOrDeviceOrCode;

    /**
     * Gets the value of the idOrDeviceOrCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idOrDeviceOrCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdOrDeviceOrCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     * {@link Device }
     * {@link Code }
     * {@link StatusCode }
     * {@link EffectiveTime }
     * {@link Specimen }
     * {@link Time }
     * {@link Patient }
     * {@link Author }
     * {@link SignatureCode }
     * {@link AssignedEntity }
     * {@link POORIN200901UV }
     * 
     * 
     */
    public List<Object> getIdOrDeviceOrCode() {
        if (idOrDeviceOrCode == null) {
            idOrDeviceOrCode = new ArrayList<Object>();
        }
        return this.idOrDeviceOrCode;
    }

}
