package Pop_Up;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload_RobotClass_PopUp {

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
				driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
				driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
				Robot r=new Robot();
				StringSelection str = new StringSelection("C:\\Users\\sneha\\OneDrive\\Desktop\\Updated Snehal Resume . net.docx");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
				r.keyPress(KeyEvent.VK_CONTROL);
				
				
	}

}
