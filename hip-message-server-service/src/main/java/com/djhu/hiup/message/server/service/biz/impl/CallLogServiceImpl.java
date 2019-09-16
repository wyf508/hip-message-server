package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.ICallLogDao;
import com.djhu.hiup.message.server.core.model.CallLog;
import com.djhu.hiup.message.server.core.model.SystemDir;
import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;
import com.djhu.hiup.message.server.service.common.HIPMessageServerServiceCode;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.util.FileUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * Created by jiangmei on 2018/6/22.
 */
@Component(ServiceName.CALL_LOG)
public class CallLogServiceImpl {
	
	private static final Logger LOG = LoggerFactory.getLogger(CallLogServiceImpl.class);

    @Resource
    private ICallLogDao callLogDao;
    @Resource
    private SystemDirServiceImpl systemDirService;


    private void insertCallLog(CallLog callLog)throws RuntimeException{
        callLogDao.insertCallLog(callLog);
    }

    public void updateCallLog(CallLog callLog,String responseCode,String responseMsg)throws RuntimeException{
        if(callLog == null) {
            return ;
        }
    	callLog.setUpdateDate(new Date());
        callLog.setResponseCode(responseCode);
        callLog.setResponseMsg(responseMsg);
        callLogDao.updateCallLog(callLog);
    }
    
    
    public CallLog insertCallLog(Map<String,Object> tmplKeyAndXmlValMap,String serviceCode,String msg,String responseCode,String responseMsg)throws Exception{

        long st = System.currentTimeMillis();
        CallLog callLog=new CallLog();
        callLog.setCreateDate(new Date());
        callLog.setSenderId((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.SENDER_ID));
        callLog.setReceiverId((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.RECEIVER_ID));
        callLog.setMsgId((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.MSG_ID));
        callLog.setMsgCreateDate((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.MSG_CREATE_TIME));
        SystemDir systemDir=systemDirService.getOneSystemDir();

        String dirPath=systemDir.getDirPath();
        String filePath= FileUtils.getFileItemPathNew(dirPath, callLog.getMsgId(), serviceCode,tmplKeyAndXmlValMap);
        FileUtils.write(filePath, msg);
        callLog.setMsgPath(filePath.replace(dirPath,""));

        callLog.setSystemDirPk(systemDir.getPk());
        callLog.setServiceCode(serviceCode);
        callLog.setServiceComment(HIPMessageServerServiceCode.getCodeAndServiceMap().get(serviceCode).getComment());
        callLog.setUpdateDate(new Date());
        callLog.setResponseCode(responseCode);
        callLog.setResponseMsg(responseMsg);
        insertCallLog(callLog);
        LOG.info("thread {} - insertCallLog总耗时：{}毫秒",Thread.currentThread().getName(),System.currentTimeMillis()-st);
        return callLog;
    }
    


    public CallLog insertCallLog(Map<String,Object> tmplKeyAndXmlValMap,String serviceCode,String msg)throws Exception{
    	long st = System.currentTimeMillis();
        CallLog callLog=new CallLog();
        callLog.setCreateDate(new Date());
        callLog.setSenderId((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.SENDER_ID));
        callLog.setReceiverId((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.RECEIVER_ID));
        callLog.setMsgId((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.MSG_ID));
        callLog.setMsgCreateDate((String) tmplKeyAndXmlValMap.get(HIPMessageKeyConstant.MSG_CREATE_TIME));
        SystemDir systemDir=systemDirService.getOneSystemDir();
        String dirPath=systemDir.getDirPath();
        String filePath= FileUtils.getFileItemPathNew(dirPath, callLog.getMsgId(), serviceCode,tmplKeyAndXmlValMap);
        FileUtils.write(filePath, msg);
        callLog.setSystemDirPk(systemDir.getPk());
        callLog.setMsgPath(filePath.replace(dirPath,""));
        callLog.setServiceCode(serviceCode);
        callLog.setServiceComment(HIPMessageServerServiceCode.getCodeAndServiceMap().get(serviceCode).getComment());
        insertCallLog(callLog);
        LOG.info("thread {} - insertCallLog总耗时：{}毫秒",Thread.currentThread().getName(),System.currentTimeMillis()-st);
        return callLog;
    }


}
