package DiffAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class shoppingsitewithparameters {
	static WebDriver driver;
	@BeforeTest
	@Parameters({"drivername"})
	public void setdriver(@Optional("chrome")String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("in chrome browser");
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.out.println("in ie browser");
			
		}
		else {
			System.out.println("cannot initialize any driver");
		}
		
		
	}
	@Test
	public void cloe()
	{
		System.out.println("closing");
	}
}
