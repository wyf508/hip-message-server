package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.ILisInspectionItemDao;
import com.djhu.hiup.message.server.core.dao.IRequestLisDao;
import com.djhu.hiup.message.server.core.model.RequestLis;
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
 * 申请单——检验
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.REQUEST_LIS)
public class RequestLisServiceImpl implements IHIPMessageServerService {

    @Resource
    private IRequestLisDao requestLisDao;
    @Resource
    private ILisInspectionItemDao lisInspectionItemDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestLisDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            throw new DataExistedException();
        }
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
        int saveCount=requestLisDao.insertSelective(keyAndXmlValMap);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        BigDecimal requestLisPk=(BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.REQUEST_LIS_PK,requestLisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            lisInspectionItemDao.insertLisInspectionItem(itemMap);
        }
        if(mapList!=null && !mapList.isEmpty()) {
        	lisInspectionItemDao.insertLisInspectionItemList(mapList);
        }
        return saveCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestLisDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        int updateCount=requestLisDao.updateBySelective(keyAndXmlValMap);
        BigDecimal requestLisPk=requestLisDao.selectPkBySelective(keyAndXmlValMap);
        lisInspectionItemDao.deleteByRequestLisPk(requestLisPk);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.REQUEST_LIS_PK,requestLisPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            lisInspectionItemDao.insertLisInspectionItem(itemMap);
        }
        if(mapList!=null && !mapList.isEmpty()) {
        	lisInspectionItemDao.insertLisInspectionItemList(mapList);
        }
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
      //  List<RequestLis> list=requestLisDao.selectBySelective(keyAndXmlValMap);
        List<RequestLis> list=requestLisDao.selectBySelectiveWithLisInspectionItem(keyAndXmlValMap);
//        for(RequestLis requestLis:list){
//            requestLis.getLisInspectionItemList().addAll(lisInspectionItemDao.selectByRequestLisPk(requestLis.getPk()));
//        }
        return list;
    }
}
