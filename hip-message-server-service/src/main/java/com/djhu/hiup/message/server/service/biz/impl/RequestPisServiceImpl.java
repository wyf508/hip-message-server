package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IPisCheckItemDao;
import com.djhu.hiup.message.server.core.dao.IPisContactPersonDao;
import com.djhu.hiup.message.server.core.dao.IPisDrawingPartsDao;
import com.djhu.hiup.message.server.core.dao.IRequestPisDao;
import com.djhu.hiup.message.server.core.model.RequestPis;
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
 * 申请单——病理
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.REQUEST_PIS)
public class RequestPisServiceImpl implements IHIPMessageServerService {

    @Resource
    private IRequestPisDao requestPisDao;
    @Resource
    private IPisDrawingPartsDao pisDrawingPartsDao;
    @Resource
    private IPisCheckItemDao pisCheckItemDao;
    @Resource
    private IPisContactPersonDao pisContactPersonDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestPisDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            throw new DataExistedException();
        }
        List<Map<String,Object>> reason= HIPMessageMapUtils.getSonMap3(keyAndXmlValMap);
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
        int saveCount=requestPisDao.insertSelective(keyAndXmlValMap);
        BigDecimal requestPisPk= (BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
        if(HIPMessageMapUtils.getSonMap1(keyAndXmlValMap)!=null && !HIPMessageMapUtils.getSonMap1(keyAndXmlValMap).isEmpty()) {
        	List<Map<String,Object>> sonMap2 = HIPMessageMapUtils.getSonMap2(keyAndXmlValMap);
            for(Map<String,Object> itemMap:sonMap2){
                itemMap.put(HIPMessageKeyConstant.REQUEST_PIS_PK,requestPisPk);
                itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//                pisCheckItemDao.insertPisCheckItem(itemMap);
            }
            pisCheckItemDao.insertPisCheckItemList(sonMap2);
        }
		if(HIPMessageMapUtils.getSonMap2(keyAndXmlValMap)!=null && !HIPMessageMapUtils.getSonMap2(keyAndXmlValMap).isEmpty()) {
			List<Map<String,Object>> sonMap2 = HIPMessageMapUtils.getSonMap2(keyAndXmlValMap);
	        for(Map<String,Object> itemMap:sonMap2){
	            itemMap.put(HIPMessageKeyConstant.REQUEST_PIS_PK,requestPisPk);
	            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//	            pisCheckItemDao.insertPisCheckItem(itemMap);
	        }
	        pisCheckItemDao.insertPisCheckItemList(sonMap2);
		}
		if(HIPMessageMapUtils.getSonMap3(keyAndXmlValMap)!=null && !HIPMessageMapUtils.getSonMap3(keyAndXmlValMap).isEmpty()) {
			 List<Map<String,Object>> sonMap3 = HIPMessageMapUtils.getSonMap3(keyAndXmlValMap);
		        for(Map<String,Object> itemMap:sonMap3){
		            itemMap.put(HIPMessageKeyConstant.REQUEST_PIS_PK,requestPisPk);
		            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//		            pisContactPersonDao.insertPisContactPerson(itemMap);
		        }
		        pisContactPersonDao.insertPisContactPersonList(sonMap3);
		}
        return saveCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestPisDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        List<Map<String,Object>> reason= HIPMessageMapUtils.getSonMap3(keyAndXmlValMap);
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
        int updateCount=requestPisDao.updateBySelective(keyAndXmlValMap);
        BigDecimal requestPisPk=requestPisDao.selectPkBySelective(keyAndXmlValMap);
        pisDrawingPartsDao.deleteByRequestPisPk(requestPisPk);
        List<Map<String,Object>> sonMap = HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:sonMap){
            itemMap.put(HIPMessageKeyConstant.REQUEST_PIS_PK,requestPisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            pisDrawingPartsDao.insertPisDrawingParts(itemMap);
        }
        pisDrawingPartsDao.insertPisDrawingPartsList(sonMap);
        pisCheckItemDao.deleteByRequestPisPk(requestPisPk);
        List<Map<String,Object>> sonMap2 = HIPMessageMapUtils.getSonMap2(keyAndXmlValMap);
        for(Map<String,Object> itemMap:sonMap2){
            itemMap.put(HIPMessageKeyConstant.REQUEST_PIS_PK,requestPisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            pisCheckItemDao.insertPisCheckItem(itemMap);
        }
        pisCheckItemDao.insertPisCheckItemList(sonMap2);
        pisContactPersonDao.deleteByRequestPisPk(requestPisPk);
        List<Map<String,Object>> sonMap3 = HIPMessageMapUtils.getSonMap3(keyAndXmlValMap);
        for(Map<String,Object> itemMap:sonMap3){
            itemMap.put(HIPMessageKeyConstant.REQUEST_PIS_PK,requestPisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            pisContactPersonDao.insertPisContactPerson(itemMap);
        }
        pisContactPersonDao.insertPisContactPersonList(sonMap3);
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        List<RequestPis> list=requestPisDao.selectBySelectiveWithC(keyAndXmlValMap);
//        for(RequestPis requestPis:list){
//            requestPis.getPisDrawingPartsList().addAll(pisDrawingPartsDao.selectByRequestPisPk(requestPis.getPk()));
//            requestPis.getPisCheckItemList().addAll(pisCheckItemDao.selectByRequestPisPk(requestPis.getPk()));
//            requestPis.getPisContactPersonList().addAll(pisContactPersonDao.selectByRequestPisPk(requestPis.getPk()));
//        }
        return list;
    }
}