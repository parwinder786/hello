package UdemyInterviewJava;

import java.util.HashMap;

public class SimpleHashMapProgram {

	public static void main(String[] args) {
	
		   HashMap<String, Integer>map = new HashMap<String,Integer>();
		   
		map.put("a", 4);
		map.put("b", 444);
		
		map.put("c", 44);
		
		map.put("d", 44446);
		
		map.put("e", 44445);
		
		System.out.println(map.get("e"));
		
		for(String x: map.keySet()) {
			
			System.out.println("values are "+x+"            "+map.get(x));
		}
		
	}

}
