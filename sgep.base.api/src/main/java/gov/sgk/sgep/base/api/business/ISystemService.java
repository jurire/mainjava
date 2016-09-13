package gov.sgk.sgep.base.api.business;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

import gov.sgk.sgep.base.api.model.prm.Mesaj;
import gov.sgk.sgep.base.api.model.prm.Mesaj.Tip;
import gov.sgk.sgep.base.api.model.system.Kimlik;

/**
 * Sistemle ilgili modellerin davranışlarını gösterir. Mesaj listele vb.
 * 
 * @author o-mssahin
 * @since 20 Eki 2015
 *
 */
public interface ISystemService extends IBaseService {

	List<Mesaj> listMessage(Tip mesajTipi, Locale locale);
	
	Mesaj getMessage(String mesajNo, String modulAdi, Locale locale);

	Kimlik getKimlik(BigDecimal tckn);
	
	//IsyeriBilgileri getIsyeri(BigDecimal sicilNo);
	
	
}
