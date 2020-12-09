package SeleAssign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;		
 

public class googleAccCreate {
	
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
	  	// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://accounts.google.com/signup");
	  	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  	
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  
		  List<WebElement> list=driver.findElements(By.tagName("input"));
		  // Iterate over the list and search for the input text box for creating the google account
		  for(int i=0;i<=list.size()-1;i++) {
			  if(list.get(i).getAttribute("id").contentEquals("firstName")){
				  list.get(i).sendKeys("Shaibal");
			  }
			  if(list.get(i).getAttribute("id").contentEquals("lastName")) {
				  list.get(i).sendKeys("Sanyal");

			  }
			  if(list.get(i).getAttribute("id").contentEquals("username")) {
				  list.get(i).sendKeys("shaibal.sanyal1989");

			  }
			  if(list.get(i).getAttribute("name").contentEquals("Passwd")) {
				  list.get(i).sendKeys("Shaibal#123");

			  }
			  if(list.get(i).getAttribute("name").contentEquals("ConfirmPasswd")) {
				  list.get(i).sendKeys("Shaibal#123");

			  }
		  }
		  driver.findElement(By.xpath("//button[contains(@class,'VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc')]")).click();
		  Thread.sleep(3000);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.xpath("//input[contains(@class,'whsOnd zHQkBf')]")).sendKeys("7305528486");
		  		 
	  }
	  


	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}