package collections;

import java.util.ArrayList;
import java.util.List;

public class Examplelistt {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add("zero");
		list.add(2);
		list.add(true);
		
		for (Object temp: list){
			System.out.println(temp);
		}
		 List<String> gList = new ArrayList<>();
		 gList.add("zero");
		 gList.add("parwinder");
		 gList.add("mam");
		// gList.add(5); shows error method is not applicable
		 gList.remove(2);
		 gList.add(1,"hh");
		 
		 for (String temp : gList){
			 System.out.println(temp);
			 
		 }
		 
		 
		

		
	}

}
