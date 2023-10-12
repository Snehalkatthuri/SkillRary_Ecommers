package Dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Throwable 
	{
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
		//address of dropdown
		WebElement dD= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//handling dropDowns
		Select s= new Select(dD);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("search-alias=aps");
		Thread.sleep(3000);
		s.selectByVisibleText("Books");
		System.out.println(s.isMultiple());//use to check whether is is single or multiple selected 
		List<WebElement> value = s.getOptions();//to get the count of options in dropdown
		System.out.println(value.size());
		for(WebElement b:value)
		{
			System.out.println(b.getText());
			
		}
		
	}

}
