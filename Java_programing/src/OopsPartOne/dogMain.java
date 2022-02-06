package OopsPartOne;

public class dogMain {

	public static void main(String[] args) {
		// Calling InheriteanceMain & Dog classes

		InheritanceMain obj = new InheritanceMain(1, 1, 5, 5, "AnimalClass");

		Dog dog = new Dog(8, 20, "Ali", "LongTai", 2, 4, 1, 32);
		// dog.eat();
		dog.walk();
		// dog.run();

	}

}
