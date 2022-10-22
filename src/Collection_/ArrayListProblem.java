package Collection_;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProblem {
	public static void main(String[] args) {
		
		int Size; //Globally Declare
		int S1,S2;
		
		ArrayList<Integer> a=new ArrayList<Integer>();       //Homogeneous(Only pass String or int data)  
		
		//1.Data Insertion
		
		a.add(21);
		a.add(28);
		a.add(15);
		a.add(32);
		
		//To Get the Total no of Data in Collection
		
		Size = a.size();            			//In Array length() is the method of finding the Size.
												//In Collection size() is the method of finding the Size.
		System.out.println("Size="+ Size);
		for(int i=0;i<Size;i++)
		{
			System.out.println(a.get(i)); 		//To Get/Retrieve the Insertion Value in Sequence form.
		}
		a.remove(1);
		Size = a.size();
		System.out.println("Size="+ Size);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("==========================");
		
		ArrayList<String> b=new ArrayList<String>();       //Homogeneous(Only pass String or int data) 
		
		//2.String Insertion
	
			b.add("Somnath");
			b.add("Akshay");
			b.add("Shivkumar");
			b.add("Pravin");
			
			//To Get the Total no of Data in Collection
			
			 S1 = b.size();            				//In Array length() is the method of finding the Size.
													//In Collection size() is the method of finding the Size.
			System.out.println("Size="+ S1);
			for(int i=0;i<S1;i++)
			{
				System.out.println(b.get(i)); 		//To Get/Retrieve the Insertion Value in Sequence form.
			}
			b.remove(2);
			 S1 = b.size();
			System.out.println("Size="+ S1);
			
			for(int i=0;i<S1;i++)
			{
				System.out.println(b.get(i));
			}
			System.out.println("==========================");
			
			List c=new ArrayList();         //Heterogeneous(pass the combinations of Char,String and integer data)
			
			//3.Combination of Char,integer and String Insertion
		
				c.add("Somnath");
				c.add('$');
				c.add(74.90);
				c.add("Pravin@123");
				
				//To Get the Total no of Data in Collection
				
				 S2 = c.size();            				//In Array length() is the method of finding the Size.
														//In Collection size() is the method of finding the Size.
				System.out.println("Size="+ S2);
				for(int i=0;i<S2;i++)
				{
					System.out.println(c.get(i)); 		//To Get/Retrieve the Insertion Value in Sequence form.
				}
				c.remove(2);
				 S2 = c.size();
				System.out.println("Size="+ S2);
				
				for(int i=0;i<S2;i++)
				{
					System.out.println(c.get(i));
				}
				System.out.println("==========================");


	}

}
