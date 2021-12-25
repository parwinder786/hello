package ParallelTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallerDataProvider {

	  @Test(dataProvider="getdata")
      public void dologin(String b) throws InterruptedException {
     	     
     	 System.out.println("------------"+b);
     	 Thread.sleep(2000);
      }

      @DataProvider(parallel=true)
      public Object[][] getdata() {
 
    Object[][] data = new Object [2][1];
    data[0] [0]= "chrome";
    data [1][0] ="firefox";
    
    
    
    return data;
      }
}
