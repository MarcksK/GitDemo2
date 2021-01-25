import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("Chrome"); // Test will execute in Chrome
		dc.setPlatform(Platform.WINDOWS); // Test will execute in windows platform 
		
		//For Remote running
		
		WebDriver driver = new RemoteWebDriver(dc);

	}

}
