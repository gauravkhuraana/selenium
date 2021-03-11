

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class CurrentPageTotalPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(" The current and total pages are " + result);

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		drv.get("http://www.amazon.in/s/ref=sr_pg_3?rh=n%3A976389031%2Ck%3Ashoes&page=3&keywords=shoes&ie=UTF8&qid=1498705578&spIA=1333873328,1332105327,3659770345,1440061440");
		
		WebElement el1 = drv.findElement(By.className("pagnCur")); 
		WebElement el2 = drv.findElement(By.className("pagnDisabled"));
		
		String result=el1.getText()+ "/" + el2.getText();
		
		System.out.println(" The current and total pages are " + result);
	}

}
