package Pop_Up;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopUp {

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
		driver.get("https://skillrary.com/");
        String parent = driver.getWindowHandle();
        driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
        
        Thread.sleep(3000);
        Set<String> child = driver.getWindowHandles();
        for(String b:child)
        {
        	driver.switchTo().window(b);
        }
        driver.findElement(By.id("mytext")).sendKeys("Snehal");
Thread.sleep(3000);
driver.switchTo().window(parent);
driver.findElement(By.xpath("//a[text()='CATEGORIES']")).click();	
	}

}
