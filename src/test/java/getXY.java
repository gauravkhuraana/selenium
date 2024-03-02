

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
;

public class getXY {

	@DataProvider(name="data")
	public Object[][] function()
	{
		return new Object[][] {{"btnK"},{"btnI"} };
	}
	

		@Test(dataProvider="data")
		public void test(String str)
		{
		

		WebDriver drv = new ChromeDriver();
		drv.get("http:\\www.google.com");
		WebElement elm = drv.findElement(By.name(str));
		
		Point pt = elm.getLocation();
		
		int NumberX=pt.getX();
		int NumberY=pt.getY();
		
		System.out.println("Hello the cordinates for are " + NumberX + " and Y is "+ NumberY);
		
		int width= elm.getSize().width;
		int height= elm.getSize().height;
		
		System.out.println("Hello the width is " + width+ " and height is "+ height);
		
		
		
		
		
		}
	}

