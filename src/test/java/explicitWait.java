


import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class explicitWait {

	public static void main(String[] args) throws MalformedURLException {
	

		ChromeOptions options = new ChromeOptions();

		WebDriver drv = new ChromeDriver();

		drv = new RemoteWebDriver(new URL("http://localhost:4444/"),options);

//		Capabilities c = drv.get
//		Map<String, Object> m = c.asMap();
//		m.forEach((key, value) −> {
//		System.out.println("Key is: " + key + " Value is: " + value);
//	});
		drv.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		drv.findElement(By.xpath("//*[text()='Click me to start timer']")).click();

//		WebElement el = new WebDriverWait(drv, Duration.ofSeconds(10))
//				.until(drv->drv.findElement(By.xpath("//*[text()='QTP']")));

//		boolean test = el.isDisplayed();
//
//		if(test)
//		{
//			System.out.println("Presence detected");
//		}
//		else
//		{
//			System.out.println("it was not found");
//		}
	}
	
}
