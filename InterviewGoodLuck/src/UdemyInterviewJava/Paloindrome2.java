package UdemyInterviewJava;

public class Paloindrome2 {

	public static void main(String[] args) {
		      
		           String str="nitin";
		           
		           StringBuffer cd = new StringBuffer(str);
		           
		          String str2= cd.reverse().toString();
		          
		          System.out.println(str2);
		          
		        if(str2.equals(str)) {
		        	System.out.println("string is palindrome");
		        }
		        else {
		        	System.out.println("string is not palindrome");
		        }

	}

}
