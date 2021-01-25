import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";
		String port = "3306";
		

		Connection con =DriverManager.getConnection("jdbc:mysql:// " + host+":"+port+"/Employeeportal", "root", "0512M@rckskhosa.");
	
	    Statement s = con.createStatement();
	    ResultSet rs = s.executeQuery("select * from credentials where scenario = 'zerobalancecard'");
	    
	   while( rs.next())
	   {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://login.salesforce.com/?locale=eu");
		   
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("username"));
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("password"));
	    
	   }
	
	}
	
	

}
