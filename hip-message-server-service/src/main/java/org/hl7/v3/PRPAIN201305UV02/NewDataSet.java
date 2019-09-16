//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.18 时间 03:22:10 PM CST 
//


package org.hl7.v3.PRPAIN201305UV02;

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
 *         &lt;element ref="{urn:hl7-org:v3}value"/>
 *         &lt;element ref="{urn:hl7-org:v3}PRPA_IN201305UV02"/>
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
    "idOrDeviceOrValue"
})
@XmlRootElement(name = "NewDataSet")
public class NewDataSet {

    @XmlElements({
        @XmlElement(name = "id", type = Id.class),
        @XmlElement(name = "device", type = Device.class),
        @XmlElement(name = "value", type = Value.class),
        @XmlElement(name = "PRPA_IN201305UV02", type = PRPAIN201305UV02 .class)
    })
    protected List<Object> idOrDeviceOrValue;

    /**
     * Gets the value of the idOrDeviceOrValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idOrDeviceOrValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdOrDeviceOrValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Id }
     * {@link Device }
     * {@link Value }
     * {@link PRPAIN201305UV02 }
     * 
     * 
     */
    public List<Object> getIdOrDeviceOrValue() {
        if (idOrDeviceOrValue == null) {
            idOrDeviceOrValue = new ArrayList<Object>();
        }
        return this.idOrDeviceOrValue;
    }

}
