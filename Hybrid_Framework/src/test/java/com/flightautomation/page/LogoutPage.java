package com.flightautomation.page;

import org.openqa.selenium.By;
import com.flightautomation.base.BaseClass;

public class LogoutPage extends BaseClass{
  
	       By loginout = By.xpath("//table/tbody/tr/td[3]/a/img");
	
	      
	       public void logout(){
	    	   
	    	   click(loginout);
	       }
}
