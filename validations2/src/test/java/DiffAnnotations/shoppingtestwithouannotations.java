package DiffAnnotations;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shoppingtestwithouannotations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a"));
		ele.click();
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"autoComplete\"]"));
		ele2.sendKeys("tablets");
		ele2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div")).click();
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[1]/p[1]/a")).click();
		Thread.sleep(10000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button")).click();
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[2]")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/span/a[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[3]/section/article/nav/a[1]")).click();
		
	}

}
