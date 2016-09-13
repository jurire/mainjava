package gov.sgk.sqep.test.base.spring.beans;

/**
 * 
 * @author o-mssahin
 * @since 14 Eki 2015
 *
 */
public interface ITestServiceForCache {

	String getPojoCachable (String id);
	
	String getPojoNotCachable (String id);

	
}
