

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
;

public class explicitWait {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		drv.findElement(By.xpath("//*[text()='Click me to start timer']")).click();;
		
		WebDriverWait wt = new WebDriverWait(drv,30);
		
		WebElement el = wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='QTP']")));
		
		boolean test = el.isDisplayed();
		
		if(test)
		{
			System.out.println("Presence detected");
		}
		else
		{
			System.out.println("it was not found");
		}
	}
	
}
