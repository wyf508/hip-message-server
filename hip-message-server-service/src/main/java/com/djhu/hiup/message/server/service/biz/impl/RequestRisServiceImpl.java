package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IRequestRisDao;
import com.djhu.hiup.message.server.core.dao.IRisCheckItemDao;
import com.djhu.hiup.message.server.core.model.RequestRis;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import com.djhu.hiup.message.server.service.util.HIPMessageMapUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 申请单——检查
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.REQUEST_RIS)
public class RequestRisServiceImpl implements IHIPMessageServerService {

    @Resource
    private IRequestRisDao requestRisDao;
    @Resource
    private IRisCheckItemDao risCheckItemDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
//        int count = requestRisDao.selectCountBySelective(keyAndXmlValMap);
//        if (count > 0) {
//            throw new DataExistedException();
//        }
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
        keyAndXmlValMap.put(HIPMessageKeyConstant.SEQ_PK,"");
        int saveCount=requestRisDao.insertSelective(keyAndXmlValMap);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap2(keyAndXmlValMap);
        BigDecimal requestRisPk=(BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
        if(mapList!=null && !mapList.isEmpty()) {
        	for(Map<String,Object> itemMap:mapList){
                itemMap.put(HIPMessageKeyConstant.REQUEST_RIS_PK,requestRisPk);
                itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//                risCheckItemDao.insertRisCheckItem(itemMap);
            }
        	risCheckItemDao.insertRisCheckItemList(mapList);
        }
        return saveCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestRisDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        int updateCount=requestRisDao.updateBySelective(keyAndXmlValMap);
        BigDecimal requestRisPk=requestRisDao.selectPkBySelective(keyAndXmlValMap);
        risCheckItemDao.deleteByRequestRisPk(requestRisPk);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.REQUEST_RIS_PK,requestRisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            risCheckItemDao.insertRisCheckItem(itemMap);
        }
        risCheckItemDao.insertRisCheckItemList(mapList);
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        List<RequestRis> list=requestRisDao.selectBySelective(keyAndXmlValMap);
//        List<RequestRis> list=requestRisDao.selectBySelectiveWithC(keyAndXmlValMap);
//        for(RequestRis requestRis:list){
//            requestRis.getRisCheckItemList().addAll(risCheckItemDao.selectByRequestRisPk(requestRis.getPk()));
//        }
        return list;
    }
}
