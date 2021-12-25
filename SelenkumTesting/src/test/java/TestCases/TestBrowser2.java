package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
                              
public class TestBrowser2 {
 
    public static String browser = "firefox";   //excel; sheet
    public static WebDriver driver;
    
	public static void main(String[] args) {
		
		
	       if(browser.equals("chrome")) {
	    	   
	    	   
	    	   WebDriverManager.chromedriver().setup();
	    	   driver = new ChromeDriver();
	    	   
	       }else if(browser.equals("firefox"))
	       {
	    	   WebDriverManager.firefoxdriver().setup();
	    	   driver = new FirefoxDriver(); 
	       }
	       else if(browser.equals("IE"))
	       {
	    	   WebDriverManager.iedriver().setup();
	    	   driver = new InternetExplorerDriver(); 
	       }
	       
		
		driver.get("http://way2automation.com");
				
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(title.length());
		//driver.close();		//close the current browser 
		driver.quit(); //close the current browser + all related browsers in same session 
		
	}

}
