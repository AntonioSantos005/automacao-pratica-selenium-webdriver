package stepsFuncional;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Web;

public class Hooks {
	WebDriver driver = new ChromeDriver();
	
//	@Before
//	public void setUp() {
//		driver = Web.createChrome();	
//	}
	
	@After
	public void tearDown() {
		Web.driver.quit();
	}

}
