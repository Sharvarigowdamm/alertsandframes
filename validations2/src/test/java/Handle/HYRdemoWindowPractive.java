package Handle;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HYRdemoWindowPractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> childs = driver.getWindowHandles();
		System.out.println(parent);
		for(String child:childs)
		{
			if(!child.equals(parent))
			{
				System.out.println(child);
				driver.switchTo().window(child);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,350)", "");
				driver.findElement(By.id("firstName")).sendKeys("sharvari");
				driver.findElement(By.id("lastName")).sendKeys("gowda");
				driver.findElement(By.id("femalerb")).click();
				driver.findElement(By.id("englishchbx")).click();
				driver.findElement(By.id("frenchchbx")).click();
				driver.findElement(By.id("email")).sendKeys("sharvari.mm@tcs.com");
				driver.findElement(By.id("password")).sendKeys("password");
				driver.findElement(By.id("registerbtn")).click();
				String valtext=driver.findElement(By.id("msg")).getText();
				System.out.println(valtext);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println(parent);
		driver.findElement(By.id("name")).sendKeys("back to parent");
		driver.close();
   
	}

}
