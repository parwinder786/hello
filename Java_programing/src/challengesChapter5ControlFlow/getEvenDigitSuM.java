package challengesChapter5ControlFlow;

public class getEvenDigitSuM {

	public static void main(String[] args) {

		System.out.print(getEvenDigitSum(214));

	}

	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		int sum = 0; // sum is initialize sum outside of while loop

		while (number > 0) { // loops runs while number is greater than 0
			if (number % 2 == 0) { // if statement checks for even number, if even number runs next line
				sum = sum + number % 10; // adds the remainder of number to sum 4  2
			} // if the statement false/odd passes line & skips the above line
			number /= 10; // reduces number by one decimal point by setting equal to number 21

		}
		return sum;
	}
}
