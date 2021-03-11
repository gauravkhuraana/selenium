

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
;

public class dateSelection {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "d:\\software\\chromedriver_win32\\chromedriver.exe") ;
WebDriver driver = new ChromeDriver();
driver.get("https://www.makemytrip.com/");

WebElement Depart = driver.findElement(By.xpath(".//*[@id='hp-widget__depart']"));
Thread.sleep(5000);
Depart.click();
List<WebElement> Data = driver.findElements(By.xpath(".//*[@class='dateFilter hasDatepicker']/div//div[1]//table//td//a")) ;
int size = Data.size() ;
System.out.println( "Display size " +size );
//String desireddate = Data.getText() ;
//System.out.println("desireddate is : " +desireddate);

for(WebElement Content : Data)
{
 String desireddate = Content.getText() ;
System.out.println("desireddate is : " +desireddate);
//Thread.sleep(5000);
if (desireddate.equalsIgnoreCase("23")) 
{
//System.out.println("Desired Date available");
Content.click();
//Thread.sleep(5000);
break;
}

else {
System.out.println("Desired Date not available");
//break;
}

}
driver.quit();
}
}