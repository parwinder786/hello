package challengesChapter5ControlFlow;

public class printFactorNo {

	public static void main(String[] args) {
		printFactors(6);

	}

	public static void printFactors(int number) {
		if(number<1) {
			System.out.println("Invalid value");
		}
		else {
			for(int i=1;i<=number;i++) {
		if(number%i==0) 
			System.out.println(i);
		
			}
		}
	}
}
