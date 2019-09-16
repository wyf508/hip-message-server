package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IOperationCheckStatusDao;
import com.djhu.hiup.message.server.core.dao.IStatusOperationDao;
import com.djhu.hiup.message.server.core.model.StatusOperation;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import com.djhu.hiup.message.server.service.util.HIPMessageMapUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 状态——手术
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.STATUS_OPERATION)
public class StatusOperationServiceImpl implements IHIPMessageServerService {

    @Resource
    private IStatusOperationDao statusOperationDao;
    @Resource
    private IOperationCheckStatusDao operationCheckStatusDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int saveOrUpdateCount=0;
        int count = statusOperationDao.selectCountBySelective(keyAndXmlValMap);
        BigDecimal statusOperationPk=null;
        if (count > 0) {
            saveOrUpdateCount=statusOperationDao.updateBySelective(keyAndXmlValMap);
            statusOperationPk=statusOperationDao.selectPkBySelective(keyAndXmlValMap);
            operationCheckStatusDao.deleteByStatusOperationPk(statusOperationPk);
        }else{
            keyAndXmlValMap.put(HIPMessageKeyConstant.SEQ_PK,"");
            saveOrUpdateCount=statusOperationDao.insertSelective(keyAndXmlValMap);
            statusOperationPk= (BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
        }
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.STATUS_OPERATION_PK,statusOperationPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            operationCheckStatusDao.insertOperationCheckStatus(itemMap);
        }
        operationCheckStatusDao.insertOperationCheckStatusList(mapList);
        return saveOrUpdateCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = statusOperationDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        int updateCount=statusOperationDao.updateBySelective(keyAndXmlValMap);
        BigDecimal statusOperationPk=statusOperationDao.selectPkBySelective(keyAndXmlValMap);
        operationCheckStatusDao.deleteByStatusOperationPk(statusOperationPk);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.STATUS_OPERATION_PK,statusOperationPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            operationCheckStatusDao.insertOperationCheckStatus(itemMap);
        }
        operationCheckStatusDao.insertOperationCheckStatusList(mapList);
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        List<StatusOperation> list=statusOperationDao.selectBySelectivewitchC(keyAndXmlValMap);
//        for(StatusOperation statusOperation:list){
//            statusOperation.getOperationCheckStatusList().addAll(operationCheckStatusDao.selectByStatusOperationPk(statusOperation.getPk()));
//        }
        return list;
    }
}
