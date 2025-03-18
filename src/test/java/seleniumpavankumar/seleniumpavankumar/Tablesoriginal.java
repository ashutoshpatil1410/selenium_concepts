package seleniumpavankumar.seleniumpavankumar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tablesoriginal {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://practice.expandtesting.com/tables");
		driver.manage().window().maximize();

		int rowcount = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr")).size();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		for (int r = 1; r <= rowcount; r++) 
		{
			String lastname = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td[1]")).getText();
			
			String email=driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td[3]")).getText();
			
			System.out.println(lastname+"\t"+email);
		}

	}

}
