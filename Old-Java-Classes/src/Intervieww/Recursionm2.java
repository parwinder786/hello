package Intervieww;

public class Recursionm2 {

	public static void main(String[] args) {
                   String ac = "java";
                   
                  
          char[] arry = ac.toCharArray();
          int len=ac.length();
          for(int i =len - 1; i >= 0;i--) {
        	  
        	System.out.println(arry[i]);
          
                  /* char[] strarry= ac.toCharArray();
                   int abc = ac.length();
                   for (int i =abc - 1; i >= 0; i--)
                   {
                       System.out.print(strarry[i]);    
                   }*/ 
                StringBuffer ab = new StringBuffer("hello");
                System.out.println(ab.reverse());
              
          }                
	}
}


      