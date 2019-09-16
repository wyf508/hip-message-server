package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 状态信息-手术状态-检查状态
 */
public interface IOperationCheckStatusDao {

    /**
     *
     * @param statusOperationPk
     * @return
     * @throws RuntimeException
     */
    List selectByStatusOperationPk(BigDecimal statusOperationPk)throws RuntimeException;

    /**
     *
     * @param statusOperationPk
     * @return
     * @throws RuntimeException
     */
    int deleteByStatusOperationPk(BigDecimal statusOperationPk)throws RuntimeException;

    /**
     *
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertOperationCheckStatus(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     *
     * @param mapList
     * @throws RuntimeException
     */
	void insertOperationCheckStatusList(List<Map<String, Object>> mapList)throws RuntimeException;

}