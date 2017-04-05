import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver drv = new ChromeDriver();
		
		drv.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions act = new Actions(drv);
		
		//act.dragAndDrop(drv.findElement(By.name("draggable")), drv.findElement(By.name("droppable"))).build().perform();
		act.clickAndHold(drv.findElement(By.name("draggable")));
		act.moveToElement(drv.findElement(By.name("droppable")));
		act.release().build().perform();
		

	}

}
