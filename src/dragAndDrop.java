import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv = new ChromeDriver();
		
/*		
		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability("marionette", true);
		WebDriver drv = new FirefoxDriver(cap);*/
		
		
		drv.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions act = new Actions(drv);
		Thread.sleep(3000);
		//act.dragAndDrop(drv.findElement(By.name("draggable")), drv.findElement(By.name("droppable"))).build().perform();
		act.clickAndHold(drv.findElement(By.id("draggable")));
		act.moveToElement(drv.findElement(By.id("droppable")));
		act.release().build().perform();
		

	}

}
