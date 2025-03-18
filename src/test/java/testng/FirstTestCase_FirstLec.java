package testng;

import org.testng.annotations.Test;

public class FirstTestCase_FirstLec 
{

	@Test(priority = 1)
	void openapp()
	{
		System.out.println("opening app");
	}
	@Test(priority = 2)
	void login()
	{
		System.out.println("login app");
	}
	@Test(priority = 3)
	void logout()
	{
		System.out.println("logout app");
	}
}
