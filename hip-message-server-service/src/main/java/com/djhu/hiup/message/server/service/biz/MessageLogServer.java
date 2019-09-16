package com.djhu.hiup.message.server.service.biz;

import com.djhulog.api.HiupLogService;
import com.djhulog.entity.LogEntity;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public abstract class MessageLogServer {
	
	private static final Logger log = LoggerFactory.getLogger(MessageLogServer.class);
	
	
	@Value("${server.code}")
	protected String code;

	@Value("${server.appCode}")
	protected String appCode;
	
	protected static final String SENDID = "sendId";
	protected static final String RECEIVEID = "receiveId";
	protected static final String MSGCREATIONTIME = "msgCreationTime";
	protected static final String MSGID = "msgId";
	protected static final String DOOREMERGENCYNO = "doorEmergencyNo";
	protected static final String OUTPATIENTNO = "outpatientNo";
	protected static final String INPATIENTNO = "inpatientNo";
	protected static final String REQUESTNO = "requestNo";
	protected static final String NAME = "name";
	protected static final String HEALTHCARDNUMBER = "healthCardNumber";
	protected static final String PATIENTID = "patientId";
	
	
	@Autowired
	protected HiupLogService hiupLogService;
	
	public void saveLog(LogEntity logEntity) {
//		log.info("save log {}", JSONObject.fromObject(logEntity));
		try {
			hiupLogService.saveAsynchronous(logEntity);
			log.info("save log success!!!");
		} catch (Exception e) {
			log.error("save log error!!!!!",e.getMessage(),e);
		}
	}
}
