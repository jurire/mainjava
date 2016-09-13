package gov.sgk.sqep.test.base.spring;

import gov.sgk.sgep.base.api.business.engine.OpenLRuleContextImpl;
import gov.sgk.sgep.base.utility.engine.rule.openl.RuleEngineOpenLTablets;

/**
 * Spring context'den bağımsız olarak Openl-tablets testi için
 * @author o-mssahin
 *
 */
public class OpenLTest {

	static interface Simple {
		void hello1(int i);
	}
	
	public static void main1(String[] args) throws Exception {
		RuleEngineOpenLTablets re = new RuleEngineOpenLTablets();
		re.afterPropertiesSet();
		OpenLRuleContextImpl<String> context = new OpenLRuleContextImpl<String>("hello1", "decision-table.xlsx");
		context.addParamType(int.class);
		context.addArgs(12);
		Object result =  re.execute(context);
		System.out.println("Sonuc: " + result);
	}
	
	public static void main(String[] args) throws Exception {
		RuleEngineOpenLTablets re = new RuleEngineOpenLTablets();
		re.afterPropertiesSet();
		OpenLRuleContextImpl<Integer> context = new OpenLRuleContextImpl<Integer>("ceza", "lookup-table.xlsx");
		Sigortali sigortali = new Sigortali();
		sigortali.setKapsam("4A");
		sigortali.setSehir("KONYA");
		context.addParamType(Sigortali.class).addArgs(sigortali);
		Integer result =  re.execute(context);
		org.junit.Assert.assertEquals(new Integer(1), result);
	}

}
