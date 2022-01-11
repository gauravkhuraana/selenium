import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class grid {


    @Test
    public static void gridTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://generic-ui.com/demo");
        driver.manage().window().maximize();

        //Select will not work here since its not in select but span

        //Click on arrow to dropdown
        WebElement selectArrow = driver.findElement(By.xpath("//div/span[@class='gui-select-arrow']"));
        selectArrow.click();
        Thread.sleep(2000);

        // click on 100 rows
        driver.findElement(By.xpath("//div[@class=\"gui-option\"][contains(text(),'100 Rows')]")).click();

        // Validating if the message is printing 100
        Assertions.assertThat(driver.findElement(By.xpath("//div/b")).getText()).isEqualTo("100");


        WebElement ele=null;
        int flag=0;
        int count=0;

        JavascriptExecutor js = (JavascriptExecutor)driver;

        Thread.sleep(3000);

        //click on the first row on grid
        driver.findElement(By.xpath("(//gui-view-text[@class='gui-text-view gui-italic'])[1]")).click();

        WebDriverWait wait=new WebDriverWait(driver,20) ;
        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//gui-view-text[@class='gui-text-view gui-italic'])[1]")));


        // Try to scoll till end to check if the last number is 100
        do{
            try{
                //element to search for while scrolling in grid
                ele = driver.findElement(By.xpath("//div[@class='gui-row gui-structure-row odd']//span[contains(text(),100)]"));
                flag=1;
            } catch(Throwable e){
                Thread.sleep(3000);

                //scrolling the grid using the grid's xpath
                driver.findElement(By.id("guihaix0dxv7ylv666trr6kq12615")).sendKeys(Keys.PAGE_DOWN);
                element1.sendKeys(Keys.PAGE_DOWN);

                //js.executeScript("scroll(0,1500);");
                Thread.sleep(3000);
            }
        }while((flag==0) || ((++count)==26));

        //"Checking if we found the value as 0"
        Assertions.assertThat(flag).isEqualTo(1);




        //just to have a look at the result
        Thread.sleep(3000);
         driver.quit();

    }
}
