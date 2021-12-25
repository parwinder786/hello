package Study6;

public class Generic {
       public void isequal(int var1, int var2) {
    	   if(var1 == var2) {
    		   System.out.println("both are qual(int)");
    	   }
    	   else {
    		   System.out.println("not equal (int)");
    	   }
       }
       public <T>void isequalGeneric(T var1, T var2) {       // with the use if T the method is became generic , now you can send any data type 
    	   if(var1 == var2) {
    		   System.out.println("both are qual");
    	   }
    	   else {
    		   System.out.println("not equal");
    	   }
       }
}
