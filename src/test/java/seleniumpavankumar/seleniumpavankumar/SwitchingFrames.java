package seleniumpavankumar.seleniumpavankumar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchingFrames {

	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("ashutosh");
		driver.switchTo().defaultContent();//Switching to back to page
		
		//frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("patil");
		driver.switchTo().defaultContent();//switching back to page
		
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("aryan");
		
		//switching to inner part of frame3
		driver.switchTo().frame(0);//switching to inner part of frame3 using index cause only frame is there
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		driver.switchTo().defaultContent();//directly switch to default page
	}

}
