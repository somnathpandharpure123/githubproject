package TestNG_Keywords;

import org.testng.annotations.Test;

public class timeOut_Keyword {
	
	@Test(timeOut=10000)
	public void infiniteloop() {
		for(;;)
		{
			System.out.println("Hello");
		}
	}

}
