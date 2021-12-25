package MethodWriting;

import java.util.Arrays;

public class FindDulicateinArraySorting {

	               
	           public static void duplicate(int arr[]) {
	        	   
	        	   
	        	   Arrays.sort(arr);
	        	   
	        	   for(int i=0; i<arr.length;i++) {
	        		   
	        		   if(arr[i]==arr[i+1]){
	        			   System.out.println("the duplicate is "+arr[i]);
	        		   }
	        	   }
	        	   
	           }
	public static void main(String[]args) {
		
		int [] ss = new int [] {0,2,5,6,7,3,8,8,9,1,2};
		                    duplicate(ss);
		
	}
}
