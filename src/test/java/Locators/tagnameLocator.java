package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tagnameLocator {

	public static void main(String[] args) throws InterruptedException {
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//open the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//Maximizing Statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement b:allLinks)
		{
			System.out.println(b.getText());
			
		}
	}

}
