package gov.sgk.sgep.base.api.business.engine;

/**
 * 
 * @author o-mssahin
 *
 */
public interface IBusinessRuleEngine {

	/**
	 * T dönen sonuç tipi
	 * @param context
	 * @return
	 */
	<T> T execute (RuleContext<T> context);
	
}
