package Retry;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testlogin {
	
	
	@Test(priority=1)
	public void dologin() {
		
		System.out.println("execting login");
	}
	
	static int count =0;
	@Test(priority=2)
      public void registeruser() {
    	  count++;
    	  System.out.println(count);
    	  //Assert.fail("executing failed");
    	  Assert.assertEquals(count, 3);
      }
}