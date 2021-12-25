package POM;

import org.openqa.selenium.By;

public class POM extends BaseClass{
	

	     By username = By.name("userName");
	     By password = By.name("password");
	     By click   = By.name("login");
	     
	     public void typeusername(){
	    	  driver.findElement(username).sendKeys("admin");	    	  
	      }
	       public void typepassword(){
	    	   driver.findElement(password).sendKeys("demo123");	    	   
	       }
	       public void clickonlogin(){
	    	   driver.findElement(click).click();	    	   
	       }

}
