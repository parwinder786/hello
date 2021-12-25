package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass2 {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void browserOpen() {

		String browser = "chrome";

		if (browser == "firefox") {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\arman\\eclipse-workspace\\Hybrid_Framework\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser == "chrome") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\arman\\eclipse-workspace\\Hybrid_Framework\\Drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser == "IE") {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\arman\\eclipse-workspace\\Hybrid_Framework\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		System.out.println("before class is executed");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		wait = new WebDriverWait(driver, 30);
	}
	// To be inside test class
	/*
	 * @Test(priority = 1)public void loginFlightApplication() {
	 * 
	 * sendKeys(By.name("userName"), "sbhinge"); sendKeys(By.name("password"),
	 * "sbhinge"); click(By.name("login"));
	 * 
	 * 
	 * }
	 */

	public void sendKeys(By locator, String text) {
		Reporter.log("Enter Text '" + text + "' for Element : " + locator, true);
		try {
			WebElement web = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			if (web != null) {
				if (web.isEnabled()) {
					web.sendKeys(text);
				} else {
					Reporter.log("Enter Text '" + text + "' for Element : " + locator + " Element not disabled", true);
				}
			} else {
				Reporter.log("Enter Text '" + text + "' for Element : " + locator + " Element not found", true);
			}
		} catch (Exception e) {
			Reporter.log("Enter Text '" + text + "' for Element : " + locator + " Element not found", true);
		}

	}

	public void click(By locator) {
		// driver.findElement(locator).click();
		Reporter.log("Element information = " + locator, true);

		try {
			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(locator));
			if (button.isEnabled()) {
				button.click();
			} else {
				Reporter.log(" The element is not clickable " + locator + true);
			}
		} catch (Exception e) {
			Reporter.log("Exception occured " + e + true);
		}
	}

	public void submit(By locator) {
		Reporter.log("Element information = " + locator, true);
		try {
			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(locator));
			if (button.isEnabled()) {
				button.submit();
			} else {
				Reporter.log(" Submit button is not working " + locator + true);
			}
		} catch (Exception e) {
			Reporter.log(" Exception occured " + e + true);
		}
	}

	Select dropdown;

	public void selectByvalue(By locator, String value) {
		// dropdown = new Select(driver.findElement(locator));
		// dropdown.selectByValue(value);

		Reporter.log("Element information = " + locator, true);
		try {
			dropdown = new Select(driver.findElement(locator));
			Boolean select = wait.until(ExpectedConditions.elementToBeSelected(locator));
			
			//to do  
			
			if (select == true) {
				dropdown.selectByValue(value);
			} else {
				Reporter.log(" dropdown is not working  " + locator + true);
			}
		} catch (Exception e) {
			Reporter.log(" Exception occured " + e + true);
		}
	}

	public void selectByIndex(By locator, int index) {
		// dropdown = new Select(driver.findElement(locator));
		// dropdown.selectByIndex(index);

		Reporter.log("Element information = " + locator, true);
		try {
			dropdown = new Select(driver.findElement(locator));
			Boolean select = wait.until(ExpectedConditions.elementToBeSelected(locator));
			
			//to do (count)
			if (select == true) {
				dropdown.selectByIndex(index);
			} else {
				Reporter.log(" dropdown is not working  " + locator + true);
			}
		} catch (Exception e) {
			Reporter.log(" Exception occured " + e + true);
		}
	}

	public void selectByVisibleText(By locator, String visibleText) {
		// dropdown = new Select(driver.findElement(locator));
		// dropdown.selectByVisibleText(visibleText);

		Reporter.log("Element information = " + locator, true);
		try {
			dropdown = new Select(driver.findElement(locator));
			Boolean select = wait.until(ExpectedConditions.elementToBeSelected(locator));
			if (select == true) {
				dropdown.selectByVisibleText(visibleText);
			} else {
				Reporter.log(" dropdown is not working  " + locator + true);
			}
		} catch (Exception e) {
			Reporter.log(" Exception occured " + e + true);
		}
	}

	public void scrollToElement() {
		Reporter.log("this method is skipped for now", true);
	}

	@AfterClass
	public void browserClose() {

		driver.close();
		System.out.println("After class is executed");

	}

}
