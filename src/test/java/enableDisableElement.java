

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
;

public class enableDisableElement {

	WebDriver drv;
	@Test
	public void setup() throws InterruptedException
	{
	

		drv = new ChromeDriver();
		drv.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     JavascriptExecutor js = (JavascriptExecutor)drv;
	     


	   js.executeScript("document.getElementsByName('fname')[0].setAttribute('disabled','');");
       Thread.sleep(3000);
	   
	     js.executeScript("document.getElementsByName('lname')[0].removeAttribute('disabled');");

	     Thread.sleep(3000);
	
		
	}
	
	
	
	
	@AfterClass
	public void exit()
	{
		drv.quit();
	}
}
