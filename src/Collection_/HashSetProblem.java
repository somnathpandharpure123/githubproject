package Collection_;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProblem {
	
	public static void main(String[] args) {
		
		HashSet<String> hset=new HashSet<String>();         //Duplicate not Allowed
		
		//Insertions
		hset.add("Somnath");
		hset.add("Akshay");
		hset.add("Shivkumar");
		hset.add("Pravin");
		hset.add("2013");
		hset.add("Pravin@123");
		hset.add("Pravin@123");
		
		//Advance for loop-for each loop
		
		for(String s : hset)
		{
			System.out.println(s);
		}
		System.out.println("=======================");
		
		hset.remove("Shivkumar");
		
		for(String s : hset)
		{
			System.out.println(s);
		}
		
		System.out.println("=======================");
		
		//By using Iterator
		Iterator<String> i = hset.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
	

}
