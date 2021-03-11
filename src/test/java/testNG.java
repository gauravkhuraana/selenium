

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG implements ITestListener{

	WebDriver drv;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case has been started here"+result.toString() );
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test case has failed "+result.toString() );

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println(" started here " + context.toString());
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
	//	selenium.setSpeed("2000");

	}
	@Test(enabled=false)
	public void test()
	{


		drv = new ChromeDriver();
		
        drv.get("http://udzial.com");
		drv.findElement(By.id("emailid")).sendKeys("hello");
	
		//acha ji
	}
	
	@Test(enabled=true)
	public void test1()
	{
		System.out.println("Hi i will be called only");
	}
	@Test(enabled=true,groups={"smoke"})
	public void test2()
	{
		System.out.println("Hi i will be called smoke only");
	}
	@Test(enabled=true,groups={"smoke","regression"})
	public void test3()
	{
		System.out.println("Hi am both smoke and regression");
	}
	@Test(enabled=true,groups={"sanity"})
	public void test4()
	{
		System.out.println("Hi i will be called sanity");
	}
	@Test(enabled=true,groups={"regression"})
	public void test5()
	{
		System.out.println("Hi i will be called regression");
	}
	
	@Test(dependsOnMethods={"test5"})
	public void test6()
	{
		System.out.println("test6 , 5 is success");
	}	
	
	@Test(dependsOnMethods={"test6"})
	public void test7()
	{
		System.out.println("test7 half run.. since 6 was done.. nithing after this");
		//drv.findElement(By.id("email")).click();
	}	
	
	
	@Test(dependsOnMethods={"test6","test7"})
	public void test8()
	{
		System.out.println("test8 will not be run");
	}	
	
	
	
	@Test(dependsOnMethods={"test7"})
	public void test9()
	{
		System.out.println("9 dependent on 7");
		drv.findElement(By.name("hello"));
	}	
	
	
	
    @Test(dependsOnMethods="test9")
 	public void test10()
	{
		System.out.println("test10");
		
	}	
}

	
	

