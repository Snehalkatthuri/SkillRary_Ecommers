package ActionClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick 
{

	public static void main(String[] args) throws InterruptedException  
	{
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
	driver.get("https://www.amazon.com/");
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	Thread.sleep(3000);
	Actions a=new Actions(driver);
	a.contextClick(search).perform();
	
	
	}
	

}
