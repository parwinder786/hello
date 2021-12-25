package Study5;

public class Throwss {

	                 public  int dividenum(int a, int b) throws Exception {   //throw exception is used to overcome the error 
	                	 int c = 0;
	                	 
	                	 
	                	              
	                	 try {
							c = a/b;
						} catch (Exception e) {    //exception usally depends on the accessing class of this method becasue accessing class
							                       // has to put data in by using this class methods
							                      // to overcome the wrong data by second class we can use throw 
							
							//e.printStackTrace();
							
							System.out.println("throwss class exception ");
							
							throw new Exception("check your numbers"); // to overcome erros we have to declare throw exception 
							                                             // in the starting of method
							                          //give msg to calling program 
						}
	                	 
	                	return c;
	                 }
	
	
}
