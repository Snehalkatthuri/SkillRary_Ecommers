package generic_utilities;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebDriverUtilities {
	//implicite
	public void implicitwait(WebDriver driver, int num)
	{
		driver.manage().timeouts().implicitlyWait(num, TimeUnit.SECONDS);
	}
	//Alter PopUp
	public void alter (WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	//7.child browser
	

}
