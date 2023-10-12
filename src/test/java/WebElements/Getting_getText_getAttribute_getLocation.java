package WebElements;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getting_getText_getAttribute_getLocation {

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
				WebElement email = driver.findElement(By.id("email"));
				String attribute = email.getAttribute("type");
				System.out.println(attribute);
				Point axis = email.getLocation();
               int x= axis.getX();
                int y= axis.getY();
                System.out.println(x);
                System.out.println(y);
	}

}
