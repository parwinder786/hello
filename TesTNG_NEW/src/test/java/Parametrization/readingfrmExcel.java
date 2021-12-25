package Parametrization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class readingfrmExcel {
	
	public static ReadingExcel excel = null;
	
	@Test(dataProvider="getdata")
	public void testdata(String username, String password, String is_correct) {
		
		System.out.println(username+"-------"+password+"----------"+is_correct);
		
		
		
	}
	
	
	@DataProvider
	public Object[][]getdata(){
		
		if(excel ==null) {
			excel = new ReadingExcel("D:\\Selenium\\Java-2019\\Parameterization");
			
		}
		
		Object[][] data = new Object[2][3];
		
		
		
		
		
		return data;
		
	}

}
