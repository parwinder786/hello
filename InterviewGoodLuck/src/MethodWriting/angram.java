package MethodWriting;

import java.util.Arrays;

public class angram {

	    static  void isangram(String x, String z) {
	    		    	
	    	//char [] arry = x.toLowerCase().toCharArray();
	    	//char [] arry2 = z.toLowerCase().toCharArray();
	    	
	    	String bc[] = x.split("");
	    	String de[] = z.split("");
	    	
	    	Arrays.sort(bc);
	    	Arrays.sort(de);
	    	
	    	if(Arrays.equals(bc, de)) {
	    		System.out.println("strings are angram");
	    	}else {
	    		System.out.println("Strings are not angram");
	    	}	    	
	    }
	    
	public static void main(String[] args) {
		          angram.isangram("abcd", "adcb");
	}

}
