package Winiumtestcases;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.Assert;

import org.testng.annotations.Test;


public class WiniumTestCase {

	public static void main(String[] args) throws MalformedURLException, InterruptedException{
		// TODO Auto-generated method stub
		
		DesktopOptions option = new DesktopOptions ();
		
		option.setApplicationPath("C:\\Users\\Marcks\\Desktop\\New folder\\Allangray.exe"); // Set up the location of the Exe
		
		WiniumDriver driver = new WiniumDriver(new URL ("http://localhost:9999"), option);
		
		@Test
		public  void Tesng1 () 
		{
		driver.findElement(By.name("Input")).sendKeys("0722222222"); //Enter number on TextBox
		Thread.sleep(10000);                                         //Sleeps before moving to the Next Step 
		driver.findElement(By.name("OK")).click();                   //Clicks the OK Button 
		System.out.println("Cellphone Number is Valid");        // Displays that the number is valid 
		
		}
		
		

	}

	private static void Tesng1() {
		// TODO Auto-generated method stub
		
	}

	private static void Capture1() {
		// TODO Auto-generated method stub
		
	}

}
