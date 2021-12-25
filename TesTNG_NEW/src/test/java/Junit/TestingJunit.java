package Junit;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestingJunit {
	
	           public static boolean DBconnection() {
	        	   return false;
	           }
	             
	            @BeforeClass
	            public static void seleniumsetup(){
	            	System.out.println("BeforeCLass=this is called only once");
	            	 Assume.assumeTrue(DBconnection());	            	
	            }
		 
	             @Before
	              public void openbrowser() {
	            	  System.out.println("opening browser");	            	  
	              }
	             
	             @Test
	             public void testnavigation() {
	            	 System.out.println("this is 1st tc-navigation");
	             }
	             
	             @Test
	             public void testlink() {
	             System.out.println("validationg the link");
	            	
	             }
	             
	             //@Ignore
	             @Test
	             public void testlogin() {
	            System.out.println("this is 2nd tc of login");
	             }
                  @Test
                  public void testclosebrowser() {
                	  System.out.println("close the browser");
                  }
                  
                  @AfterClass
                  public static void shutdownselenium(){
                	  System.out.println("AfterClass=this will be called after all the annotations");
                  }
                  
                  
}
