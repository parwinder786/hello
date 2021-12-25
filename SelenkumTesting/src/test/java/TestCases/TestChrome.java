package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Java-2019\\executableBrowser\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com");
		driver.close();
		
		
	}

}
