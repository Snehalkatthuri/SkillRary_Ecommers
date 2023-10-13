package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) throws Throwable {

		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//open the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//Maximizing Statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement model = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		//javascript
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",model);
		Thread.sleep(3000);
		model.click();
		Set<String> child = driver.getWindowHandles();
        for(String b:child)
        {
        	driver.switchTo().window(b);
        }
        WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
        System.out.print(price.getText());
        driver.findElement(By.id("add-to-cart-button")).click();
        
        
	}

}
