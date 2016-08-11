package metacube.testng.webtest;

import metacube.testng.Asserts.MAssert;
import metacube.testng.pages.GoogleSearchPage;
import metacube.testng.properties.Prop;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class TestFileToTestGitCommit extends BaseTest{

	// This is a test file for Git Repository
	String expectedTitle = "Metacube Software";
	
	GoogleSearchPage google;
	
	@BeforeClass
	public void LaunchGoogleSearchPage()
	{
		// Comment to test Git Repository
		google = new GoogleSearchPage(LaunchBrowser().LaunchApplication());
		String url = Prop.GetProperty("Environment.properties", "BaseURL");
	}
	
	@Test
	public void LaunchGoogleSearchUI() {
		google.Search(expectedTitle);
		String actualTitle = driver.getTitle();
		MAssert.assertAreEqual(actualTitle,"B");
		
	}
	
}
