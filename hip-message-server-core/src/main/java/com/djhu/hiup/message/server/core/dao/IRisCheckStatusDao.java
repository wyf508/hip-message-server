package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 状态信息_检查状态_检查状态信息表
 */
public interface IRisCheckStatusDao {

    int deleteByStatusRisPk(BigDecimal statusRisPk)throws RuntimeException;

    int insertRisCheckStatus(Map<String,Object> paramsMap)throws RuntimeException;

    List selectByStatusRisPk(BigDecimal statusRisPk)throws RuntimeException;

	void insertRisCheckStatusList(List<Map<String, Object>> mapList)throws RuntimeException;


}