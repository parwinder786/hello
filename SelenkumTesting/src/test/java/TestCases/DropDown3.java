package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dropdown=driver.findElement(By.id("searchLanguage"));
		
		Select sel = new Select(dropdown);
		
		
		//sel.selectByVisibleText("Eesti");
		
		List<WebElement> values = driver.findElements(By.tagName("option"));
		
	       System.out.println("Total values are :"+values.size()); 	
	      
	       System.out.println(values.get(7).getText());
	       
	       for(int i =0;i<values.size();i++) {
	    	  System.out.println(values.get(i).getAttribute("lang"));
	    
	    	   
	       }
	       
	       List<WebElement> links = driver.findElements(By.tagName("a"));
	       
	       System.out.println("-------------------printing links---------------------");
	       
	       System.out.println("total links are "+links.size());
	       
	       for(WebElement link:links) {
	    	 System.out.println(link.getText()+"---URL iS---------"+link.getAttribute("href"));
	    
	       }
	}

}
