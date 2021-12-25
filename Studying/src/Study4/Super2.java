package Study4;

public class Super2 extends Super{
	
	     public  void calculatevolume(int length, int width, int height) {
	    	 
	    	                                                  //we can use the length & width values of super class  
	    	                                                // into super2 class and then multiply by height 
	    	                                         //super keyword is uder to acccess the data of super class
	    	 
	    	 
	    	 double volume = super.calaulatearea(length, width)*height;
	    	 System.out.println("volume   = "+volume);
	    	 
	    	 
	     }

}
