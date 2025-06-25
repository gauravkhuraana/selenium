
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mouseActions {

    WebDriver driver ;


    @BeforeTest
    public void setup()
    {
       driver = new ChromeDriver();
       driver.get("https://google.com");
       driver.manage().window().maximize();
    }

    // to mouse hover any element below script can be used
    @Test
    public void mouseHover() throws InterruptedException {
        WebElement elm = driver.findElement(By.xpath("//a[normalize-space()='Gmail']"));
        Actions act = new Actions(driver);
        act.moveToElement(elm).perform();
        Thread.sleep(5000);
    }
}
