package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath_traversing {

	public static void main(String[] args) throws Throwable {
		//edge driver related statement
				WebDriverManager.edgedriver().setup();
				//open the empty edge browser
				WebDriver driver = new EdgeDriver();
				Thread.sleep(3000);
				//Maximizing Statement
				driver.manage().window().maximize();
				//to open the browser
				driver.get("https://www.amazon.com/s?k=laptop&crid=H43HWEU75C7U&sprefix=laptop%2Caps%2C391&ref=nb_sb_noss_1");
				WebElement value = driver.findElement(By.xpath("//span(//span[text()='SGIN Laptop 4GB DDR4 128GB SSD, 15.6 Inch Laptops Computer with Intel Celeron Quad Core Processor (up to 2.5 GHz), Intel UHD Graphics 600, Mini HDMI, WiFi, Webcam, USB3.0, Bluetooth 4.2']"));
                System.out.print(value.getText());
	}

}
