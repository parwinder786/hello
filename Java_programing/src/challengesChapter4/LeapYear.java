package challengesChapter4;

public class LeapYear {
	
	    public static void main (String[]args){
	    	
	    	System.out.println(isLeapYear(2400));
	    }
	    public static  boolean isLeapYear(int year ){
	    	 if(year>=1 && year<=9999) {
	    		int leap = year%4;
	    		int leap2 = year%100;
	    		int leap3 = year%400;
	    		
	    		if(leap==0 && (leap2!=0 || leap3==0)) {
	    			return true;
	    		}else{
	    			return false;
	    		}	    		 
	    	 }
	    		    		  
			return false;	    	 
	     }	
}
