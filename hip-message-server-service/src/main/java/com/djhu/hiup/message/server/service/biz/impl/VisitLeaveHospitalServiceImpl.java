package com.djhu.hiup.message.server.service.biz.impl;

import com.djhu.hiup.message.server.core.dao.ILeaveHospitalDiagnosisDao;
import com.djhu.hiup.message.server.core.dao.IVisitLeaveHospitalDao;
import com.djhu.hiup.message.server.core.model.VisitLeaveHospital;
import com.djhu.hiup.message.server.service.biz.IHIPMessageServerService;
import com.djhu.hiup.message.server.service.common.HIPMessageKeyConstant;
import com.djhu.hiup.message.server.service.common.ServiceName;
import com.djhu.hiup.message.server.service.exception.DataExistedException;
import com.djhu.hiup.message.server.service.exception.DataNotExistException;
import com.djhu.hiup.message.server.service.util.HIPMessageMapUtils;
import com.djhu.hiup.message.server.service.webservice.HIPMessageServerWebServiceSoap12Impl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 就诊信息——出院
 *
 * @author jiangmei
 * @date 2018/6/7
 */
@Component(ServiceName.VISIT_LEAVE_HOSPITAL)
public class VisitLeaveHospitalServiceImpl implements IHIPMessageServerService {

    private static final Logger LOG = LoggerFactory.getLogger(VisitLeaveHospitalServiceImpl.class.getName());

    @Resource
    private IVisitLeaveHospitalDao visitLeaveHospitalDao;
    @Resource
    private ILeaveHospitalDiagnosisDao leaveHospitalDiagnosisDao;

    @Override
    public int saveMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = visitLeaveHospitalDao.selectCountBySelective(keyAndXmlValMap);
        if (count > 0) {
            throw new DataExistedException();
        }
        keyAndXmlValMap.put(HIPMessageKeyConstant.SEQ_PK,"");
        int saveCount=visitLeaveHospitalDao.insertSelective(keyAndXmlValMap);
//        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
//        BigDecimal leaveHospitalPk=(BigDecimal) keyAndXmlValMap.get(HIPMessageKeyConstant.SEQ_PK);
//        if (CollectionUtils.isNotEmpty(mapList)) {
//            for (Map<String, Object> itemMap : mapList) {
//                itemMap.put(HIPMessageKeyConstant.LEAVE_HOSPITAL_PK, leaveHospitalPk);
//                itemMap.put(HIPMessageKeyConstant.CREATE_TIME, new Date());
////            leaveHospitalDiagnosisDao.insertLeaveHospitalDiagnosis(itemMap);
//            }
//        }
//        leaveHospitalDiagnosisDao.insertLeaveHospitalDiagnosisList(mapList);
        return saveCount;
    }

    @Override
    public int updateMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
        int count = visitLeaveHospitalDao.selectCountBySelective(keyAndXmlValMap);
        if (count <= 0) {
            throw new DataNotExistException();
        }
        int updateCount=visitLeaveHospitalDao.updateBySelective(keyAndXmlValMap);
        BigDecimal leaveHospitalPk=visitLeaveHospitalDao.selectPkBySelective(keyAndXmlValMap);
        leaveHospitalDiagnosisDao.deleteByLeaveHospitalPk(leaveHospitalPk);
        List<Map<String,Object>> mapList= HIPMessageMapUtils.getSonMap1(keyAndXmlValMap);
        for(Map<String,Object> itemMap:mapList){
            itemMap.put(HIPMessageKeyConstant.LEAVE_HOSPITAL_PK,leaveHospitalPk);
            itemMap.put(HIPMessageKeyConstant.CREATE_TIME,new Date());
            leaveHospitalDiagnosisDao.insertLeaveHospitalDiagnosis(itemMap);
        }
        leaveHospitalDiagnosisDao.insertLeaveHospitalDiagnosisList(mapList);
        return updateCount;
    }

    @Override
    public List selectMessage(Map<String, Object> keyAndXmlValMap) throws Exception{
//        List<VisitLeaveHospital> list=visitLeaveHospitalDao.selectBySelective(keyAndXmlValMap);
//                for(VisitLeaveHospital visitLeaveHospital:list){
//            visitLeaveHospital.getLeaveHospitalDiagnosisList().addAll(leaveHospitalDiagnosisDao.selectByLeaveHospitalPk(visitLeaveHospital.getPk()));
//        }
        return visitLeaveHospitalDao.selectBySelective(keyAndXmlValMap);
    }
}
