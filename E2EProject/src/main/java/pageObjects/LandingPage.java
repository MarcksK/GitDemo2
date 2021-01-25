package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	private By signin = By.cssSelector("a[href*='sign_in']");
	
	private By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
	
	private By NavBar = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	private By header=By.cssSelector("div[class*='video-banner'] h3");
	
	
	
	
	public LandingPage(WebDriver driver) 
	{
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}


	public LoginPage getLogin()
	{
		
		 driver.findElement(signin).click();
		 LoginPage lp = new LoginPage(driver);
		 return lp;
	}
	
	
	public WebElement getTitle()
	{
		
		return driver.findElement(title);
	}
	
	public WebElement getHeader()
	{
		
		return driver.findElement(title);
	}
	
	
	public WebElement getNavigationBar()
	{
		System.out.println ("Trying to Identify the navigation bar");
		return driver.findElement(NavBar);
	}

}
