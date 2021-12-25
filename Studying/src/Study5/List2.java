package Study5;

import java.util.ArrayList;
import java.util.List;

public class List2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to add specific data type in list we have to create generic list 
		
		List<String> glist = new ArrayList<>();
		
		
		glist.add("a");
		
		glist.add("b");
		
		glist.add("c");
		
		glist.add("d");
		
		
		glist.remove(2);         //you can also remove from list
		
		
		//glist.add(3);    // show error here because list can add only string 
		
		for(String temp : glist) {
			System.out.println(glist);
			
		}
		
	
	}

}
