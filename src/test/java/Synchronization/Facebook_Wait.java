package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Wait {

	public static void main(String[] args) throws Throwable {
		//edge driver related statement
		int num;
				WebDriverManager.edgedriver().setup();
				//open the empty edge browser
				WebDriver driver = new EdgeDriver();
				Thread.sleep(3000);
				//Maximizing Statement
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//Explicit wait
				WebDriverWait wait = new WebDriverWait(driver,10);
			    //it opens the application
				driver.get("https://www.facebook.com/");
				WebElement email = driver.findElement(By.id("email"));
                wait.until(ExpectedConditions.visibilityOf(email));
                email.sendKeys("Snehal");
                WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
                wait.until(ExpectedConditions.elementToBeClickable(loginButton));
	            loginButton.click();
	}

}
