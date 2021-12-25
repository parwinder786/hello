package UdemyInterviewJava;

import java.util.HashMap;

public class ConversionCharStringaArray {

	public static void main(String[] args) {
		
		
		String str = "jaspreet";
	
		String arr2[] = str.split(" ");
	
		for (String x:arr2) {
			System.out.println(x);
		}
		char arr [] = str.toCharArray();
		
		for(char n:arr) {
			System.out.println(n);
		}
		
		
	}		
}
