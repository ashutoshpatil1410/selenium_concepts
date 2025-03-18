package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginwithoutPageFactory {
	WebDriver driver;

	// Constructor
	public LoginwithoutPageFactory(WebDriver driver) // catching the driver instance from test method
	{
		this.driver = driver;

	}

	// locators
	By username_txt=By.xpath("//input[@placeholder='Username']");
	By password_txt=By.xpath("//input[@placeholder='Password']");
	By login_btn=By.xpath("//button[normalize-space()='Login']");
	By logo=By.xpath("//img[@alt='client brand banner']");

//		ActionMethods
	public void setusername(String username) {
		driver.findElement(username_txt).sendKeys(username);
	}

	public void setpassword(String password) {
		driver.findElement(password_txt).sendKeys(password);
	}

	public void clicklogin() {
		driver.findElement(login_btn).click();
	}
	
	public boolean logopresent()
	{
		return driver.findElement(logo).isDisplayed();
	}
}
