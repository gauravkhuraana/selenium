import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepickerQuestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "d:\\software\\chromedriver_win32\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.phptravels.net/");
		driver.findElement(By.name("checkin")).click();
		WebElement datepic1 =driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr[5]/td[3]"));	
		datepic1.click();
		WebElement datepic2=driver.findElement(By.xpath("(//div[@class='datepicker-days']/table/tbody/tr[5]/td[5])[2]"));
		datepic2.click();
		
		//Thread.sleep(2000);
		//driver.findElement(By.name("checkout")).clear();
		//Thread.sleep(1000);
		
		//driver.findElement(By.name("checkout")).click();
		//Thread.sleep(2000);
		

		/*
		driver.get("https://720kb.github.io/angular-datepicker/");

	    // passing date to the textbox
		driver.findElement(By.xpath("//input[@ng-model='date1']")).sendKeys("September 10, 1990");
		// clicking on the page to close calendar
		driver.findElement(By.xpath("//h1[text()='Angular Datepicker']")).click();
		
		// getting what is shown on screen above the textbox
		String dateOnscreen=driver.findElement(By.xpath("//span[@ng-if='date1']")).getText();
				
		// CHecking what we eenter versis whats found on screen
		Assert.assertEquals(dateOnscreen,"September 10, 1990" );
		
		System.out.println("Assertion passed");
		
		/*
		driver.findElement(By.xpath("//input[@ng-model='date1']")).click();
		
		//Click to open year dropdown
		driver.findElement(By.xpath("//i[@class='ng-scope']")).click();
		
		
		//finding out year
		
		while(true)
		{
			List<WebElement> years=driver.findElements(By.xpath("//div[@class='_720kb-datepicker-calendar-years-pagination']/a"));
		
			for(WebElement el : years)
								
				{
				
				if (Integer.parseInt(el.getText()) > 1990 )
				{
					//driver.findElements(By.xpath("//a[@ng-click='paginateYears(paginationYears[0])]'"));
					
					driver.findElement(By.xpath("(//i[contains(@class,'fa-arrow-circle-left')])[2]")).click();
					System.out.println("here we have clicked on the button to reach before");
					Thread.sleep(3000);
					break;
				}
				else
				{
					System.out.println("we reached at right place. Now we will click on it ");
				}
				//if(el.getText().to)
					//System.out.println("Hi we are here " + el.getText());
					if(el.getText().equals("1990"))
					{
						System.out.println("Hi we are here " + el.getText());

						el.click();
						
						
						break;
					}
				}
			Thread.sleep(3000);
			//driver.quit();
		}
		/*List<WebElement> elm = driver.findElements(By.xpath("//div[@class='_720kb-datepicker-calendar-body']/a"));
		
		for(WebElement el : elm)
		{
			if(el.getText().equals(anObject))
		}*/

		
	}


}
