package Collection_;

import java.util.HashMap;
import java.util.Map;

public class HashMapProblem {
	public static void main(String[] args) {
		HashMap<Character,String> h= new HashMap<Character,String>();
		
		h.put('$', "Velocity");
		h.put('A', "Class");
		h.put('Y', "Batch");
		h.put('a', "2022");
		h.put('o', "Batch");
		h.put(null, "Batch");            //HashMap Null Key and Null Value Allowed.
		h.put('o', null);
		
		for(Map.Entry<Character, String> r :h.entrySet())
		{
			System.out.println("Key = "+ r.getKey() + " Value = " + r.getValue());
		}
		System.out.println("=======================");
		
	h.put('Y', "Match");
		
		for(Map.Entry<Character, String> r :h.entrySet())
		{
			System.out.println("Key = "+ r.getKey() + " Value = " + r.getValue());
		}
		System.out.println("=======================");
		
		

	}

}
