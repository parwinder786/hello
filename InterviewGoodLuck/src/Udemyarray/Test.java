package Udemyarray;

import java.util.Arrays;

public class Test {
	
	
	
	              public static void numers (int num) {
	            	  
	            	  int result =0;
	            	  
	            	  while(num>0) {
	            		  result= result*10+num%10;
	            		  num=num/10;
	            		  
	            		  
	            	  }
	            	  
	            	  System.out.println(result);
	              }
	
	
	


	public static void main(String[] args) {
                         Test.numers(222333444);
                   }

}