package softassert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	
	
	@Test
	public void testSoft()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 1 started");
		assertion.assertEquals(11, 17, "");
		System.out.println("Test 1 complete");
		assertion.assertAll();
		
		
	}
	

	@Test
	public void testHardAsset()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test 2 started");
		assertion.assertEquals(11, 17);
		System.out.println("Test 2 complete");
	
		
		
	}

}
