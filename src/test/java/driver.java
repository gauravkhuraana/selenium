

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
;

public class driver {

	public static void main(String[] args )
	{
	
		//WebDriver drv = new ChromeDriver();
		//drv.get("http://www.naukri.com");
		
		//drv.manage().window().maximize();
		
		//Assert.assertEquals(actual, expected);
		Assert.assertEquals("testing", "testing");
		System.out.println(" here we check if actual = expected. So we need 2 variables, string, etc to compare");
		
		
		int a=10;
		//Assert.assertTrue(condition);
		Assert.assertTrue(a==10);
		System.out.println(" here we just need a condition which should be true. if false program will stop i.e suppose a was not equal to 10");
		
		
		
		
		/*
		
		Set<String> handles = drv.getWindowHandles() ; 
		
		for (String str:handles)
		{
			System.out.println(str);
		}
		
		WebElement el = (WebElement) drv.findElements(By.cssSelector("ul.arpw-ul"));
		System.out.println(el.getText());
		
		drv.manage().window().fullscreen();
		
		drv.switchTo().frame("CDwindow-1f1245ef-6c88-4832-b8a4-d069758305f8");
		//System.out.println(" I am on another window whose title is " + drv.getTitle() + " and the url is " + drv.getCurrentUrl())
		drv.switchTo().parentFrame();
		*/

		
		
	}
	
	
}
