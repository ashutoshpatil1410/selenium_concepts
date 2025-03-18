package seleniumpavankumar.seleniumpavankumar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTables {

	public static void main(String[] args) {
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='Email']"));
		username.clear();
		username.sendKeys("admin@yourstore.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
		password.clear();
		password.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//a[@class='nav-link active'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='nav-link active']//p[text()=' Customers']"));
		
	}

}
