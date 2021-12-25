package TestCases;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		//System.setProperty(key, value)
		
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Java-2019\\executableBrowser\\geckodriver.exe");
		
		driver.get("http://www.google.com");
		

	}

}
