package metacube.testng.utiltest;

import metacube.testng.common.Utilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class utilitiesTest {

	
	@Test
	public void GivenTwoUniqueRandomStringsWhenComparedShouldFailedTheTest() {
		
		String expectedTitle =Utilities.getUniqueName("Metacube");
		String actualTitle =Utilities.getUniqueName("Metacube");
			Assert.assertEquals(actualTitle, expectedTitle);
			}
}
