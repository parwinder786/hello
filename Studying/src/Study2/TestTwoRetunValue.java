package Study2;

public class TestTwoRetunValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ClassTwoRetunMethod ups = new ClassTwoRetunMethod();
		ClassTwoRetunMethod frdex = new ClassTwoRetunMethod();
		
			ups.length = 19;
		     ups.width = 20;
		     int area1= ups.calculatearea();
		     
		     
		     
		     
		     
		     frdex.length = 18;
		     frdex.width = 77;
		    int area2 =  frdex.calculatearea();
		     
		     System.out.println("total area of   ="+ (area1 + area2));  //use curly bracket for addition otherwise it will concatenate
			
	}

}
