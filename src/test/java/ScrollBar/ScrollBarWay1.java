package ScrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBarWay1 {

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
				driver.get("https://www.amazon.com/");
				//address of web element
				WebElement career = driver.findElement(By.xpath("//a[text()='Careers']"));	
				//downcasting
				JavascriptExecutor js= (JavascriptExecutor)driver;//javscriptexecutor use for scrollBar
				js.executeScript("arguments[0].scrollIntoView();",career);
				Thread.sleep(3000);
				career.click();

	}

}
