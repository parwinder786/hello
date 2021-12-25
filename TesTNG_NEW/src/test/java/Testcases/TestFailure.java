package Testcases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestFailure extends BaseTest {

	              @Test
	              public void login() {
	            	  
	            	  Assert.fail("failing the login test");
	            	  System.out.println("capture screenshot at failed TC");
	            	  
	              }
}
