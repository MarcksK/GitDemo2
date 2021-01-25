import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://accounts.google.com/signup");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		//driver.switchTo().window(arg0)
		
	Set<String>ids =driver.getWindowHandles();
	java.util.Iterator<String> it = ids.iterator();
	String parentid = it.next();
	String childid = it.next();
	
	driver.switchTo().window(childid);
	
	System.out.println("After Switching");
	
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(parentid);
	
	System.out.println("Switching Back To Parent");
	
	System.out.println(driver.getTitle());
		

	}

}
