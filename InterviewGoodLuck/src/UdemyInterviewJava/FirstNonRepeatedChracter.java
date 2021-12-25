package UdemyInterviewJava;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChracter {

	public static void main(String[] args) {
		
		String str ="swiss";
		// w is first non repeated character in string & i is second repeated character
		// whenever string problem comes we iterate by using character array
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count =1;
		for (int i =0; i<str.length();i++) {
			
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),count);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		   for(java.util.Map.Entry<Character, Integer> entry:map.entrySet()) {
			  if(entry.getValue()==1) {
				  System.out.println("the first non repeated character is = "+entry.getKey());
				  break;
				  
			  }
		   }
		

	}

}
