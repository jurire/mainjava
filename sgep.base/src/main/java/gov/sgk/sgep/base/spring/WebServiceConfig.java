package gov.sgk.sgep.base.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import gov.sgk.sgep.base.utility.ITransformer;
import gov.sgk.sgep.base.utility.Transformer;
import gov.sgk.sgep.base.webservice.consumer.emekli4a.Emekli4aClient;
import gov.sgk.sgep.base.webservice.consumer.emekli4b.Emekli4bClient;
import gov.sgk.sgep.base.webservice.consumer.emekli4c.Emekli4cClient;
import gov.sgk.sgep.base.webservice.consumer.mernis.MernisClient;
import gov.sgk.sgep.base.webservice.consumer.meyes.MeyesClient;
import gov.sgk.sgep.base.webservice.consumer.spas.SpasClient;

@Configuration
public class WebServiceConfig {
	
	@Bean
    public Jaxb2Marshaller meyesMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("gov.sgk.sgep.base.webservice.consumer.meyes.wsdl");
        return marshaller;
    }
	
	@Bean(name="meyesClient")
    public MeyesClient getMeyesClient(Jaxb2Marshaller meyesMarshaller) {
		MeyesClient meyesClient = new MeyesClient();
        meyesClient.setDefaultUri("http://mys.sgk.intra/Ws_Meyes/services/MeyesYetkiUnite");
        meyesClient.setMarshaller(meyesMarshaller);
        meyesClient.setUnmarshaller(meyesMarshaller);
        return meyesClient;
    }
	
	@Bean
    public Jaxb2Marshaller spasMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("gov.sgk.sgep.base.webservice.consumer.spas.wsdl");
        return marshaller;
    }
	
	@Bean(name="spasClient")
    public SpasClient getSpasClient(Jaxb2Marshaller spasMarshaller) {
        SpasClient spasClient = new SpasClient();
        spasClient.setDefaultUri("http://spas.sgk.intra:80/spasws/services/SpasIslemler");
        spasClient.setMarshaller(spasMarshaller);
        spasClient.setUnmarshaller(spasMarshaller);
        return spasClient;
    }
	
	@Bean
    public Jaxb2Marshaller mernisMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis");
        return marshaller;
    }
	
	@Bean(name = "mernisClient")
    public MernisClient getMernisClient(Jaxb2Marshaller mernisMarshaller) {
        MernisClient mernisClient = new MernisClient();
        mernisClient.setDefaultUri("http://kpsws.sgk.intra/SGKKPSWSv4/");
        mernisClient.setMarshaller(mernisMarshaller);
        mernisClient.setUnmarshaller(mernisMarshaller);
        return mernisClient;
    }
	
	@Bean
    public Jaxb2Marshaller emekli4aMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("gov.sgk.sgep.base.webservice.consumer.emekli4a.wsdl");
        return marshaller;
    }
	
	@Bean(name = "emekli4aClient")
    public Emekli4aClient getEmekli4aClient(Jaxb2Marshaller emekli4aMarshaller) {
		Emekli4aClient emekli4aClient = new Emekli4aClient();
		emekli4aClient.setDefaultUri("http://ws.sgk.intra/Ws_Emeklilik/services/TahnoGoster");
		emekli4aClient.setMarshaller(emekli4aMarshaller);
		emekli4aClient.setUnmarshaller(emekli4aMarshaller);
        return emekli4aClient;
    }
	
	@Bean
	public Jaxb2Marshaller emekli4bMarshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("gov.sgk.sgep.base.webservice.consumer.emekli4b.wsdl");
		return marshaller;		
	}
	
	@Bean(name = "emekli4bClient")
	public Emekli4bClient getEmekli4bClient(Jaxb2Marshaller emekli4bMarshaller){
		Emekli4bClient emekli4bClient = new Emekli4bClient();
		emekli4bClient.setDefaultUri("http://emektar.sgk.intra/EMEKTAR/services/Servisler");
		emekli4bClient.setMarshaller(emekli4bMarshaller);
		emekli4bClient.setUnmarshaller(emekli4bMarshaller);
		return emekli4bClient;
	}
	
	@Bean
	public Jaxb2Marshaller emekli4cMarshaller(){
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl");
		return marshaller;
	}
	
	@Bean(name="emekli4cClient")
	public Emekli4cClient getEmekli4cClient(Jaxb2Marshaller emekli4cMarshaller){
		Emekli4cClient emekli4cClient = new Emekli4cClient();
		emekli4cClient.setDefaultUri("http://ws.sgk.intra/WS_Emekli4c/Emekli4cWSService");
		emekli4cClient.setMarshaller(emekli4cMarshaller);
		emekli4cClient.setUnmarshaller(emekli4cMarshaller);
		return emekli4cClient;
	}
	
	@Bean
	public ITransformer transformer () {
		return new Transformer();
	}

}
