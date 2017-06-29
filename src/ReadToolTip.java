import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		
		drv.get("http://www.udzial.com");
		
		
		//Tooltip is stored in Title attribute of an element. So we are getting it using below
		String Tooltip=drv.findElement(By.xpath("//a[contains(@href,'180018001234')]")).getAttribute("title");
		
		System.out.println("Hello here is the tootltip :- \n " + Tooltip );
			
	}

}
