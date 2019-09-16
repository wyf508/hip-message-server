package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 就诊信息-出院就诊-诊断信息
 */
public interface ILeaveHospitalDiagnosisDao {

    /**
     * 查询
     * @param leaveHospitalPk
     * @return
     * @throws RuntimeException
     */
    List selectByLeaveHospitalPk(BigDecimal leaveHospitalPk)throws RuntimeException;

    /**
     * 删除
     * @param leaveHospitalPk
     * @return
     * @throws RuntimeException
     */
    int deleteByLeaveHospitalPk(BigDecimal leaveHospitalPk)throws RuntimeException;

    /**
     * 保存
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertLeaveHospitalDiagnosis(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 保存
     * @param mapList
     * @return
     * @throws RuntimeException
     */
	void insertLeaveHospitalDiagnosisList(List<Map<String, Object>> mapList)throws RuntimeException;

}