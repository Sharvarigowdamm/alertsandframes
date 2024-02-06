package DiffAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class onlineshopping {
	
	static WebDriver driver;
	@BeforeTest
public void startDriver()
{
		System.out.println("driver started");
	 driver=new ChromeDriver();
	
	}
	@Test(priority=0)
public void navigate()
{
		System.out.println("navigated to url");
	driver.get("https://www.advantageonlineshopping.com/#/");
	driver.manage().window().maximize();
}
	@Test(priority=1)
public void login()
{
	System.out.println("login successfull");
	/*
	 * driver.findElement(By.xpath("//*[@id=\"hrefUserIcon\"]")).click();
	 * driver.findElement(By.xpath(
	 * "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")).
	 * sendKeys("sharvari"); driver.findElement(By.xpath(
	 * "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")).
	 * sendKeys("sharvari");
	 */
	 
}
	@Test(priority=2)
public void searchproduct() throws InterruptedException
{
		System.out.println("searching the product");
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a"));
		ele.click();
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"autoComplete\"]"));
		ele2.sendKeys("tablets");
		ele2.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div")).click();
		Thread.sleep(10000);
}
	@Test(priority=3)
public void AddToCart() throws InterruptedException
{
		System.out.println("item is added");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"searchPage\"]/div[3]/div/div/div[2]/ul/li[1]/p[1]/a")).click();
		Thread.sleep(10000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button")).click();
		driver.findElement(By.xpath("/html/body/header/nav/ul/li[2]")).click();
		Thread.sleep(10000);
}
	@Test(priority=4)
public void DeleteFromCard() throws InterruptedException
{
		System.out.println("item is removed");
		driver.findElement(By.xpath("//*[@id=\"shoppingCart\"]/table/tbody/tr/td[6]/span/a[3]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[3]/section/article/nav/a[1]")).click();
}
	@Test(priority=5)
public void GotohomePage() throws InterruptedException
{
		System.out.println("clicking home page");
		Thread.sleep(10000);
		driver.findElement(By.xpath("/html/body/div[3]/section/article/nav/a[1]")).click();
}
	@Test(priority=6)
public void Logout()
{
	System.out.println("Logout happened");
}
	@AfterTest
public void QuitDriver()
{
		System.out.println("driver is closed");
	driver.close();
}

}
