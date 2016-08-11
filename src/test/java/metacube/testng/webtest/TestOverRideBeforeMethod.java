package metacube.testng.webtest;

import metacube.testng.Asserts.MAssert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOverRideBeforeMethod extends BaseTest{

	@BeforeMethod
	public void LaunchGoogleSearchPage()
	{
		LaunchBrowser().LaunchApplication("http://metacube.com");
	}

	@Test
	public void GivenApplicationURLWhenSpecifiedInTestClassThenShouldOverRIderURL() {
		String expectedTitle = "Metacube Software";
		String actualTitle = driver.getTitle();
		MAssert.assertAreEqual(actualTitle, expectedTitle);
	}
}
