package gov.sgk.sgep.base.webservice.consumer.emekli4b;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import gov.sgk.sgep.base.webservice.consumer.emekli4b.wsdl.SigortaliAylikDurumSorgula;
import gov.sgk.sgep.base.webservice.consumer.emekli4b.wsdl.SigortaliAylikDurumSorgulaResponse;

public class Emekli4bClient extends WebServiceGatewaySupport 
{
	public SigortaliAylikDurumSorgulaResponse getSigortaliAylikDurum(String sicilNo, Long tcNO) 
	{
		SigortaliAylikDurumSorgula request = new SigortaliAylikDurumSorgula();
		request.setSicilNo(sicilNo);
		request.setTcKimlikNo(tcNO);
		SigortaliAylikDurumSorgulaResponse response = (SigortaliAylikDurumSorgulaResponse) getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback("http://emektar.sgk.intra/EMEKTAR/services/Servisler/wsdl/Servisler.wsdl"));
		return response;
	}
}
