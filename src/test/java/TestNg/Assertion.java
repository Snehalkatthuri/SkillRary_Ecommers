package TestNg;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertion {
	WebDriver driver;
	@Test
	public void FB() throws Throwable
	{
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//open the empty edge browser
				 driver = new EdgeDriver();
				Thread.sleep(3000);
				//Maximizing Statement
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			    //it opens the application
				driver.get("https://www.facebook.com/");
				String title= driver.getTitle();
				//Hard assert
				//Assert.assertEquals(title,"dsghfas");
				//SoftAssert
				SoftAssert s = new SoftAssert();
				s.assertEquals(title,"dsghfas");
				System.out.print(driver.getCurrentUrl());
	}
	@Test
	public void Quit() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
