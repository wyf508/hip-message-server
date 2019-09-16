package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.djhu.hiup.message.server.core.model.RequestOperation;

/**
 * 申请单信息_手术申请单信息表
 */
public interface IRequestOperationDao {

    /**
     * 查询记录数量
     * @param paramsMap
     * @return
     */
    int selectCountBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    BigDecimal selectPkBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 保存信息
     * @param paramsMap
     * @return
     */
    int insertSelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 更新信息
     * @param paramsMap
     * @return
     */
    int updateBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 查询列表
     * @param paramsMap
     * @return
     */
    List selectBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    
    /**
     * 查询列表
     * @param paramsMap
     * @return
     */
	List<RequestOperation> selectBySelectiveWithoperationCheckItem(Map<String, Object> keyAndXmlValMap)throws RuntimeException;
}