package com.djhu.hiup.message.server.service.util;


import com.djhu.hiup.message.server.service.common.ActiveMQType;
import com.djhu.hiup.message.server.service.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * 推送通知到消息队列工具类
 * Created by jiangmei on 2017/8/1.
 */
@Component("pushNotice")
public class PushNoticeUtils {

    private static final Logger LOGGER= LoggerFactory.getLogger(PushNoticeUtils.class);

    @Resource
    private JmsTemplate queueJmsTemplate;
    @Resource
    private JmsTemplate topicJmsTemplate;
    @Resource
    private AppConfig appConfig;

    /**
     * 推送数据
     * @param json
     * @throws javax.jms.JMSException
     */
    public void pushMessage(String json) throws JMSException{
        if(StringUtils.isEmpty(appConfig)|| StringUtils.isEmpty(appConfig.getMqName())){
           LOGGER.error("主数据队列名称设置存在问题");
        }
        if(ActiveMQType.TOPIC.equalsIgnoreCase(appConfig.getMqType())){
            sendToTopic(appConfig.getMqName(), json);
        }else{
            sendToQueue(appConfig.getMqName(), json);
        }
    }

    private void sendToQueue(String topicName,final String message){
        LOGGER.debug("发送一条消息到指定的队列开始");
        LOGGER.debug("输入发送消息内容：{}",message);
        LOGGER.debug("输入队列名称：{}",topicName);
        LOGGER.info("发送消息：{}，到消息队列：{}",message,topicName);
        queueJmsTemplate.send(topicName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
        LOGGER.debug("发送一条消息到指定的队列结束");
    }

    private void sendToTopic(String topicName,final String message){
        LOGGER.debug("发送一条消息到指定的队列开始");
        LOGGER.debug("输入发送消息内容：{}",message);
        LOGGER.debug("输入队列名称：{}",topicName);
        LOGGER.info("发送消息：{}，到消息队列：{}",message,topicName);
        topicJmsTemplate.send(topicName, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(message);
            }
        });
        LOGGER.debug("发送一条消息到指定的队列结束");
    }

}
