package gov.sgk.sgep.base.business.impl.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gov.sgk.sgep.base.api.business.engine.IBusinessRuleEngine;
import gov.sgk.sgep.base.api.business.engine.IRuleEngine;
import gov.sgk.sgep.base.api.business.engine.RuleContext;
import gov.sgk.sgep.utility.Assert;

/**
 * {@link BusinessRuleEngine} rule engine gerçekleştirimi olan kütüphaneye soyutlama yapar. Arka tarafta drools, openl tablets vb. kural motorları olabilir.
 * Bunlardan bağımsız olarak {@link IBusinessRuleEngine} bean olarak kullanılmalıdır.
 * @author o-mssahin
 *
 */
@Service ("businessRuleEngine")
public class BusinessRuleEngine implements IBusinessRuleEngine {

	private static final Logger LOGGER = LoggerFactory.getLogger(BusinessRuleEngine.class);
	
	@Autowired(required=false)
	IRuleEngine ruleEngineDelegate;
	
	@Override
	public <T> T execute(RuleContext<T> context) {
		Assert.notNull(context, "Context null olamaz");
		Assert.notNull(ruleEngineDelegate, "RuleEngine autowired edilmedi. IRuleEngine arayüzünden türeyen herhangi bir sınıfı bean olarak spring context'e eklmelisiniz. ");
		LOGGER.info("Delegating execution to {}, context: {}", ruleEngineDelegate.ruleEngineName(), context);
		return ruleEngineDelegate.execute(context);
	}

}
