package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutosuggetionDropdown {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@class='gLFyf' and @name='q']")).sendKeys("selenium");
		
		List<WebElement>options=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		for(WebElement option:options)
		{
			if(option.getText().equals("selenium ide"))
			{
				option.click();
				break;
			}
		}
	}

}
