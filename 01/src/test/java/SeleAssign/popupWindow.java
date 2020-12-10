package SeleAssign;


import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;		
import java.util.Set;
 

public class popupWindow {

	@Test
    public void popUpTest() throws InterruptedException
    {
        	// Defining System Property for the ChromeDriver 
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        	
        	// Instantiate a IEDriver class. 
        	WebDriver driver=new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.get("http://demo.guru99.com/popup.php");
        	Thread.sleep(3000);
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	driver.findElement(By.xpath("//*[contains(@href,'../articles_popup.php')]")).click();			
    		
            String MainWindow=driver.getWindowHandle();		
            		
            // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
            Iterator<String> i1=s1.iterator();		
            Thread.sleep(3000);		
            while(i1.hasNext())			
            {		
                String ChildWindow=i1.next();		
                		
                if(!MainWindow.equalsIgnoreCase(ChildWindow))			
                {    		
                     
                        // Switching to Child window
                        driver.switchTo().window(ChildWindow);	                                                                                                           
                        driver.findElement(By.name("emailid"))
                        .sendKeys("shaibal.work@gmail.com");                       
                        Thread.sleep(2000);	                           
                        // Closing the Child Window.
                            driver.close();		
                }		
            }		
            // Switching to Parent window i.e Main Window.
            driver.switchTo().window(MainWindow);				
            Thread.sleep(2000);	
        	
        	
        	driver.quit();
    }

}
