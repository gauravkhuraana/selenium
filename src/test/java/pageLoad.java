

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
;

public class pageLoad {

	WebDriver drv;
	@BeforeClass
	public void setup()
	{
	

		drv = new ChromeDriver();
		drv.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
		drv.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		
		testWait();
	}
	
	public void testWait()
	{
		JavascriptExecutor js =(JavascriptExecutor) drv;
		
		/*if(js.executeScript("return document.readyState").toString().equals("complete"))
		{
			System.out.println("Page was completely loaded ");
			return;
		}*/
		
		for(int i=0; i <25; i++)
		{
			if(js.executeScript("return document.readyState").toString().equals("complete"))
			{
				System.out.println("Page was completely loaded on " + i + " second");
				break;
			}
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				//System.out.println("Page was completely loaded on " + i + " second");
			}
			}
				
	}
	
	}
	
	

