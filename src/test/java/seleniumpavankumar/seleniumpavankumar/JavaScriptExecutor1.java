package seleniumpavankumar.seleniumpavankumar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor1 {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        WebElement searchbtn=driver.findElement(By.xpath("//button[text()='Search']"));
		WebElement particularElement=driver.findElement(By.xpath("//strong[text()='News']"));
        
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].setAttribute('value','computer')",inputbox);
		//js.executeScript("arguments[0].click();", searchbtn);
		
		/*Why do we write the JavaScript code in double quotes ("")?
		Java requires double quotes ("") for text, so when writing JavaScript inside Java, 
		we must put it in double quotes.*/
		
		//Horizontal SrollBar
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(4000);
//		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
		//Scroll to that particular Element
		js.executeScript("arguments[0].scrollIntoView();", particularElement);
		
		System.out.println(js.executeScript("return window.pageYOffset;"));

		//js.executeScript("window.scrollBy(0,1500)","");
	}
}
