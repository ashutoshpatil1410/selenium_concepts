package grouping;

import org.testng.annotations.Test;

public class Sanity 
{

	@Test(priority = 1,groups = "sanity")
	void openapp()
	{
		System.out.println("This is openapp");
	}
	@Test(priority = 2,groups = "sanity")
	void login()
	{
		System.out.println("This is login");
	}
	@Test(priority = 3,groups = "sanity")
	void logout()
	{
		System.out.println("This is logout");
	}
}
