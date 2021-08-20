import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class RunTestInDockerViaSelenium {


    @Test
    public void openGoogle() throws MalformedURLException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.CHROME);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4446/wd/hub"),cap);

        String baseurl ="https://www.google.com/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        System.out.println("Test1");
        Thread.sleep(10000);
        driver.quit();

    }

    @Test
    public void openGoogleSecond() throws MalformedURLException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(BrowserType.FIREFOX);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4449/wd/hub"),cap);

        String baseurl ="https://www.google.com/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        System.out.println("Test2");
        Thread.sleep(10000);
        driver.quit();

    }

    @Test(dataProvider = "getData")
    public void DataProviderUsed(String browser) throws MalformedURLException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(browser);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4448/wd/hub"),cap);

        String baseurl ="https://www.google.com/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        System.out.println("Test2");
        Thread.sleep(10000);
        driver.quit();

    }
    @DataProvider(parallel=true)
    public Object[][] getData()
    {
        return new Object[][]
                {{"chrome"},{"chrome"},{"firefox"},{"firefox"}};
    }


    @Test(dataProvider = "getData2")
    public void DataProviderUsedWithVersion(String browser,String version) throws MalformedURLException, InterruptedException {

        WebDriverManager.chromedriver().setup();
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName(browser);
        cap.setVersion(version);
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4445/wd/hub"),cap);

        String baseurl ="https://www.google.com/";
        driver.get(baseurl);
        driver.manage().window().maximize();
        System.out.println("Test2");
        Thread.sleep(10000);
        driver.quit();

    }
    @DataProvider(parallel=true)
    public Object[][] getData2()
    {
        return new Object[][]
                {{"chrome","92.0.4515.107"},{"chrome","79.0.3945.117"},{"firefox","90.0.2"},{"firefox","90.0.2"}};
    }

}
