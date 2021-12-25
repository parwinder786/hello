package MethodWriting;

import java.util.HashMap;

public class DuplicateChrInString {
	
	    static void duplicateinstring(String x) {
	    	
	    	String abc[] = x.split("");
	    	
	    	HashMap<String,Integer> map = new HashMap<String,Integer>();
	    	int count =1;
	    	
	    	for(int i =0; i<abc.length;i++) {
	    		
	    		if(!map.containsKey(abc[i])) {
	    			
	    			map.put(abc[i], count);
	    		}else {
	    			
	    			map.put(abc[i], map.get(abc[i])+1);
	    		}
	    		
	    	}
	    	
	    	for(String zz :map.keySet()) {
	    		if(map.get(zz)>1) {
	    			System.out.println("the duplicate character is "+zz+"-------"+map.get(zz));
	    		}
	    		
	    	}
	    	
	    }
	

	public static void main(String[] args) {
		DuplicateChrInString.duplicateinstring("jaspreetmyputt");
                  
	}

}
