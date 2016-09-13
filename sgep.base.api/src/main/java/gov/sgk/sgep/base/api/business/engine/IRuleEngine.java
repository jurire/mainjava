package gov.sgk.sgep.base.api.business.engine;

/**
 * Bu arayüz asıl kural motoru işini atadığımız bean'lere verilmesi gerekir
 * @author o-mssahin
 *
 */
public interface IRuleEngine extends IBusinessRuleEngine {

	/**
	 * 
	 * @return Projede kullanılan kural motoruna mantıklı bir isim, loglama için kullanılacaktır.
	 */
	String ruleEngineName ();
	
}
