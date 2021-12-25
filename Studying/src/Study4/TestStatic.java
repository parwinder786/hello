package Study4;

public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Staticc obj = new Staticc();    //execute here the static block of code is fired before constructor
		
		//Staticc obj2 = new Staticc();    // for 2nd object only constructor is fired & block of code is not fired 
		                                  // block of code is fired only once 
		
		
		obj.staticmethod();              //calling static method twice
		obj.staticmethod();
		
		
		Staticc.staticmethod();         /// calling static method by class name instead of object 
		
		//Staticc.                we cant call non static method by using class name directly
		
		
		obj.nonstatic();               //calling non static method twice
		obj.nonstatic();
		
		System.out.println("---------------------------");
		
		Staticc obj2 = new Staticc(); 
		
		obj2.staticmethod();
		obj2.staticmethod();  //obj2 callling static method twice  //obj2 will not have fresh copy of data it will take the static data
		                         // from obj first start from 2 
				
		obj2.nonstatic();		
		obj2.nonstatic();      // obj2 calling nonstatic method twice  //it take data as fresh start from 0 
		
	}	
}
