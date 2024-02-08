package googleTest;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgrid {
@Test
public void seleniumGrid() {
	
	ChromeOptions chr=new ChromeOptions();
	DesiredCapabilities caps=new DesiredCapabilities();
	caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	caps.setCapability(chr.CAPABILITY, chr);
	WebDriver driver=null;
	try {
		driver=new RemoteWebDriver(URI.create("http://172.31.14.38:4444").toURL(),caps);
	}
	catch(MalformedURLException e) {
		e.printStackTrace();
	}
	driver.navigate().to("http://www.google.com");
	WebElement search=driver.findElement(By.name("q"));
	System.out.println(search.isEnabled());
	
}
}
