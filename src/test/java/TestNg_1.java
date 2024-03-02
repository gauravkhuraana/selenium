

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNg_1 {

    WebDriver driver;

    @Test

    public void Test() {
        System.out.println("Test Passed ");

    }
    @BeforeMethod
    public void beforeMethod() {
        
       // ;
        driver = new ChromeDriver();
        driver.quit();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Fetched data");
    }

}