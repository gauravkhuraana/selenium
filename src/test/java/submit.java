

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
;

public class submit {
	
	WebDriver drv;
	@BeforeClass
	public void setup()
	{
	

		drv = new ChromeDriver();
		drv.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement el1=drv.findElement(By.name("FirstName"));
		WebElement el2=drv.findElement(By.name("LastName"));
		WebElement el3=drv.findElement(By.name("EmailID"));
		WebElement el4=drv.findElement(By.name("MobNo"));
		WebElement el5=drv.findElement(By.name("Company"));
		
		el1.sendKeys("Jai");
		el2.sendKeys("Shri");
		el3.sendKeys("Krishna");
		el4.sendKeys("gaurav@testing");
		el5.sendKeys("WOrldWide");
		Thread.sleep(2000);
		
		el5.submit();
		
		
		
		
	}
	
		
		

	@AfterClass
	public void exit()
	{
		drv.quit();
	}

}
