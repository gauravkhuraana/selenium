import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDriven {


	@Test(dataProvider="testdata")
	public void twice(String uname,String passwd) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver drv = new ChromeDriver();
		
		drv.get("http://newtours.demoaut.com/");
		
		drv.findElement(By.name("userName")).clear();
		drv.findElement(By.name("userName")).sendKeys(uname);
					
		
		drv.findElement(By.name("password")).clear();
		drv.findElement(By.name("password")).sendKeys(passwd);
		
		//Thread.sleep(5000);
		
		
	}

	@DataProvider(name="testdata")
	public Object[][] testdata()
	{
		Object[][] inputdata = new Object[2][2];
		inputdata[0][0]="gaurav_jaz@yahoo.com";
		inputdata[0][1]="test";
		
		inputdata[1][0]="jaz_gaurav@yahoo.com";
		inputdata[1][1]="testing1";
		return inputdata;
				
	}
	
	}
	
	

