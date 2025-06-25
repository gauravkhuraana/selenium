

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class trackorders {

	@Test
	public void test() throws InterruptedException
	{
	

	WebDriver drv = new ChromeDriver();
	drv.get("http:\\www.flipkart.com");
	
	drv.findElement(By.linkText("Track Order")).click();
	Thread.sleep(2000);
	drv.findElement(By.xpath("//*[@href='/account/orders']")).click();
	
	}
	}
