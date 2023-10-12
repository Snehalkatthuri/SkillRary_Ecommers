package TestNg_Parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compatibility 
{
	@Parameters({"browsername"})
	@Test
	public void facebook(String browser)
	{
		WebDriver driver;
		if(browser.equals("edge"))
		{
		    //edge driver related statement
			WebDriverManager.edgedriver().setup();
		
			//open the empty edge browser
			 driver = new EdgeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","D:\\Java training\\QCO_SOEJVD_E9\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
			//Maximizing Statement
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    //it opens the application
			driver.get("https://www.facebook.com/");
		
		}
	}


