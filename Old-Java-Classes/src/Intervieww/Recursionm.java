package Intervieww;

public class Recursionm {

	public static void main(String[] args) {

		
		 String str = "java";
	     System.out.println("Original String: " + str);
           System.out.println(ab(str));
	}
            public static String ab(String s){
            	if(s.length()== 0)
            		return s;
            	else
            		return ab(s.substring(1)) +s.charAt(0);
            	
            	
            }
}
