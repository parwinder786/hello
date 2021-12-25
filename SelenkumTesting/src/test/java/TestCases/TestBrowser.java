package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.gecko.driver" , "D:\\Selenium\\Java-2019\\executableBrowser\\geckodriver.exe");
		
		WebDriverManager.chromedriver().setup();
 	   ChromeDriver driver = new ChromeDriver();
		
		//WebDriverManager.firefoxdriver().setup();
		
		//FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver = new FirefoxDriver();
		
		//CTRL+SHIFT +O to import all classes
		
		driver.get("http://way2automation.com");
		
		//System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		//driver.close();		//close the current browser 
		driver.quit(); //close the current browser + all related browsers in same session 
		
	}

}
