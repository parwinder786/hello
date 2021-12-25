package Udemyarray;

public class DuplicateinArray {

	public static void main(String[] args) {
		// by using brute force method
		
		int [] inpurtarr = {2,5,6,7,6,8,6};    //6 is duplicate element in given array
		
		//Brute force method- take 1 element and compare it with rest of elements.
		
		
		DuplicateinArray.findduplicate(inpurtarr);
		
		
		//calling method findduplicate //static method which will called by class name 
		
	}
	
                   //writing method to solve this problem (called brute force method)
	           private static void findduplicate(int [] arr) {
	        	   
	        	   for(int i=0;i<arr.length;i++) {
	        		   for(int j=i+1;j<arr.length;j++) {    //j is i+1 will take the element from array and comapre it with first
	        			   if(arr[i]==arr[j]) {
	        				   System.out.println("duplicate element found = "+arr[i]);
	        			   }
	        		   }
	        		   
	        		   
	        	   }
	        	   	        	   
	           }	

}
