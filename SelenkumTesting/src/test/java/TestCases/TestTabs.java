package TestCases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println("-------------generating id frist windwo-----------------------");
		
		Set<String> winids= driver.getWindowHandles(); //return the open ID of current windwos or set will return unique values
		//of windows id's meanwhile lsit can retrun you same values 
		
		Iterator<String>iterate= winids.iterator();
		String fristwindwo= iterate.next();
		System.out.println("id of 1st windwo looks like " +fristwindwo);
	
		
		
		driver.findElement(By.id("loginsubmit")).click();
		
		driver.getWindowHandles();
		
		//2nd window
		
		
		
		System.out.println("-------------generating id 2nd windwo-----------------------");
		
		 winids= driver.getWindowHandles(); 
	    iterate= winids.iterator();
		System.out.println(iterate.next());
	    String secondwindow= iterate.next();
	    System.out.println(secondwindow);
		
	    driver.switchTo().window(secondwindow);
		
		
		driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div/div[1]/div/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"area-footer\"]/div/div[2]/a")).click();
		System.out.println("--------------generating id from 3rd window------------------");
		
		winids= driver.getWindowHandles();
			
		iterate= winids.iterator();
		System.out.println(iterate.next());
		System.out.println(iterate.next());
		
		String thridwindwo = iterate.next();
	
		driver.switchTo().window(thridwindwo);
		
		System.out.println(driver.getTitle().contains(":: HDFC BANK :: Privacy Notice EU users"));
	}	
	

}
