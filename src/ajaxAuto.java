import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ajaxAuto {
	
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		
		
		
		
	}

	@DataProvider(name="data")
	        public Object[][] dataprovider()
			{
		      return new Object[][] { {"selenium Webdriver test"},{"auto s"} };
			}
	
	
	@Test(dataProvider="data")
	public void test(String Search)
	{
	
		WebDriver drv = new ChromeDriver();
		drv.get("http:\\www.google.com");
	
		
		drv.findElement(By.id("lst-ib")).clear();
	
	
	drv.findElement(By.id("lst-ib")).sendKeys(Search);
	int i =0 ;
	int j=i+1;
	
	for (i=1 ; i <=j ;i++)
	{
		try
		{
			Thread.sleep(5000);
			WebElement link=drv.findElement(By.xpath("//*[@class='sbsb_b']/li[@role='presentation']["+i+"]"));
			String suggestion = link.getText();
			Actions nt = new Actions(drv);
			nt.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
			
			System.out.println(suggestion);
			j++;
			
		}
		catch(Exception e)
		{
			System.out.println("Please SEarch for another word ");
		}
		
		
	}
	}

}
