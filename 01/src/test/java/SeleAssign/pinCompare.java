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
 

public class pinCompare {
	
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
	  	// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("http://chennaiiq.com/chennai/pincode-by-name.php");
	  	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  	
	  }
	  
	  @Test
	  public void f() throws InterruptedException {
		  		  
		  List<WebElement> pinNumber = driver.findElements(By.xpath("/html/body/table/tbody/tr[3]/td[2]/table[1]/tbody/tr/td[3]"));
		  int count = 0;
		  for(int i=1;i<(pinNumber.size()-1);i++) {
			  for(int j=i+1;j<=(pinNumber.size()-i);j++) {
				 if(pinNumber.get(i).getText().contentEquals(pinNumber.get(j).getText())){
					 System.out.println("Duplicate pin code present");
					 count+=1;
				 }
				 if(count>0) {
					 break;
				 }
			  }			  
			  if(count>0) {
				  break;
			  }
		  }
	  }
	  


	  @AfterMethod
	  public void afterMethod() {
		  //driver.close();
	  }  

}
