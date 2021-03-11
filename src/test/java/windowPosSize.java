

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class windowPosSize {
	
	WebDriver drv;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");

		drv = new ChromeDriver();
		drv.get("http://www.google.com");
		drv.manage().window().maximize();
	}
	
	@Test
	public void test1()
	{
		
		System.out.println("X = " + drv.manage().window().getPosition().getX());
		System.out.println("Y = " + drv.manage().window().getPosition().getY());
		System.out.println("Width = " + drv.manage().window().getSize().getWidth());
		System.out.println("Height = " + drv.manage().window().getSize().getHeight());
		
		System.out.println("Now we will set the size & position");
		drv.manage().window().setPosition(new Point(500,200));
		drv.manage().window().setSize(new Dimension(30,30));
		
	
		
		
		
		
	}
	
	@AfterClass
	public void exit()
	{
		//drv.quit();
	}


}
