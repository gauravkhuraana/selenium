import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class data {
	
	@Test(dataProvider="hello")
	public void yellow(String arg1, String arg2)
	{
		System.out.println("Hello i am the first arguement supplied by Dataprovider" + arg1);
		System.out.println("Hello i am the second arguement supplied by Dataprovider" + arg2);
		
	}
	
	@DataProvider
	public Object[][] hello()
	{
		Object[][] h = new Object[2][2];
		h[0][0]="First time first argo";
		h[0][1]="First time second argo";
		h[1][0]="second time first argo";
		h[1][1]="Second time second argo";
		
		return h;
	}
	

}


