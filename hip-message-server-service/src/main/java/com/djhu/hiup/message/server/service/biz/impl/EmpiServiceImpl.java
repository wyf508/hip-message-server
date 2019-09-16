package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IEmpiDao;
import com.djhu.hiup.message.server.core.model.Patient;
import com.djhu.hiup.message.server.service.common.ServiceName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;

/**
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.EMPI)
public class EmpiServiceImpl {

    private static final Logger LOG = LoggerFactory.getLogger(EmpiServiceImpl.class);

    @Resource
    private IEmpiDao empiDao;

    public int saveOrUpdateEmpi(Patient patient) throws Exception {
        int empiCount = empiDao.getEmpiCount(patient.getEmpi());
        LOG.info("empiCount={},patient.getEmpi={}", empiCount, patient.getEmpi());
        if (empiCount > 0) {
            LOG.info("empiDao.updateSelective EMPI更新");
            return empiDao.updateSelective(patient);
        } else {
            LOG.info("empiDao.insertSelective EMP新增");
            return empiDao.insertSelective(patient);
        }
    }

    public void discardEmpiByEmpiPk(String discardEmpi) {
        empiDao.discardEmpiByEmpiPk(discardEmpi);
    }


}
