package TestNg_FailingPurpose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	@Test
	public void fb() throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		//open the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//Maximizing Statement
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //it opens the application
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Snehal");
	}

}
