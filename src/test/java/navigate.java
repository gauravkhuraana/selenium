


import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver drv = new ChromeDriver();


		String url="http:\\www.udzial.com";
		drv.get("http:\\www.udzial.com");
		drv.get("http:\\www.gauravkhurana.in");
		drv.get("http:\\www.checkdomain.com");
		drv.get("http:\\www.check.com");
		
		System.out.println("Current URL "+drv.getCurrentUrl() );
		drv.navigate().back();
		System.out.println("After back command     " + drv.getCurrentUrl());
		drv.navigate().back();
		System.out.println("After one more back command  " + drv.getCurrentUrl());
        drv.navigate().back();
		System.out.println("After back command  " + drv.getCurrentUrl());
		drv.manage().window().maximize();

		System.out.println("Now trying via navigate command");
		drv.navigate().to("http:\\google.com");
		drv.navigate().to("http:\\yahoo.com");
		drv.navigate().to("http:\\rediffmail.com");
		drv.navigate().to("http:\\www.check.com");

		
		System.out.println("Current URL "+drv.getCurrentUrl() );
		drv.navigate().back();
		System.out.println("After back command     " + drv.getCurrentUrl());
		drv.navigate().back();
		System.out.println("After one more back command  " + drv.getCurrentUrl());
        drv.navigate().back();
		System.out.println("After back command  " + drv.getCurrentUrl());
		
		
		
//		drv.quit();
	}
	
	

}
