import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.Console;

public class vanishingElement {


    @Test
    public void disappearingElement() throws InterruptedException {
        //kuchtohai driver
        WebDriver drv = new ChromeDriver();
        //kuchtohai
        drv.get("http://www.redbus.in");
        drv.findElement(By.xpath("//*[@class=\"labelCalendarContainer\"]")).click();
        System.out.println(drv.getPageSource());
    }
}
