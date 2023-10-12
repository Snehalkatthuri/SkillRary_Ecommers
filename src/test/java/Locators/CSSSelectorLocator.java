package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorLocator {

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
				//address of field using cssSelector
				driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Snehal");
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("12345");
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("button[value='1']")).click();
				Thread.sleep(3000);
				
				
	}

}
