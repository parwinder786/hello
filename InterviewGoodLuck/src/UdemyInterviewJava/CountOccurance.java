package UdemyInterviewJava;

import java.util.HashMap;
import java.util.Map;

public class CountOccurance {

	public static void main(String[] args) {
		
		String s ="my love is  jaspreet kaur kaur dhaliwal";
		
		
		Map <String,Integer> map = new HashMap<String, Integer>();
		//split method return arry of string
		
		Integer count =1;
		String [] arry = s.split(" ");
		// so when ever we call split method it will return string array (Interview Question)
	
		for (int i=0;i<arry.length;i++) {
			
			if(!map.containsKey(arry[i])) {
				
				map.put(arry[i], count);
			}else {
				map.put(arry[i], map.get(arry[i])+1);
			}
		}
		//print the output
		for (String x: map.keySet()) {
			System.out.println("the count of wrods : "+x+"   =="+map.get(x));
		}
		

	}

}
