package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.djhu.hiup.message.server.core.model.StatusOperation;

/**
 * 状态信息_手术状态信息表
 */
public interface IStatusOperationDao {

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
	List<StatusOperation> selectBySelectivewitchC(Map<String, Object> keyAndXmlValMap)throws RuntimeException;
}