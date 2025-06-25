import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class clickElement {

    @Test
    // click at the middle of the element
    public void clickOnElementAtMiddle(WebElement webElement) {

        baseSetup BaseSteup = new baseSetup();
        WebDriver driver = new ChromeDriver();
        // get the button size
        int width = webElement.getSize().getWidth();
        int height = webElement.getSize().getHeight();

        // calculate the center point of the button
        int center_x = webElement.getLocation().getX() + width / 2;
        int center_y = webElement.getLocation().getY() + height / 2;

        // create an Actions object
        Actions actions = new Actions(driver);

        // move the mouse to the center of the button and click
        actions.moveToElement(webElement, center_x, center_y).click().perform();
    }
}
