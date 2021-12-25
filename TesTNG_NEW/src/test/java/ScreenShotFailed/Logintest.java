package ScreenShotFailed;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Logintest extends Testbase1{

	             @Test
	             public void dologin() {
	            	
	            	
						driver.findElement(By.id("identifierId")).sendKeys("arabdb@gmal");
						
						
						
            driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/span/span")).click();
          //failing this test step to capture the screenshot
	            	 
	             }
}
