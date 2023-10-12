package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locators {

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
				driver.findElement(By.id("email")).sendKeys("asdfg");
				Thread.sleep(3000);
				driver.findElement(By.name("pass")).sendKeys("shgdyegd");
				Thread.sleep(3000);
				//driver.findElement(By.name("login")).click();
				//driver.findElement(By.linkText("Forgotten password?")).click();
				driver.findElement(By.partialLinkText("Forgotten")).click();
	}

}
