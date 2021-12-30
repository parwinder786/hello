package challengesChapter4;

public class MegaByteConvertor {
	
	public static void main(String[]args) {
		 printMegaBytesAndKiloBytes(2500);
		
	}
        
	public static void printMegaBytesAndKiloBytes(int kiloByte){
		
		  if(kiloByte<0) {
			  System.out.println("Invalid Value");
		  }
		  else {
			    int MB = kiloByte/1024;
			    int KB = kiloByte%1024;
			    System.out.println(kiloByte+ " KB = " +MB+ " MB and "+KB+ " KB");
			    		
			  
		  }
	     
	 }
}
