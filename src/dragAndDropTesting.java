import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class dragAndDropTesting {

	
	//@SuppressWarnings("deprecation")
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		WebDriver drv = new FirefoxDriver(cap);
		
		/*System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();*/
    drv.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
    
    WebElement Drag1 = drv.findElement(By.xpath("//span[@draggable='true'][1]"));
    WebElement target1 = drv.findElement(By.id("mydropzone"));
    
    Actions act = new Actions(drv);
    
   // act.dragAndDrop(Drag1, target).perform();
    
    
	act.clickAndHold(Drag1);
	act.moveToElement(target1);
	act.release().build().perform();
	
   
   Thread.sleep(2000);
     
     drv.get("http://jqueryui.com/resources/demos/droppable/default.html");
     Thread.sleep(2000);
      
     Drag1 = drv.findElement(By.id("draggable"));
     target1=drv.findElement(By.id("droppable"));
     
     act.dragAndDrop(Drag1, target1).build().perform();
     Thread.sleep(2000);
     
 	act.clickAndHold(Drag1);
 	act.moveToElement(target1);
 	act.release().build().perform();
	}
}
