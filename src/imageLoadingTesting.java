import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class imageLoadingTesting {

	
	public static void main(String[] args) throws ClientProtocolException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromeDriver.exe");
		
		WebDriver drv = new ChromeDriver();
		
		drv.get("https://in.yahoo.com/");
		drv.manage().window().maximize();
		WebElement el = drv.findElement(By.xpath("//img[starts-with(@id,'yui_3_18_0_3')]"));
		//yui_3_18_0_3_1495530797503_1186
		
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpGet request = new HttpGet (el.getAttribute("src"));
		
		HttpResponse response = client.execute(request);
		
		Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
		
		System.out.println("Image loaded successfully " );
		
		
		
	}
}
