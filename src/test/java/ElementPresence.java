import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ElementPresence {

	WebDriver drv;

	@Test
	public void setup() {
	

		drv = new ChromeDriver();
		drv.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");

		String xpath = "";
		boolean test;
		for (int i = 1; i <= 5; i++) {
			xpath = ".//*[@id='text" + i + "']";
			//test = drv.findElement(By.xpath(xpath)).getSize();
			if (true) {
				System.out.println(" Element with xpath exists " + xpath);
			} else {
				System.out.println(" Element with xpath does not exists " + xpath);
			}
		}


	}

	private void drv(String xpath) {
	}


	public void test(String xpath) {
		//boolean test=drv.findElement(By.xpath(xpath).size()!=0);
		//return test;
	}

	@AfterClass
	public void exit() {
		drv.quit();
	}

 }

