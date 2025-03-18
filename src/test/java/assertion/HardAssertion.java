package assertion;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertion
{

	@Test
	void hardassertion()
	{
		//Assert.assertEquals(123, 123);//passed
		//Assert.assertEquals(123,234);//Failed
		//Assert.assertEquals("ashu",123);//Failed
		
		//Assert.assertNotEquals(123, 123);//Failed Negation
		//Assert.assertNotEquals(124, 123);//passsed 
		
		//Assert.assertTrue(true);//passed
		//Assert.assertTrue(false);//failed
		
//		Assert.assertFalse(false);//Passed
		//Assert.assertFalse(true);//failed
		
		String exepected="opencart";
		String actual="opencart";
		
		if(exepected.equals(actual))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
}
