package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IVisitOutpatientRegisterDao;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 就诊信息——门诊挂号
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.VISIT_OUTPATIENT_REGISTER)
public class VisitOutpatientRegisterServiceImpl implements IHIPMessageServerService {

    @Resource
    private IVisitOutpatientRegisterDao visitOutpatientRegisterDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = visitOutpatientRegisterDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            throw new DataExistedException();
        }
        return visitOutpatientRegisterDao.insertSelective(keyAndXmlValMap);
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = visitOutpatientRegisterDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        return visitOutpatientRegisterDao.updateBySelective(keyAndXmlValMap);
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        return visitOutpatientRegisterDao.selectBySelective(keyAndXmlValMap);
    }
}
