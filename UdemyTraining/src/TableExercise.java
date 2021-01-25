import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marcks\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29074/eng-vs-pak-1st-test-pakistan-tour-of-england-2020");
		
	WebElement table = 	driver.findElement(By.cssSelector("div[class='cb-col cb-col-67 cb-scrd-lft-col html-refresh ng-isolate-scope']"));
	
	 int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
     int count=	table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
     
     for (int i =0; i<count-39; i++)
    	 
     {
    	 
   String value= table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
    int valueinteger = Integer.parseInt(value);
    sum = sum+valueinteger;
    	 
    	 
     }
     
    //System.out.println(sum);
     
   String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
  int extrasValue= Integer.parseInt(Extras);
   int TotalSumValue = sum+extrasValue;
   System.out.println(TotalSumValue);
   
   System.out.println( driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
     
     
    
	}

}
