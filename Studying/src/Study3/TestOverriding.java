package Study3;

public class TestOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Overiding fedex = new Overiding();
		
		fedex.calculatearea(3, 3);
		
		
		
		OverridingOne ups = new OverridingOne();  
		                                           //test class access the methods of both classes becasue class Testinheritance extends 
		                                          // clsass inheritance
		ups.calculatearea(4, 4);        //this will call the method of subclass instead of superclass due to the overiding 
		                                //calculatearea is same method in super and sub class
		
		ups.calculateVolume(4, 4, 4);
		
		

	}

}
