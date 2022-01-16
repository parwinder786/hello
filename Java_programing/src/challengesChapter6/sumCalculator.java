package challengesChapter6;

public class sumCalculator {

	private double firstNumber;
	private double secondNumber;

	public double getFirstNumber() {
		return this.firstNumber;
	}

	public double getSecondNumber() {
		return this.secondNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getAdditionResult() {
		double addtion = this.firstNumber + this.secondNumber;
		return addtion;
	}

	public double getSubtractionResult() {
		double minus = this.firstNumber - this.secondNumber;
		return minus;
	}

	public double getMultiplicationResult() {
		double multiply = this.firstNumber * this.secondNumber;
		return multiply;
	}

	public double getDivisionResult() {
		if(secondNumber==0.0) {
			return 0;
		}
		double Divison = this.firstNumber / this.secondNumber;
		return Divison;
	}
}
