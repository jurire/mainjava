package gov.sgk.sgep.base.spring.message;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import gov.sgk.sgep.base.api.model.prm.Mesaj;
import gov.sgk.sgep.base.api.model.prm.Mesaj.Tip;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;

/**
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
public class FileBaseMessageSource extends ReloadableResourceBundleMessageSource implements IMessageSource {

	@Autowired
	SystemPropertiesWrapper systemPropertiesWrapper;
	
	public FileBaseMessageSource() {
		super();
		setDefaultEncoding("UTF-8");
		setUseCodeAsDefaultMessage(false);
	}
	
	/**
	 * {@link Locale} olarak uygulamanın varsayılan locele'i alınır
	 * @param code
	 * @param args
	 * @return
	 */
	public String getMessage(String code, Object ... args) {
		return getMessage(code, args, getDefaultLocale());
	}
	

	public Locale getDefaultLocale () {
		return systemPropertiesWrapper.getDefaultLocale();
	}

	@Override
	public Mesaj getMesaj(String code, String modulAdi, Object... args) {
		String content = getMessage(code, args);
		Mesaj result = new Mesaj();
		result.setMesajMetni(content);
		result.setKisaAciklama(content);
		result.setMesajTipi(Tip.INFO.getSymbol());
		return result;
	}

	
}
