import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class highlighter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		
		WebDriver drv = new FirefoxDriver();
		
		drv.get("https://google.com");
		
		JavascriptExecutor js = (JavascriptExecutor)drv;
		WebElement el = drv.findElement(By.className("gsfi"));
		
		//js.executeScript("arguments[0].setAttribute('stlye,'border: solid 2px red'');",el);
		//arguments[0].setAttribute('style,'border: solid 2px red'');", username);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px red');", el);

		
	}

}
