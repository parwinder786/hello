package StringMethods;

public class Stringbufffer {

	public static void main(String[] args) {
		StringBuffer ab=new StringBuffer("parwinder");
		ab.append("hello");
		System.out.println(ab);
		System.out.println(ab.reverse());
		
		String abc= new String("parwinder");
		abc.concat("hello");
		System.out.println(abc);
		
		/*
		StringBuffer sb=new StringBuffer("Hello ");  
		sb.insert(1,"Java");//now original string is changed  
		System.out.println(sb);//prints HJavaello  
*/		
        /*       
		StringBuffer ab = new StringBuffer("java");
		ab.replace(3, 4, "hello");
		System.out.println(ab);*/
		/*StringBuffer sb=new StringBuffer("Hello");  
		sb.delete(1,3);  
		System.out.println(sb);*/
		
		/*StringBuffer sb=new StringBuffer("Hello");  
		sb.reverse();
		System.out.println(sb);*/
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);

		
		
	}

}
