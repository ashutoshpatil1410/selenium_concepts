package seleniumpavankumar.seleniumpavankumar;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DatepickerDemo {

	static void selectdate(WebDriver driver,String expectedmonth,String expectedyear,String expecteddate)
	{
		while (true) 
		{
			String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if((expectedmonth.equals(currentmonth)) && (expectedyear.equals(currentyear)))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		
		List<WebElement> alldates =driver.findElements(By.xpath("//tbody//a[@class='ui-state-default']"));
		
		for(WebElement dates:alldates)
		{
			String date=dates.getText();
			if(date.equals(expecteddate))
			{
				dates.click();
				break;
			}
		}
		/*Why Do We Use dates.click();?
		dates is a WebElement → It represents the actual date button/link in the calendar.
		date is just a String → It contains the text of the date (like "10", "15", etc.), but it has no connection to the web page element.
		Only WebElement has a .click() method, so we must use dates.click();, not date.click();*/		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();

		String expectedmonth = "April";
		String expectedyear = "2027";
		String expecteddate = "20";
		
		selectdate(driver,expectedmonth, expectedyear,expecteddate);//Static method created so we can directly call

	}

}
