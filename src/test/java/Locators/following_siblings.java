package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class following_siblings {

	public static void main(String[] args) throws InterruptedException {
		//edge driver related statement
		WebDriverManager.edgedriver().setup();
		//open the empty edge browser
		WebDriver driver = new EdgeDriver();
		Thread.sleep(3000);
		//Maximizing Statement
		driver.manage().window().maximize();
		//it opens the application
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//a[text()='Registry']/following-sibling::a[2]")).click();

	}

}
