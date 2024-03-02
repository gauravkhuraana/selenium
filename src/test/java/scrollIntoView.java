


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
;

public class scrollIntoView {

WebDriver drv;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
        ;
		drv = new ChromeDriver();
		drv.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
     } 	
	
	@Test
	public void test()
	{
		JavascriptExecutor js = (JavascriptExecutor) drv;
		WebElement element = drv.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	

}

