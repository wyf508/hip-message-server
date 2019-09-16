package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 申请单信息_病理申请单-联系人信息表
 */
public interface IPisContactPersonDao {

    List selectByRequestPisPk(BigDecimal requestPisPk)throws RuntimeException;

    int deleteByRequestPisPk(BigDecimal requestPisPk)throws RuntimeException;

    int insertPisContactPerson(Map<String,Object> paramsMap)throws RuntimeException;

	void insertPisContactPersonList(List<Map<String, Object>> sonMap)throws RuntimeException;
}