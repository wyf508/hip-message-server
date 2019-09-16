//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.18 时间 10:12:42 AM CST 
//


package org.hl7.v3.ProvideAndRegisterDocumentSetRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{urn:hl7-org:v3}ProvideAndRegisterDocumentSetRequest"/>
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
    "provideAndRegisterDocumentSetRequest"
})
@XmlRootElement(name = "NewDataSet")
public class NewDataSet {

    @XmlElement(name = "ProvideAndRegisterDocumentSetRequest")
    protected List<ProvideAndRegisterDocumentSetRequest> provideAndRegisterDocumentSetRequest;

    /**
     * Gets the value of the provideAndRegisterDocumentSetRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provideAndRegisterDocumentSetRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvideAndRegisterDocumentSetRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvideAndRegisterDocumentSetRequest }
     * 
     * 
     */
    public List<ProvideAndRegisterDocumentSetRequest> getProvideAndRegisterDocumentSetRequest() {
        if (provideAndRegisterDocumentSetRequest == null) {
            provideAndRegisterDocumentSetRequest = new ArrayList<ProvideAndRegisterDocumentSetRequest>();
        }
        return this.provideAndRegisterDocumentSetRequest;
    }

}
