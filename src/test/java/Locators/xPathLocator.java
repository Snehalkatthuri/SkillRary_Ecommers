package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathLocator {

	public static void main(String[] args) throws Throwable   {
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
				//address of email TF using xpath attribute method
				driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("Snehal");
				//address of password TF using xpath contain method		
				driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("123445");
				//address of login button using xpath text method
				driver.findElement(By.xpath("//button[text()='Log in']")).click();
				Thread.sleep(3000);
				//address of forgot password link using xpath text contain method
                driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();

	}

}
