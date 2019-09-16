package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IStatusLisDao;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 状态----检验
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.STATUS_LIS)
public class StatusLisServiceImpl implements IHIPMessageServerService {

    @Resource
    private IStatusLisDao statusLisDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = statusLisDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            return statusLisDao.updateBySelective(keyAndXmlValMap);
        }
        return statusLisDao.insertSelective(keyAndXmlValMap);
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = statusLisDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        return statusLisDao.updateBySelective(keyAndXmlValMap);
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        return statusLisDao.selectBySelective(keyAndXmlValMap);
    }
}
