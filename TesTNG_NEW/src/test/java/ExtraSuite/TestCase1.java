package ExtraSuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	@BeforeTest (groups="smoke")
	public void creatingDBconnection() {
		System.out.println("creating DB connection");
		
	}
	
	@AfterTest (groups = {"functional","smoke"})
	public void closingDBconnection() {
		System.out.println("Closing DB Connection");
		
	}
	
	@BeforeMethod (groups = {"functional","smoke"})
	public void launchbrowser() {
		
		System.out.println("launching browser");
		
		
	}
	
	@AfterMethod (groups = {"functional","smoke"})
    public void Closebrowser() {
		
		System.out.println("closing the  browser");
		
		
	}
	
	
	
	
	@Test(priority=2, groups="smoke")
	public void dologin() {
		
		System.out.println("executing loging test");
		
		
	}
	
	@Test(priority=1 ,groups="smoke")
      public void DOuserreg() {
    	  System.out.println("executing the 2nd TC-user registration");
    	  
      }

}
