package Testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends BaseTest {
                   
	                @Test
	                public void Validatetitle() {
	                	
	                	
	                	String expected="Yahoo.com";  //excel
	                	String actual ="gmail.com";   //selenium
	                	
	                /*	if(expected.equals(Actual)) {
	                		System.out.println("passed");
	                	}else {                              //if else wont report failure becoz tc is executed properly 
	                	                                  // with TestNG
	                		System.out.println("failed");
	                	}
	                	*/
	                	//Assert.assertEquals(Actual, expected);
	                	
	                	//iselemetnpresent("xpath")
	                //Assert.assertTrue(false,"element is not true");
	                
	                //Assert.fail("failing test any condition is not matched");
	                	
	                	SoftAssert softassert = new SoftAssert();
	                	
	                	
	                	
	                System.out.println("validating the title");
	               // Assert.assertEquals(actual, expected);
	                
	                  softassert.assertEquals(actual, expected);   
	                  
	                System.out.println("validating title");
	                
	                //Assert.assertEquals(true, false);
	                softassert.assertEquals(true, false);
	               System.out.println("ending ");
	               softassert.assertAll();     //failure will be reported now in report
	                
	                	
	                }
}
