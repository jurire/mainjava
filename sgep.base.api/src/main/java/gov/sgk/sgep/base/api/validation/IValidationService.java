package gov.sgk.sgep.base.api.validation;

/**
 * Doğrulama işlemlerinin tanımları
 * 
 * @author o-mssahin
 * @since 5 Eki 2015
 *
 */
public interface IValidationService {

	/**
	 * Veri tabanı kaydı sırasında yapılacak doğrulama
	 * @param entity
	 */
	void validatePrePersistence (Object entity);
	
	boolean isAktif ();
	
}
