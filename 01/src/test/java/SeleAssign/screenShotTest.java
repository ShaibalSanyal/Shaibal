package SeleAssign;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.OutputType;
//import com.mongodb.MapReduceCommand.OutputType;
 

public class screenShotTest {
	
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod() throws InterruptedException {
		  
	  	// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	driver.get("https://api.jquery.com/dblclick/");
	  	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	  	
	  }
	  
	  @Test
	  public void f() throws Exception {
		  
		  this.takeSnapShot(driver, "D://screenshot_test.png") ; 
	  }
	  
	  public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot
	        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

	        //Call getScreenshotAs method to create image file
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	        //Move image file to new destination
	        File DestFile=new File(fileWithPath);

	        //Copy file at destination
	        FileUtils.copyFile(SrcFile, DestFile);

	    }


	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }
}
