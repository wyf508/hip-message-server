
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.djhu.hiup.message.server.service.webservice;

import java.util.logging.Logger;
import javax.jws.WebService;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2018-05-25T08:41:25.828+08:00
 * Generated source version: 3.1.7
 * 
 */

@WebService(
                      serviceName = "HIPMessageServerWebService",
                      portName = "HIPMessageServerWebServiceSoap",
                      targetNamespace = "urn:hl7-org:v3",
                      wsdlLocation = "file:HIPMessageServerWebService.xml",
                      endpointInterface = "com.djhu.hiup.message.server.service.webservice.HIPMessageServerWebServiceSoap")
                      
public class HIPMessageServerWebServiceSoapImpl implements HIPMessageServerWebServiceSoap {

    private static final Logger LOG = Logger.getLogger(HIPMessageServerWebServiceSoapImpl.class.getName());

    /* (non-Javadoc)
     * @see com.djhu.hiup.message.server.service.webservice.HIPMessageServerWebServiceSoap#hipMessageServer(java.lang.String action, java.lang.String message)*
     */
    @Override
	public String hipMessageServer(String action,String message) {
        LOG.info("Executing operation hipMessageServer");
        System.out.println(action);
        System.out.println(message);
        try {
            String _return = "";
            return _return;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
