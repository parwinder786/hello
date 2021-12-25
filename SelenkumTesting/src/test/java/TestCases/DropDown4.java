package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dropdown=driver.findElement(By.id("searchLanguage"));
		
		Select sel = new Select(dropdown);
		
		
		//sel.selectByVisibleText("Eesti");
		
		List<WebElement> values = dropdown.findElements(By.tagName("option"));
		
	       System.out.println("Total values are :"+values.size()); 	
	      
	       System.out.println(values.get(7).getText());
	       
	       for(int i =0;i<values.size();i++) {
	    	  System.out.println(values.get(i).getAttribute("lang"));
	    
	    	   
	       }
	       WebElement  block = driver.findElement(By.xpath("//*[@id='www-wikipedia-org']/div[6]/div[3]"));	
	       //added block from particular area links & driver is replaced by block 
	       //driver will find the elements from entire page & block will find it from particular area
	       
	       
	     
	       List<WebElement> links = block.findElements(By.tagName("a"));
	       
	       System.out.println("-------------------printing links---------------------");
	       
	       System.out.println("total links are "+links.size());
	       
	       for(WebElement link:links) {
	    	 System.out.println(link.getText()+"---URL iS---------"+link.getAttribute("href"));
	    
	       }
	}

}
