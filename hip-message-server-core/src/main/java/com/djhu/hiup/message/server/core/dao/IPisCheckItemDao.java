package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 申请单信息_病理申请单_检查项目信息表
 */
public interface IPisCheckItemDao {

    /**
     * 查询
     * @param requestPisPk
     * @return
     * @throws RuntimeException
     */
    List selectByRequestPisPk(BigDecimal requestPisPk)throws RuntimeException;

    /**
     * 删除
     * @param requestPisPk
     * @return
     * @throws RuntimeException
     */
    int deleteByRequestPisPk(BigDecimal requestPisPk)throws RuntimeException;

    /**
     * 插入
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertPisCheckItem(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 插入
     * @param sonMap
     * @throws RuntimeException
     */
	void insertPisCheckItemList(List<Map<String, Object>> sonMap)throws RuntimeException;

}