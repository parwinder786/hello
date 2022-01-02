package challengesChapter5ControlFlow;

public class lastDigitChecker {

	public static void main(String[] args) {
		
		System.out.println(hasSharedDigit(23,32,42));
		System.out.println(hasSharedDigit(9,99,999));
	}

	public static boolean hasSharedDigit(int no1, int no2, int no3) {
		if (no1 < 10 || no1 > 99 || no2 < 10 || no2 > 99 ||no3<10||no3>1000) {
			return false;
		} else {
			int no1A = no1 / 10; // 1 1 1
			int no1B = no1 % 10; // 5 2 8
			int no2A = no2 / 10; // 5 5 2
			int no2B = no2 % 10; // 5 5 8
			int no3A = no3 / 10; // 5 5 2
			int no3B = no3 % 10; // 5 5 8
			
			return ((no1B == no2B || no1B == no3B) || (no2B == no3B));
			// return true;
		}
	}

}
