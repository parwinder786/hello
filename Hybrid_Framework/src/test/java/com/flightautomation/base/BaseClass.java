package com.flightautomation.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

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

public class BaseClass {

	WebDriver driver;
	WebDriverWait wait;
	Properties property;

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

			// System.setProperty("webdriver.chrome.driver",path);
			driver = new ChromeDriver();
		} else if (browser == "IE") {
			System.setProperty("webdriver.ie.driver",
					"C:\\Users\\arman\\eclipse-workspace\\Hybrid_Framework\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}

		System.out.println("before class is executed");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// driver.get("http://newtours.demoaut.com/");

		driver.get(getApplicationUrl());

		wait = new WebDriverWait(driver, 30);
	}

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

		Reporter.log("Element information = " + locator, true);

		try {

			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(locator));
			if (button.isEnabled()) {
				button.click();
			} else {
				Reporter.log(" The element is not clickable " + locator + true);
			}
		} catch (Exception e) {
			Reporter.log("' for Element : " + locator + "Element not Found " + " Exception occured " + e.getMessage(),
					true);
		}
	}

	public void submit(By locator) {
		Reporter.log("Element information = " + locator, true);
		try {
			WebElement button = wait.until(ExpectedConditions.elementToBeClickable(locator));
			if (button.isEnabled()) {
				button.submit();
			} else {
				Reporter.log(" For Element " + locator + " Element is not found " + true);
			}
		} catch (Exception e) {
			Reporter.log("' for Element : " + locator + "Element not Found " + " Exception occured " + e.getMessage(),
					true);
		}
	}

	Select dropdown;

	public void selectByValue(By locator, String value) {

		Reporter.log("Element information = " + locator, true);
		try {
			dropdown = new Select(driver.findElement(locator));
			Boolean select = wait.until(ExpectedConditions.elementToBeSelected(locator));

			if (select == true) {
				dropdown.selectByValue(value);
			} else {
				Reporter.log(" For Element " + locator + " Element is not found " + true);
			}
		} catch (Exception e) {
			Reporter.log("' for Element : " + locator + "Element not Found " + " Exception occured " + e.getMessage(),
					true);
		}
	}

	public void selectByIndex(By locator, int index) {

		Reporter.log("Element information = " + locator, true);
		try {
			dropdown = new Select(driver.findElement(locator));
			List<WebElement> dd = dropdown.getOptions();
			System.out.println("The total no of elements in the dropdown are : " + dd.size());

			dropdown = new Select(driver.findElement(locator));
			Boolean select = wait.until(ExpectedConditions.elementToBeSelected(locator));

			if (select == true) {
				if (index >= 0 || index < dd.size()) {
					dropdown.selectByIndex(index);
				} else {
					Reporter.log(" For Element " + locator + " Element Index is not found " + true);
				}
			} else {
				Reporter.log(" For Element " + locator + " Index value is not in range " + true);
			}
		} catch (Exception e) {
			Reporter.log("' for Element : " + locator + "Element not Found " + " Exception occured " + e.getMessage(),
					true);
		}
	}

	public void selectByVisibleText(By locator, String visibleText) {

		Reporter.log("Element information = " + locator, true);
		try {
			dropdown = new Select(driver.findElement(locator));
			List<WebElement> txtList = dropdown.getOptions();

			for (WebElement abc : txtList) {
				// String list = abc.getText();
				// System.out.println(list);
				if (abc.getText().equals(visibleText)) {
					Reporter.log(" Entered value " + visibleText + " is present in the list " + true);

					dropdown = new Select(driver.findElement(locator));
					boolean select = wait.until(ExpectedConditions.elementToBeSelected(locator));

					if (select == true) {

						dropdown.selectByVisibleText(visibleText);
						Reporter.log(" Entered value " + visibleText + " is present in the list " + true);
					} else {
						Reporter.log(" For Element " + locator + " Element is not found " + true);
						break;
					}
				} else {
					Reporter.log(" Entered value " + visibleText + " is not present in the list " + true);
				}
			}

		}

		catch (Exception e) {
			Reporter.log("' for Element : " + locator + "Element not Found " + " Exception occured " + e.getMessage(),
					true);
		}
	}

	public void scrollToElement() {
		Reporter.log("this method is skipped for now", true);
	}

	public void configDataProvider() {

		try {
			File src = new File("C:\\Users\\arman\\eclipse-workspace\\Hybrid_Framework\\config\\config.properties");
			FileInputStream input = new FileInputStream(src);
			property = new Properties();
			property.load(input);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String chromepath() {
		String path = property.getProperty("ChromePath");
		return path;
	}

	public String getApplicationUrl() {
		String url = property.getProperty("url");
		return url;
	}

	HSSFWorkbook hssfWorkBook;

	public String dataProvider(int sheetIndex, int row, int column) {

		File src = new File("C:\\Users\\arman\\eclipse-workspace\\Hybrid_Framework\\dataProvider");

		hssfWorkBook = new HSSFWorkbook();

		try {
			FileInputStream fis = new FileInputStream(src);
			hssfWorkBook = new HSSFWorkbook(fis);
			String data = hssfWorkBook.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
			return data;
		} catch (Exception e) {
			System.out.println("Exception occured = " + e.getMessage());
		}
		return null;

	}

	@AfterClass
	public void browserClose() {

		driver.close();
		System.out.println("After class is executed");

	}

}
