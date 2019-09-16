package com.djhu.hiup.message.server.service.biz.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.djhu.hiup.message.server.core.dao.VisitOutpatientVisitDao;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;

/**
 * @author PC
 *
 */
@Component(ServiceName.VISIT_OUTPATIENT_VISIT)
public class VisitOutpatientVisitServiceImpl implements IHIPMessageServerService{
	
	@Autowired
	private VisitOutpatientVisitDao visitOutpatientVisitDao;
	
	public VisitOutpatientVisitDao getVisitOutpatientVisitDao() {
		return visitOutpatientVisitDao;
	}

	public void setVisitOutpatientVisitDao(VisitOutpatientVisitDao visitOutpatientVisitDao) {
		this.visitOutpatientVisitDao = visitOutpatientVisitDao;
	}

	@Override
	public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
		int count = visitOutpatientVisitDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            throw new DataExistedException();
        }
        return visitOutpatientVisitDao.insertSelective(keyAndXmlValMap);
	}
	
	@Override
	public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
		int count = visitOutpatientVisitDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        return visitOutpatientVisitDao.updateBySelective(keyAndXmlValMap);
	}

	@Override
	public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception {
		return visitOutpatientVisitDao.selectBySelective(keyAndXmlValMap);
	}

}
