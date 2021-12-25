package Study5;

public final class Finall {    // class is declared final now 
	
	//Final keyword can be applied to data methods & classes
	//final data is constant cannot be changed
	//final method cannot be overridden
	//final classes cannot be sub classed 
	
	 final double pi = 3.14;
	
	public final void methodA() {
		
		//final pi =4.0;                 //we cannot change data if already declared final will show error here
		
		System.out.println("pi   = "+pi);
	}
	

}
