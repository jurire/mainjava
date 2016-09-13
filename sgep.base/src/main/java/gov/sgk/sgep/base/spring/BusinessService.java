package gov.sgk.sgep.base.spring;

/**
 * Bütün iş sınıfları bunu tanımlamak
 * 
 * @author o-mssahin
 * @since 2 Eki 2015
 *
 */
@org.springframework.transaction.annotation.Transactional (readOnly=true)
public @interface BusinessService {

}
