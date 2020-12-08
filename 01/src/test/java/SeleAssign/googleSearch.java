package SeleAssign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;		
 

public class googleSearch {
	
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
	  	// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://www.google.com/");
	  	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  	
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  
		  String textToBeSearched = "selenium tutorial";
		  
		  driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys("seleni");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Thread.sleep(2000);
		  WebElement list = driver.findElement(By.xpath("//ul[@class='erkvQe']"));
			// Getting all the suggestions listed in list
			List<WebElement> suggestions = list.findElements(By.tagName("li"));
			//System.out.println(suggestions.size());
			Iterator<WebElement> ite = suggestions.iterator();
			
			while (ite.hasNext()) {

				WebElement suggestion = ite.next();
				if (suggestion.getText().toLowerCase().trim().equals(textToBeSearched)) {
					suggestion.click();
					break;
				}
			}
			Thread.sleep(2000);
	  }
	  


	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
	  
  

}
