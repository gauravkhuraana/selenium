


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
;

public class getSourceCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver drv = new ChromeDriver();

		drv.get("http://www.google.com");
		
		boolean b = drv.getPageSource().contains("Gogle");
		
		if(b)
		{
			System.out.println(" THe google page contains the keyword Google");
		}
		else
		{
			System.out.println(" THe google page does not contains the keyword Google");
		}
		
	}

}
