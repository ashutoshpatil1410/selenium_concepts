package alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlerts {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		/*driver.findElement(By.cssSelector("button[onclick='jsAlert()']")).click();
		driver.switchTo().alert().accept();*/
		
		/*driver.findElement(By.xpath("//button[contains(@onclick, 'jsConfirm')]")).click();
//		driver.switchTo().alert().accept();//want to accept
		
		driver.switchTo().alert().dismiss();//want to cancel alert
*/
		
		//handel prompt
		/*driver.findElement(By.xpath("//button[contains(@onclick, 'jsPrompt()')]")).click();
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("ashtoshpatil");
		myalert.accept();*/
		
		//handle without switching commands
		driver.findElement(By.xpath("//button[contains(@onclick, 'jsConfirm')]")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert myalert=wait.until(ExpectedConditions.alertIsPresent());//capture alert
		System.out.println(myalert.getText());
		myalert.accept();
	}

}
