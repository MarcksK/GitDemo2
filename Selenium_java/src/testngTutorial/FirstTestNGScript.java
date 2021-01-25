package testngTutorial;

import org.testng.Assert;

import org.testng.annotations.Test;

public class FirstTestNGScript {
	@Test (priority=1, description = "This Test Case will Verify Login Functionality")
	public void loginApplication()

	{
		System.out.println("Login to Application");
		
		Assert.assertEquals(12, 16);
		
	}
	
	@Test(priority=2, description= "This Test case will add certain Items in a basket")
	public void SelectItems()

	{
		System.out.println("Items Selected");
		
	}
	
	
	@Test(priority=3, description="This test case will perform checkout operations")
	public void Checkout()

	{
		System.out.println("Checkout Completed");
		
	}
}
