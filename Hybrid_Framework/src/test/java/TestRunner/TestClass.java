package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.BaseClass;
import POM.BaseClass2;
import POM.POM;

public class TestClass extends BaseClass2 {

	@Test
	public void loginFlightApplication() {
		
		sendKeys(By.name("userName"), "sbhinge");
		sendKeys(By.name("password"), "sbhinge");
		click(By.name("login"));
	}
}
