package SeleAssign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Iterator;		
 

public class newTabTest {
	
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
	  	// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://www.w3schools.com/java/");
	  	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  	
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  
		  //driver.findElement(By.linkText("Start learning Java now »")).click();
		  String newTab=Keys.chord(Keys.CONTROL,Keys.RETURN);
		  driver.findElement(By.linkText("Start learning Java now »")).sendKeys(newTab);
		  Set<String> tabs= driver.getWindowHandles();
		  List<String> tabs1=new ArrayList<String>(tabs);
		  //Switching to the new tab
		  driver.switchTo().window(tabs1.get(1));
		  
		  driver.findElement(By.id("topnavbtn_references")).click();
		  driver.findElement(By.linkText("HTML Tag Reference")).click();
	  }
	  


	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}
