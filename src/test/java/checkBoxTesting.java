

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class checkBoxTesting {

	
	

	@Test
	public void test() throws InterruptedException
	{
	  //  System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
		WebDriver drv = new ChromeDriver();
    drv.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    drv.manage().window().maximize();
    
    drv.findElement(By.id("isAgeSelected")).click();
    String successText=drv.findElement(By.id("txtAge")).getText();
    
    
    Assert.assertEquals("Success - Check box is checked", successText);



    WebElement chkbox1=drv.findElement(By.xpath("(//*[@class='cb1-element'])[1]"));
    WebElement chkbox2=drv.findElement(By.xpath("(//*[@class='cb1-element'])[2]"));
    WebElement chkbox3=drv.findElement(By.xpath("(//*[@class='cb1-element'])[3]"));
    WebElement chkbox4=drv.findElement(By.xpath("(//*[@class='cb1-element'])[4]"));

    
    chkbox1.click();
    chkbox2.click();
    
    
    if(chkbox1.isSelected() && chkbox2.isSelected() &&  chkbox3.isSelected() &&  chkbox3.isSelected())
    {
    	System.out.println("All checkboxes are selecetd");
    }
    else
    {
    	System.out.println( " Some of the checkbox is not checked yet");
    	Thread.sleep(2000);
    }
    
    drv.findElement(By.id("check1")).click();
    
    if(chkbox1.isSelected() && chkbox2.isSelected() &&  chkbox3.isSelected() &&  chkbox3.isSelected())
    {
    	System.out.println("All checkboxes are selecetd");
    	Thread.sleep(2000);

    }
    else
    {
    	System.out.println( " Some of the checkbox is not checked yet");
    }
    
    successText=drv.findElement(By.id("check1")).getAttribute("value");
    
    
    Assert.assertEquals("Uncheck All", successText);
    
    chkbox2.click();

    if(chkbox1.isSelected() && chkbox2.isSelected() &&  chkbox3.isSelected() &&  chkbox3.isSelected())
    {
    	System.out.println("All checkboxes are selecetd");
    }
    else
    {
    	System.out.println( " Some of the checkbox is not checked yet");
    	Thread.sleep(2000);

    }
    
    drv.findElement(By.id("check1")).click();
    
    
    if(!(chkbox1.isSelected() && chkbox2.isSelected() &&  chkbox3.isSelected() &&  chkbox3.isSelected()))
    {
    	System.out.println("All checkboxes are unselecetd");
    	Thread.sleep(2000);

    }
    else
    {
    	System.out.println( " Some of the checkbox is not checked yet");
    }
	}
}
