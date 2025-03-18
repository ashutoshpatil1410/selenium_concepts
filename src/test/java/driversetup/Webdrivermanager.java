package driversetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdrivermanager {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();//// Automatically downloads and sets up EdgeDriver
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		System.out.println(driver.getTitle());
	}
}
