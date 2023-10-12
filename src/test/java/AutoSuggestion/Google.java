package AutoSuggestion;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) throws Throwable  {
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
				driver.get("https://www.google.com/");
				driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("Phone");
				Thread.sleep(4000);
				List<WebElement> allValues = driver.findElements(By.xpath("//li[@data-view-type='1']"));
				Thread.sleep(3000);
				for(WebElement b:allValues)
				{
					System.out.println(b.getText());
				}
				Thread.sleep(3000);
				driver.quit();
				
				
		

	}

}
