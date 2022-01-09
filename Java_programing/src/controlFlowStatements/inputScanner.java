package controlFlowStatements;

import java.util.Scanner;

public class inputScanner {

	public static void main(String[] args) {

		// scanner class is used to read the user input
		Scanner scanner = new Scanner(System.in); // system in is opposite to system out
		System.out.println("Enter your year of birth ");
		boolean hasNextInt = scanner.hasNextInt(); // it will check next value entered is int
		if (hasNextInt) {
			int yearOfBirth = scanner.nextInt();
			scanner.nextLine(); // handle next line character, otherwise it will be skipped
			System.out.println("your date of birth is " + yearOfBirth);

			int age = 2022 - yearOfBirth; // will add the -age to it

			System.out.println("Enter your name: ");
			String name = scanner.nextLine();
			// System.out.println("your name is " + name + ", and you are age " + age + "
			// years old");
			if (age >= 0 && age <= 100) {
				System.out.println("your name is " + name + ", and you are age " + age + " years old");
			} else {
				System.out.println("Invalid year of birth, please enter the correct year of birth");
			}
		}
		else {
			System.out.println("User has not entered the valid int number");
		}
		scanner.close();
	}
}
