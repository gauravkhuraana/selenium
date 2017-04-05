import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class useBaseClass extends baseSetup{

	@Test(description="This is valid login")
	public void first() throws InterruptedException
	{
		setup("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		drv.findElement(By.name("txtUsername")).clear();
		drv.findElement(By.name("txtUsername")).sendKeys("sysadmin");
		drv.findElement(By.id("txtPassword")).clear();
		drv.findElement(By.id("txtPassword")).sendKeys("sysadmin");
		drv.findElement(By.xpath("//*[@type='submit']")).click();
		
		Thread.sleep(5000);
		drv.navigate().to("http://enterprise.demo.orangehrmlive.com/symfony/web/index.php/auth/login");
		Thread.sleep(5000);

		
	}
	
	@Test(description="This is invalid login")
	public void second() throws InterruptedException
	{
		drv.findElement(By.name("txtUsername")).clear();
		
		drv.findElement(By.name("txtUsername")).sendKeys("sysadmin");
		drv.findElement(By.id("txtPassword")).clear();
		drv.findElement(By.id("txtPassword")).sendKeys("syadmin");
		
		
		drv.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
	}
	
	
}
