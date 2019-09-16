package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IRequestBloodTransfusionDao;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import com.djhu.hiup.message.server.service.util.HIPMessageMapUtils;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 申请单——输血
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.REQUEST_BLOOD_TRANSFUSION)
public class RequestBloodTransfusionServiceImpl implements IHIPMessageServerService {

    @Resource
    private IRequestBloodTransfusionDao requestBloodTransfusionDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestBloodTransfusionDao.selectCountBySelective(keyAndXmlValMap);
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
        return requestBloodTransfusionDao.insertSelective(keyAndXmlValMap);
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = requestBloodTransfusionDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        return requestBloodTransfusionDao.updateBySelective(keyAndXmlValMap);
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        return requestBloodTransfusionDao.selectBySelective(keyAndXmlValMap);
    }
}
