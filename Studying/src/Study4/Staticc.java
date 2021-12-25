package Study4;

public class Staticc {
	
	
	          static int staticab;          //static variable
	          
	          int nonstaticab;
	                                          //non static variable
	          
	         static public void staticmethod() {                              //static method
	        	  System.out.println("static b=variable - = "+staticab);
	        	  staticab ++;
	        	  
	        	  
	          }                                             // non static method
	           public void nonstatic() {
	        	   System.out.println("non staticvariable = ="+nonstaticab);
	        	   nonstaticab ++;
	        	   
	           }
	           
	           static {
	        	   System.out.println("static block of code");
	           }
	           Staticc (){
	        	   System.out.println("constructor with same name of class");
	           }
	           
           
}
