package MethodWriting;

public class CharacterOccurance {

	
	  static void repeatno(String ab) {
		  
		  int no =ab.length()-ab.replace("i","").length();
		  System.out.println(no);
	  }
	
	public static void main(String[] args) {
		
		CharacterOccurance.repeatno("this is real madrid");

	}

}
