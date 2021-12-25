package Study3;

//subclass

public class OverridingOne extends Overiding {

	
public void calculateVolume(int length, int width, int height) {
		
		System.out.println("volume   is " +(length*length*height));    //class has its own methods 
				
}
         public void calculatearea(int length, int width) {           //class has same method name as parent class
	
	         System.out.println("sub area   is " +(length/length));
}
}
