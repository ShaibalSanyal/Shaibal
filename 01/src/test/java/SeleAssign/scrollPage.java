package SeleAssign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;


public class scrollPage {
	
	WebDriver driver;
	JavascriptExecutor js;
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
	  	// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  		  	
	  	driver.manage().window().maximize();
	  	Thread.sleep(5000);
	  	Dimension di = new Dimension(1720, 880);
		driver.manage().window().setSize(di);
	  	driver.get("http://demo.guru99.com/test/guru99home/");
	  	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  	
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  
		  js = (JavascriptExecutor) driver;
		  
		//Find element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.linkText("VBScript"));

	        //This will scroll the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
			Thread.sleep(5000);
	  }
	  
	  
	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
	  
  

}
