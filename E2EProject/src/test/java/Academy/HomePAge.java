package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePAge extends base{
	
	public WebDriver driver ;
	public static Logger log = LogManager.getLogger(base.class.getName()); // Logger
	
	@Test (dataProvider="getData" )
	public void basePageNavigation(String Username, String Password, String text ) throws IOException
	{
		driver= initializeDriver();
		driver.get("http://qaclickacademy.com/");
		
		//one is inheritance
		//creating object to that class and invoke methods of it
		
		LandingPage l = new LandingPage(driver);
		LoginPage lp= l.getLogin();  //similar to driver.findElement
		
		//LoginPage lp = new LoginPage(driver);
		
		lp.getEmail().sendKeys(Username);
		
		lp.getpassword().sendKeys(Password);
		//System.out.println(text);
		 log.info(text); //Printing text logs
		
		lp.getLogin().click();
		
		ForgotPassword fp= lp.forgotPassword();
		fp.getEmail().sendKeys("sending random test");
		fp.sendMeInstructions().click();
		
		}
	
	@DataProvider
	
	public Object[][] getData ()
	{
		//row stands for how many different data types test should run
		//column stands for how many values per each test 
		Object[][] data = new Object[2][3];
		
		//0th row
		data[0][0] = "nonresticted@gmail.com";
		data[0][1] ="123444333";
		data[0][2] = "Restricted User";
		
		//1st row
		data[1][0]= "RestrictedUser@gmail.com";
		data[1][1] = "36737636";
		data[1][2] = "Non Restricted user";
		
		return data;
	}
	

	@AfterTest
	public void teardown () 
	{
		
		driver.close();
	}

}
