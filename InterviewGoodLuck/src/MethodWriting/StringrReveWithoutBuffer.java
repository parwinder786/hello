package MethodWriting;

public class StringrReveWithoutBuffer {
	  
	
	public static void reverse(String x) {
		
		  String d ="";
		  
		  for(int i =x.length()-1;i>=0;i--) {
			 d = d+x.charAt(i);			  
		  }
		  System.out.println(d);
		
	}
	
	
	public static void main(String[] args) {
		
	         reverse("thgiu");
		
		
	}
}



