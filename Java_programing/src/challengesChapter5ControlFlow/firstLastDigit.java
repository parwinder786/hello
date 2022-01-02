package challengesChapter5ControlFlow;

public class firstLastDigit {

	public static void main(String[] args) {

		sumFirstAndLastDigit(2235);
	}

	public static int sumFirstAndLastDigit(int number) {
		if (number < 0) {
			return -1;
		}
		int num = number; // 123 1235
		int lastDigit = num % 10; // 123%10=3 1235%10= 5
		while (num > 9) {
			num = num / 10; // 123/10 = 12 12/10= 1 2235/10=223 223/10 =22 22/10 = 2
		}
		System.out.println(lastDigit + num);
		return lastDigit + num;
	}

}
