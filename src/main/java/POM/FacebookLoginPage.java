package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
	//Declaration
	//address of email text field
	@FindBy(id="email")
	private WebElement emailTF;
	//address of password text field
		@FindBy(name="pass")
		private WebElement passwordTF;
	//address of login button
		@FindBy(xpath="//button[@name='login']")
		private WebElement loginBtn;
		
		//Initialization
		public FacebookLoginPage(WebDriver driver) 
		{
			PageFactory.initElements(driver,this);
		}
		
	//Utilization
	//getter for all private WebElements
		
	public WebElement getEmailTF()
	{
		return emailTF;
	}
	public WebElement getPasswordTF()
	{
		return passwordTF;
	}	
	public WebElement getloginBtn()
	{
		return passwordTF;
	}
	
	//business libraries
	public void emailTextField(String data)
	{
		emailTF.sendKeys("data");
	}
	public void passwordTextField(String data)
	{
		passwordTF.sendKeys("data");
	}
	public void loginButton() {
		loginBtn.click();
	}
}
