import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webTable {

	

		@BeforeTest
		public void before()
		{
			System.setProperty("webdriver.gecko.driver","D:\\software\\geckodriver-v0.11.1-win64\\geckodriver.exe");

			WebDriver drv = new FirefoxDriver();
			drv.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
            List<WebElement> rowsList=drv.findElement(By.xpath("//div[@id='post-body-8228718889842861683']/div/table/tbody/tr"));
			System.out.println("Total number of rows are " + rowsList.size());
			int rowsize=rowsList.size();
			
			for (int i=0; i <rowsize ; i++)
			{
				List<WebElement> colsList = rowsList.get(i).findElement(By.tagName("td"));
				int colsize=colsList.size();
				System.out.println("Total number of coloumns in " + (i+1) + " row are " + colsize);
			 
				for(int j=0; j <colsize ; j++)
				{
					String celltext;
					celltext=colsList.get(j).getText();
					System.out.println("Value at row=" + (i+1) + "column =  " + (j+1) + " is " + celltext);
					 	
					
				}

			}
			
		}
		
		
	}


