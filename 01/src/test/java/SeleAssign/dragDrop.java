package SeleAssign;

import static org.junit.Assert.assertTrue;
import java.awt.List;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions; 

public class dragDrop {

	@Test
    public void dragDropTest() throws InterruptedException
    {
        	// Defining System Property for the ChromeDriver 
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaibal_sanyal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        	
        	// Instantiate a IEDriver class. 
        	//WebDriver driver=new InternetExplorerDriver();
        	WebDriver driver=new ChromeDriver();
        	driver.manage().window().maximize();
        	driver.navigate().to("https://jqueryui.com/droppable/");
        	
        	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        	
        	//Drag & drop
        	driver.switchTo().frame(0);
        	
        	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        	WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
        	//WebElement source = driver.findElement(By.id("draggable"));
        	//WebElement dest = driver.findElement(By.id("droppable"));
        	
        	Actions act = new Actions(driver);
        	act.dragAndDrop(source, dest).perform();
        	Thread.sleep(5000);
        	
        	driver.quit();
    }

}
