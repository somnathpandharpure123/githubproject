package ExceptionHandling;

public class ArithmeticException {
	
	public static void main(String[] args) {
		
		//1.Without Handling of Exception
		
//		System.out.println("Hi");
//		
//		int a = 20 ;             //===========Arithmetic Exception
//		
//		System.out.println(a/0);
//		
//		System.out.println("Hello");
		
		//======================================================================================
		
		//2. With Handling of Exception
		
		int a = 20;
		System.out.println("Good Morning");
		try {
		System.out.println(a/0);
		}
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("hello");
		
		//===========================================================================================
	}

}
