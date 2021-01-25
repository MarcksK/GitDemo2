package marcks.selemium.webdriver.basic;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

//import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.Assert;
//import org.openqa.selenium.interactions.Actions;

public class launchBrowser {
	
	
	public static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException  
	
	{
	   
		//Set the Browser location 
		System.setProperty("webdriver.gecko.driver", "C:\\Marcks\\Selenium_java\\Driver\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver ();
		
	 
	 
	 
		//BrowseFacebook
	    driver.get("http://www.facebook.com");
	  //Maximize the Browser
	    driver.manage().window().maximize();
	    
	    //EnterName 
	  
	    
	    {
	    	
	    	System.out.println("Capturing name");
	    driver.findElement(By.id("u_0_m")).sendKeys("FbName");
	    
	    
	    
	    }
	   
	    //Enter Surname
	    driver.findElement(By.id("u_0_o")).sendKeys("FbSurname");
	    Thread.sleep(3000);
	    
	    //Enter MobileNumber
	    driver.findElement(By.id("u_0_r")).sendKeys("0734505611");
	    Thread.sleep(3000);
	    
	    //Enter NewPassWord
	    driver.findElement(By.id("password_step_input")).sendKeys("P@ssw0rd");
	    Thread.sleep(3000);
	   //Selecting a dropDown and date
	    
	    Select sell=new Select(driver.findElement(By.id("day")));
	    Thread.sleep(3000);
	    sell.selectByIndex(3);
	    
	    
	    //Select Month 
	    
	    Select sell1=new Select (driver.findElement(By.id("month")));
	    sell1.selectByIndex(5);
	    Thread.sleep(3000);
	   
	    //Selecting the YearDropdown
	   Select Sell2 = new Select(driver.findElement(By.id("year")));
	    Sell2.selectByVisibleText("1990");
	    Thread.sleep(3000);
	    
	    //Clicking the Radio Button 
	    
	  WebElement radioButton =  driver.findElement(By.id("u_0_7"));
	  radioButton.click();
	  Thread.sleep(3000);
	  
	  //Clicking the Signup Button
	  
	  driver.findElement(By.id("u_0_12")).click();
	  driver.manage().wait(500);
	  Thread.sleep(3000);
	  
	  //Navigate to the previous Page
	  
	  driver.navigate().back();
	  Thread.sleep(3000);
	  
	  //Refresh Page
	  
	  driver.navigate().refresh();
	  Thread.sleep(3000);
	  //Close the Browser
	  
	   
	   //Select sell = new select()
	   
	
	}

}
