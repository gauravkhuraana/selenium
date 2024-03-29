
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class graphHandling {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod()
    {
        driver = new ChromeDriver();

        String baseurl = "https://www.google.com/";

        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Covid cases in India");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);

    }
    @Test
    public void svgGraph() throws InterruptedException {


        List<WebElement> graphList=
        driver.findElements(By.xpath("(//div[@class=\"uch-svg\"])[3]//div[@class=\"uch-xa\"]//span"));

        Actions act = new Actions(driver);
        for(WebElement e:graphList)
        {
        act.moveToElement(e).build().perform();   ;
        String text = driver.findElement(By.xpath("//table[@class='F9Gkq']//tr/td")).getText();
        System.out.println(text);
        }
    }

    @Test
    public void graph2() throws InterruptedException {


        List<WebElement> graphList=
                driver.findElements(By.xpath("(//div[@class='uch-svg'])[2]//span[@class=\"uch-xa-tl\"]"));
      //  List<WebElement> graphList=
        //        driver.findElements(By.xpath("//div[@jsname='EMtBNe']"));


        Actions act = new Actions(driver);
        for(WebElement e:graphList)
        {
            act.moveToElement(e).build().perform();   ;
            String text = driver.findElement(By.xpath("//table[@class='swWWne']//tr/td")).getText();
            System.out.println(text);
        }
    }

    @Test
    public void graph2AnotherWay() throws InterruptedException {


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//div[@class=\"p6xhrd\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
//        List<WebElement> graphList=
//                driver.findElements(By.xpath("((//div[@class='uch-xa'])[2]//span)[1]"));
//        //  List<WebElement> graphList=
        //        driver.findElements(By.xpath("//div[@jsname='EMtBNe']"));


        Actions act = new Actions(driver);
//        for(WebElement e:graphList)
//        {
            for (int i =0; i<element.getLocation().getX();i++)
            {
                 act.moveByOffset (1,0).build().perform();
                String text = driver.findElement(By.xpath("//div[@class=\"p6xhrd\"]")).getText();
                System.out.println(text);
            }

        //}
    }

    //table[@class="swWWne"]//tr/td

    @AfterMethod
    public void afterEachMethod() throws InterruptedException {
        Thread.sleep(15000);
        driver.quit();
    }

    public void handlingGraph3()
    {

        List<WebElement> thirdGraph = driver.findElements(By.xpath("//*[local-name()='svg' and @class='uch-psvg'])[3]"));
        Actions act = new Actions(driver);
        for (WebElement el:thirdGraph)
        {
            act.moveToElement(el).build().perform();
        }
    }

  }
