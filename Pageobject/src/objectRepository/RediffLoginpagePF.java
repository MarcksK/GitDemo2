package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {
	
	WebDriver driver;
	public RediffLoginpagePF(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	/*By username = By.xpath("//input[@id='login1']");
	By Password = By.name ("passwd");
	By Signin = By.name ("proceed");*/
	
	@FindBy(xpath="//input[@id='login1']")
	
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement Password;
	
	@FindBy(name="proceed")
	WebElement Signin;
	
	
	
	
	public WebElement EmailId()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return Password;
	}
	
	public WebElement Submit()
	{
		return Signin;
		
	}


}
