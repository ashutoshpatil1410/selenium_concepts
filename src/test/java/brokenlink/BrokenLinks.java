package brokenlink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int brokenlinks=0;
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		try {
		for(WebElement link:links)
		{
			String hrefvalue=link.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty())
			{
				System.out.println("Link does not have any value");
				continue;
			}
			
			URL url =new URL(hrefvalue);
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println("Link is broken----->"+hrefvalue);
				brokenlinks++;
			}
			else {
				System.out.println("Link is not broken----->"+hrefvalue);
			}
			
			
		}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Number of broken links"+brokenlinks);
		

	}

}
