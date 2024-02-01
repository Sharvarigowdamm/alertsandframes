package Handle;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HYRdemoWindowPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> childs = driver.getWindowHandles();
		System.out.println(parent);
		for(String child:childs) {
			if(!child.equals(parent)) {
				Alert alert=driver.switchTo().alert();
				driver.switchTo().window(child);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
				driver.findElement(By.id("alertBox")).click();
				System.out.println(alert.getText());
				alert.accept();
				driver.findElement(By.id("confirmBox")).click();
				driver.findElement(By.id("alertBox")).click();
				System.out.println(alert.getText());
				alert.accept();
				
				driver.findElement(By.id("promptBox")).click();
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				Alert alert2=wait.until(ExpectedConditions.alertIsPresent());
				alert2.sendKeys("Sharvari");
				alert2.accept();
			}
			
		}

	}

}
