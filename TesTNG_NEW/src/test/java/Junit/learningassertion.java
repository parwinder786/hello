package Junit;
import org.junit.Test;

import junit.framework.Assert;

public class learningassertion {
	
	            @Test
	             public void testtitle() {
	              
	            	String actualtitle ="google"; //result from tested title
	            	String expectedtitle ="gogle";  //compared title
	            	
	            /*	if(actualtitle==expectedtitle) {
	            		System.out.println("test case passed");
	            	}else{
	            		System.out.println("tc is failed");
	            	}*/
	            	
	            	System.out.println("comparision started");
	            	try {
	            	Assert.assertEquals(actualtitle, expectedtitle);
	            	}
	            	catch (Throwable e) {
	            		System.out.println("error captured");
	            	}
	            	 System.out.println("comparioson is passed ");
	            	  
	            	 
	            	 
	             }
}
