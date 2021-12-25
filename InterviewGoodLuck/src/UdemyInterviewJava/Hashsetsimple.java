package UdemyInterviewJava;

import java.util.HashMap;
import java.util.Map;

public class Hashsetsimple {
	    
	public static void main(String[] args) {
		Map <String,Integer> map = new HashMap<String, Integer>();
		
		map.put("ac", 11);
		map.put("rr", 116);
		map.put("agg", 161);
		map.put("at", 1);
		
	     System.out.println(map.get("agg")+1);
	     System.out.println(map.keySet());
	     System.out.println(map.values());
	     
	
	}
}



