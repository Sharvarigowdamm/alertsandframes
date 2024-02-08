package googleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotTesting {
	@Test
	public void search() throws IOException {
		WebDriver driver=new ChromeDriver();
		   driver.navigate().to("https://www.google.com");
		   WebElement searchbox=driver.findElement(By.name("q"));
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File("google.png"));
	}
   
}
