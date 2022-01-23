package challengesChapter6;

public class ComplextNumber {

	private double real, imaginary;

	public ComplextNumber(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public double getReal() {
		return this.real;
	}

	public double getImaginary() {
		return this.imaginary;
	}

	public void add(double real, double imaginary) {
		this.real += real;
		this.imaginary += imaginary;

	}

	public void add(ComplextNumber complexNumber) {
		add(complexNumber.getReal(), complexNumber.getImaginary());
	}

	public void subtract(double real, double imginary) {
		this.real -= real;
		this.imaginary -= imaginary;
	}

	public void subtract(ComplextNumber complexNumber) {
		subtract(complexNumber.getReal(), complexNumber.getImaginary());
	}

}
