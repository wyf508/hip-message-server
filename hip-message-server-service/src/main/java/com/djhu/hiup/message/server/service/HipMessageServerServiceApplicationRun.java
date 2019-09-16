package com.djhu.hiup.message.server.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by jiangmei on 2018/1/9.
 */
@SpringBootApplication
@PropertySource({"file:config/application.properties"})
@PropertySource({"file:config/rule.properties"})
@ImportResource({"classpath:spring/spring.xml","classpath:spring/spring-hlht-db.xml","classpath:spring/spring-hlht-dao.xml","classpath:spring/spring-disconf.xml"})
@ComponentScan({"com.djhu.hiup.message.server.service","com.djhulog"})
public class HipMessageServerServiceApplicationRun {

    private static Logger logger = LoggerFactory.getLogger(HipMessageServerServiceApplicationRun.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(HipMessageServerServiceApplicationRun.class, args);
        } catch (Exception e) {
            logger.error("启动springboot失败！！！", e.getMessage(), e);
        }
        logger.info("启动服务完成");
    }

}
