package OopsPartOne;

//class is created to inherit from InheritanceMain 

public class Fish extends InheritanceMain {

	private int gills, eyes, fins;

	public Fish(String name, int gills, int eyes, int fins) {
		super(1, 1, 1, 10, name);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}

	private void rest() {

	}

	private void movemusceles() {

	}

	public void swim(int speed) {
		movemusceles();
		super.move(speed);  // calling super method from inheritance class
	}

}
