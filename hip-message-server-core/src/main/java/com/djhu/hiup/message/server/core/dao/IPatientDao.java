package com.djhu.hiup.message.server.core.dao;

import com.djhu.hiup.message.server.core.model.Patient;
import java.util.List;
import java.util.Map;

/**
 * 病人信息
 */
@SuppressWarnings("ALL")
public interface IPatientDao {


    /**
     * 查询记录数量
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int selectCountBySelective(Map<String,Object> paramsMap)throws RuntimeException;


    /**
     * 查询记录数量 merge
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int selectCountBySelectiveMerge(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 保存信息
     * @param patient
     * @return
     * @throws RuntimeException
     */
    int insertSelective(Patient patient)throws RuntimeException;

    /**
     * 更新信息
     * @param patient
     * @return
     * @throws RuntimeException
     */
    int updateBySelective(Patient patient)throws RuntimeException;

    /**
     * 查询列表
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    List selectBySelective(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 查询更新具体值 Update
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    List<Patient> selectBySelectiveForUpdate(Map<String,Object> paramsMap)throws RuntimeException;


    /**
     * 查询更新具体值  Merge
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    List<Patient> selectBySelectiveForMerge(Map<String,Object> paramsMap)throws RuntimeException;


    /**
     * 根据empi列表查询患者信息列表
     * @param empiList
     * @return
     * @throws RuntimeException
     */
    List<Patient> selectPatientByEmpi(List<String> empiList);

    /**
     * empi查询患者数量
     * @param empi
     * @return
     * @throws RuntimeException
     */
    int selectPatientCountByEmpi(String empi);


    /**
     * 根据主键更新EMPI
     * @param tmplUpdatePatient
     * @throws RuntimeException
     */
    int updateEmpiByPk(Patient tmplUpdatePatient)throws RuntimeException;

    /**
     * 查询被合并患者信息
     * @param paramsMap
     * @return
     * @throws RuntimeException
     *
     */
    List<Patient> selectBeMergedPatientByPatientId(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 根据主键废弃该患者信息
     * @param patient
     * @return
     * @throws RuntimeException
     */
    int discardPatientByPk(Patient patient)throws RuntimeException;


}