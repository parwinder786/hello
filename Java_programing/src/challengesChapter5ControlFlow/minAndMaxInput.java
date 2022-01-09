package challengesChapter5ControlFlow;

import java.util.Scanner;

public class minAndMaxInput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int min = 0;
		int max = 0;
		boolean first = true;

		while (true) {
			System.out.println("Enter Number:");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int number = scanner.nextInt();
				if (first) {
					first = false; // will execute only once because first value is false now
					min = number; // it will set the min value to first entry
					max = number; // it will set the max value to first entry
				}

				if (number > max) {
					max = number;
				}

				if (number < min) {
					min = number;
				}

			} else {
				break;
				// System.out.println("Invalid Number");
			}
			scanner.nextLine(); // handle input
		}
		System.out.println("min = " + min + " max " + max);
		scanner.close();
	}

}
