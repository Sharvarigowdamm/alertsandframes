package google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPageFactory {
WebDriver driver;
public GoogleSearchPageFactory(WebDriver driver1)
{
this.driver=driver;
PageFactory.initElements(driver, this);
}
@FindBy(name="q")
WebElement searchbox;

public void NavigateGoogleSearchPage() {
	driver.get("https://www.google.com");
}
public void typeSearchKeyword(String keyword) {
	searchbox.click();
	searchbox.sendKeys("selenium");
	searchbox.sendKeys(Keys.ENTER);
}


}
