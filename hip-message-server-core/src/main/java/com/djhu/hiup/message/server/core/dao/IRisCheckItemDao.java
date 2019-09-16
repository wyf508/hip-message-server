package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 申请单信息_检查申请单_检查项目信息表
 */
public interface IRisCheckItemDao {

    /**
     *
     * @param requestRisPk
     * @return
     * @throws RuntimeException
     */
    List selectByRequestRisPk(BigDecimal requestRisPk)throws RuntimeException;

    /**
     *
     * @param requestRisPk
     * @return
     * @throws RuntimeException
     */
    int deleteByRequestRisPk(BigDecimal requestRisPk)throws RuntimeException;

    /**
     *
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertRisCheckItem(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     *
     * @param mapList
     * @throws RuntimeException
     */
	void insertRisCheckItemList(List<Map<String, Object>> mapList)throws RuntimeException;

}