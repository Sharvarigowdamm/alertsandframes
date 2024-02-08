	package googleTest;
	
	import java.io.IOException;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;
	
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
	
	import google.GoogleSearchPageFactory;
	import utilities.ReadExcelExample;
import utilities.ScreenshotTesting2;
	
	public class ScreenshotusingListeners {
		WebDriver driver;
		 ExtentReports extent;
		 ExtentTest test;
	
	@DataProvider(name="csvData") public Object[][] providedata() throws
	IOException { ReadExcelExample read=new ReadExcelExample(); 
	Object[][]
	data=read.ReadExceldata("./Data1.xlsx","sheet2");
	
	return data; }
	
	@BeforeTest 
	public void setup() 
	{ 
		 driver =new ChromeDriver();
	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extent1.html");
	extent = new ExtentReports(); 
	extent.attachReporter(htmlreporter);
	
	}
	
	@Test
	public void GoogleSearch() {
	test=extent.createTest("Google search", "perform google search ");
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	Assert.assertEquals(title, "Google");
	
	}
	@AfterMethod
	public void listenerstest(ITestResult result) throws IOException {
		if(result.getStatus()==ITestResult.SUCCESS) {
			String screenshotpath=ScreenshotTesting2.captureScreenshot(driver,result.getName());
			test.fail("details",MediaEntityBuilder.createScreenCaptureFromPath(screenshotpath).build());
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.SKIP,"test skipped"+result.getThrowable());
		}
		else {
			test.log(Status.PASS, "Test Passed");
		}
		driver.quit();
	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	}
