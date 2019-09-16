package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.IInpatientVisitDiagnosisDao;
import com.djhu.hiup.message.server.core.dao.IVisitInpatientVisitDao;
import com.djhu.hiup.message.server.core.model.VisitInpatientVisit;
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
 * 就诊信息——住院就诊
 * Created by jiangmei on 2018/6/7.
 */
@Component(ServiceName.VISIT_INPATIENT_VISIT)
public class VisitInpatientVisitServiceImpl implements IHIPMessageServerService {

    @Resource
    private IVisitInpatientVisitDao visitInpatientVisitDao;
    @Resource
    private IInpatientVisitDiagnosisDao inpatientVisitDiagnosisDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
//        int count = visitInpatientVisitDao.selectCountBySelective(keyAndXmlValMap);
//        if (count > 0) {
//            throw new DataExistedException();
//        }
        keyAndXmlValMap.put(HIPMessageKeyConstant.SEQ_PK,"");
        int saveCount=visitInpatientVisitDao.insertSelective(keyAndXmlValMap);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        BigDecimal inpatientVisitPk=(BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
        if(mapList!=null && !mapList.isEmpty()) {
        	for(Map<String,Object> itemMap:mapList){
                itemMap.put(HIPMessageKeyConstant.INPATIENT_VISIT_PK,inpatientVisitPk);
                itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//                inpatientVisitDiagnosisDao.insertInpatientVisitDiagnosis(itemMap);
            }
        	inpatientVisitDiagnosisDao.insertInpatientVisitDiagnosisList(mapList);
        }
        return saveCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = visitInpatientVisitDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        int updateCount=visitInpatientVisitDao.updateBySelective(keyAndXmlValMap);
        BigDecimal inpatientVisitPk=visitInpatientVisitDao.selectPkBySelective(keyAndXmlValMap);
        inpatientVisitDiagnosisDao.deleteByInpatientVisitPk(inpatientVisitPk);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.INPATIENT_VISIT_PK,inpatientVisitPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
//            inpatientVisitDiagnosisDao.insertInpatientVisitDiagnosis(itemMap);
        }
        inpatientVisitDiagnosisDao.insertInpatientVisitDiagnosisList(mapList);
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
//        List<VisitInpatientVisit> list=visitInpatientVisitDao.selectBySelective(keyAndXmlValMap);
        
        List<VisitInpatientVisit> list=visitInpatientVisitDao.selectBySelectiveWitchC(keyAndXmlValMap);
//        for(VisitInpatientVisit visitInpatientVisit:list){
//            visitInpatientVisit.getInpatientVisitDiagnosisList().addAll(inpatientVisitDiagnosisDao.selectByInpatientVisitPk(visitInpatientVisit.getPk()));
//        }
        return list;
    }
}
