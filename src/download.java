import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		//WebDriver drv = new FirefoxDriver(cap);
		FirefoxProfile pro = new FirefoxProfile();
		pro.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		WebDriver drv = new FirefoxDriver(cap);
	
		try
		{
		drv.get("http://filehippo.com/download_shareit/");
		
		WebElement dnl = drv.findElement(By.xpath("//span[text()='Download Latest Version']"));
		dnl.click();
		drv.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	//	drv.quit();
		}
		catch(Exception e)
		{
			System.out.println("Hi exception caught is " + e.getMessage());
		}
		
	}

}
