package Handle;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class registrationpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("sharvari");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("gowda");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("banglore");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("gowda@tcs.com");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("8217714155");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"checkbox3\"]")).click();
         
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//*[@id=\"countries\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
	
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("aus");
		
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		  WebElement
		  options=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		  "select2-country-container")));
		  options.click();
		 
		
		//driver.findElement(By.id("select2-country-container")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submitbtn\"]")).click();
		driver.close();

	}

}
