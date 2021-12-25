package UdemyInterviewJava;

public class ReverseEACHword {

	public static void main(String[] args) {
		
		String str = "how are you "; //woh era uoy
		String finalresult ="";
		
		String [] arr = str.split("\\s"); // split based on space
	
		
		String result ="";
		
		for ( String word : arr) {
			
	
			
			int j = word.length()-1;
			//how first word of j
			while (j>=0) {
				char ch =word.charAt(j);
				result = result+ch;
				j--;
			}
			finalresult = finalresult +" "+result;
			
			
		}
		
			System.out.println(finalresult);	

	}

}
