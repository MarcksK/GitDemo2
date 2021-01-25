package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class ValidateTitle extends base{
	
	public WebDriver driver ;
	public static Logger log = LogManager.getLogger(base.class.getName()); // Logger
	LandingPage l;
	
	@Test 
	public void basePageNavigation() throws IOException
	{
		driver= initializeDriver();
		log.info("Driver is Initialized"); //log driver error
		
		driver.get("http://qaclickacademy.com/");
		log.info("Navigated to Home Page"); //Log page errors
		
		//one is inheritance
		//creating object to that class and invoke methods of it
		
		 l = new LandingPage(driver);
		//compare text from browser
		
		Assert.assertEquals(l.getTitle().getText(), "FEAURED COURSES");
		log.info("Successfully Validated Text Message"); // Assertions logs
	
	
		
		}
	
	@Test
	
	public void validateHeader()
	{
		

		Assert.assertEquals(l.getHeader().getText(), "Learn Hot tools like Selenium, Appium, JMeter, SoapUI,Database Testing and more..");
		
	
		
	}
	

	@AfterTest
	public void teardown () 
	{
		
		driver.close();
	}
	
	

}
