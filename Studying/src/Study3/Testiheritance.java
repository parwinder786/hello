package Study3;

public class Testiheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance fedex = new Inheritance();
		
		fedex.calculatearea(3, 3);
		
		
		
		InheritanceOne ups = new InheritanceOne();  
		                                           //test class access the methods of both classes becasue class Testinheritance extends 
		                                          // clsass inheritance
		ups.calculatearea(4, 4);
		ups.calculateVolume(4, 4, 4);
		
	}
	
	
	

}
