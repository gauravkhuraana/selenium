

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
;

public class CalendarHandling {

	public static void main(String[] args) 
	{
		
		//System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		//DesiredCapabilities cap = DesiredCapabilities.firefox();

		WebDriverManager.firefoxdriver().setup();

		//cap.setCapability("marionette", true);
		WebDriver driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.name("datepicker")).click();
					
		List<WebElement> allDates= (List<WebElement>) driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
			
		}
		
		
	}

}