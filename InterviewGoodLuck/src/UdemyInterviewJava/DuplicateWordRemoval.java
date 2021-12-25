package UdemyInterviewJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateWordRemoval {
                        public static void main (String[] args) {             
	                           //input = i am am ram ram 
	                         //ouput = i am ram 
	
	
	                          String str = "i am am ram ram";
	                          
	                          //set interface will not store duplicates
	                          
	                          String [] input = str.split(" ");   //split always return String arry
	                          
	                          Set <String> myset = new HashSet<String>();
	                          
	                          
	                          for (String x: input) {
	                        	  
	                        	  myset.add(x);
	                        	                        	  
	                        	 
	                          }
	                          //how will you print the element those are present in the set : interview question
	                          Iterator itr = myset.iterator();
	                          while(itr.hasNext()) {
	                        	  System.out.print(itr.next()+ " ");
}	                          
}
}

