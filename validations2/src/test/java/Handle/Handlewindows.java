package Handle;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement newtab=driver.findElement(By.xpath("//*[@id=\"tabButton\"]"));
		js.executeScript("arguments[0].scrollIntoView(true);;",newtab);
		newtab.click();
		/*
		 * WebElement
		 * newwindow=driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
		 * js.executeScript("arguments[0].scrollIntoView(true);;",newwindow);
		 * newwindow.click(); WebElement
		 * newwindowmsg=driver.findElement(By.xpath("//*[@id=\"messageWindowButton\"]"))
		 * ; js.executeScript("arguments[0].scrollIntoView(true);;",newwindowmsg);
		 * newwindowmsg.click();
		 */
		/*
		 * Set<String>s=driver.getWindowHandles(); int size=s.size();
		 * System.out.println(size);
		 */
		System.out.println(parent);
		ArrayList<String> tab= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tab.get(1));
		driver.switchTo().window(tab.get(1));
		String childtext= driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		//System.out.println(s);
		System.out.println(childtext);
        //driver.quit(); 
        driver.switchTo().window(tab.get(0));
        
        //new window
        WebElement newwindow=driver.findElement(By.xpath("//*[@id=\"windowButton\"]"));
		  js.executeScript("arguments[0].scrollIntoView(true);;",newwindow);
		newwindow.click(); 
		
		ArrayList<String> window= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(window.size());
		System.out.println(window.get(2));
		 driver.switchTo().window(window.get(2));
		String childtext2= driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]")).getText();
		//System.out.println(s);
		System.out.println(childtext2);
		driver.quit();
	}

}
