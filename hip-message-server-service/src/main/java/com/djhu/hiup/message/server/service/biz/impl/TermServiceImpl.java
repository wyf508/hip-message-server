package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.ITermDao;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 术语
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.TERM)
public class TermServiceImpl implements IHIPMessageServerService {

    @Resource
    private ITermDao termDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = termDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            throw new DataExistedException();
        }
        return termDao.insertSelective(keyAndXmlValMap);
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = termDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        return termDao.updateBySelective(keyAndXmlValMap);
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        return termDao.selectBySelective(keyAndXmlValMap);
    }
}
