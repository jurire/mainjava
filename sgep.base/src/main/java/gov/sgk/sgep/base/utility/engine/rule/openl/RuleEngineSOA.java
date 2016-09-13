package gov.sgk.sgep.base.utility.engine.rule.openl;

import gov.sgk.sgep.base.api.business.engine.IRuleEngine;
import gov.sgk.sgep.base.api.business.engine.RuleContext;

public class RuleEngineSOA implements IRuleEngine {

	@Override
	public <T> T execute(RuleContext<T> context) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ruleEngineName() {
		return this.getClass().getSimpleName();
	}
	
}
