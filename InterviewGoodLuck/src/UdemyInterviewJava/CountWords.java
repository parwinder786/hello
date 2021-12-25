package UdemyInterviewJava;

import java.util.HashMap;
import java.util.Map;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "i love jaspreet kaur brar and my mother and both are my lives now  ";
		
	   
		     Map<String,Integer> map = new HashMap<String,Integer>();
		     
		
		     Integer count=1;
		     String [] arry = str.split(" ");
		     for (int i=0;i<arry.length;i++) {
		    	 
		    	 if(!map.containsKey(arry[i])) {
		    		 
		    		 map.put(arry[i], count);
		    	 }else {
		    		 map.put(arry[i], map.get(arry[i])+1);
		    	 }
		    	 
		     }
		
		       for(String x: map.keySet()) {
		    	   System.out.println("the count of word  = "+x+"===="+map.get(x));
		       }

	}

}
