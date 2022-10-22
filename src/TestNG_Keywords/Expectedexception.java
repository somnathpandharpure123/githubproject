package TestNG_Keywords;

import org.testng.annotations.Test;

public class Expectedexception {

	//Question->If you want to handle exception without try catch block so how will you handle it?
	//ExpectedExceptions=Exceptiontype.class
	
	@Test(expectedExceptions=NullPointerException.class)
	public void test() {
		System.out.println("Handle Arithmetic Exception");
		String s = null;
		s.length();
		System.out.println(s);
	}

}
