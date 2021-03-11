

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
;

public class rightClick {
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "D:\\software\\IEDriverServer_x64_2.53.1\\iedriverserver.exe");

//		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		
//		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();

		WebDriverManager.chromedriver().setup();
		WebDriver drv = new ChromeDriver();

		//cap.setCapability("marionette", true);*/
		
		//WebDriver drv = new InternetExplorerDriver(cap);
		
		//WebDriver drv = new ChromeDriver();
		
		
		drv.get("www.google.com");
		drv.manage().window().maximize();
		
		Actions act = new Actions(drv);
		
		act.contextClick(drv.findElement(By.className("gb_P"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

}
