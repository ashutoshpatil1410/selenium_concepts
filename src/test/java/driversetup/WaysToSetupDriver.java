package driversetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WaysToSetupDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\msedgedriver.exe");

		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
	}

}
