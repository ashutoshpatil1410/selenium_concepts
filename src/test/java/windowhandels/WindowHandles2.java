package windowhandels;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowHandles2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

		//Approach this approach suitable if only 2 windows or limited windows
		/*Set<String> windowids=driver.getWindowHandles();
		List<String> windowlist=new ArrayList(windowids);
		String parentid=windowlist.get(0);
		String childid=windowlist.get(1);
		
		System.out.println(driver.getTitle());//Gives parent title
	
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());*/
		
		//THIS APPROACH FOR MORE 2 OR 3 WINDOWS
		Set<String> windowids=driver.getWindowHandles();
		List<String> windowlist=new ArrayList(windowids);
		
		for(String windowid:windowlist)
		{
			if(driver.getTitle().equals("OrangeHRM"))
			{
				driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			}
			else {
				System.out.println("title is not matching");
			}
		}
	}

}
