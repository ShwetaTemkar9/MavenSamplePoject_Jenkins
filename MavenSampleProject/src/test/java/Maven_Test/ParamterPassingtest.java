package Maven_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParamterPassingtest {

	
	@Test (groups="RT")
	public void SrndingParameterTest() {
		
		Reporter.log("this iS command line input test");
		String URL=System.getProperty("url");
		String USERNAME= System.getProperty("username");
		String PASSWORD =System.getProperty("password");
	  System.out.println(URL);
	  System.out.println(USERNAME);
	  System.out.println(PASSWORD);
		
	}
	
	@Test (groups="ST")
	public void test1() {
		
		Reporter.log("Maven  TEST",true);
		System.out.println("ST");
	}
}
