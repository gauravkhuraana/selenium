
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testAnApp {

    @Test
public void Test() throws InterruptedException {
        WebDriver drv = new ChromeDriver();


        drv.get("https://host.hub-dev-01.hub.com/?chooseidp");
        Thread.sleep(5000);
        drv.findElement(By.xpath("//input[@id='signInName']")).sendKeys("qa-ta-dev001@sbxhubb2c.onmicrosoft.com");
        drv.findElement(By.xpath("//input[@id='password']")).sendKeys("qa-ta-dev001@sbxhubb2c.onmicrosoft.com");
        drv.findElement(By.xpath("//button[@id=\"next\"]")).click();
    }
}
