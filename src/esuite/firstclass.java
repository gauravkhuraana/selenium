package esuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstclass {

	WebDriver drv;
	@BeforeTest
	public void setup()
	{
System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");		
	}
	
	@Test
	public void test() throws InterruptedException
	{
		String url="https://brokerweb-uat.ssp-hosting.com/SSPHousehold";
		WebDriver drv = new FirefoxDriver();
		drv.get(url);
		
		drv.findElement(By.id("PropertyAssumptions")).click();
		Thread.sleep(1000);
		drv.findElement(By.id("ProposerAssumptions")).click();
		Thread.sleep(1000);
		
		Select sl = new Select(drv.findElement(By.id("HeardAboutUs")));
		sl.selectByIndex(2);
		drv.findElement(By.id("AcceptCreditCheckTerms")).click();
		Thread.sleep(1000);
		
		drv.findElement(By.id("btnContinue")).click();
		Thread.sleep(1000);
		
		
	}
	
	
}
