package InterviewOne;

import java.nio.IntBuffer;

public class StringReverse {

	public static void main(String[] args) {
		
		String cd ="ffggggg";
	     
		 StringBuffer ab = new StringBuffer("123456 abc");
		 StringBuffer abc = new StringBuffer(cd);
		 System.out.println(ab.reverse());
		 
		 String nd  = abc.reverse().toString();
		 
		// System.out.println(abc.reverse(cd));
		 
		 System.out.println(nd);
		 System.out.println("---------------");
		 
		 StringBuffer abcd = new StringBuffer("we are learning java");
		 System.out.println(abcd.reverse());
			 
		 System.out.println("---------------");
		 
		 System.out.println(ab.append(abcd));   //add
		 
		 System.out.println("------------");
		 System.out.println(abcd.charAt(3));   // to print the particular character in the string 
		 
		 System.out.println("------------");
		 System.out.println(abcd.deleteCharAt(4));
		 
		 
		 System.out.println("------------");
		 ab.insert(4, "v");
		 System.out.println(ab);
			 
		 
		 
		 
	}

}
