package TestCases;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium\\Java-2019\\executableBrowser\\IE\\IEDriverServer.exe");
		
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://way2automation.com");
		driver.close();
		

	}

}
