package gov.sgk.sgep.base.spring.message;

import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;

import gov.sgk.sgep.base.api.business.ISystemService;
import gov.sgk.sgep.base.api.model.prm.Mesaj;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;
import gov.sgk.sgep.utility.Assert;

/**
 * 
 * @author o-mssahin
 *
 */
public class DBBasedMessageSource implements IMessageSource {

	@Autowired
	SystemPropertiesWrapper systemPropertiesWrapper;
	
	@Autowired
	ISystemService systemService;
	
	@Override
	public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
		String result = getMessage(code, args, locale);
		return StringUtils.isEmpty(result) ? defaultMessage : result;
	}

	@Override
	public String getMessage(String code, Object[] args, Locale locale) throws NoSuchMessageException {
		return null;
	}

	@Override
	public String getMessage(MessageSourceResolvable resolvable, Locale locale) throws NoSuchMessageException {		
		return null;
	}

	@Override
	public String getMessage(String code, Object... args) {
		String modulAdi = SpringContextProvider.getSystemPropertiesWrapper().getApplicationId();
		Mesaj mesaj = getMesaj(code, modulAdi, args);
		return mesaj == null ? SpringContextProvider.getLabelSource().getMessage("msg.mesaj.bulunamadi", code) 
				: mesaj.getMesajMetni();		
	}

	@Override
	public Mesaj getMesaj(String code, String modulAdi, Object... args) {
		Assert.notEmpty(code, "code boş olamaz");
		Assert.notEmpty(modulAdi, "modulAdi boş olamaz");
		Mesaj mesaj = systemService.getMessage(code, modulAdi, systemPropertiesWrapper.getDefaultLocale());
		return mesaj == null ? Mesaj.createNotFoundMesaj(SpringContextProvider.getLabelSource().getMessage("msg.mesaj.bulunamadi", code))
				: mesaj;
	}

}
