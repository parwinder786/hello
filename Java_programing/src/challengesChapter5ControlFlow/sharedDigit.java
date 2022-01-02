package challengesChapter5ControlFlow;

public class sharedDigit {

	public static void main(String[] args) {
		
            System.out.println("The number is = "+hasSharedDigit(15,55));
            System.out.println("The number is = "+hasSharedDigit(12,55));
            System.out.println("The number is = "+hasSharedDigit(18,28));
	}
	
	public static boolean hasSharedDigit(int no1,int no2) {
		if(no1<10||no1>99||no2<10||no2>99) {
			return false;
		}else {
			int no1A = no1/10;    //1     1      1
			int no1B = no1%10;    //5     2      8
			int no2A = no2/10;    //5     5      2
			int no2B = no2%10;    //5     5      8
			return ((no1A==no2A||no1A==no2B)||(no1B==no2A)||(no1B==no2B));
			//return true;
		}
	}
	

}
