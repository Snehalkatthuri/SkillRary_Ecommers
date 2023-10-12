package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiOptionDropdown {

	public static void main(String[] args) throws Throwable {
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//open the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//Maximizing Statement
		driver.manage().window().maximize();
		//Implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//it opens the application
		driver.get("https://demoapp.skillrary.com/");
		WebElement MDd = driver.findElement(By.id("cars"));
		Select s = new Select(MDd);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("399");
		Thread.sleep(3000);
		s.selectByVisibleText("More Than INR 500 ( 55 )");
		System.out.println(s.isMultiple());
		List<WebElement> value = s.getOptions();
		for(WebElement b:value)
		{
			System.out.println(b.getText());	
		}
		//s.deselectAll();
		s.deselectByIndex(2);
		Thread.sleep(3000);
		s.deselectByValue("399");
		Thread.sleep(3000);
	s.deselectByVisibleText("More Than INR 500 ( 55 )")	;
	}
	

}
