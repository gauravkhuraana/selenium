

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class dataPropertyRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fl = new File("C:\\Users\\Gaurav.Khurana\\workspace\\Practise\\dataFile.properties");
		FileInputStream fs = new FileInputStream(fl);
		Properties prop = new Properties();
		prop.load(fs);
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");

		WebDriver drv = new ChromeDriver();
		drv.get(prop.getProperty("URL"));
		System.out.println(prop.get("username"));
		System.out.println(prop.getProperty("password"));
		
		
		System.out.println("lets print all the keys ");
		Enumeration ke = prop.keys();
		
		while(ke.hasMoreElements())
		{
			String key = (String) ke.nextElement();
			String Value = prop.getProperty(key);
			System.out.println(Value);
			
			
		}
		

	}

}
