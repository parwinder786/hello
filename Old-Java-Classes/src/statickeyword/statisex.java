package statickeyword;

public class statisex {
        static int staticvariable;
        int nonstaticvariable;
        static public void staticmethod()
        {
        	System.out.println("staticvariable = " + staticvariable);
        	staticvariable ++;
        }
        
        public void nonstaticmethod()
        {
        	
        	System.out.println("nonstaticvariablr = " + nonstaticvariable);
        	nonstaticvariable++;
        }
        static {
        	System.out.println("static block of code");
        }
        statisex(){                     
        	System.out.println("constructor");
        	
        }
        
}
