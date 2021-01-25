package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.xpath("//input[@id='user_email']");
	
	By password = By.xpath("//input[@id='user_password']");
	
	By login = By.xpath("//input[@name='commit']");
	
	By forgotPassword = By.cssSelector("[href*='password/new']");
	
	
	
	
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}
	
	
	public ForgotPassword forgotPassword()
	{
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);

		
	}


	public WebElement getEmail()
	{
		
		return driver.findElement(email);
	}
	
	public WebElement getpassword()
	{
		
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		
		return driver.findElement(login);
	}

}
