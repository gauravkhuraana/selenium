import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



public class remoteDebugging
{

    WebDriver driver;
    @Test
    public void runTestOnChrome()
    {

        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("debuggerAddress","127.0.0.1:9111");
        driver = new ChromeDriver(opt);

        /// comment the code for loggin in
        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");


        driver.findElement(By.xpath("//*[text()=' Search ']")).click();
        if(driver.findElement(By.xpath("//*[text()='Invalid']")).isDisplayed())
        {
            System.out.println("Able to see invalid ");
        }

    }

    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
