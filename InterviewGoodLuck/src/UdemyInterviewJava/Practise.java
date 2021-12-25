package UdemyInterviewJava;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
		
		
		
	String str = "stop";
	char ch [] =  str.toLowerCase().toCharArray();
	
	
    Arrays.sort(ch);
    
    for(Character x:ch) {
    	System.out.print(x);
    }

	}

}
