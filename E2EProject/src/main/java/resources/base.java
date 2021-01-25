package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class base {
	
	public WebDriver driver;//declare driver 
	public Properties prop;
	
 public WebDriver initializeDriver () throws IOException
 {

	 prop = new Properties ();
	 
	 //System.getProperty("user.dir")
	 
	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	 
	 prop.load(fis);
	 
	 //mvn test -Dbrowser=chrome
	 
	String browserName = System.getProperty("browser");
	 
	//String browserName = prop.getProperty("browser");
	System.out.println(browserName);
	
	if (browserName.contains("chrome"))

	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		if (browserName.contains("headless"))
		
		{
		
			options.addArguments("headless");
			
		}
		
		driver=new ChromeDriver(options);
		//execute in chrome driver
	}
	else if (browserName.equals("fireFox"))
	{
		//Firefox code
		
	}
	else if(browserName.equals("IE"))
	{
		//IE Code
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//setting timeouts
	return driver;
		
 } 
 
  public String getScreenShotPath(String testcaseName, WebDriver driver) throws IOException // taking screenshots
  {
	  
	 TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	
	String destinationFile =System.getProperty("user dir")+"\\reports\\"+testcaseName+".png";
	FileUtils.copyFile(source,new File(destinationFile));
	return destinationFile; //this method expects path
  }
  
 
}
