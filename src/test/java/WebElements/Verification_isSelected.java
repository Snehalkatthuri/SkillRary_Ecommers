package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_isSelected {

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
			    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				WebElement radio = driver.findElement(By.xpath("//label[text()='Female']"));
				radio.click();
				if(radio.isSelected())
				{
					System.out.print("pass");
				}
				else 
				{
					System.out.print("fail");
				}
				
			

	}

}
