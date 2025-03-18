package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginvia_PageFactory 
{
	//WebDriver driver;
	
	//Constructor
	public Loginvia_PageFactory(WebDriver driver) //catching the driver instance from test method
	{
		//this.driver=driver;
		PageFactory.initElements(driver,this);// Mandotory
		//To find Elements need driver so passing this driver to findby
	}
	
	//locators
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username_txt;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password_txt;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement login_btn;
		
//	ActionMethods
	public void setusername(String username)
	{
		username_txt.sendKeys(username);
	}
	public void setpassword(String password)
	{
		password_txt.sendKeys(password);
	}
	
	public void clicklogin()
	{
		login_btn.click();
	}
	

}
