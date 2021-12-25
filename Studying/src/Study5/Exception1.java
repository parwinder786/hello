package Study5;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		int d[]  = new int [3];
		
		int a =10;
		int b =0;
		int c= 0;
		//c= a/b;             // run time exception   or a/d will be compile time exception 
		                       // to handle the exception we have to cover the code with try catch exception 
		try {
		d[3] = 10;
		c= a/b;
		}catch (Exception e) {
			System.out.println("Exception occured " );
			
			System.out.println("exception type == "+e);    // will verify the type of exception 
			e.printStackTrace();   //where exception occured 
		
		}finally {
			System.out.println("finally will always run");    //either you have exception or no the it will always run due to finally keyword
		}
		
		
			
		System.out.println("c   == "+c);
		
		
		
		
	}

}
