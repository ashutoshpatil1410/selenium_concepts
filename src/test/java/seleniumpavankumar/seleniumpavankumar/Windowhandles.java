package seleniumpavankumar.seleniumpavankumar;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM')]")).click();
		
		/*Set<String> ensures uniqueness (no duplicate window handles).
		Order is not required, so a Set is preferred.
		We can convert Set to List if needed for indexed access.*/
	
	
		//Approach1
		/*Set<String> windowset=driver.getWindowHandles();
		List<String>windowList=new ArrayList<String>(windowset);
		
		
		
		String parentId=windowList.get(0);
		String childId=windowList.get(1);
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());*/
		
		//Approach2
		
		Set<String> windowids=driver.getWindowHandles();
		for(String windows:windowids)
		{
			String title=driver.switchTo().window(windows).getTitle();
			
			if(title.equals("OrangeHRM"))
			{
				System.out.println("ashutosh patil");
			}
		}
		
		driver.close();
	}

}
