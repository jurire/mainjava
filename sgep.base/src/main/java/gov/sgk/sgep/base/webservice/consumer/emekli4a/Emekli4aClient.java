package gov.sgk.sgep.base.webservice.consumer.emekli4a;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import gov.sgk.sgep.base.webservice.consumer.emekli4a.wsdl.TahnoGetir;
import gov.sgk.sgep.base.webservice.consumer.emekli4a.wsdl.TahnoGetirResponse;

public class Emekli4aClient extends WebServiceGatewaySupport 
{
	public TahnoGetirResponse getTahnoGetir(String tcNo, String userid, String password) 
	{
		TahnoGetir request = new TahnoGetir();
		request.setTcKimlikNo(tcNo);
		request.setPassword(password);
		request.setUserid(userid);

		TahnoGetirResponse response = (TahnoGetirResponse) getWebServiceTemplate().marshalSendAndReceive(request,
				new SoapActionCallback(
						"http://ws.sgk.intra/Ws_Emeklilik/services/TahnoGoster/wsdl/TahnoGoster.wsdl"));
		return response;
	}
}
