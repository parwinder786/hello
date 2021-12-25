package Study5;

import java.awt.List;
import java.util.ArrayList;  //array list imported because it gives during the declaration of arry list
import java.util.Iterator;

public class List1 extends Object {
	
	public static void main (String[]args) {
		
		//String []arr = new String [10];
		//
		ArrayList listo = new ArrayList ();
		
		
		//List lis = new ArrayList();  you can also define list in this way too because list is superclass of array list 
		
		listo.add("zero");
		listo.add(1);
		listo.add(true);       //add any data type 
		
		
		for(Object temp: listo) {          // to print data we cant use single data type like integer or string                  
			                          // to overcome this issue everyclass extends object class and object is used to loop all the data 
			System.out.println(temp);
		}
			
		for(int i =0; i<listo.size();i++) {
			System.out.println(listo.get(i));			
		}
			Iterator itr = listo.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}

}
