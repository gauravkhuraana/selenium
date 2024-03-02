
// How to check if all links on a website are running fine (returning 2** Messages) Rather than 4** or 5** error messages via selenium / URL / HttpURLConnection
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
;


public class brokenlinks {

	static public  void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver drv = new ChromeDriver();
		
		drv.get("http:\\www.google.com");
		drv.manage().window().maximize();
		
		List<WebElement> links = drv.findElements(By.tagName("a"));
		
		System.out.println("The number of links are " + links.size());
	
	    for(int i=0;i<2; i++)
	    {
	    	WebElement el = links.get(i);
	    	Actions act = new Actions(drv);
	    	act.keyDown(Keys.SHIFT).click(el).build().perform();
	    	String str=null;
	    	try
	    	{
	    	str=el.getAttribute("href");
	    	if(str!=null && str.contains("http"))
	    	{
	    	System.out.println(i+1+" The link href value is " + str);
	    	activelinks(str);
	    
	    	}
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println("Exception is "+e.getMessage());
	    	}
	    	
	    	
	    }
	
	}
	public static void activelinks(String u) throws IOException
	{
	URL url = new URL(u);
	HttpURLConnection http = (HttpURLConnection)url.openConnection();
	
	http.setConnectTimeout(3000);
	http.connect();
		
	if(http.getResponseCode()==200)
	{
		System.out.println("THis link is fine "+ u + http.getResponseMessage() );
	}
	if(http.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
	{
		System.out.println("link not fine "+ u + http.getResponseMessage() );
	}
	
	}
	

}
