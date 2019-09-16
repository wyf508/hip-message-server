
package com.djhu.hiup.message.server.service.webservice;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.djhu.hiup.message.server.service.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.djhu.hiup.message.server.service.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HIPMessageServer }
     * 
     */
    public HIPMessageServer createHIPMessageServer() {
        return new HIPMessageServer();
    }

    /**
     * Create an instance of {@link HIPMessageServerResponse }
     * 
     */
    public HIPMessageServerResponse createHIPMessageServerResponse() {
        return new HIPMessageServerResponse();
    }

}
