//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.19 时间 09:09:17 AM CST 
//


package org.hl7.v3.RetrieveDocumentSetRequest;

import org.apache.commons.lang.StringUtils;
import org.hl7.v3.DocEntity;

import javax.xml.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;


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
 *         &lt;element name="ID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="root" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="extension" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DocumentRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DocumentUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 *
 * @author mengbin.tang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id","documentRequest"
})
@XmlRootElement(name = "RetrieveDocumentSetRequest")
public class RetrieveDocumentSetRequest extends DocEntity{

//    protected List<Object> idOrDocumentRequest;
    
	@XmlElement(name = "ID" )
    protected RetrieveDocumentSetRequest.ID id;
	@XmlElement(name = "DocumentRequest" )
    protected RetrieveDocumentSetRequest.DocumentRequest documentRequest;



    public RetrieveDocumentSetRequest.ID getId() {
		return id;
	}


	public void setId(RetrieveDocumentSetRequest.ID id) {
		this.id = id;
	}


	public RetrieveDocumentSetRequest.DocumentRequest getDocumentRequest() {
		return documentRequest;
	}


	public void setDocumentRequest(RetrieveDocumentSetRequest.DocumentRequest documentRequest) {
		this.documentRequest = documentRequest;
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
     *         &lt;element name="DocumentUniqueId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "documentUniqueId",
        "repositoryUniqueId"
    })
    @XmlRootElement(name = "DocumentRequest")
    public static class DocumentRequest {

        @Override
		public String toString() {
			return "DocumentRequest [documentUniqueId=" + documentUniqueId + ", repositoryUniqueId="
					+ repositoryUniqueId + "]";
		}

		@XmlElement(name = "DocumentUniqueId")
        protected String documentUniqueId;
        
        @XmlElement(name = "RepositoryUniqueId")
        protected String repositoryUniqueId;

        public String getRepositoryUniqueId() {
			return repositoryUniqueId;
		}

		public void setRepositoryUniqueId(String repositoryUniqueId) {
			this.repositoryUniqueId = repositoryUniqueId;
		}

		/**
         * 获取documentUniqueId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentUniqueId() {
            return documentUniqueId;
        }

        /**
         * 设置documentUniqueId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentUniqueId(String value) {
            this.documentUniqueId = value;
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
    @XmlRootElement(name = "ID")
    public static class ID {

        @XmlAttribute(name = "root")
        protected String root;
        @XmlAttribute(name = "extension")
        protected String extension;

        @Override
		public String toString() {
			return "ID [root=" + root + ", extension=" + extension + "]";
		}

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
	public String toString() {
		return "RetrieveDocumentSetRequest [id=" + id + ", documentRequest=" + documentRequest + "]";
	}


	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> xml = new HashMap<String, Object>();
		xml.put("msgId", id.extension);
		if(StringUtils.isNotEmpty(documentRequest.repositoryUniqueId)) {
			xml.put("repositoryUniqueId", documentRequest.repositoryUniqueId);
		}
		
//		if(StringUtils.isNotEmpty(documentRequest.documentUniqueId)) {
//			xml.put("docFlowNo", documentRequest.documentUniqueId);
//		}
//
        xml.put("documentId", documentRequest.documentUniqueId);

		return xml;
	}

}
