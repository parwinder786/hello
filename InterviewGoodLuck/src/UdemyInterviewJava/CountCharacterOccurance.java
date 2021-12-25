package UdemyInterviewJava;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String str = "this is real madrid";
		
		// abc is string and we will remove c then ab will be left and abc-ab will give to length of occurance of c
	
		
		int result =str.length()-str.replace("i","").length();

      System.out.println(result);
	}

}
