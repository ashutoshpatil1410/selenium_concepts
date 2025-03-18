package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class OrangeHrmTest 
{
	WebDriver driver;
	@BeforeClass
	void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	void test() throws InterruptedException
	{
//		Loginvia_PageFactory op= new Loginvia_PageFactory(driver);
		LoginwithoutPageFactory op=new LoginwithoutPageFactory(driver);
		
		op.setusername("Admin");
		op.setpassword("admin123");
		op.clicklogin();
		Thread.sleep(3000);
		
		Assert.assertEquals(op.logopresent(),true);
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
	
}
