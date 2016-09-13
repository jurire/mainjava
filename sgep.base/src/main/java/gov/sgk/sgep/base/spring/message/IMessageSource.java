package gov.sgk.sgep.base.spring.message;

import org.springframework.context.MessageSource;

import gov.sgk.sgep.base.api.model.prm.Mesaj;

/**
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
public interface IMessageSource extends MessageSource {
	
	String getMessage(String code, Object ... args);
	
	/**
	 * 
	 * @param code
	 * @param modulAdi
	 * @param args
	 * @return null eğer mesaj bulunamazsa
	 */
	Mesaj getMesaj(String code, String modulAdi, Object ... args);
	
}
