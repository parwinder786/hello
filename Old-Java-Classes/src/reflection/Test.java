package reflection;

public class Test {
	public static void main(String[] args){
		Employee alex = new Employee ();
		//validator is static class so dont need to create objects
		//just call class and validate method
		Validator.Validate(alex);
		
		
		
		
	}

	
	
}
