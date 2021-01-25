package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {
	
	WebDriver driver;
	public RediffLoginpage(WebDriver driver) {
		
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	By username = By.xpath("//input[@id='login1']");
	By Password = By.name ("passwd");
	By Signin = By.name ("proceed");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
		
	}
	
	public WebElement Submit()
	{
		return driver.findElement(Signin);
		
	}


}
