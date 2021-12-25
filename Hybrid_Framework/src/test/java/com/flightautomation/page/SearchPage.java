package com.flightautomation.page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.flightautomation.base.BaseClass;

public class SearchPage extends BaseClass {

	By findFlights = By.xpath("//input[@name='findFlights']");
	By flyToMonth = By.name("toMonth");

	
	public void findingFlight() {

		selectByIndex(flyToMonth, 2);

		selectByVisibleText(flyToMonth, "July");

		selectByValue(flyToMonth, "4");
	}

	public void clickFindFlights() {
		click(findFlights);
	}

}
