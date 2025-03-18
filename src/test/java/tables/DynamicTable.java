package tables;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver =new EdgeDriver();
		driver.get("https://practice-automation.com/tables/");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.xpath("//table[@id='tablepress-1']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,700);" );
		js.executeScript("arguments[0].scrollIntoView()", table);
		
		int totalrows=driver.findElements(By.xpath("//table[@id='tablepress-1']//tbody/tr")).size();
		
	/*	*/
		
		for(int p=1;p<=3;p++)
		{
			//If page is greater than one then we have to navigate further
			Thread.sleep(3000);
			if(p>1)
			{
				WebElement activepage=driver.findElement(By.xpath("//button[contains(@class,'dt-paging-button') and text()="+p+"]"));
				activepage.click();
			}
			
			//Reading data from table
			for(int r=2;r<=totalrows;r++)
			{
				String country=driver.findElement(By.xpath("//table[@id='tablepress-1']//tbody/tr["+r+"]/td[2]")).getText();
				String population=driver.findElement(By.xpath("//table[@id='tablepress-1']//tbody/tr["+r+"]/td[3]")).getText();
				
				System.out.println(country+"\t\t---------->"+population);
			}
		}
		//Throwing some exception but all the data is displayed need to check
		
		
	}

}
