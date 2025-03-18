package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver =new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		WebElement countydrp=driver.findElement(By.xpath("//select[@id='country']"));
		//Selecting single option
		Select countydropdown=new Select(countydrp);
		//countydropdown.selectByVisibleText("India");
		
		//Capture all the options from dropdown
		//Getoptions==>Return all the options from the dropdown as a webElement
		List<WebElement> options=countydropdown.getOptions();
		System.out.println(options.size());
		
		//normal for loop approach
		/*for(int i=0;i<options.size();i++)
		{
		System.out.println(options.get(i).getText());
		}*/
		
		for(WebElement op:options)
		
		{
			System.out.println(op.getText());
		}
		Thread.sleep(3000);
		
		//driver.close();
	}

}
