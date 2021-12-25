package UdemyInterviewJava;

import java.util.Arrays;

public class angram {

	public static void main(String[] args) {
	
		//if you string are made of similar character then its called angram 
		
       /* String [] ab = {"a","c","b"};     //for string array
		
		String ab2[] = {"b","c","a"};
		
	     Arrays.sort(ab);
	     Arrays.sort(ab2);
	       if(Arrays.equals(ab, ab2)) {
	    	   System.out.println("arrays are ingram");
	       }else {
	    	   System.out.println("arrays are not ingram");
	       }*/
				
		String str1= "army";     //stop or tops
		String str2 = "mary";
		
		
		char [] arry = str1.toLowerCase().toCharArray();
		
		char [] arry1 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(arry1);
        Arrays.sort(arry);
        
        
        if(Arrays.equals(arry, arry1)) {
        	
        	System.out.println("Given Strings are angram");
        }else {
        	System.out.println("Given Strings are not angram");
        }
	}

}
