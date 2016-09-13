package gov.sgk.sgep.base.api.utility.exception;

import java.util.List;

/**
 * Uygulama bazında atılan bütün aykırı durumlar bu arayüzü gerçekleştirmek zorundadır
 * 
 * @author o-mssahin
 * @since 28 Eki 2015
 *
 */
public interface IException {

	/**
	 * 
	 * @return Anlaşılır şekilde hatanın açıklaması
	 */
	String description ();
	
	/**
	 * 
	 * @return Aykırı durumun kodu
	 */
	String code ();
	
	List<Throwable> listCause ();

	/**
	 * Bazı aykırı durumlar ekranda summary görünmesi istenmeyebilir
	 * @return
	 */
	boolean showSummary ();
	
}
