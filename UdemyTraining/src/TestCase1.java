import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public interface webdriver {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// invoke .exe file first
		
		//Chrome driver Path 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Accessing Google
		driver.get("https://www.facebook.com/");
		
		//Print title of the page
		System.out.println(driver.getTitle());
		
		//Validates if you landed on correct URL
	   System.out.println(driver.getCurrentUrl());
	   
	   driver.findElement(By.cssSelector("#email")).sendKeys("myemailAdress");
	   
	  //driver.findElement(By.name("pass")).sendKeys("123456");
	   
	 //driver.findElement(By.linkText("Forgotten account?")).click();
	   
	
	

	}

}
