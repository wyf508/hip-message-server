package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IStatusOrderExecDao;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 状态——医嘱
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.STATUS_ORDER_EXEC)
public class StatusOrderExecServiceImpl implements IHIPMessageServerService {

    @Resource
    private IStatusOrderExecDao orderExecDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = orderExecDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            return orderExecDao.updateBySelective(keyAndXmlValMap);
        }
        return orderExecDao.insertSelective(keyAndXmlValMap);
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = orderExecDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        return orderExecDao.updateBySelective(keyAndXmlValMap);
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        return orderExecDao.selectBySelective(keyAndXmlValMap);
    }
}
