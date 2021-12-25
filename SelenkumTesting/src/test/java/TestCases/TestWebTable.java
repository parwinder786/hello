package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  List<WebElement> rows=  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		  System.out.println("total rows are : "+rows.size());
		  
		  List<WebElement> column=  driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		  
		  
		  System.out.println("total columns are : "+column.size());
		  
		  
		  for(int row=1; row<=rows.size();row++) {          //print 1st row and 5 column first then all the rows  & all columns   
			  
			  for( int cols=1; cols<=column.size();cols++)
			  {				  
				  System.out.print(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+row+"]/td["+cols+"]")).getText()+"  ");
				  				  
			  }
			  System.out.println("---------------------------------");
		  }
		  		  
	}
	
}
