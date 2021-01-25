import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingSsLCerti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//SSL Certificates
		//Desire Capabilities
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//Belongs to your locala nrowser
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(c);
		
		driver.get("");

	}

}
