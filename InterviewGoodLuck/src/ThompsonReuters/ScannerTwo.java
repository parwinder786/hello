package ThompsonReuters;

import java.util.Scanner;

public class ScannerTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" please enter your name");
		
		scan.nextLine();  // to print name in next line
		String name = scan.nextLine();
		
		
		System.out.println("the name is "+name);
	}

}
