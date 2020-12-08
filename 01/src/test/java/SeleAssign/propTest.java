package SeleAssign;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
		
public class propTest {
	WebDriver driver;
	public void propertiesTest() throws IOException, InterruptedException{
		// Defining System Property for the ChromeDriver 
	  	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  	
	  	// Instantiate a ChromeDriver class. 
	  	driver=new ChromeDriver();
	  	driver.manage().window().maximize();
	  	
	  	FileInputStream objfile = new FileInputStream(System.getProperty("C:\\Users\\shaibal_sanyal\\eclipse-workspace\\01\\config.properties"));
		  Properties obj = new Properties();
		  obj.load(objfile);
		  String url = obj.getProperty("https://www.google.com/");
		  driver.get(url);
		  driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')]")).sendKeys(obj.getProperty("Search"));
		  Thread.sleep(2000);
	}
	

}
