package challengesChapter6;

public class sumCalulatorMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumCalculator calculator = new sumCalculator();
		calculator.setFirstNumber(5.25);
		
		System.out.println(calculator.getFirstNumber());
		
		calculator.setSecondNumber(0);
		
		System.out.println(calculator.getSecondNumber());
		
	System.out.println("add= "+calculator.getAdditionResult());
	
	System.out.println("subtract= "+calculator.getSubtractionResult());
	
	System.out.println("Multiply= "+calculator.getMultiplicationResult());
	
	System.out.println("Divison= "+calculator.getDivisionResult());
	
	}

}
