import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    //Deleting cookies
	    driver.manage().deleteAllCookies();
	    
	    //Deleting a cookie that you know 
	  //  driver.manage().deleteCookieNamed("Marcks");
	    
	    //
	    //driver.manage().
	    
	    driver.get("https://www.google.com/");
	    
	    //taking screenshots
	    File src =   ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src, new File("C:\\Users\\Marcks\\Pictures\\Screenscreenshot.png"));

	}

}
