package Udemyarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicateUsingHashMap {

	public static void main(String[] args) {
	              int [] arr = {4,6,7,8,8,9,3,6};
	              //these no can act as key in hash map so value gonna be occurance if occurance is more than 1 
	              //then its duplicate
	            
	              FindDuplicateUsingHashMap.findduplicate(arr);
	              
	    	              
	}
                   private static void  findduplicate(int[] array) {
                	//hash map we can store key value pair values
                	  Map <Integer, Integer> hm = new HashMap<Integer, Integer>();
                	  // integer is key and value
                	  
                	  for(int x:array) {
                		  
                		  if(!hm.containsKey(x)) {  //if hash map map is not containing key then put his value in x
                			  
                				hm.put(x, 1);   //then x (array no) key and values is 1
                		  }else {
                			  hm.put(x, hm.get(x)+1);
                			  //if its already available get will the value corresponding key and add the values in it by 1
                		  }
                		  
                	  }
                	  for (Integer x: hm.keySet()) {
                		  if(hm.get(x)>1) {
                			  System.out.println("duplicate element is : "+x);
                		  }
                	  }
                	   
                	                 	   
                	   
                	   
                   }
}
