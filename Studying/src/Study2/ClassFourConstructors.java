package Study2;

public class ClassFourConstructors {
	

	int length;
	int width;
	
	
	ClassFourConstructors(){
		this.length=5;                                            //construcor is method same name as class
		this.width =6;                                           //executed when object is created
		System.out.println("constructor is fired");            //used to set default values
                                                             //constructor does not return anything including void
		}
	
	

	ClassFourConstructors(int length, int width){
		this.length=length;                                            //constructor is method same name as class
		                                                              // passing arguments in constructor 
		this.width =width;                                             
		System.out.println("constructor is fired for 2nd time");                                                         
                                                                     
		}
	
	
	void calculatearea() {
		int area = length*width;
		System.out.println("area   is " +area);   //construcor is method same name as class
		                                          //executed when object is created
		                                          //used to set default values
		                                          //constructor does not return anything including void
	}
	

}
