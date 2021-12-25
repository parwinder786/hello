package UdemyInterviewJava;

import java.util.HashMap;
import java.util.Map;

public class DuplicatechrinString {

	public static void main(String[] args) {
	
		
		String str= "laptop";
		
		//hash map is used for key values
		
		char [] arr =str.toCharArray();
		/*for (char x: arr) {                 //string is converted in char arry
			System.out.print(x);
		}*/
		//character is key and integer is value
		
		Map<Character, Integer>map = new HashMap<Character ,Integer>();
		
		int count =1;   //any character is available then default count is one
		
		for (int i=0; i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
			
			for (Character key :map.keySet()) {
				if(map.get(key)>1) {
					System.out.println(key+"   :   "+map.get(key));
				}
			}
		}
	 	

	}

}
