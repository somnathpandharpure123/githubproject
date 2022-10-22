package ExceptionHandling;

public class NumberFormatException {
	
	public static void main(String[] args) {
		
		//1.Without Handling of Exception
//		
//		String S1 = "Somnath";
//		
//		int number = Integer.parseInt(S1);
//		
//		System.out.println(number);
		
		//==============================================
		
		//2.With Handling of Exception
		
		String S1 = "Somnath";
		
		System.out.println("Hi");
		
		try
		{
		int number = Integer.parseInt(S1);
		}
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Hello");
		
	}

}
