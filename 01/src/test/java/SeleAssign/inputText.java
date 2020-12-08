package SeleAssign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;		
 

public class inputText {
	
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
	  	// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("http://www.zlti.com");
	  	driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	  	
	  }
	  
	  @Test
	  public void f() throws InterruptedException {		  
		  
		  	String url = "";
	        	        
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        
	        for(int i=0;i<=links.size()-1;i++) {
	   		 	url=links.get(i).getAttribute("href");
	   		 	System.out.println(url);
	   		 	if(url==null || url.isEmpty()) {
	   		 		System.out.println("link is broken");
	   		 }
	   	  }
			Thread.sleep(2000);
	  }
	  


	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}
	  
