package gov.sgk.sgep.base.webservice.consumer.spas;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import gov.sgk.sgep.base.webservice.consumer.spas.wsdl.GetSpasTescilForOnlySicilOrTc;
import gov.sgk.sgep.base.webservice.consumer.spas.wsdl.GetSpasTescilForOnlySicilOrTcResponse;


public class SpasClient extends WebServiceGatewaySupport 
{
	public GetSpasTescilForOnlySicilOrTcResponse getSpasTescil(String tcNo)
	{
		GetSpasTescilForOnlySicilOrTc request = new GetSpasTescilForOnlySicilOrTc();
		request.setTcKimlikNo(tcNo);
		GetSpasTescilForOnlySicilOrTcResponse response = (GetSpasTescilForOnlySicilOrTcResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request, new SoapActionCallback(
						"http://spas.sgk.intra/spasws/services/SpasIslemler/wsdl/SpasIslemler.wsdl"));
		return response;
	}
}
