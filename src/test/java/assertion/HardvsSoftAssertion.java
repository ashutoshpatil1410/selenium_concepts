package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertion
{

	//@Test
	void HardAssertion()
	{
		System.out.println("Testing1");
		System.out.println("Testing2");
		
		Assert.assertEquals(true, false);//It will throw exeption to overcome we use softassertion
										//program will terminate
		
		System.out.println("Testing3");
		System.out.println("Testing4");
	}
	
	@Test
	void SoftAssertion()
	{
		System.out.println("Testing1");
		System.out.println("Testing2");
		
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(true, false);
		
		System.out.println("Testing3");
		System.out.println("Testing4");
		
		sa.assertAll(); 
		//It is mandotory cause even test is failing without above line it not reflecting 
	}
}
