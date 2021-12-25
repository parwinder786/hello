package Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest {
	
	
	@BeforeTest
	public void creatingDBconnection() {
		System.out.println("creating DB connection");
		
	}
	
	@AfterTest
	public void closingDBconnection() {
		System.out.println("Closing DB Connection");
		
	}
	
	@BeforeMethod
	public void launchbrowser() {
		
		System.out.println("launching browser");
		
		
	}
	
	@AfterMethod
    public void Closebrowser() {
		
		System.out.println("closing the  browser");
		
		
	}
	
	
	
	
	@Test(priority=2)
	public void dologin() {
		
		System.out.println("executing loging test");
		
		
	}
	
	@Test(priority=1)
      public void DOuserreg() {
    	  System.out.println("executing the 2nd TC-user registration");
    	  
      }

}
