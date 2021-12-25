package Testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
                         // in base  test we can keep methods intialzation and some methods in set up
	
	                   @BeforeSuite
	                   public void setup() {
	                	   System.out.println("initializing everything");
	                	   // before all the classes not only one class
	                   }
	                   
	                   @AfterSuite
	                   public void teardown() {
	                	   System.out.println("quit everything");
	                	   
	                	   //after all the classes not only one class
	                	   
	                   }
	
} 
