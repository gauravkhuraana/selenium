
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
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnfirefox()
    {
        driver = new FirefoxDriver();
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnEdge()
    {
        driver = new EdgeDriver();
        driver.get("https://google.com");
        // to get details logging for Chrome driver
        System.setProperty("webdriver.chrome.verboseLogging", "true");

    }

    @Test
    public void runTestOnChromeSgrid() throws MalformedURLException {
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
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:4444"),firefoxOptions);
        driver.get("https://google.com");
    }

    @Test
    public void runTestOnEdgeSgrid() throws MalformedURLException {
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
