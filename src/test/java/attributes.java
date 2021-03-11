
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class attributes {

	
	@Test
	public void test() throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		//WebDriver drv = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				WebDriver drv = new FirefoxDriver();
				
		
		drv.get("http://www.google.com");
		drv.manage().window().maximize();
		
		WebElement searchBox = drv.findElement(By.className("gsfi"));
		System.out.println(" aria-haspopup  " + searchBox.getAttribute("aria-haspopup"));
		searchBox.sendKeys("helloo");
		searchBox = drv.findElement(By.className("gsfi"));
		System.out.println(" aria-haspopup  " + searchBox.getAttribute("aria-haspopup"));
		
		
		System.out.println(" aria-haspopup  " + searchBox.getText());
		
		
		System.out.println(" Now printing the atttributes and properties");
		
		System.out.println(" Attributes are :- ");
		
		System.out.println(" class " + searchBox.getAttribute("class"));
		System.out.println(" className " + searchBox.getAttribute("className"));
		System.out.println(" id  " + searchBox.getAttribute("id"));
		System.out.println("  name " + searchBox.getAttribute("name"));
		System.out.println(" autocomplete  " + searchBox.getAttribute("autocomplete"));
	
		
		Thread.sleep(3000);
		drv.quit();
		
		
	}
}
