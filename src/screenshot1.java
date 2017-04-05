import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.get("http:\\www.udzial.com");
		
		File scsht = ((TakesScreenshot)drv).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scsht, new File ("D:\\Gaurav\\screenshot1.jpeg"));
		
		
	}

}
