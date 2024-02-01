package Handle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class widget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebElement widgets=driver.findElement(By.id("autoCompleteMultipleInput"));
		widgets.click();
		widgets.sendKeys("ja");
		widgets.sendKeys(Keys.ARROW_DOWN);
		WebElement options=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"autoCompleteMultipleContainer\"]/div/div[1]")));
		options.click();
		System.out.println(widgets.getAttribute("value"));
		//driver.quit();
	}

}
