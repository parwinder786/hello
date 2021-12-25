package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();  // 3interface & methods & classes 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	/*	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		.withTimeout(30,TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class);*/
		
		//WebElement username = driver.findElement(By.id("identifierId"));  //cant store find element in string//using id 
		
		//WebElement username = driver.findElement(By.name("identifier"));   //by using name
		
		
		//WebElement username = driver.findElement(By.cssSelector("#identifier")); // with CSS selector
		
		/*WebElement username = driver.findElement(By.xpath("//*[@id='identifierId']"));  //xpath
		
		
		username.sendKeys("armanndhillon@gmail.com");
		
		WebElement NextBTN = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span"));
		
		NextBTN.click();*/
		 
		 driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("armanndhillon@gmail.com");
		 
		 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		//try {
		//	Thread.sleep(1000);
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block    //halt the execution for 1 second 
		//	e.printStackTrace();
		//}   
	 driver.findElement(By.name("password")).sendKeys("realmadrid");
	 driver.close();
		 	 
		 
	}

}
