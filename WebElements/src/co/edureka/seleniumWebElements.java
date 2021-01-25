package co.edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;




public class seleniumWebElements {
	
	
	public static void main (String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Marcks\\WebElements\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver ();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	//deleting cookies
	
	driver.manage().deleteAllCookies();
	
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
    
    //Wait time
    Thread.sleep(4000);
    
    driver.findElement(By.className("nav-input")).click();
    
   driver.findElement(By.linkText("Cocomii")).click();
   
   //Page load Wait 
   
   driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
   // want to navigate to another  page
   
   driver.navigate().to("https://www.facebook.com/");
   Thread.sleep(5000);
   
   //Navigate back
   
   driver.navigate().back();
   
  
   
   //Exit the driver execution
   
   driver.quit();
}

}