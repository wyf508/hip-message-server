package com.djhu.hiup.message.server.core.dao;

import java.util.List;
import java.util.Map;

/**
 * 人员信息
 */
public interface IPersonnelDao {

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