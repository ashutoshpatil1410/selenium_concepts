package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class OrangeHrm_SecondLec
{

	WebDriver driver;
	
	
	@Test(priority = 1)
	void openapp() throws InterruptedException
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	void logopresent()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status==true)
		{
			System.out.println("Test is passed");
		}
		else {
			System.out.println("Test is failed");
		}
	}
	
	@Test(priority = 3)
	void login()
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 4)
	void logout()
	{
		driver.quit();
	}
	
	
}
