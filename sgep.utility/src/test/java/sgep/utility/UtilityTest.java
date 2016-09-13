package sgep.utility;

import org.junit.Assert;
import org.junit.Test;

import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 *
 */
public class UtilityTest {

	@Test
	public void testToBoolean () {
		Assert.assertTrue(Utility.toBoolean(null) == false);
		Assert.assertTrue(Utility.toBoolean("TrUE") == true);
		Assert.assertTrue(Utility.toBoolean("False") == false);
		Assert.assertTrue(Utility.toBoolean("true") == true);
		Assert.assertTrue(Utility.toBoolean("false") == false);
		Assert.assertTrue(Utility.toBoolean("") == false);
	}
	
}
