package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HiddenDropodown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver =new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		Thread.sleep(5000);//Elements to load
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='oxd-select-option']"));
		System.out.println(options.size());//29
		
		for(WebElement op:options)
		{
			options=driver.findElements(By.xpath("//div[@class='oxd-select-option']"));//To avoid element stale exeception
			if(op.getText().equals("Chief Financial Officer"))
			{
				op.click();
				break;
			}
		}
		
		
	}
	

}
