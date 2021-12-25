package InterviewOne;




public class thompson {
	

	public static void main(String[] args) {
		
		String ab ="jaspreet kaur";
		
		String  sum =" ";
		
		
		for(int i=ab.length()-1;i>=0;i--) {
			
			sum=sum+ab.charAt(i);
		}
		
		System.out.println(sum);
		
		            
	}

}