package com.djhu.hiup.message.server.service.util;

import com.djhu.hiup.message.server.service.common.HIPMessageServerServiceCode;
import org.hl7.v3.GetDocumentStroedInfoRequest.GetDocumentStroedInfoRequest;
import org.hl7.v3.POORIN200901UV.POORIN200901UV;
import org.hl7.v3.PRPAIN201304UV02.PRPAIN201304UV02;
import org.hl7.v3.PRPAIN201305UV02.PRPAIN201305UV02;
import org.hl7.v3.PRPAIN201311UV02.PRPAIN201311UV02;
import org.hl7.v3.PRPAIN201314UV02.PRPAIN201314UV02;
import org.hl7.v3.PRPAIN401001UV02.PRPAIN401001UV02;
import org.hl7.v3.PRPAIN402001UV02.PRPAIN402001UV02;
import org.hl7.v3.PRPAIN402003UV02.PRPAIN402003UV02;
import org.hl7.v3.PRPAIN900300UV02.PRPAIN900300UV02;
import org.hl7.v3.PRPA_IN900300UV02.PRPA_IN900300UV02;
import org.hl7.v3.PRPMIN301010UV01.PRPMIN301010UV01;
import org.hl7.v3.PRPMIN303010UV01.PRPMIN303010UV01;
import org.hl7.v3.PRPMIN306010UV01.PRPMIN306010UV01;
import org.hl7.v3.PRPMIN401030UV01.PRPMIN401030UV01;
import org.hl7.v3.PRPMIN403010UV01.PRPMIN403010UV01;
import org.hl7.v3.PRPMIN406010UV01.PRPMIN406010UV01;
import org.hl7.v3.ProvideAndRegisterDocumentSetRequest.ProvideAndRegisterDocumentSetRequest;
import org.hl7.v3.QUMTIN020030PL.QUMT_IN020030PL2;
import org.hl7.v3.QUMTIN020030UV01.QUMTIN020030UV01;
import org.hl7.v3.RetrieveDocumentSetRequest.RetrieveDocumentSetRequest;

import java.util.HashMap;
import java.util.Map;

public class DocClassUtil {

    private static Map<String, Class> classes = new HashMap<String, Class>();

    static {

        //患者
        classes.put(HIPMessageServerServiceCode.S0001, PRPAIN201311UV02.class);
        classes.put(HIPMessageServerServiceCode.S0002, PRPAIN201314UV02.class);
        classes.put(HIPMessageServerServiceCode.S0003, PRPAIN201304UV02.class);
        classes.put(HIPMessageServerServiceCode.S0004, PRPAIN201305UV02.class);

        //医疗卫生机构
        classes.put(HIPMessageServerServiceCode.S0005, PRPMIN401030UV01.class);
        classes.put(HIPMessageServerServiceCode.S0006, PRPMIN403010UV01.class);
        classes.put(HIPMessageServerServiceCode.S0007, PRPMIN406010UV01.class);

        //医疗卫生人员
        classes.put(HIPMessageServerServiceCode.S0008, PRPMIN301010UV01.class);
        classes.put(HIPMessageServerServiceCode.S0009, PRPMIN303010UV01.class);
        classes.put(HIPMessageServerServiceCode.S0010, PRPMIN306010UV01.class);

        //电子病历
        classes.put(HIPMessageServerServiceCode.S0014, ProvideAndRegisterDocumentSetRequest.class);
        classes.put(HIPMessageServerServiceCode.S0015, RetrieveDocumentSetRequest.class);
        classes.put(HIPMessageServerServiceCode.S0016, GetDocumentStroedInfoRequest.class);

        //住院就诊
        classes.put(HIPMessageServerServiceCode.S0026, PRPAIN402001UV02.class);
        classes.put(HIPMessageServerServiceCode.S0027, PRPAIN402001UV02.class);
        classes.put(HIPMessageServerServiceCode.S0028, PRPA_IN900300UV02.class);

        //出院登记
        classes.put(HIPMessageServerServiceCode.S0032, PRPAIN402003UV02.class);
        classes.put(HIPMessageServerServiceCode.S0033, PRPAIN402003UV02.class);
        classes.put(HIPMessageServerServiceCode.S0034, PRPA_IN900300UV02.class);

        //医嘱
        classes.put(HIPMessageServerServiceCode.S0035, POORIN200901UV.class);
        classes.put(HIPMessageServerServiceCode.S0036, POORIN200901UV.class);
        classes.put(HIPMessageServerServiceCode.S0037, QUMT_IN020030PL2.class);

        //申请单
        classes.put(HIPMessageServerServiceCode.S0041, POORIN200901UV.class);
        classes.put(HIPMessageServerServiceCode.S0042, POORIN200901UV.class);
        classes.put(HIPMessageServerServiceCode.S0043, QUMTIN020030UV01.class);

        //门诊就诊
        classes.put(HIPMessageServerServiceCode.S0082, PRPAIN401001UV02.class);
        classes.put(HIPMessageServerServiceCode.S0083, PRPAIN401001UV02.class);
        classes.put(HIPMessageServerServiceCode.S0084, PRPAIN900300UV02.class);

        //预约信息
//        classes.put(HIPMessageServerServiceCode.S0053, PRPAIN410001UV.class);
//        classes.put(HIPMessageServerServiceCode.S0054, PRPAIN410001UV.class);
//        classes.put(HIPMessageServerServiceCode.S0055, PRPAIN410001UV.class);


    }

    public static Class getClassByType(String requestMsgType) {
        return classes.get(requestMsgType);
    }
}
