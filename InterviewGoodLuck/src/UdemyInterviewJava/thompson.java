package UdemyInterviewJava;

import java.util.HashSet;
import java.util.Set;

public class thompson {

	     public static void duplicate (int arr[]) {
	    	 
	    	 
	    	 Set<Integer> set = new HashSet<Integer>();
	    	 
	    	 for(int x :arr) {
	    		 
	    		 if(!set.add(x)) {
	    			 System.out.println("duplicate value is "+x);
	    		 }
	    	 }
	    	 
	    	 
	     }
	
	
	
	
	
	public static void main(String[] args) {
	
	        
		        int abc[] = {1,2,3,4,5,5};
		        
		thompson.duplicate(abc);
			
		}
	     
		
}
