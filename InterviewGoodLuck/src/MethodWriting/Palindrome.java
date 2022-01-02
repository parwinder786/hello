package MethodWriting;

public class Palindrome {
	
	
	       public static void palindrome(String str) {
	    	   
	    	String org = str;
	    	   
	    	   StringBuffer ab = new StringBuffer(str);
	    	   
	    	  String cd =  ab.reverse().toString();
	    	  System.out.println(cd);
	    	 System.out.println(org);
	    
	    	  if(cd.equals(org)) {
	    		  System.out.println("Strings are plaindrom");
	    	  }
	    	  else {
	    		  System.out.println("Strings are not palindrome");
	    	  }	    	   
	    	   
	       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindrome("nitinw");
		palindrome("121");
	}

}
