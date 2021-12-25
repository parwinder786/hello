package Study2;

public class TestClassThreePassParamter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		CLassthreePassParameter ups = new CLassthreePassParameter();
		CLassthreePassParameter frdex = new CLassthreePassParameter();
		
			/*ups.length = 6;
		     ups.width = 7;
		     int area1= ups.calculatearea(4);*/
		     
		ups.length = 6;
	     ups.width = 7;
	     int area1= ups.calculatearea(4,8);    //calculating passing aruguments intead of class values-passing arguments takes priority 
	                                          // over class level data with same name
	                                        
		     
		     
		     
		  /*   frdex.length = 18;
		     frdex.width = 77;
		    int area2 =  frdex.calculatearea(5)*/;
	     
	     frdex.length = 18;
	     frdex.width = 77;
	    int area2 =  frdex.calculatearea(5,4);            //this keyword is used to make priority of class data over passing arguments
	    		
	    		
		     
		     System.out.println("total area of   ="+ (area1 + area2));
			
	}

}
