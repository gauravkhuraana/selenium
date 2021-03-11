

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;
;


public class runTestNG {

	
	@Test
	public void test()
	{
		TestNG ok = new TestNG();
		List<String> li = new ArrayList();
		
		li.add("C:\\Users\\Gaurav.Khurana\\workspace\\Practise\\testng.xml");
		
		ok.setTestSuites(li);
		
		ok.run();
				
	}
}
