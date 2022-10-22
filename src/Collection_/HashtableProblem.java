package Collection_;

import java.util.Hashtable;
import java.util.Map;

public class HashtableProblem {
	public static void main(String[] args) {
		Hashtable<Character,String> h= new Hashtable<Character,String>();
		
		h.put('$', "Velocity");
		h.put('A', "Class");
		h.put('Y', "Batch");
		h.put('a', "2022");
		h.put('o', "Batch");
		//h.put(null, "Batch");            //HashTable can not allowed Null Key and Null Value.
		//h.put('o', null);
		
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
