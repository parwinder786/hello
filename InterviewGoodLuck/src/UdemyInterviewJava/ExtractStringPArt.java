package UdemyInterviewJava;

public class ExtractStringPArt {

	public static void main(String[] args) {
		String str= "www.facebook.com";
	       
	       String firstfour=str.substring(0, 5);  //end index is exclusive so when we need string part we have to substring method
	       System.out.println(firstfour);
	       
	       
	       String lastfour =str.substring(str.length()-4, str.length());
	       System.out.println("last four character are : "+lastfour);
	       
	       String between = str.substring(4,str.length()-4);
	       System.out.println(between);
	           

	}

}
