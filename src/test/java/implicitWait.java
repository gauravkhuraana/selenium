

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;
;

public class implicitWait {
	@Test
	public static void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("http:\\www.google.com");
		drv.manage().window().maximize();
		//drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		drv.findElement(By.name("example"));
		
		
	}

}
