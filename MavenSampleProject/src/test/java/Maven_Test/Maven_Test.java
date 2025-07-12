package Maven_Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Maven_Test {
	@Test (groups="RT")
	public void SrndingParameterTest() {
		
		Reporter.log("Maven  TEST",true);
		System.out.println("RT");
	}
	
	@Test (groups="ST")
	public void test1() {
		
		Reporter.log("Maven  TEST",true);
		System.out.println("ST");
	}
}
