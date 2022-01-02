package challengesChapter5ControlFlow;

public class sumAndFive {

	public static void main(String[] args) {

		int count, sum;
		count = 0;
		sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				count++;
				sum = sum + i; // sum+=i;

				System.out.println("Found number = " + i);
			}
			if (count == 5) {

				break; // if find the 5 number then it will break
			}

		}
		System.out.println("sum = " + sum);

	}

}
