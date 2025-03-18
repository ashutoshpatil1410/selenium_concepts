package shadow_dom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Shadow_Dom {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new EdgeDriver();
//		driver.get("https://dev.automationtesting.in/shadow-dom");
		/*SearchContext shadow=driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(3000);
		System.out.println(shadow.findElement(By.cssSelector("shadow-element")).getText());*/
		
		//This Element is inside single shadow DOM.
		/*SearchContext shadow = driver.findElement(By.cssSelector("#shadow-root")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#shadow-element"));*/
		
		//This Element is inside single shadow DOM.
		/*SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input"));*/
		
		
		driver.get("https://books-pwakit.appspot.com/");
		/*SearchContext shadow0=driver.findElement(By.cssSelector(".toolbar-bottom")).getShadowRoot();
		shadow0.findElement(By.cssSelector("#input")).sendKeys("ashutosh");*/
		
		//This Element is inside single shadow DOM.
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector(".toolbar-bottom")).sendKeys("ashutosh");
	}

}
