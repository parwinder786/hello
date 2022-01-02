package challengesChapter5ControlFlow;

public class digitSum {

	public static void main(String[] args) {

		System.out.println("The sum of digits of number 125 is " + sumDigits(125));
		System.out.println("The sum of digits of number -125 is " + sumDigits(-125));
		System.out.println("The sum of digits of number 4 is " + sumDigits(4));
		System.out.println("The sum of digits of number 32123 is " + sumDigits(32123));

		int abc = 15%10;
		int ab = 15/ 10;
		System.out.println("the value of abc is " + abc);
		System.out.println("the value of abc is " + ab);
	}

	public static int sumDigits(int number) {
		if (number < 10) {

			return -1;
		}
		int sum = 0;
		// 125 /10 = 12 * 10 = 120 125 -120 = 5 to get the least significant digit

		while (number > 0) {
			// extract the least significant digit
			int digit = number % 10; // 5 2
			sum += digit; // 5 + 2 + 1
			// drop the least significant digit
			number /= 10; // same as number /12 1 0

		}
		return sum;

	}

}
