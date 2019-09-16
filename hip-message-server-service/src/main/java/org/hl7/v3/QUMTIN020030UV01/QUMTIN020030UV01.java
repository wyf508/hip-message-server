package org.hl7.v3.QUMTIN020030UV01;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.hl7.v3.QUMTIN020030PL.QUMTIN020030PL;


@XmlRootElement(name = "QUMT_IN020030UV01")
public class QUMTIN020030UV01 extends QUMTIN020030PL{

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> xml = new HashMap<String, Object>();
		xml.put("msgId", this.id.get(0).getExtension());
		xml.put("msgCreationTime", this.creationTime.get(0).getValue());
		xml.put("receiveId", this.receiver.get(0).getDevice().get(0).getId().get(0).getExtension());
		xml.put("sendId", this.sender.get(0).getDevice().get(0).getId().get(0).getExtension());
		
		QUMTIN020030PL.ControlActProcess.QueryByParameter.QueryByParameterPayload queryByParameterPayload = this.controlActProcess.get(0).getQueryByParameter().get(0).getQueryByParameterPayload().get(0);
		if(queryByParameterPayload.getActId() != null && !queryByParameterPayload.getActId().isEmpty()) {
			for (QUMTIN020030PL.ControlActProcess.QueryByParameter.QueryByParameterPayload.ActId actId : queryByParameterPayload.getActId()) {
				if("2.16.156.10011.1.24".equals(actId.getValue().get(0).getRoot())) {
					xml.put("requestNo", actId.getValue().get(0).getExtension());
				}else if("2.16.156.10011.1.11".equals(actId.getValue().get(0).getRoot())) {
					xml.put("outpatientNo", actId.getValue().get(0).getExtension());
				}else if("2.16.156.10011.1.12".equals(actId.getValue().get(0).getRoot())) {
					xml.put("inpatientNo", actId.getValue().get(0).getExtension());
				}
			}
		}
		xml.put("requestNo", queryByParameterPayload.actId.get(0).getValue().get(0).getExtension());
		if(queryByParameterPayload.getAuthorId() != null && !queryByParameterPayload.getAuthorId().isEmpty()) {
			xml.put("founderPersonId", queryByParameterPayload.getAuthorId().get(0).getValue().get(0).getExtension());
		}
		if(queryByParameterPayload.getEffectiveTime() != null && !queryByParameterPayload.getEffectiveTime().isEmpty()) {
			xml.put("requestEffectiveTimeLow", queryByParameterPayload.getEffectiveTime().get(0).getValue().get(0).getLow().get(0).getValue());
			xml.put("requestEffectiveTimeHigh", queryByParameterPayload.getEffectiveTime().get(0).getValue().get(0).getHigh().get(0).getValue());
		}
		if(queryByParameterPayload.getPatientId() != null && !queryByParameterPayload.getPatientId().isEmpty()) {
			for (QUMTIN020030PL.ControlActProcess.QueryByParameter.QueryByParameterPayload.PatientId patientId : queryByParameterPayload.getPatientId()) {
				if("2.16.156.10011.1.3".equals(patientId.getValue().get(0).getRoot())) {
					xml.put("identityNo", patientId.getValue().get(0).getExtension());
				}else if("2.16.156.10011.1.15".equals(patientId.getValue().get(0).getRoot())) {
					xml.put("medicareCardNo", patientId.getValue().get(0).getExtension());
				}else if("2.16.156.10011.2.5.1.4".equals(patientId.getValue().get(0).getRoot())) {
					xml.put("patientId", patientId.getValue().get(0).getExtension());
				}
			}
		}
		xml.put("patientId", queryByParameterPayload.patientId.get(0).getValue().get(0).getExtension());
		if(queryByParameterPayload.getStatusCodeParam() != null && !queryByParameterPayload.getStatusCodeParam().isEmpty()) {
			xml.put("statusCode", queryByParameterPayload.getStatusCodeParam().get(0).getValue().get(0).getCode());
		}
		return xml;
	}
}
