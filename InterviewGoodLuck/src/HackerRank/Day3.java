package HackerRank;

import java.util.Scanner;

public class Day3 {
       
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		  int no = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	    	if(no%2==0)
	    	{
	    		if (no>= 2 && no <= 5) {
	    			System.out.println("Not weird");
	    		} else if (no >= 6 && no<= 20) {
	    			System.out.println("weird");
	    		} else {
	    			System.out.println("Not weird");
	    		}

	    	}else
	    	{
	    		System.out.println("weird");
	    	}

	        scanner.close();
	    
	        

	}

}
