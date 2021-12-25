package Study2;

public class ClassTwoRetunMethod {
	
	
	int length;
	int width;
	int calculatearea() {
		int area = length*width;
		System.out.println("area   is " +area);    // to return value to method use return and data type front of method name(int instead of void
		
		return area;
		
		
	}

}
