

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class baseSetup {

		WebDriver drv;
		@BeforeClass
		public void setup(String s)
		{
		

			drv = new ChromeDriver();
			drv.get("");
		}
		
		@AfterClass
		public void exit()
		{
			drv.quit();
		}
	

}
