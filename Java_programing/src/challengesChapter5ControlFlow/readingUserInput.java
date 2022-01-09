package challengesChapter5ControlFlow;

import java.util.Scanner;

public class readingUserInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter number ");
		//boolean hasNextInt = scanner.hasNextInt();

		/*
		 * if (hasNextInt) { int count = 0; System.out.println("Enter number "); for
		 * (int i = 1; i < 10; i++) {
		 * 
		 * int number = scanner.nextInt();
		 * 
		 * System.out.println("Entered number is " + number); count++;
		 * System.out.println("count number is " + count); }
		 * 
		 * } else { System.out.println("Invalid Number"); }
		 */
		int counter = 0;
		int sum = 0;
		while (counter <10) { // endless loop will stop will break happens at counter of 10

			int order = counter + 1;
			System.out.println("Enter Number #" + order + ":");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int number = scanner.nextInt();
				counter++;
				sum += number;
			/*	if (counter == 10) {
					break;
				}*/
			} else {
				System.out.println("Invalid Number");
			}
			scanner.nextLine(); // handle end of line
		}
		System.out.println("sum = " + sum);
		scanner.close();
	}

}
