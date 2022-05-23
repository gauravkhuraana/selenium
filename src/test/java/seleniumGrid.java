import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class seleniumGrid
{

    WebDriver driver;
    @Test
    public void runTestOnChrome()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnfirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnEdge()
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnChromeSgrid() throws MalformedURLException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        //chromeOptions.setCapability("browserVersion", "100");
        //chromeOptions.setCapability("platformName", "Windows");
        // Showing a test name instead of the session id in the Grid UI
        //chromeOptions.setCapability("se:name", "My simple test");
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),chromeOptions);
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnFirefoxSgrid() throws MalformedURLException {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),firefoxOptions);
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnEdgeSgrid() throws MalformedURLException {
        WebDriverManager.edgedriver().setup();
        EdgeOptions edgeOptions = new EdgeOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),edgeOptions);
        driver.get("https://google.com");
    }

    @AfterTest
    public void teardown()
    {
        driver.quit();
    }
}
