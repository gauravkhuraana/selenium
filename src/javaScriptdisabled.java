import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javaScriptdisabled {
	
	WebDriver drv;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		FirefoxProfile pro = new FirefoxProfile();
		
		//pro.addExtension(@"D:\\software\\noscrip.xpi");
		pro.setPreference("javascript.enabled", false);
		drv = new FirefoxDriver(pro);
		drv.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		if(test())
		{
			System.out.println("JavaScript was present");
		}
		else
		{
			System.out.println("There is no javascript present");
		}
		
		
	}
	@Test
	public boolean test() throws InterruptedException
	{
		WebElement el = drv.findElement((By.xpath("//input[@value='Show Me Alert']")));
		el.click();
		Thread.sleep(3000);
		
		
		
		try
		{
			Alert al =drv.switchTo().alert();
		System.out.println("we Got the alert)");
		al.accept();
		return true;
		}
		catch(Exception e)
		{
			System.out.println("Oops alert was not opened");
			return false;
		}
		
		
				
	}
}
