import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class getWebElementScreenshot {
	
	WebDriver drv;
	@BeforeClass
	public void beforeSetup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		drv = new ChromeDriver();
		drv.get("http://www.bollywoodhungama.com/news/bollywood/aamir-khan-responds-pr-sondhis-allegations-portrayal-dangal/?ref=yfp");
		

	}

	@Test
	public void test() throws IOException
	{
		WebElement el = drv.findElement(By.xpath("//*[@class='loaded']"));
		captureScreen(el);
	}
	
	
	
	public void captureScreen(WebElement el) throws IOException
	{
		File sht = ((TakesScreenshot)drv).getScreenshotAs(OutputType.FILE);
		int width=el.getSize().getWidth();
		int height=el.getSize().getHeight();
		
		Point pt = el.getLocation();
		
		int X=pt.getX();
		int Y=pt.getY();
		
		System.out.println(" x = " + X + " Y = " + Y + "width = " + width + "height = " + height);
		
		
		BufferedImage img = ImageIO.read(sht);
				
		BufferedImage dest=	img.getSubimage(X, Y, width, height);
		
		ImageIO.write(dest,"png",sht);
		FileUtils.copyFile(sht,new File("D:\\gaurav\\WebElementScreenshot.png"));
	}
}
