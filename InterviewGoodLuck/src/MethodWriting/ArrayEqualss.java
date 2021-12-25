package MethodWriting;

import java.util.Arrays;

public class ArrayEqualss {
	
	          public static void equals(int arr1[], int arr2[]) {
	        	  
	        	  System.out.println(Arrays.equals(arr1, arr2));
	        	  
	          }
	
	
	

	public static void main(String[] args) {
		

	    int[] arr1 = new int [] {1, 2, 3, 4}; 
        int[] arr2 = new int [] {1, 2, 3, 4, 8}; 
       // System.out.println("is arr1 equals to arr2 : " + Arrays.equals(arr1, arr2)); 
		
		equals(arr1,arr2);
				
	}

}
