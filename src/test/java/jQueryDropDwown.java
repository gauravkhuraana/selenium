

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
;

public class jQueryDropDwown {
	
	@Test
	public void test()
	{
		
	
		WebDriver drv=new ChromeDriver();
		drv.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		
	/*	drv.findElement(By.className("select2-search__field")).sendKeys("Australia");
		
		drv.findElement(By.className("select2-selection__rendered")).sendKeys("Alaska");
		
		drv.findElement(By.className("select2-selection__rendered")).sendKeys("California");
		
		drv.findElement(By.id("select2-q6m4-container")).sendKeys("Northern Mariana Islands");
		
		drv.findElement(By.name("files")).sendKeys("php");*/
		
		List<WebElement> allTags = drv.findElements(By.id("//*[@id='selectable']/*"));
		
		Actions act = new Actions(drv);
		act.clickAndHold(allTags.get(2));
		act.clickAndHold(allTags.get(5));
		act.build().perform();
		
		act.clickAndHold(allTags.get(2)).clickAndHold(allTags.get(5)).build().perform();
		
		
		
		
		
		
		
	}

}
