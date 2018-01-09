package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/selenium/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
		System.out.println("Test is called");
	}	
	@BeforeTest
	public void beforeTest()  throws InterruptedException {	
	    System.out.println("Before Test is called");
	   // String dirpath=System.getProperty("user.dir");
	  //  System.out.println("Dir Path"+dirpath);
	    // System.setProperty("webdriver.gecko.driver", "C://Users//Ramya//Desktop//geckodriver-v0.19.1-win64//geckodriver.exe");
	    driver = new FirefoxDriver();  
	    

	}		
	@AfterTest
	public void afterTest() {
		System.out.println("After Test is called");
		driver.quit();			
	}	

}
