package TestCases;

import java.util.Date;

public class TimeStamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                 Date d = new Date();
                 System.out.println(d.toString().replace(":", "_").replace(" ", "_")+".jpg");
                 		
                 
	}

}
