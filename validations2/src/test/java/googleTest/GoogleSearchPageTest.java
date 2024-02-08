package googleTest;

import java.io.IOException;
 
 import org.openqa.selenium.WebDriver; 
 import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import
 org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import google.GoogleSearchPageFactory;
import utilities.ReadExcelExample;
 
 public class GoogleSearchPageTest { 
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
 
 @Test(dataProvider="csvData") 
 public void GoogleSearch(String keyword) {
 test=extent.createTest("Google search", "perform google search ");
 GoogleSearchPageFactory search=new GoogleSearchPageFactory(driver);
 test.log(Status.INFO,"Browser is launched");
 search.NavigateGoogleSearchPage();
 test.log(Status.PASS,"Browser is launched");
 search.typeSearchKeyword(keyword);
 test.log(Status.FAIL,"Browser is launched"); }
 
 @Test public void testcase() {
 test=extent.createTest("test case 2","sample test");
 test.log(Status.PASS,"Browser is launched");
 
 }
 
 @AfterTest public void tearDown() 
 { 
	 extent.flush(); }
 
 }
 
 
