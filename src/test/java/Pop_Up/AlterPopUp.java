package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import generic_utilities.WebDriverUtilities;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AlterPopUp {

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
					driver.get("https://demoapp.skillrary.com/product.php?product=java ");
					Thread.sleep(3000);
					//address of plus icon
					WebElement plus = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
					Thread.sleep(3000);
					Actions a =new Actions(driver);
					a.doubleClick(plus).perform();
					Thread.sleep(3000);
					driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
					//switching the control
					WebDriverUtilities utl = new WebDriverUtilities();
					utl.alter(driver);
					//Alert al= driver.switchTo().alert();
					//Thread.sleep(3000);
					//System.out.print(al.getText());
					//al.accept();
					//al.dismiss();

	}

}
