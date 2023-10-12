package ActionClasses;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHovering {

	public static void main(String[] args) throws Throwable
	{
		WebDriverManager.edgedriver().setup();
		//open the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//Maximizing the browser Statement
		driver.manage().window().maximize();
		//Implicit statement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//it opens the application
		driver.get("https://www.snapdeal.com/");
		WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Thread.sleep(3000);
		//creating an object for action class
		Actions a=new Actions(driver);
		a.moveToElement(signIn).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();//Freeze the screen to get address of element
		
	}
	

}
