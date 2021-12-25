package Intervieww;


public class TrycatchFinaaly {

	public static void main(String[] args) {
		int a,b,c;
		try {
			a=10;
			b=10;
			c=a/b;
			System.out.println(c);
	} catch (Exception e) {
			System.out.println(" exception occured = "+e.getMessage());
		}
	 finally{                                      
  	  System.out.println("will always run");
  	  System.out.println("afsdgafd");
    }
		

	}

}
