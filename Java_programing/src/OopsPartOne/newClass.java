package OopsPartOne;

public class newClass {
	// public is access modifier (unrestricted access to class)
	// private is access modifier (No class can access to class)
	// protected is access modifier (restricted access to class only in package)

	// defined a class with basic field

	private int door;
	private int wheels;
	private String model; // string is class, defined in class newClass
	private String engine;
	private String color;

	public void setModel(String model) { // setter method is to test the parameters should be defined in if condition
		String validModel = model.toLowerCase();
		if (validModel.equals("maverick") || validModel.equals("bmw")) {
			this.model = model;
		} else {
			this.model = "UNKNOWN"; // it print unknown if other than bww or maverick
		}
		// this.model = model; // with the help of this, class variable above can be
		// updated with parameter
		// without this it will not reference to the above class variable
	}

	public String getModel() { // getter method
		return this.model;
	}

}
