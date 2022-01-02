package challengesChapter5ControlFlow;

public class sumOdd {

	public static void main(String[] args) {

		System.out.println(isOdd(5));

		System.out.println(sumOdd(100, 1000));

	}

	public static boolean isOdd(int number) {
		if ((number <= 0) || (number % 2 == 0)) {
			return false;
		} else {
			return true;
		}

		// return number % 2 != 0; //other way of defining the true

	}

	public static int sumOdd(int start, int end) {
		if ((end < start) || (start < 0) || (end < 0)) {
			return -1;
		}
		int sum = 0;

		for (int i = start; i <= end; i++) {
			if (isOdd(i)) {
				sum += i;
			}
		}
		return sum;

	}

}
