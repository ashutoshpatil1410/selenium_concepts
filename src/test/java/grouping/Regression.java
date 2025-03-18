package grouping;

import org.testng.annotations.Test;

public class Regression 
{

	@Test(priority = 1,groups = {"sanity","regression"})
	void search()
	{
		System.out.println("This is search");
	}
	@Test(priority = 2,groups = {"sanity","regression"})
	void adv_search()
	{
		System.out.println("This is advance search");
	}
	
}
