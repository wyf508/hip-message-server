package com.djhu.hiup.message.server.core.dao;

import java.util.List;
import java.util.Map;

import com.djhu.hiup.message.server.core.model.VisitOutpatientVisit;

public interface VisitOutpatientVisitDao {
    int deleteByPrimaryKey(Long pk);

    int insert(VisitOutpatientVisit record);

    int insertSelective(Map<String, Object> keyAndXmlValMap);

	int selectCountBySelective(Map<String, Object> keyAndXmlValMap);

	int updateBySelective(Map<String, Object> keyAndXmlValMap);

	List selectBySelective(Map<String, Object> keyAndXmlValMap);
}