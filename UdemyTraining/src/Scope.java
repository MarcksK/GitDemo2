import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		//Give me the count of links on the page.
		System.out.println(	driver.findElements(By.tagName("a")).size());
		
		//every link will have a count a 
		
	//Find Links on footer	
WebElement footerdriver=driver.findElement(By.id("gf-BIG"));  //Limiting Webdriver scope
System.out.println(footerdriver.findElements(By.tagName("a")).size());

//Links count of only the first column

WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
   System.out.println( columndriver.findElements(By.tagName("a")).size());
   
   //4. Click on each link in the column and check if the pages are opening
   
   for (int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
   {
	   
	String clickonlinkTab =   Keys.chord (Keys.CONTROL,Keys.ENTER);
	   
	   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	   Thread.sleep(5000L);
	   
	   
   }
	   //Opens all tabs
	   Set <String> abc =driver.getWindowHandles();
	 Iterator <String> it =  abc.iterator();
	 
	 while(it.hasNext())
	 
	 { 
		 
		driver.switchTo().window(it.next());
		
		System.out.println(driver.getTitle());
	 }
	 
	   
   }
   
   
		
		
	}


