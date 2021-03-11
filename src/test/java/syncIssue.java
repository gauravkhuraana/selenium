

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class syncIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("http:\\www.redbus.in");
		
		WebElement ele1,ele2= null;
		
		ele1 = check(drv,"//*[@id='sc']",5);
		ele2 = check(drv,"//*[@id='dest']",5);
		if(ele1!=null && ele2!=null)
		{
			ele1.sendKeys("Hyderabad");
			ele2.sendKeys("Goa");
			
		}
		else
		{
			System.out.println(" Element was not found. Still dont worry ");
		}

	}
	
	public static WebElement check(WebDriver d, String xpath, int time)
	{
		WebElement ele=null;
		for(int i=0; i < time ; i++)
		{
			try
			{
				ele=d.findElement(By.xpath(xpath));
				break;

			}
			catch(Exception e)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e2)
				{
					System.out.println("waiting for the element to appear in DOM" + e2.getMessage());
				}
			}
		}
		return ele;
	}
	

}
