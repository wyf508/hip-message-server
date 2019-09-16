package com.djhu.hiup.message.server.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by jiangmei on 2018/1/29.
 */
@Component("appConfig")
public class AppConfig {
    @Value("${his.domain}")
    private String hisDomain;
    @Value("${emr.domain}")
    private String emrDomain;

    //获取配置：主数据队列类型
    @Value("${activeMQ.type}")
    private String mqType;
    //获取配置：主数据队列名称
    @Value("${activeMQ.name}")
    private String mqName;
    
    


    public String getMqType() {
        return mqType;
    }

    public void setMqType(String mqType) {
        this.mqType = mqType;
    }

    public String getMqName() {
        return mqName;
    }

    public void setMqName(String mqName) {
        this.mqName = mqName;
    }

    public String getHisDomain() {
        return hisDomain;
    }

    public void setHisDomain(String hisDomain) {
        this.hisDomain = hisDomain;
    }

    public String getEmrDomain() {
        return emrDomain;
    }

    public void setEmrDomain(String emrDomain) {
        this.emrDomain = emrDomain;
    }
}
