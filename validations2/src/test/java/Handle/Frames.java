package Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		driver.switchTo().frame("frame1");
		//Thread.sleep(5000);
		WebElement frame=driver.findElement(By.id("sampleHeading"));
		System.out.println(frame.getText());
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		//Thread.sleep(5000);
		WebElement frame2=driver.findElement(By.id("sampleHeading"));
		System.out.println(frame2.getText());
		driver.switchTo().defaultContent();
		driver.close();
	}

}
