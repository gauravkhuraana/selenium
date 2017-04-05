import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class zoomInZoomOut {
	
	 WebDriver drv;
	@BeforeClass
	public void setup()
	{
		//System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
		//drv = new FirefoxDriver(cap);
		//String url = "http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html";
		//drv.get(url);
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");

		drv = new ChromeDriver();
		drv.get("http://www.google.com");
		drv.manage().window().maximize();
		
		drv.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@Test
	public void main() throws InterruptedException
	{
		zoomin();
		zoomout();
		zoomout();
		default1();
	}
	
	public void zoomin() throws InterruptedException
	{
		for(int i=0; i < 4; i++)
		{
			System.out.println("inside");
			drv.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD));
		}
		Thread.sleep(1000);
	}
	
	public  void zoomout() throws InterruptedException
	{
		for(int i=0; i < 4; i++)
		{
			drv.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
		}
		Thread.sleep(1000);

	}
	
	public  void default1() throws InterruptedException
	{
		drv.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,"0"));
		Thread.sleep(1000);

	}
	
	
	@AfterClass
	public void exit()
	{
		drv.close();
	}

}
