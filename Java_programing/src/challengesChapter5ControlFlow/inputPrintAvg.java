package challengesChapter5ControlFlow;

import java.util.Scanner;

public class inputPrintAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		int count = 0;

		while (true) {
			System.out.println("Enter the number : ");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int number = scanner.nextInt();
				sum = sum + number;
				count++;
				avg = sum / count;

			} else {

				System.out.println("SUM = " + sum + " AVG = " + avg);
				break;
			}
			scanner.nextLine();
		}
		// System.out.println("sum = " + sum);
		// System.out.println("avg = " + avg);
		scanner.close();
	}

}
