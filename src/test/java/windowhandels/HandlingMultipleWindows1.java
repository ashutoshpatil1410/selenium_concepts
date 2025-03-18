package windowhandels;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingMultipleWindows1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[starts-with(@id,'Wikipedia1_wikipedia')]")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[starts-with(@class,'wikipedia-search-button')]")).click();

		List<WebElement> links = driver.findElements(By.xpath("//div[contains(@id,'wikipedia-search-result-link')]"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			links = driver.findElements(By.xpath("//div[contains(@id,'wikipedia-search-result-link')]"));
			// Added this because org.openqa.selenium.StaleElementReferenceException is
			// occurred
			/*
			 * When you find elements using findElements(), Selenium stores a reference to
			 * those elements. But when you navigate to another page (like clicking a link),
			 * the entire page reloads, and the previously stored elements become invalid
			 * (stale).
			 */

			// WHEN WE NAVIGATE BACK THEN PAGE RELOAD AND OLD WINDOW ID'S ARE CHANGED SO WE
			// HAVE TO DO ABOVE STUFF
			while (!links.isEmpty()) { // Run until no links are left
				// Find elements again to avoid stale reference exception
				links = driver.findElements(By.xpath("//div[contains(@id,'wikipedia-search-result-link')]"));

				if (!links.isEmpty()) {
					WebElement firstLink = links.get(0); // Always click the first link
					firstLink.click();

					Thread.sleep(3000); // Wait after clicking
					driver.navigate().back(); // Return to the search page
					Thread.sleep(3000); // Wait for reload
				} else {
					System.out.println("No more links to click.");
				}
			}

		}
	}
}