package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		
		try {
			WebDriver driver=new EdgeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//Scroll to that element
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement sliderelement=driver.findElement(By.xpath("//div[@id='HTML7']"));
			js.executeScript("arguments[0].scrollIntoView();", sliderelement);

			Actions act=new Actions(driver);
			//min_slider
			/*WebElement min_slider=driver.findElement(By.xpath("//div[contains(@id,'slider-range')]//span[1]"));
			System.out.println(min_slider.getLocation());//(970, 1973)
			//Here we have to keep Y constant because slider is horizontal
//			Thread.sleep(3000);
			
			act.dragAndDropBy(min_slider, 100, 0).perform();
			System.out.println(min_slider.getLocation());*/
			
			
			//max_slider
			WebElement max_slider=driver.findElement(By.xpath("//div[contains(@id,'slider-range')]//span[2]"));
			System.out.println(max_slider.getLocation());
			act.dragAndDropBy(max_slider, -100, 0).perform();//we are reducing so we have to mention minus
			System.out.println(max_slider.getLocation());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
