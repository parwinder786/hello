package UdemyInterviewJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class extra {

	public static void main(String[] args) {

          String str = "i am fan of of real madrid";
          
          String [] arr = str.split(" ");
          
          Set<String> set = new HashSet<String>();
          
          for(String x : arr) {
        	  set.add(x);
          }
          Iterator abc = set.iterator();
         // System.out.println(abc.hasNext());
          
          while(abc.hasNext()) {
        	  System.out.println(abc.next()+"  ");
          }
	}
	}

