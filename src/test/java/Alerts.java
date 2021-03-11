
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
;

public class Alerts {

	
	WebDriver drv;
	@BeforeClass
	public void setup()
	{
		//System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		WebDriverManager.firefoxdriver();

		WebDriver drv = new FirefoxDriver();
		//DesiredCapabilities cap = DesiredCapabilities.
		//cap.setCapability("marionette", true);

		//drv = new FirefoxDriver();
		drv.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		drv.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement el1 = drv.findElement(By.xpath("//*[@value='Show Me Alert']"));
		WebElement el2 = drv.findElement(By.xpath("//*[text()='Show Me Confirmation']"));
		WebElement el3 = drv.findElement(By.xpath("//*[text()='Show Me Prompt']"));
				
		el1.click();
				Alert al = drv.switchTo().alert();
		System.out.println(" Hi the text is " + al.getText());
		Thread.sleep(3000);
		al.accept();
		Thread.sleep(3000);


		el2.click();
		Alert al1 = drv.switchTo().alert();
System.out.println(" Hi the text is " + al1.getText());
Thread.sleep(3000);
al1.dismiss();
Thread.sleep(3000);


el3.click();
Alert al3 = drv.switchTo().alert();
System.out.println(" Hi the text is " + al3.getText());
al3.sendKeys("alert testing is completed");
Thread.sleep(3000);

	}
	
	@AfterClass
	public void exit()
	{
		drv.quit();
	}

	
}
