

import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
;

public class scrolls {
	WebDriver drv;

	@BeforeClass
	public void setup()
	{
	

		drv = new ChromeDriver();
		drv.get("http://gauravkhurana.in/gaurav-khurana-photography/");
		drv.manage().window().maximize();
	}
	
	@Test
	public void test1() throws InterruptedException, URISyntaxException
	{
		
		URI ur = new URI(drv.getCurrentUrl());
		String string4 = ur.getHost();
		System.out.println(" Hi the domain name is "+ string4);

		
		JavascriptExecutor js = (JavascriptExecutor)drv;
		
		String str1 = (String)js.executeScript("return document.title");
		String str2 = drv.getTitle();
		
		System.out.println(" Title by javascript is  "+ str1);

		System.out.println(" Title by selenium is  "+ str2);

		assert(str1.equals(str2));

		String str = (String)js.executeScript("return document.domain");
		
		System.out.println(" Hi the domain name is "+ str);
		
		
		
		
		js.executeScript("alert('Thanks a lot for this tutorial');");
				
		Thread.sleep(3000);
		drv.switchTo().alert().accept();

		js.executeScript("scroll(0,1500);");
		Thread.sleep(3000);

		
		js.executeScript("window.scrollBy(0,500);","" );
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-300);","" );
		Thread.sleep(3000);
		WebElement el = drv.findElement(By.xpath("//*[@id='subscribe-field-blog_subscription-3']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",el );
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0,doument.body.scrollHeight)","" );
		
		

		
		
		
		
		
		
	}
}
