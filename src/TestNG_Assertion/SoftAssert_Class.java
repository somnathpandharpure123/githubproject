package TestNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Class {
	SoftAssert softAssert;
	@Test
	public void DemoTest()
	{
		softAssert = new SoftAssert();
		
		softAssert.assertEquals("Equal", "Equal");
		System.out.println("Hello");
		
		softAssert.assertTrue(true);
		System.out.println("Good");
		
		softAssert.assertFalse(false);
		System.out.println("Bad");
		
		System.out.println("Successfully Passed");
		
		softAssert.assertAll();
	}
	
	@Test
	public void DemoTest1()
	{
		softAssert = new SoftAssert();
		
		softAssert.assertEquals("Equal", "Equa");
		System.out.println("Hello");
		
		softAssert.assertTrue(true);
		System.out.println("Good");
		
		softAssert.assertFalse(false);
		System.out.println("Bad");
		
		System.out.println("Successfully Passed");
		
		softAssert.assertAll();
	}

}
