package ParallelTesting;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestOne {
	
	@Parameters({"browser"})
	@Test
	public void dologin(String b) throws InterruptedException {
		 System.out.println("browser name :" +b);
		 Thread.sleep(200);
	}

}
