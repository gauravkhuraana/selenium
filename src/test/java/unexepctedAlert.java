

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class unexepctedAlert {

	public void Test() {
		// TODO Auto-generated method stub
		
		
		/*System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		DesiredCapabilities cap = DesiredCapabilities.firefox() ;
		cap.setCapability("marionette", true);
		
		
		
    	WebDriver drv = new FirefoxDriver(cap);*/
    	

	
		WebDriver drv = new ChromeDriver();
    	drv.manage().window().maximize();
    	drv.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    	drv.get("http://only-testing-blog.blogspot.in/2014/06/alert_6.html");
    	
    	
    	    	
    	
    	try
    	{
    		WebDriverWait wait=new WebDriverWait(drv, Duration.ofSeconds(20));
    		//FluentWait fwt = new FluentWait(drv).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
    		
    		//Alert alrt=(Alert)fwt.until(ExpectedConditions.alertIsPresent());
    		//alrt.accept();
    		System.out.println("Clicked the alert");
    		//drv.switchTo().alert().accept();
    		//Alert al= drv.switchTo().alert();
    		//al.dismiss();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Unexpected alert did not came ");
    	}
    	
    	drv.findElement(By.name("fname")).sendKeys("Tets1");
    	drv.findElement(By.name("lname")).sendKeys("Test2");
    	drv.findElement(By.cssSelector("#submitButton")).click();
  	}
}
