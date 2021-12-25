package  Study3;

public abstract class Abstract {     // to define empty method we have to define class as abstarct 

         public void calculateVolume(int length,int height) {
        	 
        	 double volume= calculateareabase(length)*height;
        	 
		
		System.out.println("volume   is " +(volume)); 
		
		
		
         }
         public abstract double calculateareabase(int length);       //empty method-to define empty abstract is added in front of method
               
}
