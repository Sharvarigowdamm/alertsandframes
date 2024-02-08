package googleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilities.ScreenshotTesting2;
//this method just calls the store screenshot in folder method
public class screenshotAndStoreinaFolder {
	@Test
	public void storess() {
	WebDriver driver=new ChromeDriver();
	   driver.navigate().to("https://www.google.com");
	   WebElement searchbox=driver.findElement(By.name("q"));
	   ScreenshotTesting2.captureScreenshot(driver,"searchbox");
}
}