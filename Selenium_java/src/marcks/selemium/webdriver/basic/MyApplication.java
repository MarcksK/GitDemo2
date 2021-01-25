package marcks.selemium.webdriver.basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyApplication {
	
	@Test 
	public void startApp()
	{
	Assert.assertEquals(12, 14);
		System.out.println("Starting app");
		
	}
	
	@Test (dependsOnMethods="loginApp")
	public void loginApp()
	{
		System.out.println("Login to  app");
	}
	
	
	@Test(dependsOnMethods="logoutApp")
	public void logoutApp()
	{
		System.out.println("Logout to app");
	
	}

}
