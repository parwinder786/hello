package MethodWriting;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateRemovalWithSetInString {
	
	        public static void remove(String x) {
	        	
	                  String abc[] =   x.split(" ");
	        	
	        	   Set <String>my = new HashSet<String>();
	        	   
	        	   for(String cd : abc) {
	        		     my.add(cd);	        		   
	        	   }
	        	   System.out.println(my);
	        	   
	        	   Iterator itr = my.iterator();
	        	   while(itr.hasNext()) {
	        		   Object element = itr.next();
	      	         System.out.print(element + " ");
	      	         
	        		  // System.out.println(itr.next() + " ");
	        		   
	        	   }
	        	   
	                	
	        }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		remove("i am am very happy happy");

	}

}
