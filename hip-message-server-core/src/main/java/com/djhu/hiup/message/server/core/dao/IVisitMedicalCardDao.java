package com.djhu.hiup.message.server.core.dao;

import java.util.List;
import java.util.Map;

/**
 * 就诊信息_就诊卡信息表
 */
public interface IVisitMedicalCardDao {

    /**
     * 查询记录数量
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int selectCountBySelective(Map<String,Object> paramsMap)throws RuntimeException;

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
}