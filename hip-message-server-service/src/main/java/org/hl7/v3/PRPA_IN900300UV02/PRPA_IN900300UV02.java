package org.hl7.v3.PRPA_IN900300UV02;

import org.hl7.v3.PRPAIN900300UV02.PRPAIN900300UV02_QUERY;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PRPA_IN900300UV02")
public class PRPA_IN900300UV02 extends PRPAIN900300UV02_QUERY { //extends PRPAIN900300UV02
	
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> xml = new HashMap<String, Object>();
		xml.put("msgId", this.id.get(0).getExtension());
		xml.put("msgCreationTime", this.creationTime.get(0).getValue());
		xml.put("receiveId", this.receiver.get(0).getDevice().get(0).getId().get(0).getExtension());
		xml.put("sendId", this.sender.get(0).getDevice().get(0).getId().get(0).getExtension());
		PRPAIN900300UV02_QUERY .ControlActProcess.QueryByParameterPayload queryByParameterPayload = this.controlActProcess.get(0).getQueryByParameterPayload().get(0);
		//if(queryByParameterPayload.getCareEventID()!=null && !queryByParameterPayload.getCareEventID().isEmpty()) {
			xml.put("inpatientNo", queryByParameterPayload.getCareEventID().get(0).getValue().get(0).getExtension());
		//}
		if(queryByParameterPayload.getStatusCode() !=null && !queryByParameterPayload.getStatusCode().isEmpty()) {
			xml.put("statusCode", queryByParameterPayload.getStatusCode().get(0).getCode());
		}
		if(queryByParameterPayload.getPatientId()!=null && !queryByParameterPayload.getPatientId().isEmpty()) {
			xml.put("patientId", queryByParameterPayload.getPatientId().get(0).getValue().get(0).getExtension());
		}
		return xml;
	}
}
