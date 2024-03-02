
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
public class gmailLogin{
    public static void main(String[] args) {


        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new FirefoxDriver();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //URL launch
        driver.get("https://accounts.google.com/signin");
        //identify email
        WebElement l = driver
                .findElement(By.name("identifier"));
        l.sendKeys("gaurav.jaz@gmail.com");
        WebElement b = driver
                .findElement(By.className("VfPpkd-LgbsSe"));
        b.click();
        //identify password
        WebElement p = driver
                .findElement(By.name("password"));
        p.sendKeys("123456");
        b.click();
        //close browser
        driver.close();
    }
}