package Onlineshoppingdemotest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlineshopping {
	static WebDriver driver;
public void startDriver()
{
	 driver=new ChromeDriver();
	
	}
public void navigate()
{
	driver.get("https://www.advantageonlineshopping.com/#/");
}
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
public void searchproduct()
{
	WebElement ele=driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
    ele.sendKeys("tablets");
    ele.sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//*[@id=\"16\"]")).click();
}
public void AddToCart()
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");
	driver.findElement(By.xpath("//*[@id=\"productProperties\"]/div[4]/button")).click();
}
public void DeleteFromCard()
{
	driver.findElement(By.xpath("/html/body/header/nav/ul/li[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"product\"]/td[3]/div/div")).click();
}
public void GotohomePage()
{
	driver.findElement(By.xpath("/html/body/div[3]/section/article/nav/a[1]")).click();
}
public void Logout()
{
	System.out.println("Logout happened");
}
public void QuitDriver()
{
	driver.close();
}

}
