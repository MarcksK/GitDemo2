package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffLoginpage;

public class Loginapplication {

	@Test
	public void Login()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginpage rd = new RediffLoginpage(driver);
		rd.EmailId().sendKeys("helllo");
		rd.Password().sendKeys("helllooo");
		rd.Submit().click();
		
		
	}
	
}
 