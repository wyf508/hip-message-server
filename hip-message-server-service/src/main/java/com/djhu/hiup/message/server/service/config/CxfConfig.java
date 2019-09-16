package com.djhu.hiup.message.server.service.config;

import com.djhu.hiup.message.server.service.webservice.HIPMessageServerWebServiceSoap;
import com.djhu.hiup.message.server.service.webservice.HIPMessageServerWebServiceSoap12Impl;
import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

/**
 * Created by jiangmei on 2017/12/13.
 */
@Configuration
public class CxfConfig {

   /*
   不能使用，会阻塞springboot 整个服务的启动
   @Bean
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/services*//*");
    }*/

    @Autowired
    private Bus bus;


    //互联互通交互服务
    @Bean
    public HIPMessageServerWebServiceSoap hipMessageServerWebServiceSoap() {
        return new HIPMessageServerWebServiceSoap12Impl();
    }

    @Bean
    public Endpoint hipMessageServer() {
        EndpointImpl endpoint = new EndpointImpl(bus, hipMessageServerWebServiceSoap());
        endpoint.publish("/hipMessageServer");
        endpoint.getInInterceptors().add(new LoggingInInterceptor());
        return endpoint;
    }
}

