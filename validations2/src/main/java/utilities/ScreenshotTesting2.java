package utilities;
//class is defined to add the screenshot in a screenshot folder
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebDriver;

public class ScreenshotTesting2 {

	public static String captureScreenshot(WebDriver driver,String screenshotname)
	{
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination = "./Sharvari/"+screenshotname+"_"+timestamp+".pngtry{}";
	
	    try {
	    	FileUtils.copyFile(source, new File(destination));
	    	System.out.println("screenshot captured and saved to"+destination);	
	    }catch(IOException e) {
	    	System.out.println("failed to capture"+e.getMessage());
	    }
	    
	    return destination;
	}
}
