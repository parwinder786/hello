package Study6;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Encapuslation  obj = new Encapuslation ();
		
		//obj.pinno=22;                     //updating pin and can withdraw the money without old pin 11  -security breach you can update the 
		                              // acc no too so this info needs to be constant 
		
		
		obj.updatepin(1234, 11, 333);	  //updating the pin	
		//obj.withdraw(1234, 22, 400);
		
		obj.withdraw(1234, 333, 800);     //you will able to take the money out  after updating the pin value
		
		//obj.withdraw(1234, 11,300);
		
		
		// we are accessing the private pin through methods and variable of parent class which is called encapsulation 
		//instead of calling the data member directly must wrap with methods
		

	}

}
