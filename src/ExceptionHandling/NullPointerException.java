package ExceptionHandling;

public class NullPointerException {

	public static void main(String[] args) {
		
		//1.Without Handling of Exception
		
//		System.out.println("Hi");
//		
//		String S1 = null;
//		
//		System.out.println(S1.length());
//		
//		System.out.println("Hello");
//		
		//========================================================
		
		//2.With Handling of Exception
		
		System.out.println("Hi");
		
		String S1 = null;
		
		try 
		{
		System.out.println(S1.length());
		}
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello");
		
		//===========================================================
	}
}
