package generic;

public class Democalculate {

	public static void main(String[] args) {
                 Calculate obj = new Calculate();
                 obj.isequal(10,10); 
               obj.<Integer>isequalGeneric(10,10);
               
               
           //   obj.<String>isequalGeneric("hello","hello");
      System.out.println("generic return" + obj.isequalGeneric(10,10));
      System.out.println(obj.isequalGenericone(11.4,11.4));
      System.out.println(obj.isequalGenericone(10,11));
      System.out.println(obj.isequalGenericone("hello","hello"));
      obj.isequalgenericmulti(10.4, "hello");
      
                 
                 
                 

	}

}
