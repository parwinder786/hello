package challengesChapter4;

public class EqualSumChecker {

	public static void main(String[] args) {


		System.out.println(hasEqualSum(3,3,6));
		System.out.println(hasEqualSum(3,3,7));
	}
    
	public static boolean hasEqualSum(int a, int b, int c) {
		int d = a + b;
		if(d==c) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
