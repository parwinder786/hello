package MethodWriting;

public class ReverseEachWord {

	
	            public static void reverse(String x) {
	            	
	            	String finalresult="";
	            	String arr [] = x.split("\\s");
	            	
	            	
	            	String result =""; 
	            	
	            	for(String word:arr) {
	            		
	            		int j = word.length()-1;
	            		
	            		
	            		
	            		while (j>0) {
	            			char ch = word.charAt(j);
	            			result  = result+ch;
	            			j--;
	            		}
	            		finalresult = finalresult + " "  +result;
	            	}
	            	System.out.println(finalresult);
	            	
	            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverse("how are you ");
		
		

	}

}
