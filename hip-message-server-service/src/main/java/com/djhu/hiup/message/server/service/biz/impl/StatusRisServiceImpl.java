package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IRisCheckStatusDao;
import com.djhu.hiup.message.server.core.dao.IStatusRisDao;
import com.djhu.hiup.message.server.core.model.StatusRis;
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
 * 状态----检查
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.STATUS_RIS)
public class StatusRisServiceImpl implements IHIPMessageServerService {

    @Resource
    private IStatusRisDao statusRisDao;
    @Resource
    private IRisCheckStatusDao risCheckStatusDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = statusRisDao.selectCountBySelective(keyAndXmlValMap);
        int saveOrUpdateCount=0;
        BigDecimal statusRisPk=null;
        if (count > 0) {
            saveOrUpdateCount=statusRisDao.updateBySelective(keyAndXmlValMap);
            statusRisPk=statusRisDao.selectPkBySelective(keyAndXmlValMap);
            risCheckStatusDao.deleteByStatusRisPk(statusRisPk);
        }else{
            keyAndXmlValMap.put(HIPMessageKeyConstant.SEQ_PK,"");
            saveOrUpdateCount=statusRisDao.insertSelective(keyAndXmlValMap);
            statusRisPk= (BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
        }
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.STATUS_RIS_PK,statusRisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            risCheckStatusDao.insertRisCheckStatus(itemMap);
        }
        
        risCheckStatusDao.insertRisCheckStatusList(mapList);
        return saveOrUpdateCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = statusRisDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        int updateCount=statusRisDao.updateBySelective(keyAndXmlValMap);
        BigDecimal statusRisPk=statusRisDao.selectPkBySelective(keyAndXmlValMap);
        risCheckStatusDao.deleteByStatusRisPk(statusRisPk);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.STATUS_RIS_PK,statusRisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            risCheckStatusDao.insertRisCheckStatus(itemMap);
        }
        
        risCheckStatusDao.insertRisCheckStatusList(mapList);
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        List<StatusRis> list=statusRisDao.selectBySelectiveWithC(keyAndXmlValMap);
//        for(StatusRis statusRis:list){
//            statusRis.getRisCheckStatusList().addAll(risCheckStatusDao.selectByStatusRisPk(statusRis.getPk()));
//        }
        return list;
    }
}
