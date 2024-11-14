
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testAnApp {

    @Test
public void Test() throws InterruptedException {
        WebDriver drv = new ChromeDriver();


        drv.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(5000);
        String username = "D\"Angelo";

        String xpath = String.format("//input[@name=\"%s\"]", username);

        drv.findElement(By.xpath(xpath)).sendKeys("test");

        drv.findElement(By.xpath("//input[@value=\""+username+"\"]")).sendKeys("test");
        drv.findElement(By.xpath("//input[@value='"+username+"']")).sendKeys("test");
    }
}
