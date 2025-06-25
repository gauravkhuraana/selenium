

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
;

public class dateSelector {
	
	WebDriver drv;
	@Test
	public void setup() throws InterruptedException
	{
	

		drv = new ChromeDriver();
		
		SimpleDateFormat df = new SimpleDateFormat("MM/DD/YYYY");
		Date dt = new Date();
		
		Calendar cl = Calendar.getInstance();
		cl.setTime(dt);;
		cl.add(Calendar.DAY_OF_YEAR, 1);
		dt=cl.getTime();
		
		String str = df.format(dt);
		
		System.out.println("the date today is " + str);
		drv.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		String []str1 = {"//*[@id='datepicker']","hello"}; 
		WebElement el = drv.findElement(By.xpath(str1[0]));
		el.sendKeys(str);
		Thread.sleep(3000);
		
	
		
		
		
	}
	@AfterClass
	public void exit()
	{
		drv.quit();
	}

}
