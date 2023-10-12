package Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListofAllButton {

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
		driver.get("https://www.facebook.com/");
		List<WebElement> allbutton = driver.findElements(By.tagName("div"));
for(WebElement b:allbutton)
{
	System.out.print(b.getText());
	}
	}

	

}
