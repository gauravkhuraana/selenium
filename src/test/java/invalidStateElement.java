

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
;

public class invalidStateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		
		//System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "D:\\software\\IEDriverServer_x64_2.53.1\\iedriverserver.exe");
		
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
		
		WebDriver drv = new ChromeDriver();
		
		
		drv.get("www.google.com");
		
		//JavascriptExecutor js=(JavascriptExecutor)drv;
				
		//js.executeScript("document.getElementByname('pass').value='aurav';");
		//drv.findElement(By.name("pass")).sendKeys("jaishrikrishna");
		//drv.findElement(By.xpath("//*[@type='submit']")).sendKeys("hello");
		
	}

}
