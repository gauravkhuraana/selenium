import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testSlider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv = new ChromeDriver();
		drv.get("http://jqueryui.com/slider/");
		
		drv.manage().window().maximize();
		
		
		//drv.findElement(By.tagName("iframe"));
		//int totalFrames = drv.findElements(By.tagName("iframe")).size();
	   //System.out.println("The total number of frames are "  + totalFrames);
		
		drv.switchTo().frame(0);
		
		WebElement sliderStrip = drv.findElement(By.xpath("//div[@id='slider']"));
		
		WebElement slider = drv.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		
		Dimension dim = sliderStrip.getSize();
		int width = dim.width;
		System.out.println(" The width of the slider strip is " + width);
		
		//int movement = 
		
		
		Actions act = new Actions(drv);
		act.clickAndHold(slider).moveByOffset(width,0).build().perform();
      Thread.sleep(2000);
	  	// MOving 25% back 
		
		int backPosition = width - (width*25/100);
		act.dragAndDropBy(slider, -backPosition, 0).build().perform();
		
	}
	

}
