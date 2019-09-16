package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.djhu.hiup.message.server.core.model.RequestLis;

/**
 * 申请单信息_检验申请单信息表
 */
public interface IRequestLisDao {

    /**
     * 查询记录数量
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int selectCountBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     *
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    BigDecimal selectPkBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 保存信息
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertSelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 更新信息
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int updateBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 查询列表
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    List selectBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 查询列表
     * @param keyAndXmlValMap
     * @return
     * @throws RuntimeException
     */
	List<RequestLis> selectBySelectiveWithLisInspectionItem(Map<String, Object> keyAndXmlValMap)throws RuntimeException;
}