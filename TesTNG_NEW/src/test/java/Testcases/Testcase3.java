package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3 extends BaseTest{

	
	
	@Test(priority=1,groups="funcgtional")
	public void userreg() {
		System.out.println("user registration");
		Assert.fail("user is not registered");
		
	}
	
	@Test(priority=2, dependsOnMethods="userreg")
	public void  login() {
		
		System.out.println("user login");
	}
	
	@Test(priority=4, dependsOnMethods="userreg",alwaysRun=true,groups ="functional")
	public void login2() {
		System.out.println("depenedent but runing ");
	}
	
	@Test(priority=3, groups= "smoke")
	public void thridtest() {
		System.out.println("executing thrid");
	}
}
