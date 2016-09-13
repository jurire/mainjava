package gov.sgk.sgep.base.api.business.engine;

/**
 * Openl-tablets için arayüz. OpenL-tablets 
 * @author o-mssahin
 * @since
 */
public interface OpenLRuleContext<T> extends RuleContext<T> {

	String getMethodName();

	Class<?>[] getParameterTypes();

	Object[] getArgs();

}
