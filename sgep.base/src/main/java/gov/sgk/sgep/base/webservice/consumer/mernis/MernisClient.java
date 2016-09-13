package gov.sgk.sgep.base.webservice.consumer.mernis;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;

import javax.xml.namespace.QName;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import gov.sgk.sgep.base.api.model.system.Kimlik;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.KisiBilgisiSonucu;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.NVIKPSWSTest;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.NVIKPSWSTestResponse;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.SGKKPSWSCevap;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.SGKKPSWebServis;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.SGKKPSWebServisSoap;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.TCKimlikNodanKisiBilgisiSorgula;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.TCKimlikNodanKisiBilgisiSorgulaResponse;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulatckimlikno.KisiBilgisi;


public class MernisClient extends WebServiceGatewaySupport {
	
	public NVIKPSWSTestResponse isActive(){
		NVIKPSWSTest request = new NVIKPSWSTest();
		NVIKPSWSTestResponse response = (NVIKPSWSTestResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request, new SoapActionCallback(
						"http://kpsws.sgk.intra/SGKKPSWSv4/SGKKPSWSServer/SGKKPSWS.asmx?wsdl"));
		return response;
	}

	public TCKimlikNodanKisiBilgisiSorgulaResponse getKisiBilgisi(long tcNo, String kulAdi, BigDecimal sifre, String uygulamaBilgisi) {
		TCKimlikNodanKisiBilgisiSorgula request = new TCKimlikNodanKisiBilgisiSorgula();
		request.setTCKimlikNo(tcNo);
		request.setKulAdi(kulAdi);
		request.setSifre(sifre);
		request.setUygUserKulAdi(uygulamaBilgisi);
		TCKimlikNodanKisiBilgisiSorgulaResponse response = (TCKimlikNodanKisiBilgisiSorgulaResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request, new SoapActionCallback(
						"http://kpsws.sgk.intra/SGKKPSWSv4/SGKKPSWSServer/SGKKPSWS.asmx?WSDL"));
		return response;
	}
	
	public void deneme() throws MalformedURLException{
		URL wsdlURL = new URL("http://kpsws.sgk.intra/SGKKPSWSv4/SGKKPSWSServer/SGKKPSWS.asmx?wsdl");
		QName SERVICE_NAME = new QName("http://sgknet/SGKKPSWebServis", "SGKKPSWebServis");
		
		SGKKPSWebServis ss = new SGKKPSWebServis(wsdlURL, SERVICE_NAME);
       SGKKPSWebServisSoap port = ss.getSGKKPSWebServisSoap();
        
        System.out.println("Invoking nvikpswsTest...");
        SGKKPSWSCevap cevap = port.nvikpswsTest();
        System.out.println("nvikpswsTest.result=" + cevap.getMesaj());
		
	}
	
	public Kimlik getKimlik(long tcNo) throws MalformedURLException
	{
		Kimlik kimlik = new Kimlik();
		URL wsdlURL = new URL("http://kpsws.sgk.intra/SGKKPSWSv4/SGKKPSWSServer/SGKKPSWS.asmx?wsdl");
		QName SERVICE_NAME = new QName("http://sgknet/SGKKPSWebServis", "SGKKPSWebServis");
		
		SGKKPSWebServis ss = new SGKKPSWebServis(wsdlURL, SERVICE_NAME);
        SGKKPSWebServisSoap port = ss.getSGKKPSWebServisSoap();
        
        System.out.println("Invoking Tc Kimlik Nodan Kişi Bilgisi Sorgula...");
        // TODO Mernis KPS web servisi bağlantı bilgileri manuel olarak girildi. Bu bilgiler veritabanından çekilecek
        KisiBilgisiSonucu response = port.tcKimlikNodanKisiBilgisiSorgula(tcNo, "Ssksigtescil", new BigDecimal("30296478757667703"), "SSKSigortaliTescilIslemleri");
        if(response != null )
		{
	        KisiBilgisi kisiBilgisi = response.getSorguSonucu().getKisiBilgisi().get(0);
			kimlik.setTcKimlikNo(new BigDecimal(kisiBilgisi.getTCKimlikNo()));
			kimlik.setAdi(kisiBilgisi.getTemelBilgisi().getAd());
			kimlik.setAileSiraNo(new BigDecimal(kisiBilgisi.getKayitYeriBilgisi().getAileSiraNo()));
			kimlik.setAnaAdi(kisiBilgisi.getTemelBilgisi().getAnneAd());
			kimlik.setBabaAdi(kisiBilgisi.getTemelBilgisi().getBabaAd());
			kimlik.setBireySiraNo(new BigDecimal(kisiBilgisi.getKayitYeriBilgisi().getBireySiraNo()));
			kimlik.setCiltNo(new BigDecimal(kisiBilgisi.getKayitYeriBilgisi().getCilt().getKod()));
			kimlik.setCinsiyeti(kisiBilgisi.getTemelBilgisi().getCinsiyet().getAciklama().charAt(0));
			kimlik.setDogumTarihi(new GregorianCalendar(kisiBilgisi.getTemelBilgisi().getDogumTarih().getYil(),
					kisiBilgisi.getTemelBilgisi().getDogumTarih().getAy(),
					kisiBilgisi.getTemelBilgisi().getDogumTarih().getGun()).getTime());
			kimlik.setDogumYeri(kisiBilgisi.getTemelBilgisi().getDogumYer());
			kimlik.setIlKodu(new Integer(kisiBilgisi.getKayitYeriBilgisi().getIl().getKod()).shortValue());
			kimlik.setIlceKodu(new Integer(kisiBilgisi.getKayitYeriBilgisi().getIlce().getKod()).shortValue());
			// TODO Web servisten ilk soyadı diye birşey dönmüyor.
			kimlik.setIlkSoyadi(kisiBilgisi.getTemelBilgisi().getSoyad());
			kimlik.setMahalleKoy(kisiBilgisi.getKayitYeriBilgisi().getCilt().getAciklama());
			kimlik.setMedeniHali(kisiBilgisi.getDurumBilgisi().getMedeniHal().getAciklama().charAt(0));
			kimlik.setSoyadi(kisiBilgisi.getTemelBilgisi().getSoyad());
			// TODO Web servisten Uyruk bilgisi dönmüyor.
			kimlik.setUyrukKodu("TC");
		}

		return kimlik;
	}
}
