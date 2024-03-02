

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class getPagetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver drv = new ChromeDriver();
		drv.get("http:\\www.google.com");
		
		String str= drv.getTitle();
		
		System.out.println("The page title is " + str);
		

	}

}
