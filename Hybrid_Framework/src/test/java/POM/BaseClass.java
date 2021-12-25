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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {

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
					"C:\\Users\\arman\\eclipse-workspace\\Hybrid_Framework\\Drivers\\chromedriver.exe");
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
//To be inside test class
	@Test(priority = 1)
	public void loginFlightApplication() {

		sendKeys(By.name("userName"), "sbhinge");
		sendKeys(By.name("password"), "sbhinge");
		click(By.name("login"));
		

	}

	public void sendKeys(By locator, String text) {
		Reporter.log("Enter Text '" + text + "' for Element : " + locator, true);
		try {
		WebElement webElement = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		if (webElement != null) {
			if (webElement.isEnabled()) {
				webElement.sendKeys(text);
			} else {
				Reporter.log("Enter Text '" + text + "' for Element : " + locator + " Element not disabled", true);
			}
		} else {
			Reporter.log("Enter Text '" + text + "' for Element : " + locator + " Element not found", true);
		}
		}catch(Exception e) {
			Reporter.log("Enter Text '" + text + "' for Element : " + locator + " Element not found", true);
		}

	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}

	@Test(priority = 3)
	public void submmit() {

	}

	Select month;

	@Test(priority = 4)
	public void selectByvalue() {
		month = new Select(driver.findElement(By.name("toMonth")));
		month.selectByValue("2");
	}

	@Test(priority = 5)
	public void selectByIndex() {

		month.selectByIndex(4);
	}

	@Test(priority = 6)
	public void selectByVisibleText() {

		month.selectByVisibleText("July");
	}

	@Test(priority = 7)
	public void scrollToElement() {

	}

	@AfterClass
	public void browserClose() {

		driver.close();

		System.out.println("After class is executed");

	}

}
