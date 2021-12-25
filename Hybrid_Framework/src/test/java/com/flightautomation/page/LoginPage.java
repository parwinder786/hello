package com.flightautomation.page;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.flightautomation.base.BaseClass;

public class LoginPage extends BaseClass {

	By userName = By.name("userName");
	By password = By.name("password");
	By loginButton = By.name("login");

	
	public void loginToFlightApplication() {
		sendKeysUserName();
		sendKeysPassword();
		login();

	}

	public void sendKeysUserName() {
		sendKeys(userName, "sbhinge");

	}

	public void sendKeysPassword() {
		sendKeys(password, "sbhinge");

	}

	public void login() {
		click(loginButton);

	}
}
