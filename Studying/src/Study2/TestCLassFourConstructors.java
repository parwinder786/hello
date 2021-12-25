package Study2;

public class TestCLassFourConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassFourConstructors obj = new ClassFourConstructors();
		obj.calculatearea();         //withput seetig up default value result will be 0 
		
		ClassFourConstructors obj2 = new ClassFourConstructors(3,4);   //calling 2nd constructor with arguments
		obj2.calculatearea();
		
		
		
	}

}
