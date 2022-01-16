package OopsPartOne;

public class objectCLass {

	public static void main(String[] args) {
		// create objects
		newClass fordCar = new newClass();
		// create new datatype or object of newClass or based of the template newClass
		newClass bmwCar = new newClass();

		// ford.model="hhh"; // if in the newClass public String model; is defined, we
		// can set the value here

		System.out.println("model is " + fordCar.getModel()); // it will return null, no value is setModel
		fordCar.setModel("Maverick"); // method is called in this class to set the model
		System.out.println("model is " + fordCar.getModel()); // method is called to get the passed value

	}

}
