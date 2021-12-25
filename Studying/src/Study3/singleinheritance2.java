package Study3;

public class singleinheritance2 extends SingleInheritance{
	
	public static void main (String[]args) {
		
		
		singleinheritance2 obj= new singleinheritance2();
		obj.sound();                                       //object is created for this class 
		
		
	}
	
	public void sound() {
		System.out.println("sound method of child class"); //creating same method name in child class
	}
	
	

}
