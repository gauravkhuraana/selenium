


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class untrustedSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.ie.driver", "D:\\software\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
		//System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		
		//DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		
	//	DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver drv = new ChromeDriver();

		FirefoxProfile pf = new FirefoxProfile();
		
		
		pf.setAcceptUntrustedCertificates(true);
				

		drv.get("https://cacert.org/");
		
		//drv.navigate().to("javascript:document.getElementById('overridelink').click()");
		
		//drv.findElement(By.name("overridelink")).click();
	}

}
