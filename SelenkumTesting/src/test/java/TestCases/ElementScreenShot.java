package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenShot {
	
	
	public static 	 WebDriver driver;
	
	 public static void Captureshot1() throws IOException {
		 
	        Date d = new Date();
            String filename = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
            
           
			File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //file store the screenshot
			
			FileUtils.copyFile(Screenshot, new File(".//screenshot//error.jpg"+filename));
			
	 }
	 
	
	 public static void main(String[] args) throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		 
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
				
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"hplogo\"]/div[2]"));
		Captureshot1();
		
		

	}

}
