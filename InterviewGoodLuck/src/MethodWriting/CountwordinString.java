package MethodWriting;

import java.util.HashMap;

public class CountwordinString {

	
    public static void occurance(String x) {
   	 
   	 
   	     HashMap <String, Integer>map = new HashMap<String,Integer>();
   	           
   	     String ab[] =      x.split(" ");
   	                    
   	     int count =1;
   	     
   	     for(int i =0; i<ab.length;i++) {
   	    	 
   	    	 if(!map.containsKey(ab[i])) {
   	    		 
   	    		     map.put(ab[i],count );
   	    	 }else {
   	    		 
   	    		 map.put(ab[i], map.get(ab[i])+1);
   	    	 }  	    	 
   	    	 
   	     }
   	     for(String ss :map.keySet()) {  	    	 
   	    	 System.out.println("the count of words "+ss+"----"+map.get(ss));
   	     }
   	 
    }
    
    
	public static void main(String[] args) {
		
              occurance("i love my mom mom and jaspreet kaur and gurudev");
	}

}
