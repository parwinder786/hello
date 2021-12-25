package Study2;

public class CLassthreePassParameter {
	

	int length;   //class level data
	int width;
	/*int calculatearea(int x) {
		int area = length*width*x;     //x is called passing argument
		System.out.println("area   is " +area);    // to return value to method use return and data type front of method name(int instead of void
		
		return area;
	}*/
		
	/*int calculatearea(int length, int width) {
		int area = length*width;     //passing argument will takes priority over class level values(if argument names are same)
	
		System.out.println("area   is " +area);    // to return value to method use return and data type front of method name(int instead of void
		
		return area;*/
		
		
		int calculatearea(int length, int width) {
			int area = this.length*this.width;     //this keyword is used to make priority of class values over passing arguments
		
			System.out.println("area   is " +area);    // to return value to method use return and data type front of method name(int instead of void
			
			return area;

}
}
