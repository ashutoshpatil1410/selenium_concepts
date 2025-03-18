package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) {
		WebDriver  driver =new EdgeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		//Selecting single element
		//driver.findElement(By.xpath("//input[@value='Java']")).click();

		//Selecting multiple elements
		List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
	//	System.out.println(options.size());
		
		for(WebElement op:options)
		{
			
			//System.out.println(op.getText());
			String value=op.getText();
			if(value.equals("Java")|| value.equals("Python") || value.equals("MySQL"))
			{
				op.click();
			}
		}
	}

}
