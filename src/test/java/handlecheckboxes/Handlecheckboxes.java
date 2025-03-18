package handlecheckboxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handlecheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		/*for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//best approach enhanced for loop
		/*for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}*/
		
		//select last 3 checkboxes
//		Total no of checkboxes -how many checkboxes want to select=starting index
		
		for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		//Select only 1st three checkboxes
		/*for(int i=0;i<3;i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//only select specific checkbox whether it is selected or not check first
		Thread.sleep(5000);
		
		for(WebElement checkbox:checkboxes)
		{
			if(checkbox.isSelected())
			{
				checkbox.click();
			} 	
		}
		
		
		
	}

}
