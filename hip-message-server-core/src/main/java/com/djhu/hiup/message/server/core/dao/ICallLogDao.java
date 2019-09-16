package com.djhu.hiup.message.server.core.dao;

import com.djhu.hiup.message.server.core.model.CallLog;

/**
 * 服务调用日志接口
 */
public interface ICallLogDao {

    /**
     * 保存调用信息
     * @param callLog
     * @return
     */
    int insertCallLog(CallLog callLog)throws RuntimeException;


    /**
     * 更新调用信息
     * @param callLog
     * @return
     */
    int updateCallLog(CallLog callLog)throws RuntimeException;
}