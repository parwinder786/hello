package Listener;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {

	                      @Test
	                   public void skip() {
	                	    
	                    	  if(true)
	                    	  throw new SkipException("skipping the test eg. element is not present");
	                    	  
	                    	  
	                   }
	
}
