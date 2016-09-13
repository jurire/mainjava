package gov.sgk.sgep.base.webservice.consumer.meyes;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.KullaniciBilgiYetkiGetir;
import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.KullaniciBilgiYetkiGetirResponse;
import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.KullaniciUnite;
import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.KullaniciUniteResponse;

public class MeyesClient extends WebServiceGatewaySupport {

	public KullaniciUniteResponse getKullaniciUnite(String kullaniciKod, String uygulamaKod) {
		KullaniciUnite request = new KullaniciUnite();
		request.setKullaniciKod(kullaniciKod);
		request.setUygulamaKodu(uygulamaKod);
		KullaniciUniteResponse response = (KullaniciUniteResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request, new SoapActionCallback(
						"http://mys.sgk.intra/Ws_Meyes/services/MeyesYetkiUnite/wsdl/MeyesYetkiUnite.wsdl"));
		return response;
	}

	public KullaniciBilgiYetkiGetirResponse getKullaniciBilgiYetki(String kullaniciKod, String uygulamaKod, String ip) {
		KullaniciBilgiYetkiGetir request = new KullaniciBilgiYetkiGetir();
		request.setKullaniciKod(kullaniciKod);
		request.setUygulamaKodu(uygulamaKod);
		request.setUserIp(ip);
		KullaniciBilgiYetkiGetirResponse response = (KullaniciBilgiYetkiGetirResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request, new SoapActionCallback(
						"http://mys.sgk.intra/Ws_Meyes/services/MeyesYetkiUnite/wsdl/MeyesYetkiUnite.wsdl"));
		return response;
	}
}
