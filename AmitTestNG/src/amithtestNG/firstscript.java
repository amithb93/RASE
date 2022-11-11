package amithtestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class firstscript 
{
	@Test
	public void test()
	{
		Reporter.log("beginning of the project", true);
	}
	@Test
	public void test1()
	{
		Reporter.log("end of the project", false);
	}
	
}