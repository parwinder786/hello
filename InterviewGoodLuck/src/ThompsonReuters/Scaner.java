package ThompsonReuters;

import java.util.Scanner;

public class Scaner {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("input some name");
		
		String name= input.nextLine();
		
		
		System.out.println("name = "+name);
		
		
		int a = input.nextInt();
		
		System.out.println("integer ="+a);

	}

}
