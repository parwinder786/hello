package challengesChapter5ControlFlow;

public class isPalindrome {

	public static void main(String[] args) {
		// isPalindrome(121);
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int number) {
		int intialNumber = number; // 121
		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10); // 121%10=1   12%10=2(1*10+2=12) 1%10 = 1 (12*10+1=121)
			number /= 10; // 121/10=12  12/10 = 1 1/10=0
		}
		return reverse == intialNumber;
	}
}
