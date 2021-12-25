package ThompsonReuters;

import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

public class CaseWire3 {
	
    boolean isFileInGrid(String fileName)  {
        boolean t=false;
		List<WebElement> ls=  Page.getFilesFromPage();
				//ArrayList<WebElement>();
				 
		//ls =Page.getFilesFromPage();
			for(WebElement s:ls)
			{
			    if(s.getName().equalsIgnoreCase(fileName))
					{
					    t=true;
					}else
					{
         		try {
					Page.goToNextPage();
				} catch (NamingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
			}
			return t;


}

       
	public static void main(String[] args) {
              
		CaseWire3 obj = new CaseWire3();
		String abc="new file";
		obj.isFileInGrid(abc);
	}
}
