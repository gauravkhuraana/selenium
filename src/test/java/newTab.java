

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
;

public class newTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.get("http:\\www.google.com");
		WebElement link = drv.findElement(By.className("gb_P"));
		Actions act = new Actions(drv);
		act.keyDown(Keys.SHIFT).click(link).keyUp(Keys.SHIFT).build().perform();
		

	}

}
