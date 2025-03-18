package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods
{
	@Test(priority = 1)
	void openapp()
	{
		System.out.println("This is openapp");
		Assert.assertTrue(true);
	}
	@Test(priority = 2, dependsOnMethods = {"openapp"})
	void login()
	{
		System.out.println("This is login");
		Assert.assertTrue(false);
	}
	@Test(priority = 3,dependsOnMethods = {"openapp","login"})
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority = 4,dependsOnMethods = {"openapp","search"})
	void adv_search()
	{
		System.out.println("This is advance search");
	}
	@Test(priority = 5,dependsOnMethods = {"login"})
	void logout()
	{
		System.out.println("This is logout");
	}
}
