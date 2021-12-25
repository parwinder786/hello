package statickeyword;

public class Teststatic {

	public static void main(String[] args) {
		statisex obj = new statisex ();
		//statisex obj2 = new statisex ();
		obj.staticmethod();
		obj.staticmethod();
		statisex.staticmethod();
		//statisex.nonstatic you cant call non static by this
		//only static method can be called
		obj.nonstaticmethod();
		obj.nonstaticmethod();
		statisex obj2 = new statisex ();
		obj2.staticmethod();
		obj2.staticmethod();
		
		obj2.nonstaticmethod();
		obj2.nonstaticmethod();
		
		

	}

}
