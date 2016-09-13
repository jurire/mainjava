package sgep.utility;

import org.junit.Assert;
import org.junit.Test;

import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 *
 */
public class TcknVknTest {

	@Test
	public void testTcknValid () {
		Assert.assertTrue(Utility.isTcknValid("25619208104"));
		Assert.assertFalse(Utility.isTcknValid("25619208101"));
	}
	
}
