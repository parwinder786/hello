package collections;

import java.util.HashMap;

public class Hashmapex {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<>();
	
		hm.put("alex",1000.44);
		hm.put("linda", 1452.3);
		hm.put("john", 455.66);
		
		System.out.println(hm.get("john"));

	}

}
