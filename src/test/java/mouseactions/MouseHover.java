package mouseactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement desktops=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement pc=driver.findElement(By.xpath("//a[text()='PC (0)']"));
		
		
		//build-->for creating actions
		//perfom-->for performing actions
		Actions act=new Actions(driver);
		//Both can work
		//perform=have inbuild building option
		act.moveToElement(desktops).moveToElement(pc).build().perform();
		act.moveToElement(desktops).moveToElement(pc).perform();

	}

}
