package test.java.secondTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertions {

	WebDriver drv;
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");

		drv = new ChromeDriver();
		drv.navigate().to("http://only-testing-blog.blogspot.in/2014/02/attributes.html");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		WebElement el1=drv.findElement(By.name("option1"));
		
		Assert.assertTrue(el1.isSelected()); // will pass if condition is false
			
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		WebElement el2=drv.findElement(By.name("option2"));
		
		Assert.assertFalse(el2.isSelected()); // will pass if condition is true
			
	}
	
	@Test
	public void verify() throws InterruptedException
	{
		drv.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");

		WebElement el4=drv.findElement(By.xpath("//div[@id='timeLeft']"));
		
		String actualtext="Time left: 14 seconds";
		String ExpecetedText=el4.getText();
		System.out.println("verify Actaul was" + actualtext + " expected was" + ExpecetedText);
		
		
		if(actualtext.equals(ExpecetedText))
		{
			System.out.println("Wow it matched");
		}
		else
		{
			System.out.println("Not matched");
		}
		}
	
	
	
	@Test
	public void testEquals() throws InterruptedException
	{
		drv.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		WebElement el3=drv.findElement(By.xpath("//*[@class='date-outer']/h2/span"));
		
		String actualtext="Tuesday, 28 January 2014";
		String ExpecetedText=el3.getText();
		
		System.out.println("TestEuals Actaul was" + actualtext + " expected was" + ExpecetedText);
		
		Assert.assertEquals(actualtext, ExpecetedText); // will pass if both are eQual
			
	}
		
	@Test
	public void testNotEquals() throws InterruptedException
	{
		WebElement el3=drv.findElement(By.xpath("//*[@class='date-outer']/h2/span"));
		
		String actualtext="Tuesday, 28 January 2014";
		String ExpecetedText=el3.getText();

		System.out.println("Actaul was " + actualtext + " expected was " + ExpecetedText);
		Assert.assertNotEquals(actualtext, ExpecetedText); // will pass if both are eQual
			
	}
		
	

	
	
	@AfterClass
	public void exit()
	{
		drv.quit();
	}
}
