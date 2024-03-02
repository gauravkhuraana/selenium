

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webTable {

	

		@Test
		public void before()
		{
			System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");

			WebDriver drv = new FirefoxDriver();
			drv.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
            List<WebElement> rowsList= (List<WebElement>) drv.findElement(By.xpath("//div[@id='post-body-8228718889842861683']/div/table/tbody/tr"));
			System.out.println("Total number of rows are " + rowsList.size());
			int rowsize=rowsList.size();
			
			for (int i=0; i <rowsize ; i++)
			{
				List<WebElement> colsList = (List<WebElement>) rowsList.get(i).findElement(By.tagName("td"));
				int colsize=colsList.size();
				System.out.println("Total number of columns in " + (i+1) + " row are " + colsize);
			 
				for(int j=0; j <colsize ; j++)
				{
					String celltext;
					celltext=colsList.get(j).getText();
					System.out.println("Value at row=" + (i+1) + "column =  " + (j+1) + " is " + celltext);
					 	
					
				}

			}
			
		}
	RemoteWebDriver driver;
		@Test
	    public boolean anotherWayWhenCountIsFixed(String value) {

			;
			driver = new ChromeDriver();

			driver.get("https://www.w3schools.com/html/html_tables.asp");
			driver.manage().window().maximize();

			int rowcount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
			int colCount=driver.findElements(By.xpath("//table[@id='customers']//tr//th")).size();


			boolean found = false;
			for (int i = 1; i < rowcount; i++) {
				for (int j = 1; j <=colCount; j++) {

					String valueFromTable=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
					if (value.equals(valueFromTable )) {
						System.out.println("Value is present at Row number = "+i+" Column = "+j);
						return true;
					}
				}

			}
		return false;
		}
          @AfterMethod
		  public void after()
		  {
		  	driver.quit();
		  }

			@Test
			public void getThePositionWhereElementInWebTable()
			{
				String value="Italy";
				boolean val=anotherWayWhenCountIsFixed(value);
                if(!val)
                				{System.out.println("Value is not found");}
			}

		
		
	}


