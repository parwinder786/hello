package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		driver.manage().window().maximize();  // 3interface & methods & classes 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement drop = driver.findElement(By.name("dropdownmenu"));
		
		Select sel = new Select (drop);
		
		//sel.selectByVisibleText("Milk");
		sel.selectByIndex(1);
		//sel.selectByValue("Milk");
		
		//driver.close();
		
		
		
		
	}

}
