

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
;

public class dataPropertyRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File fl = new File("./dataFile.properties");
		FileInputStream fs = new FileInputStream(fl);
		Properties prop = new Properties();
		prop.load(fs);



		ChromeOptions options = new ChromeOptions();
		boolean headless = Boolean.parseBoolean(prop.getProperty("headless"));
        if(headless) {
			options.addArguments("--headless=new");
		}
		WebDriver drv = new ChromeDriver(options);
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
