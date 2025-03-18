package keyboardactions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MiscelleneousConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement phonesElement=driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(phonesElement).keyUp(Keys.CONTROL).perform();
		
		//above two lines can be written as
		List<String>windowids=new ArrayList<>(driver.getWindowHandles());//converting set to list
		
		driver.switchTo().window(windowids.get(1));//Instead of storing in another variable combining
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("ashutosh");
		Thread.sleep(3000);
		
		driver.switchTo().window(windowids.get(0));
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Ashutosh");
		
		
		
	}

}
