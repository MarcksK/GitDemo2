import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesPractise {

	public static void main(String[] args) {
		
		
		


	
				
				// invoke .exe file first
				
				//Chrome driver Path 
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				//Accessing Google
				driver.get("https://login.salesforce.com/");
				
				//Print title of the page
				//System.out.println(driver.getTitle());
				
				//Validates if you landed on correct URL
			  // System.out.println(driver.getCurrentUrl());
			   
			   driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("myemailAdress");
			   driver.findElement(By.cssSelector("#password")).sendKeys("MyPassWord");
			   driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
			   
			 System.out.println (driver.findElement(By.cssSelector("div#error.loginError")).getText());
			   
			   
		// TODO Auto-generated method stub

	}

}
