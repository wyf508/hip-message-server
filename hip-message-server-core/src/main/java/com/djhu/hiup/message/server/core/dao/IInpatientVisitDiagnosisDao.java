package com.djhu.hiup.message.server.core.dao;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 就诊信息-住院就诊-诊断信息
 */
public interface IInpatientVisitDiagnosisDao {

    /**
     * 查询
     * @param inpatientVisitPk
     * @return
     * @throws RuntimeException
     */
    List selectByInpatientVisitPk(BigDecimal inpatientVisitPk)throws RuntimeException;

    /**
     * 删除
     * @param inpatientVisitPk
     * @return
     * @throws RuntimeException
     */
    int deleteByInpatientVisitPk(BigDecimal inpatientVisitPk)throws RuntimeException;

    /**
     * 保存
     * @param paramsMap
     * @return
     * @throws RuntimeException
     */
    int insertInpatientVisitDiagnosis(Map<String,Object> paramsMap)throws RuntimeException;

    /**
     * 保存
     * @param mapList
     * @return
     * @throws RuntimeException
     */
	void insertInpatientVisitDiagnosisList(List<Map<String, Object>> mapList)throws RuntimeException;

}