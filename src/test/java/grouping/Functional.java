package grouping;

import org.testng.annotations.Test;

public class Functional 
{

	@Test(priority = 1,groups = {"functional"})
	void addtocart()
	{
		System.out.println("This is addtocart");
	}
	@Test(priority = 2,groups = {"functional"})
	void payment()
	{
		System.out.println("This is paymentpage");
	}
	
}
