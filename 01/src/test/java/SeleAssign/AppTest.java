package SeleAssign;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class AppTest 
{
        @Test
    public void browserControl() throws InterruptedException
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
        	Thread.sleep(3000);
        	driver.close();
    }
        
        
}
