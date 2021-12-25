package Study6;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic obj = new Generic ();
		obj.isequal(9, 9);
		//obj.isequal("Hello","Hello");  we cant use strring in this method 
		obj.isequalGeneric(10, 10);
		
		obj.isequalGeneric("hello","Hello");      
		
		obj.isequalGeneric("hello",10); 
		
		
 
	}

}
