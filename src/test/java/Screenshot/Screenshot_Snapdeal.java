package Screenshot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Snapdeal {

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
				driver.get("https://www.snapdeal.com/");
				WebElement signIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
				Thread.sleep(3000);
				//creating an object for action class
				Actions a=new Actions(driver);
				a.moveToElement(signIn).perform();
				Thread.sleep(3000);
				//address of register
				driver.findElement(By.xpath("(//span[text()='Register'])[1]")).click();
				Thread.sleep(3000);
				//downcasting
				TakesScreenshot ts= (TakesScreenshot)driver;
				File src = ts.getScreenshotAs(OutputType.FILE);//to get snap
				File dest = new File("./screenshot/snapdeal.png");//to store location
				FileUtils.copyFile(src,dest);
				

	}

}
