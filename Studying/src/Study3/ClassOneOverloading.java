package Study3;

public class ClassOneOverloading {
	
	
	void calculatearea(int length) {
		
		
		System.out.println("area   is " +(length*length));
	}
	
   void calculatearea(double length) {
		
		System.out.println("area   is " +(length*length));
	}
	
    void calculatearea(int length, int width) {
		
		System.out.println("area   is " +(length*length));      //methods same name  executed with different parameter
	}
    
    public void addition(int...a) {
    	 int [] var = a;
    	 
    	 for(int i =0; i<=var.length;i++) {
    		int b = var.length+i;
    		 System.out.println(b);
    		
    		 
    	 }
    	 
    	                    
    }
	

}
