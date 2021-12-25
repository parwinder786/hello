package UdemyInterviewJava;

public class palindrome {

	public static void main(String[] args) {
		
		//palindrome means when you start reading left to right the words are same
    //using recursion- recursion means function calling itself like palindrom calling itself
		
		
		                String str ="nitin";    // logic we will compare first character with last 
		                
		                boolean result = isPalindrome(str);
		                System.out.println(str+"palindrome  ="+result);
		                
	}

	private static boolean isPalindrome(String str) {
		// TODO Auto-generated method stub
		if(str==null) {
			return false;                   //error handling methods
		}
		if(str.length()<=1) {     // one character string is always palingram
			return true;
		}
		String first = str.substring(0,1);
		String last =str.substring(str.length()-1,str.length());
		if(!first.equals(last)) {
			return false;
		}else {
			//return true;
			return isPalindrome(str.substring(1, str.length()-1) ) ;                    //method is called by itself in body..its called recrusion
			                                           //method usally called in return statements
		}
			
	
	}

}
