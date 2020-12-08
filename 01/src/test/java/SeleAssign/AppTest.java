package SeleAssign;

import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions; 

public class AppTest 
{
        @Test
    public void browserControl()
    {
        	// Defining System Property for the ChromeDriver 
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        	
        	// Instantiate a IEDriver class. 
        	//WebDriver driver=new InternetExplorerDriver();
        	WebDriver driver=new ChromeDriver();
        	
        	driver.navigate().to("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
        	driver.manage().window().maximize();
        	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        	
        	//Handle dropdown
        	driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
        	
        	driver.close();
    }
        
        
}
