package com.flightautomation.page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.flightautomation.base.BaseClass;

public class CreateFlightPage extends BaseClass {
         
	  By selectflight = By.xpath("//input[@name='reserveFlights']");
	  By bookflight = By.xpath("//input[@name='reserveFlights']");
	
	  
	  public void bookingFLight() {
		  selectFlight();
		   bookFlight();
		  
	  }
	  public void selectFlight() {		  
		  click(selectflight);
		  		  
	  }	
	  
	  public void bookFlight() {		  
		  click(bookflight);
			  
	  }	
}
