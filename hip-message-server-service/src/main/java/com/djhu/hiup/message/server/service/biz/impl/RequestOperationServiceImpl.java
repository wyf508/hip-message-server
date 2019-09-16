package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IOperationCheckItemDao;
import com.djhu.hiup.message.server.core.dao.IRequestOperationDao;
import com.djhu.hiup.message.server.core.model.RequestOperation;
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
 * 申请单——手术
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.REQUEST_OPERATION)
public class RequestOperationServiceImpl implements IHIPMessageServerService {

    @Resource
    private IRequestOperationDao requestOperationDao;
    @Resource
    private IOperationCheckItemDao operationCheckItemDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestOperationDao.selectCountBySelective(keyAndXmlValMap);
        int saveOrUpdateCount=0;
        BigDecimal requestOperationPk=null;
        List<Map<String,Object>> reason= HIPMessageMapUtils.getSonMap2(keyAndXmlValMap);
        if(reason!=null && !reason.isEmpty()) {
        	reason.forEach(map->{
        		if("DE04.01.119.00".equals(map.get("code"))) {
					keyAndXmlValMap.put("bingshi", map.get("value"));
				}else if("DE04.01.117.00".equals(map.get("code"))) {
					keyAndXmlValMap.put("zhengzhuang", map.get("value"));
				}
        	});
//        	for (Map<String, Object> map : reason) {
//				if("DE04.01.119.00".equals(map.get("code"))) {
//					keyAndXmlValMap.put("bingshi", map.get("value"));
//				}else if("DE04.01.117.00".equals(map.get("code"))) {
//					keyAndXmlValMap.put("zhengzhuang", map.get("value"));
//				}
//			}
        }
        if (count > 0) {
            saveOrUpdateCount=requestOperationDao.updateBySelective(keyAndXmlValMap);
            requestOperationPk=requestOperationDao.selectPkBySelective(keyAndXmlValMap);
            operationCheckItemDao.deleteByRequestOperationPk(requestOperationPk);
        }else{
            keyAndXmlValMap.put(HIPMessageKeyConstant.SEQ_PK,"");
            saveOrUpdateCount=requestOperationDao.insertSelective(keyAndXmlValMap);
            requestOperationPk=(BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
        }
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        if(mapList!=null && !mapList.isEmpty()) {
        	for(Map<String,Object> itemMap:mapList){
                itemMap.put(HIPMessageKeyConstant.REQUEST_OPERATION_PK,requestOperationPk);
                itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//                operationCheckItemDao.insertOperationCheckItem(itemMap);
            }
        	operationCheckItemDao.insertOperationCheckItemBatch(mapList);
        }
        return saveOrUpdateCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestOperationDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        int updateCount=requestOperationDao.updateBySelective(keyAndXmlValMap);
        BigDecimal requestOperationPk=requestOperationDao.selectPkBySelective(keyAndXmlValMap);
        operationCheckItemDao.deleteByRequestOperationPk(requestOperationPk);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.REQUEST_OPERATION_PK,requestOperationPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            operationCheckItemDao.insertOperationCheckItem(itemMap);
        }
        operationCheckItemDao.insertOperationCheckItemBatch(mapList);
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
//        List<RequestOperation> list=requestOperationDao.selectBySelective(keyAndXmlValMap);
        List<RequestOperation> list=requestOperationDao.selectBySelectiveWithoperationCheckItem(keyAndXmlValMap);
//        for(RequestOperation requestOperation:list){
//            requestOperation.getOperationCheckItemList().addAll(operationCheckItemDao.selectByRequestOperationPk(requestOperation.getPk()));
//        }
        return list;
    }
}
