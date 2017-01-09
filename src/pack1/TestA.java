package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA 
{
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\BrowserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void testOne() 
	{
		driver.get("http://www.google.com");
		System.out.println("URL Launched");
	}

	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
}
