package ScreenShotFailed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase1 {
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup() {
		
		if(driver==null) {
			
			//WebDriverManager.chromedriver().setup();
		 	//driver = new ChromeDriver();
			
			WebDriverManager.firefoxdriver().setup();
		 	driver = new FirefoxDriver();
			
			driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		}
		
	}
	
	  @AfterSuite
      public void teardown() {
    	  driver.quit();
      }
	  
}
