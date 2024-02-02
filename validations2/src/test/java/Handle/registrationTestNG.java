package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class registrationTestNG {
	WebDriver driver ;
@BeforeClass
public void openbrowser()
{
	 driver = new ChromeDriver();
	}
@Test
public void validateregistrationpage()
{
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	//System.out.println(driver.getTitle());
	String expectedTitle= "Register";
	Assert.assertEquals(driver.getTitle(), expectedTitle);
     WebElement ele= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
	Assert.assertTrue(ele.isEnabled());
	WebElement ele2= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
	Assert.assertTrue(ele2.isDisplayed());
	
	  ele.sendKeys("sharvari"); 
	  String expfstnmae="sharvari";
	  Assert.assertEquals(ele.getAttribute("value"),expfstnmae);
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("gowda");
	  driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("gowda@tcs.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8217714155");
	  JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		SoftAssert so=new SoftAssert();
        WebElement Ele= driver.findElement(By.xpath("//*[@id=\"countries\"]"));
        so.assertNotNull(Ele);
        driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
        so.assertAll();
}
@AfterClass
public void closebrowser()
{
	//driver.quit();
	}

}
