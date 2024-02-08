package googleTest;

import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.poi.hpsf.Date;
import org.openqa.selenium.WebDriver;

public class ScreenshotTesting2 {

	public static String captureScreenshot(WebDriver driver,String screenshotname)
	{
		String timestamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	}
}
