package Parametrization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestParameterfromXML {
	
	@Parameters({"browser"})
	@Test
	public void getbrowser(String browser) {
		
		System.out.println(browser);
	}

}
