package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIsElementPresent {
	public static WebDriver driver;
	
	public static boolean IsElementP(String locator){
		try {driver.findElement(By.xpath(locator));
		return true;}
		catch(Throwable t) {
			return false;
		}
	
	}
    

	public static void main(String[] args) {
			
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println(IsElementP("//*[@id='searchLanguage']"));
		
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).isDisplayed());
		//isdiplayed checks the visibility of element in page not presency of element 
		//there is no method in webdriver to chcek the element is present...we have to write any method	
		
	}

}
