package StringMethods;

public class Practise {

	public static void main(String[] args) {
		StringBuffer abc = new StringBuffer("hello");
		System.out.println(abc.reverse());
		String ab = "this is real madrid";
		int distinct =0;
		for(int i=0;i<ab.length();i++){
			for(int j=0;j<ab.length();j++){
				if(ab.charAt(i)==ab.charAt(j)){
					distinct++;
				}
			}
			System.out.println(ab.charAt(i)+" "+distinct);
			String abcd = String.valueOf(ab.charAt(i)).trim();
			ab=ab.replaceAll(abcd,"");
			distinct=0;
			
		}

	}

}
