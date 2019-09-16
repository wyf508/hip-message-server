package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 申请单信息_检验申请单_检验项目信息表
 */
public interface ILisInspectionItemDao {

    /**
     * 查询
     * @param requestLisPk
     * @return
     * @throws RuntimeException
     */
    List selectByRequestLisPk(BigDecimal requestLisPk)throws RuntimeException;

    /**
     * 删除
     * @param requestLisPk
     * @return
     * @throws RuntimeException
     */
    int deleteByRequestLisPk(BigDecimal requestLisPk)throws RuntimeException;

    /**
     * 保存
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertLisInspectionItem(Map<String,Object> paramsMap)throws RuntimeException;

	/**
	 * 批量保存
	 * @param mapList
	 * @throws Exception
	 */
	void insertLisInspectionItemList(List<Map<String, Object>> mapList) throws Exception;

}