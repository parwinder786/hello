package UdemyInterviewJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMethod {
	
	

	public static void main(String[] args) {

		
		 // Create an array list
	      //ArrayList al = new ArrayList();
	      Set al = new HashSet();
	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add("F");
	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	    while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }

	}

}
