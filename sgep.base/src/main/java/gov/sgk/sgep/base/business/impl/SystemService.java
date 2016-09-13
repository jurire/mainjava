package gov.sgk.sgep.base.business.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.business.ISystemService;
import gov.sgk.sgep.base.api.dao.ISystemDAO;
import gov.sgk.sgep.base.api.model.prm.Mesaj;
import gov.sgk.sgep.base.api.model.prm.Mesaj.Tip;
import gov.sgk.sgep.base.api.model.system.Kimlik;
import gov.sgk.sgep.base.business.BaseService;
import gov.sgk.sgep.base.spring.BusinessService;
import gov.sgk.sgep.base.spring.WebServiceConfig;
import gov.sgk.sgep.base.utility.ITransformer;
import gov.sgk.sgep.base.webservice.consumer.mernis.MernisClient;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.KisiBilgisiSonucu;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.TCKimlikNodanKisiBilgisiSorgulaResponse;

/**
 * Sistemle ilgili bütün veri tabanı işlemleri bu sınıfta yürütülmektedir.
 * 
 * @author o-mssahin
 * @since 20 Eki 2015
 *
 */
@BusinessService
@org.springframework.transaction.annotation.Transactional (readOnly=true)
@Service ("systemService")
public class SystemService extends BaseService implements ISystemService {

	@Autowired
	ISystemDAO systemDAO;
	
	/**
	 * {@link WebServiceConfig} context'e eklenmeyebilir o yüzden required=false yapıldı
	 */
	@Autowired (required=false)
	MernisClient mernisClient;
	
	/**
	 * {@link WebServiceConfig} context'e eklenmeyebilir o yüzden required=false yapıldı
	 */
	@Autowired (required=false)
	ITransformer transformer;
	
	@Override
	protected ISystemDAO getDAO() {
		return systemDAO;
	}

	@Override
	public Mesaj getMessage(String mesajNo, String modulAdi, Locale locale) {		
		return systemDAO.getMesaj(mesajNo, modulAdi, locale);
	}

	@Override
	public List<Mesaj> listMessage(Tip mesajTipi, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kimlik getKimlik(BigDecimal tckn) {
		Kimlik result = systemDAO.getKimlik(tckn);
		if(result == null )
		{
			TCKimlikNodanKisiBilgisiSorgulaResponse response = mernisClient.getKisiBilgisi(tckn.longValue(), null, null, null);
			KisiBilgisiSonucu kisibilgisiResult = response.getTCKimlikNodanKisiBilgisiSorgulaResult();
			result = transformer.transformKimlik(kisibilgisiResult);
		}
		return result;
	}
	/*
	@Override
	public IsyeriBilgileri getIsyeri(BigDecimal sicilNo)
	{
		IsyeriBilgileri result;
		SicilNodanIsyeriBilgisiSorgulaResponse response = mernisClient.getIsyeriBilgisi(sicilNo.longValue(), null, null, null);
		IsyeriBilgisiSonucu isyeriBilgisiResult = response.getSicilNodanIsyeriBilgisiSorgulaResult();
		result = transformer.transformIsyeri(isyeriBilgisiResult);
	}
*/
}
