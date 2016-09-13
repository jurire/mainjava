package gov.sgk.sgep.base.webservice.consumer.emekli4c;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl.AylikBilgisi4C;
import gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl.AylikBilgisi4CResponse;
import gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl.ParamsAylikBilgisi4CVO;

public class Emekli4cClient extends WebServiceGatewaySupport 
{
	public AylikBilgisi4CResponse getAylikBilgisi(String kimlikNo, String kullaniciId, String sifre, String sorguIp, String sorgulayan) 
	{
		AylikBilgisi4C request = new AylikBilgisi4C();
		request.setArg0(new ParamsAylikBilgisi4CVO());
		request.getArg0().setKimlikNo(kimlikNo);
		request.getArg0().setKullaniciId(kullaniciId);
		request.getArg0().setSifre(sifre);
		request.getArg0().setSorguIp(sorguIp);
		request.getArg0().setSorgulayanKisi(sorgulayan);

		AylikBilgisi4CResponse response = (AylikBilgisi4CResponse) getWebServiceTemplate().marshalSendAndReceive(request, new SoapActionCallback(
				"http://ws.sgk.intra/WS_Emekli4c/Emekli4cWSService/WEB-INF/wsdl/Emekli4cWSService.wsdl"));
		return response;
	}
}
