import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class openAOpenedBrowser {

    public static void main(String args[])
    {
//        System.out.println("Rune this command ");
//        System.out.println("C:\\Program Files (x86)\\Google\\Chrome\\Application>chrome.exe --remote-debugging-port=9222 --user-data-dir=remote-profile");
//
//        System.out.println("Hare Krishna");
//
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("debuggerAddress","127.0.0.1:9222");
//        WebDriver drv = new ChromeDriver(options);
//
//        drv.findElement(By.xpath("//li[@id='menu-item-573']//a[normalize-space()='Subscribe']")).click();

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new FirefoxDriver();
        String baseurl ="https://www.google.com/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        driver.quit();



    }
}
