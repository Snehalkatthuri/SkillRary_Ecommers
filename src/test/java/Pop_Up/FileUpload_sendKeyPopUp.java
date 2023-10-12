package Pop_Up;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_sendKeyPopUp {

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
		driver.get("https://www.foundit.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sneha\\OneDrive\\Desktop\\Updated Snehal Resume . net.docx");

	}

}
