package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestOne {
	
	@Test
	public void testOne()
	{
		System.out.println("Love TestNG");
	}
	
	
	@BeforeSuite
	public void BfSuite()

	{
		System.out.println("**********Before Suite**********");
	}
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("**********I will Run last**********");
	}

}
