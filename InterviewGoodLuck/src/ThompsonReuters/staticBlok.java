package ThompsonReuters;

public class staticBlok {

	
	//Also, static blocks are executed before constructors. For example, check output of following Java program. 
	
	static { 
        int i = 10; 
        System.out.println("static block called "); 
    } 
    staticBlok(){ 
        System.out.println("Constructor called"); 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		staticBlok obj = new staticBlok();
		staticBlok obj2=new staticBlok();
		
		/*
		 * Selenium project will not actively support only the WebDriver API.
The Selenium RC APIs have been moved to a “legacy” package.
By a quirk of timing, Mozilla have made changes to Firefox that mean that from Firefox 48 you must use their geckodriver to use that browser, regardless of whether you're using Selenium 2 or 3.
3.0 not have HeadLess Driver (HtmlWebDriver) but 2.0 have
3.0 is not stable because sometime geckodriver does not handle JavaScriptExecutor. Code give the exception

 2.0 Minimum Java version required is below 7 or below.
~ Support Firefox browser version below 47.0
~ It supports HeadLess Browser with HtmlWebDriver.
~ Selenium 2 supported selenium core for backward compatibility.
~ Selenium 2 provided the webdriver for each browser like Firefox, Google Chrome, IE, Microsoft Edge, Safari.
3.0
The major version change from Selenium 2 to 3 means significant additions in terms of functionality and/or interface changes. Some of the major changes and additions apart from bug fixes from previous versions are
~ Java 8 is a must.
~ The support for browser drivers has changed for all the major browsers.
~ Developing W3C webdriver specification.
~ The original Selenium Core will be retired, which will have a significant impact on teams using Selenium Core.
~ Selenium 3.0 does not have HeadLess Driver

		 */
				
	}

}
