package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviders {
	@DataProvider
	public Object[][] getData()
	{
		Object[][] a = new Object[3][2];
		a[0][0]="Snehal";
	    a[0][1]="Katthuri";
	    
	    a[1][0]="Sandeep";
	    a[1][1]="Katthuri";
	    
	    a[2][0]="Pusad";
	    a[2][1]="Hyd";
	    
	    return a;
	}
	
	@Test(dataProvider = "getData")
	public void demo(String data, String data1) throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    //it opens the application
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("data");
		driver.findElement(By.id("pass")).sendKeys("data1");
	}

}
