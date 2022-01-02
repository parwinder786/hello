package challengesChapter4;

public class LeapYear {
	
	    public static void main (String[]args){
	    	
	    	System.out.println(isLeapYear(2022));
	    	System.out.println(getDaysInMonth(2,2022));
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
	    public static int getDaysInMonth(int month,int year) {
	    	if((month<1) || (month >12) || (year <1) || (year >9999 )) {
	    		return -1;
	    		
	    	}
	    	else if (isLeapYear(year) && month==2) {
	    		return 29;
	    	}
	    	else {
	    		switch (month) {
	    		case 4: case 6: case 9: case 11:
	    			return 30;
	    		case 2:
	    			return 28;
	    		default:
	    			return 31;
	    		}
	    		
	    	}
	    }
}
