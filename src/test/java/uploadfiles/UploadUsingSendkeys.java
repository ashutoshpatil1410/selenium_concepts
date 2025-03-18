package uploadfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class UploadUsingSendkeys {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		//Executed successfully but not recommended
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("D:/study/English/Tense.xlsx");
		WebElement uploadbutton=driver.findElement(By.xpath("//button[@id='fileSubmit']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", uploadbutton);
		//Upload multiple Files
		/*String f1="D:\\study\\English\\Tense.xlsx";
		String f2="D:\\study\\English\\Book1.xlsx";
		try {
			driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys(f1+" "+f2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	
		driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
		
//		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys(f1+"\n"+f2);*/
		
		/*String f1 = "D:\\study\\English\\Tense.xlsx";
		String f2 = "D:\\study\\English\\Book1.xlsx";

		// Get the correct separator for the system
		String separator = System.getProperty("line.separator");

		WebElement choosebutton = driver.findElement(By.xpath("//input[@id='fileInput']"));

		// Send multiple file paths
		choosebutton.sendKeys(f1 + separator + f2);

		// Click submit button
		driver.findElement(By.xpath("//button[@id='fileSubmit']")).click();
		*/

	}

}
