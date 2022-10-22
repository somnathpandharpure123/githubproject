package TestNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_Class {
	
	@Test
	public void DemoTest()
	{
		Assert.assertEquals("Equal", "Equal");
		System.out.println("Hello");
		
		Assert.assertTrue(true);
		System.out.println("Good");
		
		Assert.assertFalse(false);
		System.out.println("Bad");
		
		Assert.fail();
		System.out.println("Successfully Passed");
	}
	
	

}
