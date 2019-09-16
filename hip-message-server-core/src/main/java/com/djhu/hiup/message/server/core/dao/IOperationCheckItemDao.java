package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 申请单信息-手术申请单-检查项目
 */
public interface IOperationCheckItemDao {

    /**
     * 查询
     * @param requestOperationPk
     * @return
     * @throws RuntimeException
     */
    List selectByRequestOperationPk(BigDecimal requestOperationPk)throws RuntimeException;

    /**
     * 删除
     * @param requestOperationPk
     * @return
     * @throws RuntimeException
     */
    int deleteByRequestOperationPk(BigDecimal requestOperationPk)throws RuntimeException;

    /**
     * 插入
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertOperationCheckItem(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 插入
     * @param mapList
     * @throws RuntimeException
     */
	void insertOperationCheckItemBatch(List<Map<String, Object>> mapList)throws RuntimeException;

}