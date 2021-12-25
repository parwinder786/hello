package Study7;

public class Testfunctional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		TestFuntionalI1 obj = new TestFuntionalI1();
		
		FunctionalInterfacee instance = obj::methodA;  //creating instance of interface class 
		
		System.out.println("class-fumctopnal interface == "  +instance.method(4));  // it will execute the method of testfuncational class1
		
		
		FunctionalInterfacee calca=(x) ->x*2;   //lambdas have to associated with a functional interface
		System.out.println("calculate  == "+calca.method(5));
		
		
		
	}

}
