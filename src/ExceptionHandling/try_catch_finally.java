package ExceptionHandling;

public class try_catch_finally {
	public static void main(String[] args) {
		
		int a = 20;
		System.out.println("Good Morning");
		try {
		System.out.println(a/0);
		}
		catch (Exception e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		finally {
		
		System.out.println("This is final block");
	}
	}
	
	//finally block===>Execution occur,catch block handle,finally block execute
	//finally block===>Execution occur,catch block not handle,finally block execute
	

}
