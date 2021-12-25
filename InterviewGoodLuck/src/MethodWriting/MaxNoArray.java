package MethodWriting;

import java.lang.reflect.Array;

public class MaxNoArray {
	
	public static  void maxno (int []array) {
		
		int max= array[0];
		int min = array[0];
		
		 for(int i =1; i<array.length;i++) {
			 if(array[i]>max) {
				 max=array[i];
			 }else if (array[i]<min){
				 min=array[i];
			 }
		 }
		
		System.out.println("max no is "+max);
		System.out.println("the minimun is "+min);
	}
	
	
	          

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  int array[] = {1,2,3,4,5};
		  MaxNoArray.maxno(array);
		

	}

}
