package Udemyarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DuplicateinArraySorting {

	public static void main(String[] args) {
		// by using brute force method
		
		int [] inpurtarr = {2,5,7,7,8,6,8,6};    //6 is duplicate element in given array
		
	
		
		
		DuplicateinArraySorting.findduplicate(inpurtarr);
		
		
	
		
	}
	
	           private static void findduplicate(int [] arr) {
	        	   
	        	   Arrays.sort(arr);
	        	   for(int i=0;i<arr.length-1;i++) {    //lenght is -1 becasue we aer taking arr[i+1] so will go out of bound
	        		      
	        			   if(arr[i]==arr[i+1]) {
	        				   System.out.println("duplicate element found = "+arr[i]);
	        			   
	        		   }
	        		   
	        		   
	        	   }
	        	   	        	   
	           }	

}
