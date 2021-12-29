package ExpressionsStatementdsCodeBlocks;

public class controlStatements {

	public static void main(String[] args) {

		// If keyword
		int score = 1000;
		if (score < 1000) {
			System.out.println("same score");
		} else if (score > 1000) {
			System.out.println("not same score");
		} else {
			int abc = 20;
			System.out.println("no match");
		}
		// int bcd = abc; it can not defined because abc is used inside the block
		calculatescore();

	}

	// methods
	public static void calculatescore() {
		System.out.println("the menthoed is created & called");
		
	}

}
