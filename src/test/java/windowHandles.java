
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class windowHandles {


    WebDriver drv;
    @BeforeTest()
     public void setup()
     {
        drv = new ChromeDriver();

     }

     @Test
    public void test() throws InterruptedException {
         drv.get("https://opensource-demo.orangehrmlive.com/");

         JavascriptExecutor js = (JavascriptExecutor)drv;
         js.executeScript("window.scrollBy(0,9500);" );
         Thread.sleep(3000);

         String parent = drv.getWindowHandle();
         System.out.println("Current window handle is "+parent);

         // How to open multiple tabs in selenium
         openMultipleTab();

         Set<String> allWindowHandles = drv.getWindowHandles();

         //SwitchToParticularWindow
         switchToParticularTab("Twitter",allWindowHandles);
         Thread.sleep(1000);
         switchToParent(parent);

         // Close all tabs apart from parent in selenium
         closeAllTabsExceptParent(parent,allWindowHandles);


     }

    private void openMultipleTab() throws InterruptedException {
        drv.findElement(By.xpath("//img[@alt=\"LinkedIn OrangeHRM group\"]")).click();
        Thread.sleep(3000);
        drv.findElement(By.xpath("//img[@alt=\"OrangeHRM on Facebook\"]")).click();
        Thread.sleep(3000);
        drv.findElement(By.xpath("//img[@alt=\"OrangeHRM on twitter\"]")).click();
        Thread.sleep(3000);
        drv.findElement(By.xpath("//img[@alt=\"OrangeHRM on youtube\"]")).click();
    }

    private void closeAllTabsExceptParent(String parentHandle, Set<String> allWindowHandles) throws InterruptedException {

        for(String e:allWindowHandles)
        {
            if(!e.contains(parentHandle))
            {
                String title = drv.switchTo().window(e).getTitle();
                System.out.println("Closing the current window whose title is "+ title);
                drv.switchTo().window(e).close();
                //drv.close();
            }
        }
    }

    private void switchToParticularTab(String tab, Set<String> allWindowHandles) throws InterruptedException {

        for(String e:allWindowHandles)
        {
            String title = drv.switchTo().window(e).getTitle();
             if(title.contains(tab))
            {
                System.out.println("The current window we switched to has title as "+ title);
                drv.switchTo().window(e);
                Thread.sleep(2000);
                return;
            }
        }
    }

    private void switchToParent(String parentTab) throws InterruptedException {

        drv.switchTo().window(parentTab);
        System.out.println("we are switching to parent tab "+ drv.getTitle() + " url is " + drv.getCurrentUrl());
        Thread.sleep(2000);
    }





    @AfterTest()
    public void teardown()
     {
        drv.quit();
     }


}
