package HackerRank;

import java.util.Scanner;

public class Day3duplicate {

	      public static void main (String agrs[]) {
	Scanner scan = new Scanner(System.in);
	int no = scan.nextInt();

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
}
}
