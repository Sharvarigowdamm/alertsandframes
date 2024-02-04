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

public class registrationTestNGhardassert {
	WebDriver driver;

	@BeforeClass
	public void openbrowser() {
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void validatefstnamepage() {
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		// System.out.println(driver.getTitle());
		String expectedTitle = "Register";
		Assert.assertEquals(driver.getTitle(), expectedTitle);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		Assert.assertTrue(ele.isEnabled());
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		Assert.assertTrue(ele2.isDisplayed());
		ele.sendKeys("sharvari");
		String expfstnmae = "sharvari";
		Assert.assertEquals(ele.getAttribute("value"), expfstnmae);

		
	}
	@Test(priority = 2)
	public void FillAllDetails() {
		
		System.out.println("2nd method");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("gowda");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("gowda@tcs.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8217714155");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();

		driver.findElement(By.xpath("//*[@id=\"countries\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("aus");
		try {
			WebElement Ele = driver.findElement(By.xpath("select2-country-container"));
			Ele.click();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			System.out.println("Xpath not found");
			Assert.assertTrue(false);
		}
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		System.out.println("clicked submit button");

		
	}

	@AfterClass
	public void closebrowser() {
		driver.quit();
	}

}
