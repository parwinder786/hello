package Numbers;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		 {
			    int num;
			    System.out.println("Enter an Integer number:");

			    //The input provided by user is stored in num
			    Scanner input = new Scanner(System.in);
			    num = input.nextInt(); // nextInt () reads integer value from the user

			       if ( num % 2 == 0 )
			        System.out.println("Entered number is even");
			     else
			        System.out.println("Entered number is odd");

	}
	}
}
