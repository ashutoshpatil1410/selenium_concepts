package seleniumpavankumar.seleniumpavankumar;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotFullPage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//FullPage Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		/*File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File  targetFile=new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");		
		FileUtils.copyFile(sourcefile, targetFile);
		*/
		
		//Particular section Screenshot
		WebElement featuredproduct=driver.findElement(By.xpath("//div[contains(@class,'product-grid home')]"));
		File sourcefile=featuredproduct.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshot\\featuredproducts.png");
		FileUtils.copyFile(sourcefile, targetFile);
		driver.close();
		
		
		//BELOW CODE IS JUST FOR PRACTISING
		
		/*TakesScreenshot t =(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File TargetFile=new File(System.getProperty("user.dir")+"\\screenshot\\ashu.png");
		FileUtils.copyFile(srcFile, TargetFile);*/
		
		//Taking particular section screenshot
		/*WebElement product=driver.findElement(By.xpath(""));
		File srcfile=product.getScreenshotAs(OutputType.FILE);
		File Target=new File(System.getProperty("user.dir")+"give path");
		FileUtils.copyFile(srcfile, Target);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
