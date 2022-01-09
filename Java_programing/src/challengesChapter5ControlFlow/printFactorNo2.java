package challengesChapter5ControlFlow;

public class printFactorNo2 {

	public static void main(String[] args) {

		System.out.println(printPerfectNo(6));

	}

	public static boolean printPerfectNo(int number) {
		// int sum,addition;
		if (number < 1) {
			return false;
		}

		else {
			int sum = 0;
			for (int i = 1; i < number; i++) {

				if (number % i == 0) {
			
				sum = sum + i;
				System.out.println(sum);
				}
			}
			return (sum == number);
		}
	}
}
