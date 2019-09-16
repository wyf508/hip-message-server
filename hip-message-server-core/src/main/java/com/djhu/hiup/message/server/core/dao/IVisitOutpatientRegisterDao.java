package com.djhu.hiup.message.server.core.dao;

import java.util.List;
import java.util.Map;

/**
 * 就诊信息_门诊挂号信息表
 */
public interface IVisitOutpatientRegisterDao {

    /**
     * 查询记录数量
     * @param paramsMap
     * @return
     */
    int selectCountBySelective(Map<String,Object> paramsMap)throws RuntimeException;

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
    
}