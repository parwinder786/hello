package ParallelTesting;

import org.testng.annotations.Test;

public class Invocation extends LaunchingBrowser {
	
	@Test(invocationCount=5)
	public void executestime() {
		
		driver = getDriver("chrome");
		driver.get("https://www.google.com/");
		
	System.out.println(driver.getTitle());
		driver.quit();
	
	}	

}
