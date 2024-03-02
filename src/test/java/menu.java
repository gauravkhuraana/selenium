

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class menu {

	@Test
public void Test() {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");

		WebDriver drv = new ChromeDriver();


		drv.get("http://www.ticketmaster.co.uk");
    	drv.manage().window().maximize();
    	WebElement men = drv.findElement(By.xpath("//*[@id='navLinkCat_music']"));

    	Actions bld = new Actions(drv);
    	bld.moveToElement(men).build().perform();
    	
    WebDriverWait wt = new WebDriverWait(drv, Duration.ofSeconds(5));
    	
    wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='subNav_music_menu']/tbody/tr[2]/td[1]/a[1]")));
	WebElement menuOption = drv.findElement(By.xpath("//*[@id='subNav_music_menu']/tbody/tr[2]/td[1]/a[1]"));
	menuOption.click();

		
	}

}
