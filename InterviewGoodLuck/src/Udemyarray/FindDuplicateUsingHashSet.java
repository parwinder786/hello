package Udemyarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingHashSet {

	public static void main(String[] args) {
	              int [] arr = {4,6,7,8,8,9,3,6,4};
	            
	              FindDuplicateUsingHashSet.findduplicate(arr);
	              //method is static so we dont have create instance or object of it
	    	              
	}
                   private static void  findduplicate(int[] array) {
                
                	   
                	   Set<Integer> hs = new HashSet<Integer>();  //hashset never contains duplicates
                	   
                	      for(int x:array)   {
                	    	    
                	    	  if(!hs.add(x)) { //hash set uses the add method to add values in set. so it not gonnna add the duplicate values 
            
                	    		  System.out.println("duplicate values is :"+x);
                	    		  
                	    		  
                	    	  }
                	    	  
                	      }
                	   
                	   
                   }
}
