package challengesChapter5ControlFlow;

public class primeNumber {

	public static void main(String[] args) {
		// The first few prime numbers are as follows: 2, 3, 5, 7, 11, 13, 17, 19, 23,
		// 29, 31, 37,
		// System.out.println(isPrime(9));

		// for (int i = 2; i < 100; i++) {
		// System.out.println("Number " + i + " is "+isPrime(i));
		// }

		for (int i = 2; i < 100; i++) {
			if (isPrime(i)) {
				System.out.println("Number " + i + " is prime number ");
				//if(i ==7) {    to get prime number till 7, use the if statement 
				//	System.out.print("existing the loop");
				//	break;
				//}
			}
		}

	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
