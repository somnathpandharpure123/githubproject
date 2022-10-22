package ExceptionHandling;


public class ArrayOutOfBoundryException {
	
	public static void main(String[] args) {
		
		//1.Without Handling of Exception
		
//		System.out.println("Good Morning");
//		
//		int [] a = new int[5];
//		
//		a[6] =20;
//		
//		System.out.println("Hello");
		
		//==========================================================
		
		//2.With Handling of Exception
		
		System.out.println("Good Morning");
		
		int [] a = new int[5];
		
		try 
		{
			a[6] =20;
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello");
		
		//============================================================
		
	}

}
