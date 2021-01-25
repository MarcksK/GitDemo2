package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

//Adding Logs
//Generating Html Reports
//Screenshots on failure
//Jenkins Intergration

public class ValidateNavigationBar extends base{
	
	public WebDriver driver ;
	
	public static Logger log = LogManager.getLogger(base.class.getName()); // Logger
	
	@BeforeTest
	public void initialize () throws IOException
	{
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com");
		
		
	}
	
	@Test 
	public void basePageNavigation() throws IOException
	{
		
		//one is inheritance
		//creating object to that class and invoke methods of it
		
		LandingPage l = new LandingPage(driver);
		//compare text from browser

        Assert.assertTrue(l.getNavigationBar().isDisplayed());
        log.info("Navigation Bar is Displayed"); //Log page errors
	
		
		}
	
	@AfterTest
	public void teardown () 
	{
		
		driver.close();
	}
	
	

}
