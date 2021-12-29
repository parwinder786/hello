package ExpressionsStatementdsCodeBlocks;

public class MethodOverloading {

	public static void main(String[] args) {

// Same method name with different parameters.If you change the return type then it does not overload the method.
//Method overloading is feature that allows us to have more than one method with same name, so long we use different parameters

		System.out.println(calculateScore("john", 22));

		System.out.println(calculateScore("john", 22, 23));

		System.out.println(calculateScore());
	}

	public static int calculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " Scored " + score);
		return score * 1000;
	}

	public static int calculateScore(String playerName, int score, int age) {
		System.out.println("Player " + playerName + " Scored " + score + " at the age of " + age);
		return score * 1000;
	}

	public static int calculateScore() {
		return 0;
	}

}
