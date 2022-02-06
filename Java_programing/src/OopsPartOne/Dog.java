package OopsPartOne;

// class is created to inherit from InheritanceMain 
public class Dog extends InheritanceMain {

	// it will show errors unless you create constructor

	private int eyes, legs, tails, teeth;
	private String coat; // adding new characters for dog

	public Dog(int size, int weight, String name, String coat, int eyes, int legs, int tails, int teeth) {
		super(1, 1, size, weight, name); // super mean using values from inheritance class
		// 1 is brain and removed from argument error is gone
		this.eyes = eyes;
		this.legs = legs;
		this.tails = tails;
		this.teeth = teeth;
		this.coat = coat;

	}

	private void chew() {
		System.out.println("Dog class chew method is called");
		// private method cannot be accessed outside of class
	}

	public void eat() {
		System.out.println(" the dog eat class method is called");
		chew(); // chew is called inside the class and will called if eat method called outside
				// of class
	}

	public void walk() {
		System.out.println(" the dog walk class method is called & called the move from Inheritance class");
		//move(5);
		super.move(5); // to call the parent class method 
	}

	public void run() {
		System.out.println(" the dog run class method is called");
		move(10);
	}
	
	private void moveLegs(int speed) {
		System.out.println(" Dog movelegs private method called ");
	}
	public void move(int speed) {
		
		System.out.println(" the dog overrided move class method is called");
		moveLegs(speed);
		
	}

}
