

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
;

public class profileFirefox {
	
	@Test
	public static void profile()
	{
		System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	//	DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
	//	ProfilesIni pr = new ProfilesIni();
		
	//	FirefoxProfile fp = pr.getProfile("default");
		WebDriver drv = new FirefoxDriver();
		
		drv.get("http:\\www.gauravkhurana.in");
		//return 0;
	}
	

}
