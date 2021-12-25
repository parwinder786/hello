package com.flightautomation.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.flightautomation.base.BaseClass;
import com.flightautomation.page.CreateFlightPage;
import com.flightautomation.page.LoginPage;
import com.flightautomation.page.LogoutPage;
import com.flightautomation.page.SearchPage;

public class TestCaseFlightTicketsBooking extends BaseClass {
	
	
	
	@Test
	public void loginFlightApplicationTestCase() {
	
		LoginPage loginPage = new LoginPage();
		loginPage.loginToFlightApplication();
		
		SearchPage searchPage = new SearchPage();
		searchPage.findingFlight();
		searchPage.clickFindFlights();
		
		
		CreateFlightPage createflight = new CreateFlightPage();
		createflight.bookingFLight();
		
		
	    LogoutPage logOut = new LogoutPage();
	    logOut.logout();
		

		
		
		
	}	
}
