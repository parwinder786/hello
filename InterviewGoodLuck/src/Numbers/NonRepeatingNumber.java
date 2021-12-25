package Numbers;

public class NonRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "hah";
		  System.out.println("The given string is: " + str1);
		  for (int i = 0; i < str1.length(); i++)   //i=1
		  {
		   boolean unique = true;
		   
		   for (int j = 0; j < str1.length(); j++) {   // j=0
		    if (str1.charAt(i) == str1.charAt(j) && i != j) {  
		    //false                               (true  )                        
		    	unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
		  }
	}

}
