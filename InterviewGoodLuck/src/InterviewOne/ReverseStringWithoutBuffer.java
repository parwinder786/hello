package InterviewOne;

public class ReverseStringWithoutBuffer {

	public static void main(String[] args) {
		
		String ab="java";
		
		String result=" ";
		for(int i=ab.length()-1;i>=0;i--) {
			
			result= result+ab.charAt(i);
		}
		System.out.println(result);

	}

}
