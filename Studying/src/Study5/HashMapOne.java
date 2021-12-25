package Study5;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapOne {

	public static void main(String[] args) {
		
		//collection type- used to store key values
		
		HashMap hm = new HashMap ();    //import the hashmap
		
		hm.put("alex", 15000.50);
		       // key values e.g store employee and salary 
		
		hm.put("jag", 666.4);
		
		
		System.out.println(hm.get("jag"));   // to get the vlaues we dont need for loop becasue we can use get
		                                     // property to check the particular key such as jag will fetch the value of jag
		
		//Generic Hashmap
		
		HashMap<String, Double> hmm = new HashMap<>();
		hmm.put("a", 99.4);
		hmm.put("b", 1.01);
		System.out.println(hmm.get("b"));
		
		Set<String> keys = hmm.keySet();
		for(String key:keys)
		{
			System.out.println("keys--------" +key+ "value---------------"+hmm.get(key));
		}
      //  Map<String,List<String>> map1 = new HashMap<String,List<String>>();
	}

}
