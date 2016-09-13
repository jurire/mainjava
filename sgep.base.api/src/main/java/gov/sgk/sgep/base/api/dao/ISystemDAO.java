package gov.sgk.sgep.base.api.dao;

import java.math.BigDecimal;
import java.util.Locale;

import gov.sgk.sgep.base.api.model.prm.Mesaj;
import gov.sgk.sgep.base.api.model.system.Kimlik;

/**
 * 
 * @author o-mssahin
 *
 */
public interface ISystemDAO extends IBaseDAO {

	Mesaj getMesaj (String mesajNo, String modulAdi, Locale locale);
	Kimlik getKimlik(BigDecimal tckn);
	
}
