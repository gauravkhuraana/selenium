import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findElement {
	
	@Test
	public void findelement()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		
		drv.get("http://jqueryui.com/");
		
		WebElement el = drv.findElement(By.xpath(".//*[@class='menu-item'][1]/a[1]"));
		//el.click();
	 drv.manage().window().maximize();
		
		List<WebElement> elList = drv.findElement(By.xpath(".//*[@id='menu-top']/li"));
		System.out.println("Total element in the list are " + elList.size());
		
		Iterator<WebElement> i1 = elList.iterator();
		
		
		while(i1.hasNext())
		{
			
			WebElement el2=i1.next();
			String str=el2.getText();
			int count=0;
			System.out.println("Hi the element caught is 0 " +str);
			count++;
			System.out.println("Total time loop ran was  " +count);
			
		}
		
	}

}
