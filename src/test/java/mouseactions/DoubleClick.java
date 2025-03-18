package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement doublclickbutton=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		
		field1.clear();
		field1.sendKeys("Ashutosh");
		Actions act=new Actions(driver);
		act.doubleClick(doublclickbutton).perform();
		String box2=field2.getAttribute("value");
		System.out.println(box2);
		
		Thread.sleep(3000);
		if(box2.equals("Ashutosh"))
		{
			System.out.println("Text copied..");
		}
		else {
			System.out.println("Text is not copied");
		}
		
	}
	

}
