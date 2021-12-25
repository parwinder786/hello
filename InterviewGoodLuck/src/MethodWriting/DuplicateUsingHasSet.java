package MethodWriting;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingHasSet {
	
	
	      public static void duplicate(int[] as) {
	    	  
	    	  
	    	  
	    	  Set<Integer>  ls = new HashSet<Integer>();
	    	  
	    	  for(int x:as) {
	    		  
	    		  if(!ls.add(x)) {
	    			  System.out.println("the duplicate chr is = "+x);
	    		  }
	    	  }
	    	  
	    	  
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] asa = new int [] {3,5,6,8,9,6,4,1,3};
		
		  duplicate(asa);

	}

}
