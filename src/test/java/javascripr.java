

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import net.jsourcerer.webdriver.jserrorcollector.JavaScriptError;
;

public class javascripr {
	
	 WebDriver drv;
	private Object JavaScriptError;

	@BeforeClass
		public void setup() throws IOException
		{
//			System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
			//DesiredCapabilities cap = DesiredCapabilities.firefox();
			//cap.setCapability("marionette", true);
			
			//JavaScriptError.addExtension(pf);
			WebDriver drv = new ChromeDriver();

			drv.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			//String url = "http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html";
			//drv.get(url);
			//drv.manage().window().maximize();
			//System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");

			//drv = new FirefoxDriver();
			
			
			drv.get("http://only-testing-blog.blogspot.com/2015/01/table-with-checkbox.html");
		//	drv.get("http://udzial.com");

		}
		
		@Test
		public void main() throws Exception 
		{
			
//			List<JavaScriptError> js = JavaScriptError.readErrors(drv) ;
//
//			System.out.println(" THe number of errors found are " + js.size());
//			for(int i =0 ; i <js.size(); i++)
//			{
//				System.out.println(" JavaScript Error Message is " + js.get(i).getErrorMessage());
//				System.out.println(" JavaScript Error Message Line number is " + js.get(i).getLineNumber());
//				System.out.println(" JavaScript Error Message Sourcer is " + js.get(i).getSourceName());
//
//				System.out.println(" JavaScript Error Message class name is " + js.get(i).getClass().toString());
				
			}
			
		}


