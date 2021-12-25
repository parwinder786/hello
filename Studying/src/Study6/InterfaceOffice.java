package Study6;

public interface InterfaceOffice {   // to create interface right click on package and select new as interface
	
	             public void New();
	             public void open();
	             public void save();
	             
	           // void print ();    // if we add new method then it will cause issues for implemeting class
	             
	             default void print() {
	            	 System.out.println("print method");  //default method will make easy for creating new methods for  all across classes
	            	                             //just have create the new method in interface 
	            	 
	             }	            
	             
                             
}
