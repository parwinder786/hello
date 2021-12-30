package challengesChapter4;

public class TeenNumberChecker {

	public static void main(String[] args) {
	
         System.out.println(hasTeen(14,66,99));
         System.out.println(isTeen(15));
	}

	
	public static boolean hasTeen(int no1, int no2, int no3) {
		if((no1>=13 && no1<=19)|| (no2>=13 && no2<=19) ||(no3>=13 && no3<=19)) {
		return true;
	}else {
		return false;
	}
}
	
	    public static boolean isTeen(int no) {
	    	if( no>=13 && no<=19) {
	    		return true;
	    	}else {
	    		return false;
	    	}
	    	
	    }
}