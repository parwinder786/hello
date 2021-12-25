package Parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MutltipleDataProvider {
	
	             @Test(dataProvider="dp1")
	             public void dologin(String username, String password) {
	            	     
	            	 System.out.println(username+"------------"+password);
	             }

	             @DataProvider(name="dp1")
	             public Object[][] getdata() {
	            	 //dataprovider is annotation which is used to provide data from excel to test method above
	            	 
	            	 //return type should not be void because data any be anything in excel-it-string-boolean
	           //so we will object as retrun data [][]means column and row from excel
	           Object[][] data = new Object [3][2];
	           data[0] [0]= "ghdgfgg.com";
	           data [0][1] ="asas";
	           
	           data[1] [0]= "gdfgg.com";
	           data [1][1] ="as";
	           
	           data[2] [0]= "gg.com";
	           data [2][1] ="s";
	           
	           
	           
	           return data;
	           
	        		             	 
	            	 
	             }
	             @DataProvider(name="dp2")
	             public Object[][] getdata2() {
	            	 //dataprovider is annotation which is used to provide data from excel to test method above
	            	 
	            	 //return type should not be void because data any be anything in excel-it-string-boolean
	           //so we will object as retrun data [][]means column and row from excel
	           Object[][] data = new Object [3][3];
	           data[0] [0]= "ghdgfgg.com";
	           data [0][1] ="asas";
	           data [0][2] ="emailcpm,";
	           
	           
	           data[1] [0]= "gdfgg.com";
	           data [1][1] ="as";
	           data [1][2] ="assss";
	           
	           
	           data[2] [0]= "gg.com";
	           data [2][1] ="sdd";
	           data [2][2] ="sgdfhjgfg";
	           
	           
	           return data;
}
}