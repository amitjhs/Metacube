package metacube.testng.webtest;

import java.util.Properties;

import metacube.testng.enums.LaunchingBrowser;
import metacube.testng.properties.Prop;
import metacube.testng.webdriver.Browser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {

	public  WebDriver driver;
	public GoogleSearch googlePage;
	public Properties envProp;

	public BaseTest LaunchBrowser() {

		envProp = Prop.LoadProperties("Environment.properties");
		String _browser = envProp.getProperty("browser");
		LaunchingBrowser br = LaunchingBrowser.valueOf(_browser);

		switch(br)
		{
		case IE:
			driver = Browser.getWebDriver(LaunchingBrowser.IE);
			break;

		case FireFox:
			driver = Browser.getWebDriver(LaunchingBrowser.FireFox);
			break;

		case Chrome:
			driver = Browser.getWebDriver(LaunchingBrowser.Chrome);
			break;

		}
		return this;
	}

	public WebDriver LaunchApplication() {
		String Url = "http://"+ envProp.getProperty("BaseURL");
				//+"/" + envProp.getProperty("ApplicationURL");
		driver.get(Url);
		return driver;
	}

	public WebDriver LaunchApplication(String Url) {
		driver.get(Url);
		return driver;
	}	


	@AfterSuite
	public void CloseBrowser() {
		driver.close();
		driver.quit();
	}


}

