

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver drv = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//DesiredCapabilities cap = DesiredCapabilities.firefox();
		//cap.setCapability("marionette", true);
		//WebDriver drv = new FirefoxDriver(cap);
		String url = "http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html";
		drv.get(url);
		drv.manage().window().maximize();
		
		//WebElement picker = drv.findElement(By.className("hasDatepicker"));
		
		String date1="datepicker";
		WebElement picker = drv.findElement(By.name(date1));
		
		picker.click();
		/*try
		{
		drv.findElement(By.xpath("//*[@id='datepicker']")).click();
		//Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println("Hi click was unsuccessful due to  " + e.getMessage());
				
		}*/
		System.out.println("Hi i am after click ");
		List<WebElement> allDates= (List<WebElement>) drv.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		System.out.println("Hi i am after collecting data click ");

		for(WebElement el : allDates)
		{
			String date=el.getText();
		
			System.out.println("Hi i am inside loop " + date );

			if(date.equalsIgnoreCase("12"))
			{
				el.click();
				break;
			//Thread.sleep(10000);
			}
		}
		//drv.quit();
	}

}
