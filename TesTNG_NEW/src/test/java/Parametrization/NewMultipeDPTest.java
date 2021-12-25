package Parametrization;

import org.testng.annotations.Test;

public class NewMultipeDPTest {

	
    @Test(dataProviderClass=MutltipleDataProvider.class,dataProvider="dp1")
    public void dologin(String username, String password) {
   	     
   	 System.out.println(username+"------------"+password);  //keeping data provider in separate folder
    }
    
    @Test(dataProviderClass=MutltipleDataProvider.class,dataProvider="dp2")
    public void douseregis(String fname, String lname ,String emaild) {
   	     
   	 System.out.println(fname+"------------"+lname+"-------------"+emaild);  //keeping data provider in separate folder
    }
    
    
    
}
