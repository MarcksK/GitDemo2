import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); //Applying ImplicWait Globally
		
       WebElement source =	driver.findElement(By.id("fromCity"));
		Thread.sleep(6000);
		source.click();
		
        source.sendKeys("MUM");
		
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		
		 WebElement destination =driver.findElement(By.id("toCity"));
		 destination.click();
		 
		 destination.sendKeys("DEL");
		 
		 Thread.sleep(2000);
		 
		 destination.sendKeys(Keys.ARROW_DOWN, Keys.ENTER);
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 String script = " return document.getElementById(\"fromCity\").value;";
		 String text = (String) js.executeAsyncScript(script);
		 System.out.println(text);
		 
		 
		 
		

	}

}
