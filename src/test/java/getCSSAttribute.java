

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class getCSSAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		WebDriver drv = new ChromeDriver();
		
		drv.get("http://google.com/");
		
		WebElement el = drv.findElement(By.id("lst-ib"));
		
		System.out.println("Style =" + el.getAttribute("style"));
		System.out.println("Border = " + el.getCssValue("border"));
		System.out.println("padding = " + el.getCssValue("padding"));
		System.out.println("margin = " +el.getCssValue("margin"));
		System.out.println("height = " +el.getCssValue("height"));
		System.out.println("position = " +el.getCssValue("position"));
		System.out.println("z-index = " +el.getCssValue("z-index"));
		System.out.println("width = " +el.getCssValue("width"));

		
		 /*
		  * 0px none rgb(0, 0, 0)
0px

#lst-ib


rgb(0, 0, 0) none 0px

		  */
	
	}

}
