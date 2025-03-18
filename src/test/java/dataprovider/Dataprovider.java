package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Dataprovider 

{
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/en-gb?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(dataProvider = "dp")
	void login(String email,String password) throws InterruptedException
	{
//		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		WebElement emailid=driver.findElement(By.xpath("//input[@id='input-email']"));
		emailid.sendKeys(email);
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
		pass.sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//
		
		emailid.clear();
		pass.clear();
		Thread.sleep(2000);
	
		
		boolean status=driver.findElement(By.xpath("//img[@class='img-fluid']")).isDisplayed();
		if(status==true)
		{
			Assert.assertTrue(true);
			driver.findElement(By.xpath("//a[text()='Logout' and @class='list-group-item']")).click();
		}
		else {
			Assert.fail();
		}
	}
	
	@DataProvider(name = "dp")
	Object[][] dataprovider()
	{
		//You can use this string array but if another data except string then problem occurs so use 
		//object type of array 
		Object[][] data= {
				{"abc@gmail.com","test123"},
				{"xyz@gmail.com","abc@123"},
				{"ashutoshpatil@gmail.com","test@123"},
				{"pqr@gmail.com","mno123"}
				
				
				
		};
		return data;
	}
	
	@AfterClass
	void teardown()
	{
		driver.close();
	}
}
